class Solution {
    fun climbStairs(n: Int): Int {
        if (n==1) return 1
        if (n==2) return 2

        var a =1
        var b=2

        for (i in 3..n){
            val c = a+b
            a=b
            b=c
        }
        return b

    }
}