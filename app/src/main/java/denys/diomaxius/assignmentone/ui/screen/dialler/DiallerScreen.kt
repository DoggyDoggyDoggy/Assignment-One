package denys.diomaxius.assignmentone.ui.screen.dialler

import android.Manifest
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import androidx.activity.compose.ManagedActivityResultLauncher
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import denys.diomaxius.assignmentone.ui.screen.dialler.components.CallButton
import denys.diomaxius.assignmentone.ui.screen.dialler.components.DisplayPhoneNumber
import denys.diomaxius.assignmentone.ui.screen.dialler.components.NumbersKeyboard
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.core.content.ContextCompat
import androidx.core.net.toUri

@Composable
fun DiallerScreen(
    viewModel: DiallerScreenViewModel = viewModel(),
) {
    val context = LocalContext.current
    val phoneNumber by viewModel.phoneNumber.collectAsState()

    var hasCallPermission by remember {
        mutableStateOf(
            ContextCompat.checkSelfPermission(
                context,
                Manifest.permission.CALL_PHONE
            ) == PackageManager.PERMISSION_GRANTED
        )
    }

    val permissionLauncher = rememberLauncherForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { granted ->
        hasCallPermission = granted
    }
    
    LaunchedEffect(Unit) {
        if (!hasCallPermission) {
            permissionLauncher.launch(Manifest.permission.CALL_PHONE)
        }
    }

    Content(
        modifier = Modifier,
        phoneNumber = phoneNumber,
        addNumber = viewModel::addNumber,
        deleteNumber = viewModel::deleteNumber,
        context = context,
        permissionLauncher = permissionLauncher,
        hasCallPermission = hasCallPermission
    )
}

@Composable
fun Content(
    modifier: Modifier = Modifier,
    phoneNumber: String,
    addNumber: (String) -> Unit,
    deleteNumber: () -> Unit,
    context: Context,
    permissionLauncher: ManagedActivityResultLauncher<String, Boolean>,
    hasCallPermission: Boolean,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(15.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HorizontalDivider(
            thickness = 1.dp,
            color = Color(0xFFC8E3EA)
        )

        DisplayPhoneNumber(
            modifier = Modifier.weight(1f),
            phoneNumber = phoneNumber,
            deleteNumber = deleteNumber
        )

        HorizontalDivider(
            thickness = 1.dp,
            color = Color(0xFFC8E3EA)
        )

        NumbersKeyboard(
            addNumber = addNumber,
        )

        CallButton(
            onClick = {
                if (hasCallPermission) {
                    context.startActivity(
                        Intent(
                            Intent.ACTION_CALL,
                            "tel:$phoneNumber".toUri()
                        )
                    )
                } else {
                    permissionLauncher.launch(Manifest.permission.CALL_PHONE)
                }
            }
        )
    }
}