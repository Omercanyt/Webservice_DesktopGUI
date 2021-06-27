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

    /**
     * Getter for computer price
     * @return price of computer
     */
    public Double getComputerPrice() {
        return computerPrice;
    }

    /**
     * Setter gor computer price
     * @param computerPrice belongs to computer price
     */
    public void setComputerPrice(Double computerPrice) {
        this.computerPrice = computerPrice;
    }

    /**
     * Getter for computer screen size
     * @return screen size of computer
     */
    public String getComputerScreenSize() {
        return computerScreenSize;
    }

    /**
     * Setter for computer screen size
     * @param computerScreenSize belongs to computer screen size
     */
    public void setComputerScreenSize(String computerScreenSize) {
        this.computerScreenSize = computerScreenSize;
    }

    /**
     * Getter for computer model
     * @return model of computer
     */
    public String getComputerModel() {
        return computerModel;
    }

    /**
     * Setter for computer model
     * @param computerModel belongs to computer model
     */
    public void setComputerModel(String computerModel) {
        this.computerModel = computerModel;
    }

    /**
     * Getter for computer brand
     * @return brand of computer
     */
    public String getComputerBrand() {
        return computerBrand;
    }

    /**
     * Setter for computer brand
     * @param computerBrand belongs to computer brand
     */
    public void setComputerBrand(String computerBrand) {
        this.computerBrand = computerBrand;
    }

    /**
     * Getter for computer screen resolution
     * @return screen resolution of computer
     */
    public String getScreenResolution() {
        return screenResolution;
    }

    /**
     * Setter for computer screen resolution
     * @param screenResolution belongs to computer screen resolution
     */
    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    /**
     * Getter for computer processor
     * @return processor of computer
     */
    public String getProcessor() {
        return processor;
    }

    /**
     * Setter for computer processor
     * @param processor belongs to computer processor
     */
    public void setProcessor(String processor) {
        this.processor = processor;
    }

    /**
     * Getter for computer memory
     * @return memory of computer
     */
    public String getMemory() {
        return memory;
    }

    /**
     * Setter for computer
     * @param memory
     */
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
