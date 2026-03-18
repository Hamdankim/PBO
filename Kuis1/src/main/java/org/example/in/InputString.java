package org.example.in;

public class InputString extends Input
{
    public InputString(String strB1, String strB2, String operator) {
        super(strB1, strB2, operator);
    }

    @Override
    public Object getB1() {
        Object ob1 = (Object) this.strB1;
        return ob1;
    }

    @Override
    public Object getB2() {
        Object ob2 = (Object) this.strB2;
        return ob2;
    }
}
