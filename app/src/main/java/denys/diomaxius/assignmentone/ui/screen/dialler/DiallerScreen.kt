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

val buttonList = listOf(
    1 to "",
    2 to "ABC",
    3 to "DEF",
    4 to "GHI",
    5 to "JKL",
    6 to "MNO",
    7 to "PQRS",
    8 to "TUV",
    9 to "WXYZ",
    "*" to "",
    0 to "+",
    "#" to ""
)

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