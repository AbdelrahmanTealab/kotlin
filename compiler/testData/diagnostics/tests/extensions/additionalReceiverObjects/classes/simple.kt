object Some {
    val a = 1
}

class A with(Some) {
    val b = a
}

with<A> fun f() {}