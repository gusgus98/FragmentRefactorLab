package edu.temple.fragmentrefactor

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentHelloWorld : Fragment() {

    private lateinit var displayTextView: TextView
    private lateinit var nameEditText: EditText
    private lateinit var changeButton: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_hello_world, container, false)

        displayTextView = view.findViewById(R.id.displayTextView)
        nameEditText = view.findViewById(R.id.nameEditText)
        changeButton = view.findViewById(R.id.changeButton)

        changeButton.setOnClickListener {
            val name = nameEditText.text.toString()

            displayTextView.text = if (name.isEmpty()) {
                "Please enter your name"
            } else {
                "Hello, $name!"
            }
        }

        return view
    }
}
