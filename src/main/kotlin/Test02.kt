fun main() {
    var a = 1000
    var b = 1_000
    var c = 0x3E8

    println(a)
    println(b)
    println(c)

    var aa = 10L //Long型として定義
    var bb = 10F //Float型として定義

    println(aa::class)
    println(bb::class)


    var msg1 = "こんにちは。\n私はkotlinを学んでいます。"
    var msg2 = """こんにちは。
        |私は
        |kotlinを
        |学んでいます。
        |
        |よろしく。
    """.trimMargin()

    println(msg1)
    println(msg2)

    var data = arrayOf(1, 2, 3)
    println("配列dataの先頭の値は${data[0]}で、要素数は${data.size}です。")
    println("1+1は、${1+1}です。")

}