package spatule.helloworld.ui.screens.home

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import spatule.helloworld.ui.screens.home.components.RotatingButton

@Composable
fun Home() {
    var count by rememberSaveable { mutableStateOf(0) }

    Box {
        RotatingButton(count = count, buttonClicked = { count++ })
    }
}