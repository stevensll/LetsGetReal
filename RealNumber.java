public class RealNumber{
    private double value;

    public RealNumber(double v){
        value  = v;
    }

    public double getValue(){
        return value;
    }

    public String toString(){
        return ""+getValue();
    }
    /* 
     *Return true when the values are within 0.001% of eachother.
    *Special case: if one is exactly zero, the other must be exactly zero.
    */
    public boolean equals(RealNumber other){
        boolean isEqual = false;
        double a = this.getValue();
        double b = other.getValue();
        double diffPercent = Math.abs( (a-b) / a);
        if (a == 0 && b == 0) isEqual = true;
        if (diffPercent < 0.00001) isEqual = true;
        return isEqual;
    }

    public RealNumber add(RealNumber other){
        return new RealNumber(this.getValue() + other.getValue());
    }

    public RealNumber subtract(RealNumber other){
        return new RealNumber(this.getValue() - other.getValue());
    }

    public RealNumber multiply(RealNumber other){
        return new RealNumber(this.getValue() * other.getValue());
    }

    public RealNumber divide(RealNumber other){
        return new RealNumber(this.getValue() / other.getValue());
    }

    
}