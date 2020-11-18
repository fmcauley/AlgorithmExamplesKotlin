class BinarySearch {
    fun searchFor(value: Int, given: Collection<Int>) : Boolean {

        var start = given.first()
        var end = given.last()

       while (start <= end) {
           val mid = (start + end) / 2
           if (value == mid) {
                return  true
           }

           if (mid > value) {
               end = mid - 1
           }

           if (mid < value) {
               start = mid + 1
           }
       }

        return false
    }
}