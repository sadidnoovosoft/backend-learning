class BadData(message: String) : Exception(message)

fun checkObject(obj: Any?): String =
    if (obj is String)
        obj
    else
        throw BadData("Needs string got $obj")

fun test(
    checkObject: (obj: Any?) -> String
) {
    println(checkObject("sadid"))
    checkObject(null)
}

fun main() {
    test(::checkObject)
}