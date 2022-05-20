//How to push/pull
//https://4bes.nl/2019/06/02/step-by-step-start-using-git-for-powershell/ 
//not done(obv)
public class StackExpTestDay2
{
 public static String infix2Postfix(String infix)
 {
    for(int i = 0; i < infix.length(); i++){
        int value = 0;
        ArrayList<String> arr = new ArrayList<String>();
        if(infix.indexOf(i).equals("+")||
        infix.indexOf(i).equals("-")||){
            /*arr.add(i-2);
            arr.add(i-1);*/
            value = 1;
        }
        if(infix.indexOf(i).equals("/")||
        infix.indexOf(i).equals("%")||
        infix.indexOf(i).equals("*")||){
            /*arr.add(i-2);
            arr.add(i-1);*/
            value = 2;
        }
        if(infix.indexOf(i).equals("!")){
            /*arr.add(i-2);
            arr.add(i-1);*/
            value = 3;
        }
        if(value!=0){
            if(value = 3||!(i<=2)){
              arr.add(0, i-2);
              arr.add(0, i-1);
              arr.add(infix.substring(i, i+1));
            } else { arr.add(0, i-1); }
            if(value = 3){
              arr.add(0, i-1);
              arr.add(infic.substring(i, i+1));
            }
            if(value = 3){
              arr.add(0, i-1);
              arr.add(infix.substring(i, i+1));
            }
        }
        return arr;
    }
 }
 
  public static void main(String[] args)
  {
    String answer, yourAns;
    String exp;
    int c=0, w=0;
    
    exp = "2+5+6";
    answer = "256++";
    System.out.println("Testing infix to postfix conversion for Single Digit Operation");
    System.out.println("Operations tested: +,-,*,/,%,^,!");
    System.out.println("Testing " + exp);
    yourAns = infix2Postfix(exp);
    if(yourAns.equals(answer)){
      System.out.println("Pass");
      c++;
    }else{
      System.out.println("Failed... Your answer: " + yourAns + "; Correct answer: " + answer);
      w++;
    }
    
    System.out.println();
    exp = "2+5*6-9";
    answer = "256*+9-";
    System.out.println("Testing " + exp);
    yourAns = infix2Postfix(exp);
    if(yourAns.equals(answer)){
      System.out.println("Pass");
      c++;
    }else{
      System.out.println("Failed... Your answer: " + yourAns + "; Correct answer: " + answer);
      w++;
    }
    
    System.out.println();
    exp = "(1+(1+1)^3)/2";
    answer = "111+3^+2/";
    System.out.println("Testing " + exp);
    yourAns = infix2Postfix(exp);
    if(yourAns.equals(answer)){
      System.out.println("Pass");
      c++;
    }else{
      System.out.println("Failed... Your answer: " + yourAns + "; Correct answer: " + answer);
      w++;
    }
        
   System.out.println();
    exp = "(1+2)*3%(2+3)";
    answer = "12+3*23+%";
    System.out.println("Testing " + exp);
    yourAns = infix2Postfix(exp);
    if(yourAns.equals(answer)){
      System.out.println("Pass");
      c++;
    }else{
      System.out.println("Failed... Your answer: " + yourAns + "; Correct answer: " + answer);
      w++;
    }

   System.out.println();
    exp = "(4-7%3)!";
    answer = "473%-!";
    System.out.println("Testing " + exp);
    yourAns = infix2Postfix(exp);
    if(yourAns.equals(answer)){
      System.out.println("Pass");
      c++;
    }else{
      System.out.println("Failed... Your answer: " + yourAns + "; Correct answer: " + answer);
      w++;
    }

    System.out.println();
    System.out.println("Number of correct answer: " + c);
    System.out.println("Number of incorect answer: " + w);
    System.out.println("Accuracy: " + Math.round((double)c/(c+w)*100)/100 + "%");
  }
}
