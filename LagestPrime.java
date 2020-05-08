public class LagestPrime {
    public static void main(String arg[]){
        System.out.println (getLargestPrime ( 21 ));
    }
    public static int getLargestPrime(int number){
        if (number <= 0) return -1;
        int test = 0;
        for(int i = 1;i != number;i++){
            for (int j = 1; j != number;j++){
                //System.out.println ("j = " + j);
                test = i * j;
                if (test == number) {
                    return j;
                }
            }
        }
        return test;
    }

}
