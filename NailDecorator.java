public class NailDecorator extends HairdressingServiceDecorator{

    public NailDecorator(HairdressingService additional){
        super (additional);
    }
    public NailDecorator(){
        this.hairdressing = hairdressing;
    }

    public String haircut(){
        return additional.haircut() + addNailCare();
    }
    public String addNailCare(){
        return " + nail care ";
    }

    public String nailcare(){
        return hairdressing.nailcare();
    }
    
}
