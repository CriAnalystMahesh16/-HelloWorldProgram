package Function;

public class Lab001 {
    public static void main(String[] args) {
        //block of code performs specific task
        //code reuseablity
        System.out.println("Methods or Functions");
          sayHi();
           sayHello();
           for (int i=0;i<5;i++){
               sayHi();
               sayHello();
               hihello();
           }

    }

    static void hihello() {
        System.out.println("hihello....");
    }

    static void sayHi(){
        System.out.println("Hi...");
    }
    static void sayHello(){
        System.out.println("Hello....");
    }
}
