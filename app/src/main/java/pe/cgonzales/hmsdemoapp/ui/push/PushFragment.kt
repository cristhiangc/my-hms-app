package pe.cgonzales.hmsdemoapp.ui.push

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import pe.cgonzales.hmsdemoapp.R

class PushFragment : Fragment() {

    private lateinit var pushViewModel: PushViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        pushViewModel =
                ViewModelProviders.of(this).get(PushViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_gallery, container, false)
        val textView: TextView = root.findViewById(R.id.text_gallery)
        pushViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}