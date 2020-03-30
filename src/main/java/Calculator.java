import org.graalvm.compiler.core.common.type.ArithmeticOpTable;

public class Calculator {
    public static void main(String[] args) throws  Exception{
        try{
            System.out.println("Sum is :" + Add("2,5"));
        }catch (Exception e){
            System.out.println(e);
        }


    }
    private static final String delimiter = ",|\n ";
    public static int Add(String input) throws  Exception{
        String[] numbers = input.split(delimiter);

        if (IsEmpty(input)){
            return 0;
        }
        if (input.length() == 1){
            return StringToInt(input);
        }else{
            return  GetSum(numbers);
        }

    }
    private static boolean IsEmpty(String numbers){
        return  numbers.isEmpty();
    }
    private  static int StringToInt(String numbers){
        return Integer.parseInt(numbers);

    }
    private static int GetSum(String[] num1) throws  Exception{
        FindException(num1);
   int sum = 0;
   for(String current: num1){
       if(StringToInt(current) > 999){
           continue;
       }
       sum += StringToInt(current);
   }
          return  sum;

    }
    public static void  FindException(String[] numbers) throws Exception{
        for (String current: numbers){
            if(StringToInt(current) < 0){
                throw new Exception("Negative number not allowed");
            }
        }
    }
}
