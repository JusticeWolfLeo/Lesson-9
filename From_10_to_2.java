public class From_10_to_2 {
    public static void main(String[] args)
    {
        int n, count = 0, a;
        String x = "";
        n = 7;
        while(n > 0)
        {
            a = n % 2;
            if(a == 1)
            {
                count++;
            }
            x = x + "" + a;
            n = n / 2;
        }
        System.out.println("Binary number:"+x);
        System.out.println("No. of 1s:"+count);
    }
}
