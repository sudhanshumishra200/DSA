import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three angles of the triangle:");
        int angle1 = scanner.nextInt();
        int angle2 = scanner.nextInt();
        int angle3 = scanner.nextInt();

        int sumOfAngles = angle1 + angle2 + angle3;

        if (angle1>0 && angle2>0 && angle3>0 && sumOfAngles == 180) {
            if (angle1 < 90 && angle2 < 90 && angle3 < 90) {
                System.out.println("Acute Triangle");
            } else if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("Right Triangle");
            } else {
                System.out.println("Obtuse Triangle");
            }
        } else {
            System.out.println("These angles do not form a triangle.");
        }

        scanner.close();
    }
}
