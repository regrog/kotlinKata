import kotlin.math.max

fun maxSequence(arr: List<Int>): Int {
    var resp = 0
    for(i in arr.indices){
        for(j in i..arr.size) {
            val sub = arr.subList(i, j)
            val t = sub.sum()
            if (t > resp)
                resp = t
        }
    }
    return if (resp > 0) resp else 0
}


fun maxSequenceBestPractice(arr: List<Int>): Int {
    var max = 0
    arr.indices.forEach { outer ->
        (outer..arr.size).forEach { inner ->
            max = max(arr.subList(outer, inner).sum(), max)
        }
    }
    return max
}