package programs

/*
*
* Linear search works by comparing the element with every item in the list one by one.
*
* */

fun main(){
    val numbers = listOf<Int>(2,6,7,1,8,4)
    val search = linearSearch(numbers,7)
    println(search)
}

fun linearSearch(array:List<Int>,element:Int):Int{
    var index = -1
    var i = 0
    while(i<array.size){
        if(array[i]==element){
            index = i
        }
        i++
    }
    return index
}
