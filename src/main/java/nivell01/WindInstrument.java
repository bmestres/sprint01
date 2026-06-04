package nivell01;
// Concrete class
public class WindInstrument extends Instrument {

    // Constructor
    public WindInstrument(String name, double price){
        // Initialize superclass
        super(name, price);
    }
    // Implement concrete play action
    @Override
    public void play(){
        System.out.println("Està sonant un instrument de vent");
    }
}
