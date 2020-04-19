public class AdapterImpl implements Adapter{

    //Math math;
    @Override
    public Float twiceOf(Float f){
        System.err.println("call twiceOf");
        return Math.doubled(f.doubleValue()).floatValue();
    }

    @Override
    public Float halfOf(Float f){
        System.err.println("call half");
        return (float) Math.half(f.doubleValue());
    }

}

