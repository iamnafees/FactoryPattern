public class BiscuitDesignFactory {

    public BiscuitDesign getBiscuitDesign(String BiscuitDesign){

        if(BiscuitDesign.equalsIgnoreCase("LionDesign"))
        {
            return new LionDesign();
        }
        if(BiscuitDesign.equalsIgnoreCase("RabitDesign"))
        {
            return new RabitDesign();
        }
        if(BiscuitDesign.equalsIgnoreCase("ParrotDesign"))
        {
            return new ParrotDesign();
        }
        return  null;


    }
}
