public class fibonacciseries{
    public static int fib(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        return fib(n-1)+(n-2);
    }
    public static void main(String args[])
    {
        int res=fib(1);
        System.out.println(res);
    }
}