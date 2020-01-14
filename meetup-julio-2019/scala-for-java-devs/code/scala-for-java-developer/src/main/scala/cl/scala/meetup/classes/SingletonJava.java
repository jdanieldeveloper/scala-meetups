package cl.scala.meetup.classes;

public class SingletonJava {

    public static void main(String args) {
        MySingleton mySingleton = MySingleton.getInstance();

    }

    public void getSingletonInstance(){
        MySingleton mySingleton = MySingleton.getInstance();
    }
}

class MySingleton {

    private static MySingleton mySingleton;

    private MySingleton() {
        if (mySingleton != null) {
            mySingleton = new MySingleton();
        }
    }

    public static MySingleton getInstance() {
        return new MySingleton();
    }

    public void print(){
        //TODO implement here
    }
}
