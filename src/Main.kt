import java.time.LocalDate
import java.time.Period
import java.util.Date

fun main() {

    println("")


}

class User(var username: String, var password: String, var address: String, var dateofbirth: String) {

    private var shoppingCart: MutableList<String> = TODO()

    fun addToCart() { //Alter des Benutzers muss über der Altersgrenze sein.

        TODO()

    }

    fun removeFromCart() {

        TODO()
    }


}

class Book(private var title: String, private var ageRestriction: String, private var releaseDate: String) {
    fun getTitle() : String {

        return title
    }

    fun getAgeRestriction() : String {

        return ageRestriction

    }

    fun getReleaseDate() : String {

        return releaseDate
    }

}

class Movie(private var title: String, private var ageRestriction: String, private var releaseDate: String) {
    fun getTitle() : String {

        return title
    }

    fun getAgeRestriction() : String {

        return ageRestriction

    }

    fun getReleaseDate() : String {

        return releaseDate
    }

}

class Merchandise(private var title: String, private var ageRestriction: String, private var releaseDate: String) {
    fun getTitle() : String {

        return title
    }

    fun getAgeRestriction() : String {

        return ageRestriction

    }

    fun getReleaseDate() : String {

        return releaseDate
    }

}
