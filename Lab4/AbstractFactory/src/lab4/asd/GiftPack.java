package lab4.asd;

import java.util.ArrayList;
import java.util.List;

public class GiftPack {
    private List<GiftItem> giftItems = new ArrayList<>();
    private Address shippingAddress;
    private String packType; //"Business", "Adults", or "Kids"

    public GiftPack(Address shippingAddress, String packType) {
        this.giftItems = giftItems;
        this.shippingAddress = shippingAddress;
        this.packType = packType;
    }

    public void addItem (GiftItem giftItem){
        giftItem.setPackaging(getPackageLevel().getMaterialPackage(giftItem.getPackingType()));
        giftItems.add(giftItem);
    }
    public float getCost(){
        if(giftItems != null){
            return giftItems.stream().map(x -> x.getPackaging().getCost()).reduce(Float::sum).get();
        }
        return 0;
    }
    public PackAbstract getPackageLevel(){
        return PackageLevelFactory.getPackageLevelFactory().getPackageLevel(this.packType);
    }
}
