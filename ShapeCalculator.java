import java.util.Scanner;
public class ShapeCalculator {

  public static void main(String[] args) {
    Scanner input = new
    Scanner(System.in);
    System.out.prinln("Select the shape to be worked on");
    System.out.println("1. Circle");
    System.out.println("2. Rectangle");
    System.out.println("3. Triangle");
    System.out.println("4. Sphere");

    Int choice = input.nextInt();

    Switch (choice) {
        Case 1:
            System.out.println(“Enter the radius of the circle: “);
            Double radius = input.nextDouble();
            Double area = Math.PI * radius * radius;
            Double perimeter = 2 * Math.PI * radius;
            System.out.println("The area of the circle is" + area);
            System.out.println("The perimeter of the circle is" + perimeter);
            Break;
        Case 2:
            System.out.println(“Enter the length of the rectangle: “);
            Double length = input.nextDouble();
            System.out.println(“Enter the width of the rectangle: “);
            Double width = input.nextDouble();
            Area = length * width;
            Perimeter = 2 * (length + width);
            System.out.println(“The area of the rectangle is “ + area);
            System.out.println(“The perimeter of the rectangle is “ + perimeter);
            Break;
        Case 3:
            System.out.println(“Enter the base of the triangle: “);
            Double base = input.nextDouble();
            System.out.println(“Enter the height of the triangle: “);
            Double height = input.nextDouble();
            System.out.println(“Enter the hypotenuse of the triangle: “);
            Double hypotenuse = input.nextDouble();
            Area = 0.5 * base * height;
            Perimeter = base + height + hypotenuse;
            System.out.println(“The area of the triangle is “ + area);
            System.out.println(“The perimeter of the triangle is “ + perimeter);
            Break;
        Case 4:
            System.out.println(“Enter the radius of the sphere: “);
            Radius = input.nextDouble();
            Area = 4 * Math.PI * radius * radius;
            Double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
            System.out.println(“The surface area of the sphere is “ + area);
            System.out.println(“The volume of the sphere is “ + volume);
            Break;
        Default:
            System.out.println(“Invalid choice!”);
            Break;
    }

    Input.close();

}
}
