public class Main {
    public static void main(String[] args) {

        BiscuitDesignFactory biscuitDesignFactory = new BiscuitDesignFactory();

        BiscuitDesign lionDesign=biscuitDesignFactory.getBiscuitDesign("LionDesign");
        BiscuitDesign rabitDesign=biscuitDesignFactory.getBiscuitDesign("rabitDesign");
        BiscuitDesign parrotDesign=biscuitDesignFactory.getBiscuitDesign("parrotDesign");

        lionDesign.build();
        rabitDesign.build();
        parrotDesign.build();


    }
}