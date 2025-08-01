package denys.diomaxius.assignmentone

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import denys.diomaxius.assignmentone.ui.screen.dialler.DiallerScreen
import denys.diomaxius.assignmentone.ui.screen.dialler.DiallerScreenViewModel
import androidx.activity.viewModels
import denys.diomaxius.assignmentone.utils.extractPhoneNumber

// Left the MainActivity class as clean as possible for the current application.
// Screen tested on Pixel 3a, Pixel 6, Pixel 7, OnePlus8
class MainActivity : ComponentActivity() {
    private val viewModel: DiallerScreenViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //set phone number from intent
        intent.extractPhoneNumber()?.let(viewModel::setPhoneNumber)

        setContent {
            DiallerScreen(
                viewModel = viewModel
            )
        }
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        intent.extractPhoneNumber()?.let(viewModel::setPhoneNumber)
    }
}