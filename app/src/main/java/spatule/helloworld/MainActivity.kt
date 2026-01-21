package spatule.helloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import spatule.helloworld.ui.navigation.MovieAppNavigation
import spatule.helloworld.ui.screens.home.HomeScreen
import spatule.helloworld.ui.theme.HelloWorldTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloWorldTheme {
                // HomeScreen()
                MovieAppNavigation()
            }
        }
    }
}

