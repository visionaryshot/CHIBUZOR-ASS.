public class Trianglethree  {
public static void main(String[] args) {
for (int line= 10; line >= 1; line--) {
            for (int asteriks = 0; asteriks < 10 - line; asteriks++) {
                System.out.print(" ");
            }
            for (int asteriks = 1; asteriks <= line; asteriks++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
}
}