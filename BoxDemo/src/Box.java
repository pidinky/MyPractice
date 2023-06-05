public class Box {
    double height;
    double width;
    double length;

    double volume(){

        return height * width * length;
    }

    void setDimensions(double h, double w, double l){
        height = h;
        width = w;
        length = l;
    }
}
