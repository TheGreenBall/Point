public class Point {

    int x;
    int y;

    Point() {


    }


    Point(int x, int y){

        this.x = x;
        this.y = y;


    }

    Point(Point a) {



    }

    public int getX() {

        this.x = x;

        return x;

    }

    public int getY() {

        this.y = y;

        return y;


    }

  Point setLocation(int a, int b) {

        this.x = a;
        this.y = b;

        Point s = new Point(x,y);
        return s;


    }




}
