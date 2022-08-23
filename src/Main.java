public class Main {
    public static void main(String[] args)
    {
        int a=2;
        int n=1;
        int b=50;
        int tracker=1;

        while(tracker<=a)
        {
            n=b*n;
            tracker++;
        }
        System.out.println(n);

    }
}