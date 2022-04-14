package za.co.mcc;

public class Currencies {

  private final String one = "CAD";
  private final String two = "USD";
  private final String three = "CHF";
  private final String four = "EUR";
  private final String five = "KYD";
  private final String six = "GBP";
  private final String seven = "JOD";
  private final String eight = "OMR";
  private final String nine = "BHD";
  private final String ten = "KWD";

  static public String numberToString(int n){
  String number;
    if(n == 1){
    number = "one";
      return number;
  } else if(n == 2){
      number = "two";
      return number;
    } else if(n == 3){
      number = "three";
      return number;
    } else if(n == 4){
      number = "four";
      return number;
    } else if(n == 5){
      number = "five";
      return number;
    } else if(n == 6){
      number = "six";
      return number;
    } else if(n == 7){
      number = "seven";
      return number;
    } else if(n == 8){
      number = "eight";
      return number;
    } else if(n == 9){
      number = "nine";
      return number;
    } else if(n == 10) {
      number = "ten";
      return number;
    }
  }
}
