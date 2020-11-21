import org.junit.Assert.*
import org.junit.Test

class RunningSumTest {

    @Test
    fun givenAnArrayOfTwoIntegersThenReturnTheRunningSum() {
        val rm = RunningSum()
        val actual = rm.runningSum(intArrayOf(1,2))
        val expected = intArrayOf(1,3)

        assertArrayEquals(expected,actual)
    }
}