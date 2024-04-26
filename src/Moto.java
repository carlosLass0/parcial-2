public class Moto {
 
String placa; 
int modelo; 
int cilindraje; 

    public Moto(String placa, int modelo, int cilindraje) {
        this.placa = placa;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
    }

    public String getPlaca() {
        return placa;
    }

    public int getModelo() {
        return modelo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

 public String motorGarantia() {
        if (modelo.equals("honda")) {
            return "La garantía de la moto es por 2 años";
        } else {
            return "La garantía de la moto es por 1 año";
        }
 }
}



