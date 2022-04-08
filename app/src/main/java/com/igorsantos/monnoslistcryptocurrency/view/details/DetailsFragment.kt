package com.igorsantos.monnoslistcryptocurrency.view.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.igorsantos.monnoslistcryptocurrency.data.rules.EventObserver
import com.igorsantos.monnoslistcryptocurrency.data.utils.AlertDialogError
import com.igorsantos.monnoslistcryptocurrency.databinding.FragmentDetailsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailsFragment : Fragment() {

    private var _binding: FragmentDetailsBinding? = null
    val binding get() = _binding!!

    private val viewModel: DetailsViewModel by viewModels()
    private val args: DetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel.getDetails(args.name)
        return FragmentDetailsBinding.inflate(inflater, container, false).also {
           _binding = it
            binding.lifecycleOwner = viewLifecycleOwner
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.apply {

            data.observe(viewLifecycleOwner) {
                binding.data = it
            }

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