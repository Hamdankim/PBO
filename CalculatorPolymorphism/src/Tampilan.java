import In.Input;
import In.InputFloat;
import In.InputInteger;

import java.util.Scanner;

public class Tampilan
{
    private String tipeData;
    private Input input;
    private Scanner scanner;

    public Tampilan()
    {
        this.scanner = new Scanner(System.in);
        this.tipeData = "int";
    }

    public void tampilkan()
    {
        System.out.print("Masukkan Tipe Data: ");
        this.tipeData = this.scanner.nextLine();

        String strB1 = "0";
        String strB2 = "0";
        String operator = "+";

        System.out.print("Masukkan Bilangan-1: ");
        strB1 = this.scanner.nextLine();

        System.out.print("Masukkan Bilangan-2: ");
        strB2 = this.scanner.nextLine();

        System.out.print("Masukkan Operator: ");
        operator = this.scanner.nextLine();

        switch (this.tipeData)
        {
            case "int":
                this.input = new InputInteger(strB1, strB2, operator);
                break;
            case "float":
                this.input = new InputFloat(strB1, strB2, operator);
                break;
            default:
                System.out.println("[ERROR] Operator tidak valid!");
        }
    }

    public Input getInput() {
        return input;
    }
}
