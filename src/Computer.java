public class Computer {
    public static void main(String[] args) {

        try {
            HardDrive hardDrive = new HardDrive("SSD BX500", "Crucial", "CT120BX500SSD1",
                    1000, 90000);
            Memory memory = new Memory("DDR3 ", "GoodRam", "DDR3-1600 CL11 Single Rank",
                    1600, 85);
            Processor processor = new Processor("Intel Core 3", "Intel",
                    "Intel Core i3-10XXX", 3600, 60);

            System.out.println("- - - Nominal data - - - ");
            System.out.println(hardDrive);
            System.out.println(memory);
            System.out.println(processor);
            System.out.println();

            System.out.println("- - - Memory overclock - - -");
            memory.overclock(220);
            System.out.println(memory);
            System.out.println();

            System.out.println("- - - Processor overclock - - -");
            processor.overclock(130);
            System.out.println(processor);
            System.out.println();

            System.out.println("- - - Processor overclock with minus frequency - - -");
            processor.overclock(-120);
            System.out.println(processor);
        } catch (RuntimeException e){
            System.err.println(e.getMessage());
        }

    }
}
