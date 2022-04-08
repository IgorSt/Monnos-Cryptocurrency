package com.igorsantos.monnoslistcryptocurrency.view.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import com.igorsantos.monnoslistcryptocurrency.data.rules.Event
import com.igorsantos.monnoslistcryptocurrency.data.rules.EventObserver
import com.igorsantos.monnoslistcryptocurrency.data.utils.AlertDialogError
import com.igorsantos.monnoslistcryptocurrency.databinding.FragmentPresentationBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PresentationFragment : Fragment() {

    private var _binding: FragmentPresentationBinding? = null
    val binding get() = _binding!!

    private val presentationViewModel: PresentationViewModel by viewModels()

    private lateinit var presentationAdapter: PresentationAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        lifecycle.addObserver(presentationViewModel)
        presentationAdapter = PresentationAdapter(presentationViewModel)
        return FragmentPresentationBinding.inflate(inflater, container, false).also {
            _binding = it
            binding.viewModel = presentationViewModel
            binding.lifecycleOwner = viewLifecycleOwner
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            rvPresentation.adapter = presentationAdapter
            rvPresentation.addItemDecoration(DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL))
        }

        presentationViewModel.apply {
            data.observe(viewLifecycleOwner) {
                presentationAdapter.submitList(it.response)
            }

            onDetailsClicked.observe(viewLifecycleOwner, EventObserver {
                val action = PresentationFragmentDirections.actionPresentationFragmentToDetailsFragment(it)
                findNavController().navigate(action)
            })

            errorLoad.observe(viewLifecycleOwner) {
                AlertDialogError()
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}