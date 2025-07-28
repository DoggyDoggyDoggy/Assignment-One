package denys.diomaxius.assignmentone.ui.screen.dialler.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import denys.diomaxius.assignmentone.ui.screen.dialler.data.DialButton
import denys.diomaxius.assignmentone.ui.screen.dialler.data.buttonList

@Composable
fun NumbersKeyboard(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(15.dp),
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