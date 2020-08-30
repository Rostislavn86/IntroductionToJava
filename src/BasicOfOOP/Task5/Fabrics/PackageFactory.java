package BasicOfOOP.Task5.Fabrics;

import BasicOfOOP.Task5.CreatePaсkage;
import BasicOfOOP.Task5.Package.GiftWrap;
import BasicOfOOP.Task5.Package.Paper;

public class PackageFactory
{
    static String packageName;

    public CreatePaсkage createPaсkage(String packageName)
    {
            if (packageName.equalsIgnoreCase("Бумага"))
            {
            this.packageName = new Paper().getPackageName();
            return new Paper();
            }
            if (packageName.equalsIgnoreCase("Подарочная упаковка"))
            {
            this.packageName = new GiftWrap().getPackageName();
            return new GiftWrap();
            }
            else
            {
                return null;
            }
    }

    public static String getPackageName()
    {
        return packageName;
    }
}
