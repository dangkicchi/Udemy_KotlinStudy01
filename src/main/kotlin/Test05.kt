fun main() {

    //配列
    var a = arrayOf(1, 2, 3) //[1, 2, 3]
    var b = intArrayOf(1, 2, 3) //[1, 2, 3] 要素は Int型
    var c: Array<String?> = arrayOfNulls(3) //[null, null, null]
    var d = Array(3, { i -> i * 2} ) // [0, 2, 4]
    println(a[1]) //結果：2
    println(d[2]) //結果：4


    //コレクション(以下のように作成すると読み取り専用になる)
    var list = listOf("あ", "い", "う")
    var set = setOf ("A", "B", "A", "C", "D", "B", )
    var map = mapOf("First" to 1, "Second" to 2, "Third" to 3)
    println(list) //結果：["あ", "い", "う"]
    println(set) //結果：[A, B, C, D]
    println(map) //結果：[First=1, Second=2, Third=3]

    //変更可能なコレクションを作成するには、
    //mutableコレクション名Of()関数を使う
    var list_m = mutableListOf("あ", "い", "う")

    //mutable な set, map はどう使うの？
    var set_m = mutableSetOf ("A", "B", "A", "C", "D", "B", )
    var map_m = mutableMapOf("First" to 1, "Second" to 2, "Third" to 3)
    list_m[0] = "わ"
    println(list_m) //結果：["わ", "い", "う"]

    //以下のような記述をすれば、Listも変更される
    var list1 = mutableListOf(1, 2, 3)
    var list2: List<Int> = list1
    list1[1] = 4
    println(list2) //[1, 4, 3]


}