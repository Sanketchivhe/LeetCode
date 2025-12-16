public class Power_of_two {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return true;
        }
    if(n < 0){
        return false;
    }
    while (n % 2 == 0) {
        n /= 2;

    }
    return n ==1;
    }

    public static void main(String[] args) {
        Power_of_two pot = new Power_of_two();
        int number = 16;
        boolean result = pot.isPowerOfTwo(number);
        System.out.println(number + " is power of two: " + result);
    }
}
