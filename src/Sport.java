public class Sport  extends Moto {
    
    private String motor;
    private String potencia;
    private String tanque;

    public Sport(String motor, String potencia, String tanque, String placa, int modelo, int cilindraje) {
        super(placa, modelo, cilindraje);
        this.motor = motor;
        this.potencia = potencia;
        this.tanque = tanque;
    }
    
    

    public String getMotor() {
        return motor;
    }

    public String getPotencia() {
        return potencia;
    }

    public String getTanque() {
        return tanque;
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
        if (motor.equals("4T")) {
            return "La garantía de la moto es por 2 años";
        } else {
            return "La garantía de la moto es por 1 año";
        }

    }
}
    
    

