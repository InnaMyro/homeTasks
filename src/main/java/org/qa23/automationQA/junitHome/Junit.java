package org.qa23.automationQA.junitHome;



public class Junit {
    public static void main(String[] args) {


    }
    public static int sum(int one, int second) {
        if(one <= 0 || second <= 0) {
            return one + second;
        }else {
            return one + second + 1;
        }
    }


    public static int div(int one, int second) {
      //  try{
        return one / second;
       /* } catch (ArithmeticException e) {
            return 0;
        }*/
    }
}
