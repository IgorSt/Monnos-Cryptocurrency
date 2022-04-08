package com.igorsantos.monnoslistcryptocurrency.data.utils

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.igorsantos.monnoslistcryptocurrency.R
import java.lang.IllegalStateException

class AlertDialogError : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val build = AlertDialog.Builder(requireContext())
            build.setMessage(getString(R.string.sorry_error_occurred, it))
                .setPositiveButton(getString(R.string.ok), DialogInterface.OnClickListener { _, _ ->
                    requireActivity().onBackPressed()
                }).show()
            build.create()
        } ?: throw IllegalStateException("Activity cannot bu null")
    }
}