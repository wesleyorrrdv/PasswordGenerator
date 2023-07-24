class PasswordGenerator {
    fun generatePassword(length:Int):String {
        val chars = ('a'..'z') + ('A'..'Z') + ('0'..'9')
        return (1.. length)
            .map{chars.random()}
            .joinToString ("")
    }

}