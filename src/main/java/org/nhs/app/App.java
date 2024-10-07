public class App{

    public static void main (String args[]){

      one();
      line();
      two();
      line();
      three();
      line();
      challenge();

      

    }

    public static void one() {
        for (int number = 1; number <= 5; number++){
            for (int counter = 1; counter <= number; counter++){
               System.out.print(number);
             }
             System.out.println();
         }
      
   } 


   public static void two() {
      for (int x = 1; x <= 5; x++){
         for (int dot = 1; dot <= 5 - x; dot++){
            System.out.print(".");
         }
         for (int num = 1; num <= x; num++){
            System.out.print(x);
         }
         System.out.println();
      }
   }


   public static void three() {
      for (int x = 1; x <= 5; x++){
         for (int dot = 1; dot <= 5 - x; dot++){
            System.out.print(".");
         }

         System.out.print(x);
      
         for (int dot2 = 1; dot2 <= x - 1; dot2++){
            System.out.print(".");
         }
         System.out.println();
      }
   }


   public static void challenge() {
      int width = 9;
      for (int x = 1; x <= width; x++){
         for (int space = 1; space <= width - x; space++){
            System.out.print(" ");
         }
         for (int num1 = 1; num1 <=x * 2; num1 ++){
            System.out.print(x);
         }
         System.out.println();
      }
      for (int x = width - 1; x >= 1; x--){
         for (int space = 1; space <= width - x; space++){
            System.out.print(" ");
         }
         for (int num1 = 1; num1 <=x * 2; num1 ++){
            System.out.print(x);
         }
         System.out.println();
      }
   }



   public static void line() {
      System.out.println();
   }
}




    /* public static void main (String[] args){
       for (int number = 1; number <=5; number ++){
          for (int counter = 1; counter <=4; counter++){
             System.out.print(number);
           }
           System.out.println();
       }
    }
 }  */