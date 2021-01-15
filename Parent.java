
class Parent{}
class Child extends Parent{}
       class TestInstanceOf
        {
            public static void main(String rk[])
            {
                Parent P = new Parent();
                Child C = new Child();
                System.out.println(P instanceof Child);
                System.out.println(P instanceof Parent);
                System.out.println(C instanceof  Parent);
            }
        }
    
