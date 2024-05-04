package CoreJava;

public class ps3
{
    int a;

    public ps3(int a2)
    {
        this.a=a2;
    }

    public void multi()
    {
        a=a*2;
        System.out.println(a);
    }

    public int add()
    {
        a=a+2;
        return a;
    }

    public int sub()
    {
        a=a-2;
        return a;
    }

    public int multithree()
    {
        a=a*3;
        return a;
    }
}
