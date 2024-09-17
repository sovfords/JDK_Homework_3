import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        String[] strArray1 = new String[]{"fsad","dsa","231"};
        String[] strArray2 = new String[]{"fsadвфы","","231"};
        String[] wrongArray1 = new String[]{"123","21"};
        Integer[] wrongArray2 = new Integer[]{1,21,43};

        Pair<String,Integer> pair = new Pair<>("Str",12);

        System.out.println(Calculator.sum(1,1.5));
        System.out.println(Calculator.subtract(3.5,1.6));
        System.out.println(Calculator.multiply(3.5,2));
        System.out.println(Calculator.divide(14,7));

        System.out.println();

        System.out.println(compareArrays(strArray1,strArray2));
        System.out.println(compareArrays(strArray1,wrongArray1));
        System.out.println(compareArrays(strArray1,wrongArray2));

        System.out.println();

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);

    }
    public static <T> Boolean compareArrays(T[] array1,T[] array2)
    {
        if(array1.length == array2.length)
        {
            for (int i = 0; i < array1.length; i ++)
            {
                if(array1[i].getClass() != array2[i].getClass())
                {
                    return false;
                }
            }
        }
        else
        {
            return false;
        }
        return true;


    }

}
