package denys.diomaxius.assignmentone.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DiallerScreen(modifier: Modifier = Modifier) {
    Column {
        DisplayPhoneNumber()
        NumbersKeyBoard()
    }
}

@Composable
fun DisplayPhoneNumber(modifier: Modifier = Modifier) {
    Row(

    ) {
        Text(
            text = "asdsa"
        )
        Icon(
            imageVector = Icons.Default.Home,
            contentDescription = null
        )
    }
}

@Composable
fun NumbersKeyBoard(modifier: Modifier = Modifier) {
    CustomButton(
        modifier = Modifier.size(64.dp)
    )
}

@Composable
fun CustomButton(
    modifier: Modifier = Modifier,
    number: String = "",
    textUnderNumber: String = ""
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