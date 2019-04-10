import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input R for rectangle, C for circle!");
        Shape sh;

        String choice = sc.next();

        if (choice.equals("C")) {
            Circle c = new Circle();
            c.radius = sc.nextDouble();
            sh = c;
        } else {
            Rectangle r = new Rectangle();
            r.width = sc.nextDouble();
            r.height = sc.nextDouble();
            sh = r;
        }

        System.out.println(sh.getArea());
        System.out.println(sh.getPerimeter());


//        if (choice.equals("C")) {
//            double r = sc.nextDouble();
//            Circle c = new Circle();
//            c.radius = r;
//
//            System.out.println(c.getArea());
//            System.out.println(c.getPerimeter());
//        } else {
//            double w = sc.nextDouble();
//            double h = sc.nextDouble();
//
//            Rectangle r = new Rectangle();
//            r.width = w;
//            r.height = h;
//
//            System.out.println(r.getArea());
//            System.out.println(r.getPerimeter());
//        }




    }
}
