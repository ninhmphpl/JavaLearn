package OOP.Practice;

public class Rectangle {
    int width;
    int height;
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
    public int area (){
        return this.height*this.width;
    }
    public int primeter(){
        return (this.width+this.height)*2;
    }
    public void display(){
        System.out.println(" * ".repeat(this.width));
        for ( int i = 0 ; i <= this.height - 2; i ++){
            System.out.println(" * " + "   ".repeat(this.width -2 ) + " * ");
        }
        System.out.println(" * ".repeat(this.width));
    }

}
