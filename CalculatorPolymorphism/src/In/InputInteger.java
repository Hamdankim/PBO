package In;

public class InputInteger extends Input
{
    public InputInteger(String strB1, String strB2, String operator) {
        super(strB1, strB2, operator);
    }

    @Override
    public java.lang.Object getB1()
    {
        int b1 = Integer.parseInt(this.strB1);
        Object ob1 = (Object) b1;
        return ob1;
    }

    @Override
    public java.lang.Object getB2()
    {
        int b2 = Integer.parseInt(this.strB2);
        Object ob2 = (Object) b2;
        return ob2;
    }


}
