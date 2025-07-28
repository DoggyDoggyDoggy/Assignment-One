package denys.diomaxius.assignmentone.ui.screen.dialler

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import denys.diomaxius.assignmentone.R

sealed class DialButton {
    data class Icon(val number: String, @DrawableRes val resId: Int) : DialButton()
    data class Digit(val number: String, val letters: String) : DialButton()
}

val buttonList: List<DialButton> = listOf(
    DialButton.Icon("1", R.drawable.outline_voicemail_24),
    DialButton.Digit("2", "ABC"),
    DialButton.Digit("3", "DEF"),
    DialButton.Digit("4", "GHI"),
    DialButton.Digit("5", "JKL"),
    DialButton.Digit("6", "MNO"),
    DialButton.Digit("7", "PQRS"),
    DialButton.Digit("8", "TUV"),
    DialButton.Digit("9", "WXYZ"),
    DialButton.Digit("*", ""),
    DialButton.Digit("0", "+"),
    DialButton.Digit("#", "")
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
                row.forEach {dialButton ->
                    when(dialButton) {
                        is DialButton.Icon -> {
                            CustomButton(
                                modifier = Modifier
                                    .padding(5.dp)
                                    .size(100.dp),
                                number = dialButton.number,
                                iconRes = dialButton.resId
                            )
                        }
                        is DialButton.Digit -> {
                            CustomButton(
                                modifier = Modifier
                                    .padding(5.dp)
                                    .size(100.dp),
                                number = dialButton.number,
                                textUnderNumber = dialButton.letters
                            )
                        }
                    }
                }
            }
        }
    }
}