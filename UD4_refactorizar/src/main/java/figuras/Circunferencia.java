package figuras;

public class Circunferencia {

    private double radio;
    private String color;
    private double PI = 3.1416;

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }
    public double calculaArea (){
        double area = 2 * PI * getRadio() * getRadio();
        
        return area; 
    }
    
    public void imprimir() {
        color = "rojo";
        double d = 2 * getRadio();
        System.out.println("Di�metro: " + d);
        System.out.println("Color: " + color);
        System.out.println(calculaArea());
    }

    public boolean esIgual(Circunferencia otro, boolean conDecimales) {
        double radio1 = this.getRadio();
        double radio2 = otro.getRadio();
        if (conDecimales) {
            if (radio1 == radio2) {
                return true;
            } else {
                return false;
            }
        } else {
            if (Math.abs(radio1 - radio2) < 1) {
                return true;
            } else {
                return false;
            }
        }
    }
}
