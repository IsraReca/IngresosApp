package lettuce.ingresosapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import lettuce.ingresosapp.R
import lettuce.ingresosapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.ingresosBtn.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(
                R.id.action_navigation_home_to_navigation_ingresos
            )
        }

        binding.egresosBtn.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(
                R.id.action_navigation_home_to_navigation_egresos
            )
        }

        binding.mes.text = getMonth()
        binding.balance.text = getIngresos()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun getMonth() : String{
        return "ENERO"
    }

    private fun getIngresos() : String{
        return "$1.000.000"
    }
}