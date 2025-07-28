package denys.diomaxius.assignmentone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import denys.diomaxius.assignmentone.ui.screen.dialler.DiallerScreen
import denys.diomaxius.assignmentone.ui.screen.dialler.DiallerScreenViewModel
import androidx.activity.viewModels

class MainActivity : ComponentActivity() {
    private val viewModel: DiallerScreenViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiallerScreen(
                viewModel = viewModel
            )
        }
    }
}
