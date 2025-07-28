package denys.diomaxius.assignmentone.ui.screen.dialler

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import denys.diomaxius.assignmentone.ui.screen.dialler.components.DisplayPhoneNumber
import denys.diomaxius.assignmentone.ui.screen.dialler.components.NumbersKeyboard

@Composable
fun DiallerScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        DisplayPhoneNumber(
            modifier = Modifier.weight(1f)
        )
        NumbersKeyboard(

        )
        Button(
            modifier = Modifier
                .width(150.dp)
                .height(75.dp),
            onClick = {}
        ) {
            Text(
                text = "Call"
            )
        }
    }
}