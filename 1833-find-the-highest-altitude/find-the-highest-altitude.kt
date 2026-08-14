class Solution {
    fun largestAltitude(gain: IntArray): Int {

        var altitude =0  // Biker starts at altitude 0
        var highest=0  // Starting altitude 0 is also the highest initially


        for (g in gain){
            altitude +=g
            highest = max (highest,altitude)
        }
        return highest
        
    }
}