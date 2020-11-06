public class Memory  extends Component implements Overclockable{
    private int frequency;
    private double temperature;
    private  int nominalFrequency;
    private static final int MAX_TEMPERATURE = 100;

    public Memory(String modelName, String producerName, String serialNumber, int frequency, double temperature) {
        super(modelName, producerName, serialNumber);
        this.frequency = frequency;
        this.nominalFrequency = frequency;
        this.temperature = temperature;
    }

    @Override
    public void overclock(int frequencyToAdd) {
        frequency += frequencyToAdd;
        temperature += 0.15 * frequencyToAdd;
        if (temperature > MAX_TEMPERATURE)
            throw new RuntimeException("The added frequency caused over limit of temperature for Memory. " +
                    "The limit is: " + MAX_TEMPERATURE);
        else if (frequency < nominalFrequency) throw new RuntimeException("The frequency can't be less than nominal.");
    }

    @Override
    public String toString() {
        return "Memory{" +
                super.toString() +
                ", frequency='" + frequency +
                "', temperature='" + temperature +
                "'}";
    }

}
