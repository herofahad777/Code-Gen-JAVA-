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
        
        classtypesetup obj1 = new classtypesetup();
        clstype = obj1.classtypesetup();
        
        classnamesetup obj2 = new classnamesetup();
        clsname = obj2.classnamesetup();
        
        builder obj3 = new builder(sca,clstype,clsname,skip);
        
    }
    
    
    void tests()
    {
        
    }
}
