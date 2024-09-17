public class Calculator
{
    public  static  <T extends Number> Double sum(T num1,T num2)
    {
        return num1.doubleValue() + num2.doubleValue();

    }

    public  static  <T extends Number> Double multiply(T num1,T num2)
    {
        return num1.doubleValue() * num2.doubleValue();
    }

    public  static  <T extends Number> Double divide(T num1,T num2)
    {
        try {
            return num1.doubleValue() / num2.doubleValue();
        }
        catch (ArithmeticException e)
        {
            System.out.println("Деление на ноль");
            return null;

        }

    }

    public  static  <T extends Number> Double subtract(T num1,T num2)
    {
        return num1.doubleValue() - num2.doubleValue();
    }
}
