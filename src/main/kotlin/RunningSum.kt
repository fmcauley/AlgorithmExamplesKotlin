class RunningSum {

    fun runningSum(nums: IntArray) : IntArray {
        var runningTotal = mutableListOf<Int>()
        var memorize = 0

        for (x in nums) {
            memorize += x
            runningTotal.add(memorize)
        }

        return  runningTotal.toIntArray()
    }
}