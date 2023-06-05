public class Box {
    double height;
    double width;
    double length;

    public Box(){
        height = 0;
        width = 0;
        length = 0;
    }

    public Box(double i) {
        height = width = length = i;
    }

    public Box(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    double volume(){

        return height * width * length;
    }

    /*void setDimensions(double h, double w, double l){
        height = h;
        width = w;
        length = l;
    }*/
}
