public class Solution {
    public string CategorizeBox(int length, int width, int height, int mass) {
        // Checks for both
        if(mass >= 100 && (((long long)length * width * height) >= 1e9 
        ||(length >= 10000 || width >= 10000 || height >= 10000 || mass >= 10000)))
            return "Both";
        
        // Checks for bulky
        if(((long long)length * width * height) >= 1e9 ||
        (length >= 10000 || width >= 10000 || height >= 10000 || mass >= 10000))
            return "Bulky";
        
        // Checks for heavy
        if(mass >= 100)
            return "Heavy";
        return "Neither";
    }
}