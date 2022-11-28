import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                while (true) {
                    try {
                        Scanner scanner = new Scanner(System.in);
                        Parallelepiped p = new Parallelepiped(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                        System.out.println(p);
                        p.getVolume();
                        p.getArea();
                    } catch (ArithmeticException e) {
                        System.out.println("Only number");
                    } catch (Exception e) {
                        System.out.println("Wrong number!");
                    }
                }
            }
        }
