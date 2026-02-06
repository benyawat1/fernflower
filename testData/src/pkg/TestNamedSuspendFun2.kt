
suend fun foo2(): Int {
    while (true) {
        try {
            val x = bar()
            if (x == 0) break
        } finally {
            bar()
        }
    }
    return 1
}

suend fun bar(): Int = 0
