package com.company;

public class Main {

  final String ALPHABET = " ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ";

  char [] alphabetToChars = ALPHABET.toCharArray();

  public int letterToNumber(char inputLetter) {
    for (int i = 0; i < alphabetToChars.length; i++) {
      if (alphabetToChars[i] == inputLetter){
        return i;
      }
    }
    return -1;
  }

  public char numberToLetter (int inputNumber){
    char number = ALPHABET.charAt(inputNumber);
    return number;
  }

  public static void main(String[] args) {
    Main obj = new Main();
    System.out.println(obj.letterToNumber('F'));
    System.out.println(obj.numberToLetter(6));
  }
}