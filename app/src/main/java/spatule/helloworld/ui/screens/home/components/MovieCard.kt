package spatule.helloworld.ui.screens.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import spatule.helloworld.R


@Composable
fun MovieCard(
    title: String,
    directors: List<String>,
    mark: Float,
    modifier: Modifier = Modifier
) {
    Row (
        modifier = modifier
            .padding(8.dp)
            .fillMaxWidth()
            .background(
                color = MaterialTheme.colorScheme.surfaceTint,
                shape = RoundedCornerShape(16.dp)
            )
            .padding(16.dp)
    ) {
        Column (
            modifier = Modifier.weight(1.0F)
        ) {
            Text(
                text = title,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                style = MaterialTheme.typography.titleMedium
            )

            val directorsString = directors.joinToString(", ")
            Text(
                text = stringResource(
                    R.string.movie_card_by,
                    directorsString
                ),
                style = MaterialTheme.typography.bodySmall
            )
        }
        Text(text = "$mark/5")
    }
}

@Preview
@Composable
fun PreviewMovieCard () {
    MovieCard(
        title = "Cidade de Deussssssssssssssssssssssssssssssssssssssssssssssssssssssssssss",
        directors = listOf<String>("Fernando Meirelles", "Kátia Lund"),
        mark = 4.3F
    )
}