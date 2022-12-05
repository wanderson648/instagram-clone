package com.example.clone_instagram.register.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.clone_instagram.R
import com.example.clone_instagram.common.view.CustomDialog

class RegisterPhotoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_register_photo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val customDialog = CustomDialog(requireContext())

//        customDialog.setTitle(R.string.app_name)
        customDialog.addButton(R.string.photo, R.string.gallery) {
            when (it.id) {
                R.string.photo -> {
                    Log.i("test", "Foto")
                }
                R.string.gallery -> {
                    Log.i("test", "Galeria")
                }

            }
        }

        customDialog.show()
    }
}