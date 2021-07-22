package Shape;

public abstract class Shape {
    protected String type;

    public String getType(){
        return this.type;
    }
    public Shape(String type){
        this.type=type;
    }
    public final double Pi=3.14;



}



