package gen.z.booleans

// These define our new booleans
const val fact = true
const val facts = fact
const val cap = false
const val noCap = !cap
const val `no cap` = noCap

// Gotta have these emojis for our new booleans
const val `💯` = fact
const val `🧢` = cap
const val `🚫🧢` = `no cap`

fun Boolean.isCapping(): Boolean = this == `🧢`
fun Boolean.`is capping`(): Boolean = isCapping()
