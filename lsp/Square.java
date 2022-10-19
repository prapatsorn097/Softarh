public class Square implements Shape {

    private int side;
    Square(){
    }

    Square(int side) {
        this.setSide(side);
    }
    
    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public int getArea(){
        return side*side;
    }
}