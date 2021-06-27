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

    /**
     * Default Constructor
     */
    public Computers() {
    }

    /**
     * Constructor
     * @param computerPrice belongs to computer price
     * @param computerScreenSize belongs to computer screen size
     * @param computerModel belongs to computer model
     * @param computerBrand belongs to computer brand
     * @param screenResolution belongs to computer screen resolution
     * @param processor belongs to computer processor
     * @param memory belongs to computer memory
     * @param storageCapacity belongs to computer storage capacity
     */
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

    public Double getComputerPrice() {
        return computerPrice;
    }

    public void setComputerPrice(Double computerPrice) {
        this.computerPrice = computerPrice;
    }

    public String getComputerScreenSize() {
        return computerScreenSize;
    }

    public void setComputerScreenSize(String computerScreenSize) {
        this.computerScreenSize = computerScreenSize;
    }

    public String getComputerModel() {
        return computerModel;
    }

    public void setComputerModel(String computerModel) {
        this.computerModel = computerModel;
    }

    public String getComputerBrand() {
        return computerBrand;
    }

    public void setComputerBrand(String computerBrand) {
        this.computerBrand = computerBrand;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(String storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
}
