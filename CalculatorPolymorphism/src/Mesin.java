import In.InputFloat;
import In.InputInteger;

public class Mesin
{
    public void hitung(InputInteger input)
    {
       int b1 = (int) input.getB1();
       int b2 = (int) input.getB2();
       String op = input.getOperator();

       int hasil = 0;

       switch (op)
       {
           case "+":
               hasil = b1 + b2;
               break;
           case "-":
               hasil = b1 - b2;
               break;
           case "/":
               hasil = b1 / b2;
               break;
           case "*":
               hasil = b1 * b2;
               break;
           case "%":
               hasil = b1 % b2;
               break;
       }

        System.out.println(b1 + " " + op + " " + b2 + " = " + hasil );
    }

    public void hitung(InputFloat input)
    {
        Float b1 = (float) input.getB1();
        Float b2 = (float) input.getB2();
        String op = input.getOperator();

        Float hasil = 0.f;

        switch (op)
        {
            case "+":
                hasil = b1 + b2;
                break;
            case "-":
                hasil = b1 - b2;
                break;
            case "/":
                hasil = b1 / b2;
                break;
            case "*":
                hasil = b1 * b2;
                break;
            case "%":
                hasil = b1 % b2;
                break;
        }

        System.out.println(b1 + " " + op + " " + b2 + " = " + hasil );
    }
}
