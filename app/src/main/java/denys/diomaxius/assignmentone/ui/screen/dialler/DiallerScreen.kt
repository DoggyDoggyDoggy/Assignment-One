package denys.diomaxius.assignmentone.ui.screen.dialler

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import denys.diomaxius.assignmentone.ui.screen.dialler.components.CallButton
import denys.diomaxius.assignmentone.ui.screen.dialler.components.DisplayPhoneNumber
import denys.diomaxius.assignmentone.ui.screen.dialler.components.NumbersKeyboard
import androidx.compose.runtime.getValue

@Composable
fun DiallerScreen(
    modifier: Modifier = Modifier,
    viewModel: DiallerScreenViewModel = viewModel()
) {
    val phoneNumber by viewModel.phoneNumber.collectAsState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(15.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        DisplayPhoneNumber(
            modifier = Modifier.weight(1f),
            phoneNumber = phoneNumber
        )
        NumbersKeyboard(

        )
        CallButton()
    }
}