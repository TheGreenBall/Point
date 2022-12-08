public class Point {

    //public
    int x;
    int y;


    // finish making constructor
    Point() {


    }


    Point(int x, int y){

        this.x = x;
        this.y = y;


    }

    // finish making constructor
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

    Point translate(int t, int v) {

        this.x =  x + t;
        this.y = y + v;

        Point s = new Point(x,y);

        return s;
    }

    //ToString Method





}
