package denys.diomaxius.assignmentone.ui.screen.dialler.data

import androidx.annotation.DrawableRes
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