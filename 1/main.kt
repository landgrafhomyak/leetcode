class Solution {
    class UnreachableCodeException : RuntimeException()
    
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val presented = HashMap<Int, Int>()
        nums.forEachIndexed { i, n -> 
            presented[target - n]?.also { j ->
                return@twoSum intArrayOf(i, j)
            }
            presented[n] = i
        }
        throw UnreachableCodeException()
    }
}
