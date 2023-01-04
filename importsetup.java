public class importsetup extends PRGbuilder
{
    public short importsetup()
    {
        System.out.println("Scanner import press 1 for true\nany other number for false");
        sca = sc.nextShort();
        skip = sc.nextLine();
        return sca;
    }
}
