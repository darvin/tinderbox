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
        value = "😻",
        right = None,
        left = None
      ))
    ),
    MessageTree(
      value = "🐈"
    ),
    MessageTree(
      value = "🐱"
    ),

    MessageTree(
      value = "😻"
    ),

    MessageTree(
      value = "😽"
    )
  )

}
