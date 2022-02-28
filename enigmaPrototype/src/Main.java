import java.util.Scanner;

public class Main {

  final String ALPHABET = " ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ";

  public String encrypt(String message, int shiftValue) {
    message = message.toUpperCase();
    String cipherText = "";
    for (int i = 0; i < message.length(); i++) {
      int charPos = ALPHABET.indexOf(message.charAt(i));
      int keyValue = (shiftValue + charPos) % 29;
      if (charPos == 0) {
        keyValue = 0;
      }
      char replaceValue = ALPHABET.charAt(keyValue);
      cipherText += replaceValue;
    }
    return cipherText;
  }

  public String decrypt(String message, int shiftValue) {
    message = message.toUpperCase();
    String cipherText = "";
    for (int i = 0; i < message.length(); i++) {
      int charPos = ALPHABET.indexOf(message.charAt(i));
      int keyValue = (charPos - shiftValue) % 29;
      if (charPos == 0) {
        keyValue = 0;
      } else if (keyValue < 0) {
        keyValue = ALPHABET.length() + keyValue - 1;
      }
      char replaceValue = ALPHABET.charAt(keyValue);
      cipherText += replaceValue;
    }
    return cipherText;
  }

  public static void main(String[] args) {
    Main obj = new Main();
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter text you wish to encrypt/decrypt: ");
    String message = scan.nextLine();
    System.out.println("Enter Shift Value: ");
    int key = scan.nextInt();
  }
}