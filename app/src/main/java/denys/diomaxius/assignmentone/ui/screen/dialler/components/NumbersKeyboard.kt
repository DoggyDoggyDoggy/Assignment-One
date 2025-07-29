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


// Custom layout for numbers keyboard
@Composable
fun NumbersKeyboard(
    modifier: Modifier = Modifier,
    addNumber: (String) -> Unit,
) {
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
                row.forEach { dialButton ->
                    when (dialButton) {
                        is DialButton.Icon -> {
                            CustomButton(
                                modifier = Modifier
                                    .padding(5.dp)
                                    .size(100.dp),
                                number = dialButton.number,
                                iconRes = dialButton.resId,
                                onClick = {
                                    addNumber(dialButton.number)
                                }
                            )
                        }

                        is DialButton.Digit -> {
                            CustomButton(
                                modifier = Modifier
                                    .padding(5.dp)
                                    .size(100.dp),
                                number = dialButton.number,
                                textUnderNumber = dialButton.letters,
                                onClick = {
                                    addNumber(dialButton.number)
                                }
                            )
                        }
                    }
                }
            }
        }
    }
}