public class From_10_to_2_rec {
    public static void main(String[] args) {
        System.out.println("The converted number is " + dectoBin(7));
    }

    private static int dectoBin(int n){
        if(n == 0 )
            return 0;
        else
            return  n % 2 + 10 * dectoBin(n/2);
    }

}

