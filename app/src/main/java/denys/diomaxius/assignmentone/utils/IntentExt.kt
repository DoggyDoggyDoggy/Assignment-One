package denys.diomaxius.assignmentone.utils

import android.content.Intent

fun Intent.extractPhoneNumber(): String? {
    return if (action == Intent.ACTION_DIAL) {
        data?.schemeSpecificPart
    } else null
}