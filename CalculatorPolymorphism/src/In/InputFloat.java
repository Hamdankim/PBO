package In;

public class InputFloat extends Input {

    public InputFloat(String strB1, String strB2, String operator) {
        super(strB1, strB2, operator);
    }

    @Override
    public java.lang.Object getB1() {
        Float b1 = Float.parseFloat(this.strB1);
        Object ob1 = (Object) b1;
        return ob1;
    }

    @Override
    public java.lang.Object getB2() {
        Float b2 = Float.parseFloat(this.strB2);
        Object ob2 = (Object) b2;
        return ob2;
    }
}
