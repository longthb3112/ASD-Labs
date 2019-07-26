package lab4.asd;

public interface PackAbstract {
        abstract Packaging createBagPackage();
        abstract Packaging createBoxPackage();
        abstract Packaging createWrapPackage();
        default Packaging getMaterialPackage(String type){
                Packaging packaging;
                switch(type){
                        case "Bag":
                                packaging = createBagPackage();
                                break;
                        case "Box":
                                packaging = createBoxPackage();
                                break;
                        default :
                                packaging = createWrapPackage();
                                break;
                }
                return packaging;
        }

}
