import java.util.Scanner;
public class MainRectangle {
    public static void main(String[] args) {
        int a = askSide("A");
        int b = askSide("B");
        showResult(a, b);
    }
    private static int askSide(String side) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input side "+side+": ");
        return scanner.nextInt();
    }
    private static void showResult(int a, int b) {
        int perimeter = 2*(a+b);
        System.out.println("Side A: "+a+"\nSide B: "+b+"\nPerimeter: "+perimeter);
    }
}