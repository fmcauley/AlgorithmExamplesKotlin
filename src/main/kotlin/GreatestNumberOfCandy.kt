class GreatestNumberOfCandy {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): BooleanArray {

        // find the max value
        var maxValue = 0
        for (x in candies) {
            if (x > maxValue) {
                maxValue = x
            }
        }

        // try with out the conversion
        var booleanValues = BooleanArray(candies.count())

        // for loop with index values
        for (z in candies.indices) {
            booleanValues[z] = candies[z] + extraCandies >= maxValue
        }

        return booleanValues
    }
}