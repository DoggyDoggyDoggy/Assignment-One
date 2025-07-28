package denys.diomaxius.assignmentone.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
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

@Composable
fun DisplayPhoneNumber(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
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
                            .size(100.dp)
                            .padding(5.dp),
                        number = it.first.toString(),
                        textUnderNumber = it.second
                    )
                }
            }
        }
    }
}

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