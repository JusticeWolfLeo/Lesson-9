public class Pow5N {
    public static int PowA(int x, int n)
    {
        if (n==0)
            return 1;
        return PowA(x,n-1)*x;
    }
    public static void main(String[] args)
    {
        int x =5;
        int n =3;
        int pow=PowA(x,n);
        System.out.println("Pow("+x+", "+n+") = "+pow);
    }
}

