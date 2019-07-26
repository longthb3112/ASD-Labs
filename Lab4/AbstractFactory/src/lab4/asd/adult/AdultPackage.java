package lab4.asd.adult;

import lab4.asd.PackAbstract;
import lab4.asd.Packaging;

public class AdultPackage implements PackAbstract {
    @Override
    public Packaging createBagPackage() {
        return new AdultBagPack();
    }

    @Override
    public Packaging createBoxPackage() {
        return new AdultBoxPack();
    }

    @Override
    public Packaging createWrapPackage() {
        return new AdultWrapPack();
    }
}
