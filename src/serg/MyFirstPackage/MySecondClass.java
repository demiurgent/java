package serg.MyFirstPackage;

public class MySecondClass {
    private int field_x = 0;
    private int field_y = 0;
    
    public MySecondClass(int field_x, int field_y) {
    	
    }
    public int getFieldX() {
        return field_x;
    }
    public int getFieldY() {
    	return field_y;
    }
    public void setFieldX(int field_x){
    	this.field_x = field_x;
    }
    public void setFieldY(int field_y){
    	this.field_y = field_y;
    }
    public int getMin() {
        return Math.min(this.field_x, this.field_y);
    }
}
