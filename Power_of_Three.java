public class Power_of_Three {
    public boolean isPowerOfThree(int n) {
        if (n == 0){
            return false;
        }
        if(n < 0){
            return false;
        }
        while(n % 3 == 0){
            n /= 3;
        }
        return n == 1;
        
    }
    public static void main(String[] args){
        Power_of_Three pot = new Power_of_Three();
        int number = 27;
        boolean result = pot.isPowerOfThree(number);
        System.out.println(number + " is power of three: " + result);
    }
}
