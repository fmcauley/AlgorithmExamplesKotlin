import org.junit.Assert.*
import org.junit.Test

class RemoveVowelsTest {

    @Test
    fun whenGivenAStringWithAVowelAndAConsonantTheConsonantIsReturned() {
        val rv = RemoveVowels()
        val actual = rv.removeVowels("am")
        val expected = "m"

        assertEquals(expected, actual)
    }

    @Test
    fun whenGivenAStringWithTwoConsonantsTheReturnValueWillHaveThoseSameTwoValues() {
        val rv = RemoveVowels()
        val actual = rv.removeVowels("nn")
        val expected = "nn"

        assertEquals(expected,actual)
    }
}