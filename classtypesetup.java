public class classtypesetup extends PRGbuilder
{
    public short classtypesetup()
    {
        System.out.println("Class type:-\n1:public\n2:protected\n3:private\nany other number for default");
        clstype = sc.nextShort();
        skip = sc.nextLine();
        return clstype;
    }
}