package lab4.asd;

import lab4.asd.adult.AdultPackage;
import lab4.asd.business.BusinessPackage;
import lab4.asd.kid.KidPackage;

public class PackageLevelFactory implements IPackageLevelFactory {
    private static IPackageLevelFactory packageLevelFactory = new PackageLevelFactory();
    private PackageLevelFactory(){}
    public static IPackageLevelFactory getPackageLevelFactory(){
        return packageLevelFactory;
    }
    @Override
    public PackAbstract getPackageLevel(String type) {
        PackAbstract pack;
        switch(type){
            case "Business":
                pack = new BusinessPackage();
                break;
            case "Kid":
                pack = new KidPackage();
            default:
                pack = new AdultPackage();
        }
        return pack;
    }
}
