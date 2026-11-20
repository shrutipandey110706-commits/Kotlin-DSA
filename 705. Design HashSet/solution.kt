class MyHashSet() {
    private val arr=mutableListOf<Int>()

    fun add(key: Int) {
        if(key !in arr){
            arr.add(key)
        }
    }

    fun remove(key: Int) {
        if (key in arr){
            arr.remove(key)
        }
    }

    fun contains(key: Int): Boolean {
        return key in arr
    }

}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * var obj = MyHashSet()
 * obj.add(key)
 * obj.remove(key)
 * var param_3 = obj.contains(key)
 */
