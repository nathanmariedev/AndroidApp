package spatule.helloworld.ui.screens.home.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import spatule.helloworld.data.model.Movie

@Composable
fun MovieList(
    movieList: List<Movie>,
    onMovieClick: (movieId: Int) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
    )
    {
        items(movieList) { movie ->
            MovieCard(
                title = movie.title,
                directors = movie.directors,
                mark = movie.mark,
                modifier = Modifier.clickable {
                    onMovieClick(movie.id)
                }
            )
        }
    }
}

@Preview
@Composable
fun PreviewMovieList(){
    val movies = listOf(
        Movie(
            id = 1,
            title = "Cidade de Deus",
            directors = listOf("Fernando Meirelles", "Kátia Lund"),
            mark = 4.3f
        ),
        Movie(
            id = 2,
            title = "Inception",
            directors = listOf("Christopher Nolan"),
            mark = 4.5f
        ),
        Movie(
            id = 3,
            title = "Pulp Fiction",
            directors = listOf("Quentin Tarantino"),
            mark = 4.6f
        ),
    )
    MovieList(onMovieClick = {
            movieId -> println("Movie $movieId clicked")
        },
        movieList = movies
    )
}