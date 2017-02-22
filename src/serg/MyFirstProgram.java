package serg;

class MyFirstClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
class MySecondClass {
    int field_x = 0;
    int field_y = 0;
    
    MySecondClass(int field_x, int field_y) {
    	
    }
    private int getFieldX() {
        return field_x;
    }
    private int getFieldY() {
    	return field_y;
    }
    private void setFieldX(int field_x){
    	this.field_x = field_x;
    }
    private void setFieldY(int field_y){
    	this.field_y = field_y;
    }
}
