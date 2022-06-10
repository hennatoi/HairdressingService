public abstract class HairdressingServiceDecorator implements HairdressingService{

    protected HairdressingService additional;
    protected HairdressingService hairdressing;

    public HairdressingServiceDecorator(HairdressingService additional){
        this.additional = additional;
    }
    public HairdressingServiceDecorator(){
        this.hairdressing = hairdressing;
    }

    public String haircut(){
        return additional.haircut();
    }

    public String eyelashcare(){
        return hairdressing.eyelashcare();
    }

    public String nailcare(){
        return hairdressing.nailcare();
    }
    
}
