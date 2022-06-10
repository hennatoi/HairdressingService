public class Haircut implements HairdressingService {

    @Override
    public String haircut(){
        return "Hair cut 45min. ";
    }
    @Override
    public String eyelashcare(){
        return "Eyelash care ";
    } 
    @Override
    public String nailcare() {
        return "Nail care ";
    }
    
}
