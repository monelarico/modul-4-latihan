import java.util.Scanner;

public class latihan2 {
    private static String inputText = ""; // Teks akan disimpan di sini

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    inputText = enterText(scanner);
                    break;
                case 2:
                    countCharacters();
                    break;
                case 3:
                    countWords();
                    break;
                case 4:
                    searchWord(scanner);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan Text Analyzer. Sampai jumpa!");
                    System.exit(0); // Keluar dari program
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("=== MENU TEKS ANALYZER ===");
        System.out.println("1. Masukkan Teks");
        System.out.println("2. Hitung Jumlah Karakter");
        System.out.println("3. Hitung Jumlah Kata");
        System.out.println("4. Cari Kata dalam Teks");
        System.out.println("5. Keluar");
        System.out.print("Pilihan Anda: ");
    }

    private static String enterText(Scanner scanner) {
        System.out.println("Masukkan teks:");
        scanner.nextLine(); // Consume the newline character left by nextInt()
        return scanner.nextLine();
    }

    private static void countCharacters() {
        int charCount = inputText.length();
        System.out.println("Jumlah karakter: " + charCount);
    }

    private static void countWords() {
        int wordCount = inputText.split("\\s+").length;
        System.out.println("Jumlah kata: " + wordCount);
    }

    private static void searchWord(Scanner scanner) {
        System.out.println("Masukkan kata yang ingin dicari:");
        String searchWord = scanner.next();

        if (!searchWord.isEmpty()) {
            boolean wordFound = inputText.toLowerCase().contains(searchWord.toLowerCase());
        }
    }
}