package programs


fun main(){
    val numbers = listOf(5,6,7,8,9,10)
    val index = binarySearch(numbers,7)
    println(index)
}


fun binarySearch(array: List<Int>, element: Int): Int {
    var left = 0
    var right = array.size - 1

    while (left <= right) {
        val mid = (left + right) / 2

        when {
            array[mid] == element -> return mid
            array[mid] < element -> left = mid + 1
            else -> right = mid - 1
        }
    }

    return -1
}