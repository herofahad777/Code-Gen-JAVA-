 import java.util.Scanner;
public class PRGbuilder
{
    Scanner sc = new Scanner(System.in);
    short sca = 0;//Scanner on/off
    short clstype = 0;//class type accessiblity
    short cdtype = 0;
    String clsname = "CdGen";//default class name
    String skip = "";//to consume problems created by other Scanners
    public void Launcher()
    {
        importsetup obj = new importsetup();
        sca = obj.importsetup();
        System.out.println(sca);
        classtypesetup obj1 = new classtypesetup();
        clstype = obj1.classtypesetup();
        System.out.println(clstype);
        classnamesetup obj2 = new classnamesetup();
        clsname = obj2.classnamesetup();
        System.out.println(clsname);
        build();
    }
    void build()
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
    // void codetype()
    // {
        // System.out.println("To find the sum of \n1:Additon,2:Substraction,3:Multiply,4:Divide,any other number to leave blank");
        // cdtype = sc.nextShort();
        // skip = sc.nextLine();
    // }
    // void tests()
    // {
        
    // }
}
