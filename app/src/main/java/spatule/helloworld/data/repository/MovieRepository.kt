package spatule.helloworld.data.repository

import spatule.helloworld.data.model.Movie

class MovieRepository {
    private val movies : List<Movie> = listOf(
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
            mark = 4.5f,
            cover = "https://m.media-amazon.com/images/M/MV5BZjhkNjM0ZTMtNGM5MC00ZTQ3LTk3YmYtZTkzYzdiNWE0ZTA2XkEyXkFqcGc@._V1_FMjpg_UX1000_.jpg"
        ),
        Movie(
            id = 3,
            title = "Pulp Fiction",
            directors = listOf("Quentin Tarantino"),
            mark = 4.6f,
            cover = "https://m.media-amazon.com/images/I/91T4eN0LmUL._AC_UF1000,1000_QL80_.jpg",
            synopsis = "Reviewers say 'Pulp Fiction' is acclaimed for its inventive narrative, sharp dialogue, and standout performances by John Travolta, Samuel L. Jackson, and Uma Thurman. Themes of redemption, violence, and morality are prominent, alongside its distinctive cinematography, soundtrack, and pop culture references. The film's influence on independent cinema is significant. However, some find the violence and certain subplots unsettling, and a few consider it overrated."
        ),
    )

    fun getMovies(): List<Movie> {
        return movies
    }

    fun getMovieById(id: Int): Movie? {
        return movies.firstOrNull{ it.id == id }
    }
}