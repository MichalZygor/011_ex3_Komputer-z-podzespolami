abstract public class Component {
    private String modelName;
    private String producerName;
    private String serialNumber;

    public Component(String modelName, String producerName, String serialNumber) {
        this.modelName = modelName;
        this.producerName = producerName;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "model name='" + modelName +
                "', producer name='" + producerName +
                "', serial number='" + serialNumber +"'";
    }
}
