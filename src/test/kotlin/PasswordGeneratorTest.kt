import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class PasswordGeneratorTest {
    private val passwordGenerator = PasswordGenerator()

    @Test
    fun generatePassword() {
        val length = 6
        val password = passwordGenerator.generatePassword(length)
        assertEquals(length,password.length)

    }
}