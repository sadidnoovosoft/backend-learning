fun getStringLength(obj: String?): Int? {
    if (obj is String && obj.isNotEmpty()) {
        return obj.length
    }
    return null
}

fun getExpressionLength(obj: Any?): Int? {
    when(obj) {
        is String -> return obj.length
        else -> return obj.toString().length
    }
}

fun main() {
    println(getStringLength(""))
    println(getStringLength(null))

    println(getExpressionLength(123))
    println(getExpressionLength(true))
    println(getExpressionLength(null))
}