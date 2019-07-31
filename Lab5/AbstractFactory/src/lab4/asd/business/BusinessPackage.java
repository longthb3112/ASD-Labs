package lab4.asd.business;

import lab4.asd.PackAbstract;
import lab4.asd.Packaging;

public class BusinessPackage implements PackAbstract {
    @Override
    public Packaging createBagPackage() {
        return new BusinessBagPack();
    }

    @Override
    public Packaging createBoxPackage() {
        return new BusinessBoxPack();
    }

    @Override
    public Packaging createWrapPackage() {
        return new BusinessWrapPack();
    }


}
