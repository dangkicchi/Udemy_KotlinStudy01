fun main() {
    //kotlinではnullの代入を許さない
    var foo: String = "foo"
//    foo = null
    println(foo)

    //NULL許容型(取り扱いに注意)
    var foo2: String? = "foo2"
    foo2 = null
    println(foo2)

    //非null型とNullable型で暗黙的な型変換(ボクシング)が発生する
    var aa:Int = 10000
    var bb:Int = aa
    var cc:Int? = aa

    println(aa == bb)
    println(aa === bb)
    println(aa == cc)
    println(aa === cc)

    //非null型にNullable型は代入できない
    var fooa: String? = "foo"
//    var foob: String = fooa

    //Any型にもNullable型は代入できない
    var foox: String? = "foo"
//    var fooy: Any = foox

    //Any型もNullable型にすれば代入できる
    var fooj: String? = "foo"
    var fook: Any? = fooj

    var a: String = "foo"
    println(a?.length) //3が返る

    var b: String? = null
    println(b?.length) //nullが返る
    println(b?.length ?:0) //0が返る



}