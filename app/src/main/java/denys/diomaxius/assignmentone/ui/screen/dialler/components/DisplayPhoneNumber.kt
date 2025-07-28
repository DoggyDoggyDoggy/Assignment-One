package denys.diomaxius.assignmentone.ui.screen.dialler.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import denys.diomaxius.assignmentone.R

@Composable
fun DisplayPhoneNumber(
    modifier: Modifier = Modifier,
    phoneNumber: String,
    deleteNumber: () -> Unit
) {
    Row(
        modifier = modifier.fillMaxWidth().padding(horizontal = 15.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            modifier = Modifier.weight(1f),
            text = phoneNumber,
            fontSize = 32.sp,
            fontWeight = FontWeight.Medium
        )

        Icon(
            modifier = Modifier
                .size(48.dp)
                .clickable{
                    deleteNumber()
                },
            painter = painterResource(id = R.drawable.outline_backspace_24),
            contentDescription = null
        )
    }
}