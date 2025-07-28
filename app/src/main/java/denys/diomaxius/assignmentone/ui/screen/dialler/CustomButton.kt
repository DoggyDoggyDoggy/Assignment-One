package denys.diomaxius.assignmentone.ui.screen.dialler

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CustomButton(
    modifier: Modifier = Modifier,
    number: String = "",
    textUnderNumber: String = "",
) {
    Button(
        modifier = modifier,
        shape = CircleShape,
        onClick = {}
    ) {
        Column {
            Text(
                text = number
            )
            Text(
                text = textUnderNumber
            )
        }
    }
}