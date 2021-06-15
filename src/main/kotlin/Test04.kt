fun main() {

    //型が違うのでどちらもエラーになる
//    var a: Float = 1.2
//    var b: Double = 10

    //以下のように書く必要がある
    var a: Float = 1.2F
    var b: Double = 10.0
    println(a)
    println(b)

    //上記のようにサフィックスを使うか、toデータ型変換メソッドで変換する必要がある
    var x: Int = 10
    var y: Long = x.toLong()
    println(x)
    println(y)
}