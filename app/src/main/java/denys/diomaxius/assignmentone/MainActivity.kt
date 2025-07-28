package denys.diomaxius.assignmentone

import android.content.Intent
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

        handleDialIntent(intent)

        setContent {
            DiallerScreen(
                viewModel = viewModel
            )
        }
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        handleDialIntent(intent)
    }

    private fun handleDialIntent(intent: Intent) {
        if (intent.action == Intent.ACTION_DIAL) {
            intent.data
                ?.schemeSpecificPart
                ?.let { number ->
                    viewModel.setPhoneNumber(number)
                }
        }
    }
}
