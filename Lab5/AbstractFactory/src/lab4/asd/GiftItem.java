package lab4.asd;

public class GiftItem {
    private String giftId;
    private String giftName;
    private String description;

    private String packagingType; //"bag", "box", or "wrap".
    private Packaging packaging;
    public String getPackingType(){
        return this.packagingType;
    }
    public void setPackaging(Packaging packaging){
        this.packaging = packaging;
    }
    public Packaging getPackaging(){
        return this.packaging;
    }
    public GiftItem(String giftId, String giftName, String description, String packagingType) {
        this.giftId = giftId;
        this.giftName = giftName;
        this.description = description;
        this.packagingType = packagingType;
    }
}
