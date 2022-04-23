package app
import scalatags.Text.all._
object MinimalApplication extends cask.MainRoutes{

  val bootstrap = "https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.css"
  @cask.get("/")
  def hello() = doctype("html")(
    html(
      head(link(rel := "stylesheet", href := bootstrap)),
      body(
        div(cls := "container")(
          h1("Hello!"),
          p("World!")
        )
      )
    )
  )

  @cask.post("/do-thing")
  def doThing(request: cask.Request) = {
    request.text().reverse
  }

  initialize()
}
