import java.util.*

fun main() {
    val reader = Scanner(System.`in`)
    val values = hashSetOf<Int>()


    println("enter the elements of array1 of size 5")
    val arr1 = Array<Int>(5) { i -> 0 }
    for (i in 0..4) {
        arr1[i] = reader.nextInt()
    }

    println("Enter the /*/**/*/elements of array2 of size 5")
    val arr2 = Array<Int>(5) { i -> 0 }
    for (i in 0..4) {
        arr2[i] = reader.nextInt()
    }

    for (items in arr1) {
        for (letters in arr2) {
            if (letters == items) {
                values.add(letters)
            }

        }
    }

    println("Common elements are $values")


}

