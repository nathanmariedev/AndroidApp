package spatule.helloworld.data.model

data class Movie (
    var id: Int,
    var title: String,
    var directors: List<String>,
    var mark: Float,
    var synopsis: String = "No synopsis available",
    var cover: String = "https://upload.wikimedia.org/wikipedia/commons/b/b9/No_Cover.jpg"
)