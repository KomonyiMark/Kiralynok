package kiralynok;

import java.io.IOException;

public class Kiralynok {
    private Tabla tabla;
    public Kiralynok(){
     tabla = new Tabla('#');
    megoldasok();
    }
    public static void main(String[] args) throws IOException {
Kiralynok kir = new Kiralynok();
kir.megoldasok();
        
      
    }   

    private void megoldasok() {
        feladat4();
        feladat6();
        
        }

    private void feladat4() {
                //4.Feladat
  Tabla tabla = new Tabla('#');
        System.out.println("4. feladat: Az üres tábla");
        tabla.megjelenit();
          }

    private void feladat6() {
         System.out.println("6.Feladat: feltöltött tábla");
        tabla.elhelyez(8);
        tabla.megjelenit();
    }
    
}
