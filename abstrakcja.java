package Abstrakcja;

public class Transport_test {

    public static void main(String[] args) {
        Samolot s1 = new Samolot();
        s1.setPredkosc(800);
        s1.lec();
        
        Statek st1 = new Statek();
        st1.setPredkosc(30);
        st1.plyn();
    }
    
}

package Abstrakcja;

public interface Pływa {
    void plyn();
}


package Abstrakcja;

public interface Lata {
    void lec();
}


package Abstrakcja;

public class Statek implements Pływa{
    double predkosc;

    public double getPredkosc() {
        return predkosc;
    }

    public void setPredkosc(double predkosc) {
        this.predkosc = predkosc;
    }
   
    public void plyn(){
        System.out.println("Statek płynie z predkością: " + getPredkosc() + " wezłów.");
    }
}

package Abstrakcja;

public class Samolot implements Lata{
    double predkosc;

    public double getPredkosc() {
        return predkosc;
    }

    public void setPredkosc(double predkosc) {
        this.predkosc = predkosc;
    }
    
    public void lec(){
        System.out.println("Samolot leci z predkością: " + getPredkosc() + " kilometrow.");
    }
}