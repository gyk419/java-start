package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        printMSG(3, "Hello, world!");
        printMSG(5, "Hello, world2!");
        printMSG(7, "Hello, world3!");
    }

    public static void printMSG(int a, String b){
        for(int i=0; i< a; i++){
            System.out.println(b);
        }
    }
}
