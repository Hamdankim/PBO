import In.Input;
import In.InputFloat;
import In.InputInteger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Tampilan t = new Tampilan();
        t.tampilkan();

        Input i = t.getInput();

        Mesin m = new Mesin();
        if (i instanceof InputInteger)
        {
            m.hitung((InputInteger) i);
        }
        else if (i instanceof InputFloat)
        {
            m.hitung((InputFloat) i);
        }
    }
}