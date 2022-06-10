public class EyelashDecorator extends HairdressingServiceDecorator {

    public EyelashDecorator(HairdressingService additional){
        super (additional);
    }

    public EyelashDecorator(){
        this.hairdressing = hairdressing;
    }

    public String haircut(){
        return additional.haircut() + addEyelashCare();
    }
    private String addEyelashCare(){
        return " + eyelash care ";
    }

    public String eyelashcare(){
        return hairdressing.eyelashcare();
    }
    
}
