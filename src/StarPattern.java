public class StarPattern {
    public static void main(String[] args) {
        // Outer loop for number of lines
        for (int i = 1; i <= 5; i++) {
            // Inner loop for printing stars in each line
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
