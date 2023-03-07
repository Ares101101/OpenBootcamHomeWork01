public class Main {
    public static void main (String[] args){

        suma(10 , 20 ,30);

        Coche miCoche = new Coche();
        miCoche.SumarPuertas();
        System.out.println(miCoche.puertas);
    }
    public static void suma(int a , int b, int c) {
        var suma = a+b+c;
        System.out.println(suma);
    }
}

class Coche {
    public  int puertas = 0;

    public void SumarPuertas (){
        this.puertas ++;
    }

}