import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Your weight (in kg): ");//Cân nặng
        weight = scanner.nextDouble();

        System.out.print("Your height (in m): ");//Chiều cao
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Kết quả\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Nhẹ cân");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Bình Thường");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Thừa cân");
        else
            System.out.printf("%-20.2f%s", bmi, "Béo phì");
    }
}