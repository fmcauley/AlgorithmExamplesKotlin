import org.junit.Assert.*
import org.junit.Test

class GreatestNumberOfCandyTest {

    @Test
    fun ensureThatGreatestNumberIsNotNull() {
        assertNotNull(GreatestNumberOfCandy())
    }

    @Test
    fun givenASingleKidWithOneCandyAndOneExtraCandyReturnTrue() {
        val values = intArrayOf(1)
        val extraCandy = 1
        val gnc = GreatestNumberOfCandy()
        val actual = gnc.kidsWithCandies(values,extraCandy)
        val expected = booleanArrayOf(true)

        assertArrayEquals(actual, expected)
    }

    @Test
    fun givenTwoKidsWithCandyAndASingleExtraCandyReturnTrueFalse() {
        val values = intArrayOf(3,1)
        val extraCandy = 1
        val gnc = GreatestNumberOfCandy()
        val actual = gnc.kidsWithCandies(values,extraCandy)
        val expected = booleanArrayOf(true,false)

        assertArrayEquals(actual, expected)
    }
}