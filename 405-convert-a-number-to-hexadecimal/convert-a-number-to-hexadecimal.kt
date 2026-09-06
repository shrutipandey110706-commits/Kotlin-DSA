class Solution {
    fun toHex(num: Int): String {
        if (num ==0){
            return "0"
        }
        // Hexadecimal digits: 0-9 and a-f
        val hex ="0123456789abcdef"
        val result =StringBuilder()
        // Use a variable because we will change its value
        var n = num

        while (n!=0){
            val digit = n and 15// Get the last 4 bits of n,15 in binary = 1111
            result.append(hex[digit])
            n=n ushr 4  //unsigned right shift.
        }
        return result.reverse().toString()
        
    }
}