

public class builder
{
    public builder(short sca,short clstype,String clsname,String skip)
    {
    System.out.println("\n\n\n\n");
        System.out.println("//Code Gen Starting\n//Code gen made by Fahad Sameer Shaikh");
        switch(sca)
        {
            case 1:
            {
                System.out.println("import java.util.Scanner;");
                break;
            }
            default:;
        }
        switch(clstype)
        {
            case 1:
            {
                System.out.print("public ");
                break;
            }
            case 2:
            {
                System.out.print("protected ");
                break;
            }
            case 3:
            {
                System.out.print("private ");
                break;
            }
            default:;
        }
        System.out.print("class ");
        System.out.println(clsname);
        System.out.println("{\n      void main()\n{\n               \n} \n}");
    }
}
