// normal class
class Hold1(
    val arg1: String,
    var arg2: Int,
)

// data class
data class Hold2(
    val arg1: String,
    var arg2: Int,
)

data class Contact(
    val firstname: String,
    val lastname: String,
    val number: String,
    val address: String,
)

fun main() {
    val h1 = Hold1("Sadid", 21)
    val h2 = Hold2("Sadid", 21)

    println(h1)
    println(h2)

    val h3 = Hold1("Sadid", 21)
    val h4 = Hold2("Sadid", 21)

    println(h3)
    println(h4)

    h3.arg2 = 35
    println(h2 == h4)
    h4.arg2 = 35

    println(h1 == h3)
    println(h4 == h2)

    // copy()
    val contact = Contact(
        firstname = "Tejas",
        lastname = "Ekhande",
        number = "+91-9975119287",
        address = "05, Alacrity, Baner",
    )

    val newContact = contact.copy(
        number = "+91-7620236431",
    )

    println(contact)
    println(newContact)

    println(contact.hashCode())
    println(newContact.hashCode())
}