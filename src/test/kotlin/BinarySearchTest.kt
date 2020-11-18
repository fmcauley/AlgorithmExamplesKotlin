import org.junit.Assert.*
import org.junit.Test

class BinarySearchTest {
    @Test fun testThatBinarySearchIsNotNil() {
        val bs = BinarySearch()
        assertNotNull(bs)
    }

    @Test
    fun testThatBinarySearchCanFindAGivenNumber() {
        val bs = BinarySearch()
        val values = arrayListOf<Int>(1,2,3,4,5)
        val searchValue = 2
        val output = bs.searchFor(searchValue,values)

        assertTrue(output)
    }

    @Test
    fun testThatBinarySearchWillReturnFalseWhenAValueIsNotFound() {
        val bs = BinarySearch()
        val values = arrayListOf<Int>(1,2,3,4)
        val searchValue = 5
        val output = bs.searchFor(searchValue,values)

        assertFalse(output)
    }
}