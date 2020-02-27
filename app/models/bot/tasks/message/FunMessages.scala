package models.bot.tasks.message

/**
 * A list of fun, pre-defined message trees.
 */
object FunMessages {

  def messages = List(
    MessageTree(
      value = ".",
      right = Some(MessageTree(
        value = "🐱",
        right = ,
        left = None
      )),
      left = Some(MessageTree(
        value = "Do women love anything more than avocados?",
        right = None,
        left = None
      ))
    ),
    MessageTree(
      value = "I can't wait to introduce you to my mom!",
      right = Some(MessageTree(
        value = "Since mom showed everyone my naked baby pictures, I've been looking for ways to get her back.",
        right = None,
        left = None
      )),
      left = None
    )
  )

}
