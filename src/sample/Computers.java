package sample;

public class Computers {
    private Double computerPrice;
    private String computerScreenSize;
    private String computerModel;
    private String computerBrand;
    private String screenResolution;
    private String processor;
    private String memory;
    private String storageCapacity;

    public Computers() {
    }

    public Computers(Double computerPrice, String computerScreenSize, String computerModel, String computerBrand, String screenResolution, String processor, String memory, String storageCapacity) {
        this.computerPrice = computerPrice;
        this.computerScreenSize = computerScreenSize;
        this.computerModel = computerModel;
        this.computerBrand = computerBrand;
        this.screenResolution = screenResolution;
        this.processor = processor;
        this.memory = memory;
        this.storageCapacity = storageCapacity;
    }
}
