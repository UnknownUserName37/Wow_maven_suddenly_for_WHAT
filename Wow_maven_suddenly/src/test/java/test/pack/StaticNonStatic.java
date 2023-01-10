package test.pack;

public class StaticNonStatic {
    static int counter = 0;

        public StaticNonStatic() {
            counter++;
        }

        public void getCount() {
            System.out.println("Total number of Util instances so far: " + counter);
        }
    }

    class Main
    {
        public static void main(String[] args)
        {
            StaticNonStatic ob1 = new StaticNonStatic();
            ob1.getCount();

            StaticNonStatic ob2 = new StaticNonStatic();
            ob2.getCount();

            StaticNonStatic ob3 = new StaticNonStatic();
            ob3.getCount();
        }
    }


