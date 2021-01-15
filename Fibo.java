
public class Fibo {

    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c;
        int num=10;
        for(int i=1;i<=num;++i)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }


    }
    }


