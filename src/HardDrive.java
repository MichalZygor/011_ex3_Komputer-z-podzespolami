public class HardDrive extends Component {
    private double capacity;
    private double iops;            // input/output operations per second

    public HardDrive(String modelName, String producerName, String serialNumber, double capacity, double iops) {
        super(modelName, producerName, serialNumber);
        this.capacity = capacity;
        this.iops = iops;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                super.toString() +
                ", capacity='" + capacity +
                "', iops='" + iops +
                "'}";
    }
}
