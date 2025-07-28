package denys.diomaxius.assignmentone.ui.screen.dialler

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class DiallerScreenViewModel : ViewModel() {
    private val _phoneNumber = MutableStateFlow<String>("")
    val phoneNumber = _phoneNumber

    fun addNumber(number: String) {
        _phoneNumber.value = _phoneNumber.value + number
    }

    fun deleteNumber() {
        _phoneNumber.value = _phoneNumber.value.dropLast(1)
    }
}