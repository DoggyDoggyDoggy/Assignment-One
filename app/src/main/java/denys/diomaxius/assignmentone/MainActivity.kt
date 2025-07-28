package denys.diomaxius.assignmentone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import denys.diomaxius.assignmentone.ui.screen.dialler.DiallerScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiallerScreen()
        }
    }
}
