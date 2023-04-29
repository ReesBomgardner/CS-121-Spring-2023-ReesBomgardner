package Activity21;

public class Activity21 {
    public int q;
    public int r;
    public int s;
    static int counter = 1 ;
    public class constructor {
        public void main(String[] args) {
            q = 2;
            r = 4;
            s = 8;
            counter++;
        }
    }
        static int returnCounter(){
            return counter;
        }
        static int message(){
            System.out.println("Counter is up to: " + returnCounter());
            counter++;
            return returnCounter();
        }

}
