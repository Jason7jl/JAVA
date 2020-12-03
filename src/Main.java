import exercises.HelloWorld;

class Main {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHi();
        int a = 200;

        if (a%4 == 0&&(a%100!=0||a%400==0)) {

            System.out.println( a + " is a leap year");
        }
        else {

            System.out.println(a + " false");
        }
        String name = "Fgdsea";
        System.out.println("Hello " + name);

        }
    }