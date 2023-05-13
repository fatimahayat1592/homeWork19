package homeWork19;

public class Task4 {
   /* Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.*/
    private static void multiply(int a,int b){
        System.out.println(a*b);
    }
    private  static void multiply(int a,long b){
        System.out.println(a*b);
    }
    private  static void multiply(float a,double b){
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        multiply(15,30);
        multiply(1065,345434455L);
        multiply(65.76F,56656.98);
    }
}
