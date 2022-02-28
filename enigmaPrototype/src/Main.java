import java.util.Scanner;

public class Main {

  final String ALPHABET ="ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ";

  public String encrypt(String message, int shiftValue) {
    message = message.toUpperCase();
    String cipherText = " ";
    for (int i = 0; i < message.length(); i++) {
        int charPos = ALPHABET.indexOf(message.charAt(i));
        int keyValue = (shiftValue + charPos) % 29;
        char replaceValue = ALPHABET.charAt(keyValue);
        cipherText += replaceValue;
    }
return cipherText;
  }

  public static void main(String[] args) {
    Main obj = new Main();
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter text you wish to encrypt: ");
    String message = scan.nextLine();
    System.out.println("Enter Shift Value: ");
    int key = scan.nextInt();
    System.out.println("Encrypted message: " + obj.encrypt(message, key));
  }
}
