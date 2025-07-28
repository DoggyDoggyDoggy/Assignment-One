package denys.diomaxius.assignmentone.ui.screen.dialler.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun CustomButton(
    modifier: Modifier = Modifier,
    number: String = "",
    textUnderNumber: String = "",
    @DrawableRes iconRes: Int? = null,
    onClick: (String) -> Unit
) {
    Button(
        modifier = modifier,
        shape = CircleShape,
        onClick = {
            onClick(number)
        }
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = number,
                fontSize = 28.sp,
                fontWeight = FontWeight.Medium
            )
            if (iconRes == null) {
                Text(
                    text = textUnderNumber,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium
                )
            } else {
                Icon(
                    painter = painterResource(id = iconRes),
                    contentDescription = null
                )
            }
        }
    }
}