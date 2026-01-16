package spatule.helloworld.ui.screens.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate

@Composable
fun RotatingButton(count: Int, buttonClicked: () -> Unit) {
    Column (
        modifier = Modifier.rotate(count * 10.0F),
    ) {
        Text(
            text = "Hello $count!"
        )
        Button(onClick = { buttonClicked() }) {

        }
    }
}