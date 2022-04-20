
public class java {
   public static void main(String args[]) {
      char operand = '*';
      
      int a=3;
      int b=7;

      switch(operand){
          case '+':
          System.out.println(a+b);
          break;

          case '-':
          System.out.println(a-b);
          break;
          
          case '*':
          System.out.println(a*b);
          break;

          case '/':
          System.out.println(a/b);
          break;

          default:
          System.out.println("invalid");
          
      }


   }

}
