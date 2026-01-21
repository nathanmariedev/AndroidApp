package spatule.helloworld.ui.screens.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import spatule.helloworld.data.model.Movie
import spatule.helloworld.data.repository.MovieRepository
import spatule.helloworld.ui.screens.home.components.MovieList


@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    val movies = MovieRepository().getMovies()
    var count by rememberSaveable { mutableStateOf(0) }

    Column (
        modifier = Modifier.padding(8.dp)
    ) {
        Text(
            text = "Films",
            style = MaterialTheme.typography.headlineLarge
        )
        
        if (movies.isEmpty()) {
            Box (
                modifier = Modifier.fillMaxWidth().fillMaxHeight(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "No movies found 🐙",
                    style = MaterialTheme.typography.displaySmall
                )
            }
        } else {
            MovieList(
                movieList = movies,
                onMovieClick = {movieId ->  
                    navController.navigate("details/$movieId")
                }
            )
        }
    }
}