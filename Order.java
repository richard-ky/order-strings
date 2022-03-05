/* 
 * Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.
 * Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
 * If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.
 */

public class Order {
  public static String order(String words) {
    String[] wordList = words.split(" ");
    String[] orderedWords = new String[9];
    String finalList = "";
    
    if (words == "") {
      return "";
    }
    
    for (String word: wordList) {
      // I am calling this array "characters" because 
      // each String consists of only 1 character 
      String[] characters = word.split("");
      
      for (String character: characters) {
        if (Character.isDigit(character.charAt(0))) 
          orderedWords[character.charAt(0) - '0' - 1] = word;
      }        
    }
    
    for (int i = 0; i < orderedWords.length; i++) {
      if (orderedWords[i] != null) 
        finalList = finalList + " " + orderedWords[i];
    }
    
    return finalList.trim();
  }
}
