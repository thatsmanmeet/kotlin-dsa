package programs

fun main(){
    val numbers = mutableListOf(4,1,9,6,29,3,12,5,2)
    val sortedList = bubbleSort(numbers)
    println(sortedList)
}

fun bubbleSort(array:MutableList<Int>):MutableList<Int>{
    var i = 0
    var j:Int
    var temp:Int
    while(i < array.size-1){
        j = 0
        while (j < array.size-1){
            if(array[j] > array[j+1]){
                temp = array[j]
                array[j] = array[j+1]
                array[j+1] = temp
            }
            j++
        }
        i++
    }
    return array
}