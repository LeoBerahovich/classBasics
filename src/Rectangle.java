public class Rectangle {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength(){
        return this.length;
    }
    public int getWidth(){
        return this.width;
    }
    public void setLength(int len){
        this.length = len;
    }
    public void setWidth(int wid){
        this.width = wid;
    }
    public int getArea()  {
        return (this.width * this.length);
    }

    public int getDiagonal()  {
        return (int)Math.sqrt(this.length * this.length + this.width * this.width);
    }
    public boolean isSquare(){
        if (this.width == this.length){
            return true;
        }else{
            return false;
        }
    }
}
