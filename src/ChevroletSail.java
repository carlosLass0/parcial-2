public class ChevroletSail extends Sedan {
    
    private String tanque;
    private boolean seguro; 
    

    public ChevroletSail(String tanque, boolean seguro, String placa, int modelo, double precio) {
        super(placa, modelo, precio);
        this.tanque = tanque;
        this.seguro = seguro;
    }

    public ChevroletSail(String tanque, boolean seguro, double motor, boolean frenos, String placa, int modelo, double precio) {
        super(motor, frenos, placa, modelo, precio);
        this.tanque = tanque;
        this.seguro = seguro;
    }

    public String Seguro() {
        if (seguro) {
            return "El automóvil tiene seguro todo riesgo";
        } else {
            return "El automóvil no tiene seguro todo riesgo";
        }
    }

    public String precioSeguro(double precio) {
        if (precio > 50000000) {
            double valorSeguro = precio * 0.1;
            return "El valor del seguro es: " + valorSeguro;
        } else {
            return ("No hay valor del seguro puesto que el valor del automóvil es menor a 50.000.000");

        
        public String Seguro() {
        if (seguro) {
            return ("El automóvil tiene seguro todo riesgo");
        } else {
            return ("El automóvil no tiene seguro todo riesgo");
        }
    }

    public String precioSeguro(double precio) {
        if (precio > 50000000) {
            double vSeguro = precio * 0.1;
            return ("El valor del seguro es: ") + vSeguro;
        } else {
            return ("No hay valor del seguro puesto que el valor del automóvil es menor a 50.000.000");
        }        
    }    
    }
    }


    
    

   

    

    
    
    
    
    
    
    
    
    
    
    

