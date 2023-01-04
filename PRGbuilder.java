 
import java.util.Scanner;
public class PRGbuilder
{
    Scanner sc = new Scanner(System.in);
    short sca = 0;//Scanner on/off
    short clstype = 0;//class type accessiblity
    short cdtype = 0;
    String clsname = "build";//class name
    String skip = "";//to consume problems created by other Scanners
    void importsetup()
    {
        System.out.println("Scanner import press 1 for true\nany other number for false");
        sca = sc.nextShort();
        skip = sc.nextLine();
    }
    void classtypesetup()
    {
        System.out.println("Class type:-\n1:public\n2:protected\n3:private\nany other number for default");
        clstype = sc.nextShort();
        skip = sc.nextLine();
    }
    void classnamesetup()
    {
        System.out.println("Enter class name");
        clsname = sc.nextLine().trim();
    }
    void codetype()
    {
        System.out.println("To find the sum of \n1:Additon,2:Substraction,3:Multiply,4:Divide");
        cdtype = sc.nextShort();
        skip = sc.nextLine();
    }
    void build()
    {
        System.out.println("\n\n\n\n");
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
    }
    void main()
    {
        PRGbuilder obj = new PRGbuilder();
        obj.importsetup();
        obj.classtypesetup();
        obj.classnamesetup();
        obj.build();
    }
}
