import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            System.out.print("Pilih operasi (1/2/3/4/5): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculateSquareRoot();
                    break;
                case 2:
                    calculatePower();
                    break;
                case 3:
                    calculateNaturalLogarithm();
                    break;
                case 4:
                    calculateFactorial();
                    break;
                case 5:
                    System.out.println("Terima kasih, program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

        } while (choice != 5);

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("=== Calculator ===");
        System.out.println("1. Akar Kuadrat");
        System.out.println("2. Pangkat");
        System.out.println("3. Logaritma");
        System.out.println("4. Faktorial");
        System.out.println("5. Keluar");
    }

    private static void calculateSquareRoot() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        double number = scanner.nextDouble();
        double result = Math.sqrt(number);
        System.out.println("Hasil: " + result);
    }

    private static void calculatePower() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan basis: ");
        double base = scanner.nextDouble();
        System.out.print("Masukkan eksponen: ");
        double exponent = scanner.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println("Hasil: " + result);
    }

    private static void calculateNaturalLogarithm() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        double number = scanner.nextDouble();
        double result = Math.log(number);
        System.out.println("Hasil: " + result);
    }

    private static void calculateFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int number = scanner.nextInt();
        int result = factorial(number);
        System.out.println("Hasil: " + result);
    }

    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}