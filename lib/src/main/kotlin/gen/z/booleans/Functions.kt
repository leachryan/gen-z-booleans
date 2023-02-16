package gen.z.booleans

infix fun Any?.`fact`(other: Any?): Boolean {
    return this == other
}

infix fun Any?.`cap`(other: Any?): Boolean {
    return this != other
}

infix fun Any?.`no cap`(other: Any?): Boolean = fact(this)