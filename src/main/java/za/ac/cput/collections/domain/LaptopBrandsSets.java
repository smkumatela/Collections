package za.ac.cput.collections.domain;

/**
 * Created by Songezo on 2016-03-11.
 */
public class LaptopBrandsSets {

    private String brandName;
    private String processor;

    public LaptopBrandsSets() {
    }

    public LaptopBrandsSets(String brandName, String processor) {
        this.brandName = brandName;
        this.processor = processor;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "LaptopBrandsSets{" +
                "brandName='" + brandName + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}
