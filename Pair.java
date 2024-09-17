public class Pair <T,Q>
{
    private T first;
    private Q second;


    Pair(T first,Q second)
    {
        this.first = first;
        this.second = second;
    }


    public T getFirst()
    {
        return first;
    }

    public Q getSecond() {
        return second;
    }

    @Override
    public String toString()
    {
        return "Первое значение: " + first + "\nВторое значение: " + second;
    }
}
