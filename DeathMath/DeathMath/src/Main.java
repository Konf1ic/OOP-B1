import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        width = scanner.nextFloat();//Chiều rộng
        System.out.println("Enter height: ");
        height = scanner.nextFloat();//Chiều dài
        float area = width * height;
        System.out.println("Area is: " + area);
    }
}