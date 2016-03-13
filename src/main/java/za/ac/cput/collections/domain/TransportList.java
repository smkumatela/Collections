package za.ac.cput.collections.domain;

/**
 * Created by Songezo on 2016-03-10.
 */
public class TransportList {

    private String transportName;
    private String transportType;

    public TransportList() {
    }

    public TransportList(String transportName, String transportType) {
        this.transportName = transportName;
        this.transportType = transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }

    public String getTransportName() {
        return transportName;
    }

    public String getTransportType() {
        return transportType;
    }

    @Override
    public String toString() {
        return "TransportList{" +
                "transportName='" + transportName + '\'' +
                ", transportType='" + transportType + '\'' +
                '}';
    }
}
