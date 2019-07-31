package lab4.asd.kid;

import lab4.asd.PackAbstract;
import lab4.asd.Packaging;

public class KidPackage implements PackAbstract {
    @Override
    public Packaging createBagPackage() {
        return new KidBagPack();
    }

    @Override
    public Packaging createBoxPackage() {
        return new KidBoxPack();
    }

    @Override
    public Packaging createWrapPackage() {
        return new KidWrapPack();
    }
}
