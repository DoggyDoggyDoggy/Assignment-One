package denys.diomaxius.assignmentone.ui.screen.dialler

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

val buttonList = listOf(
    1 to "♥",
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
fun NumbersKeyboard(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        buttonList.chunked(3).forEach { row ->
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                row.forEach {
                    CustomButton(
                        modifier = Modifier
                            .padding(5.dp)
                            .size(100.dp),
                        number = it.first.toString(),
                        textUnderNumber = it.second
                    )
                }
            }
        }
    }
}