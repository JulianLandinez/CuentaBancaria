
import java.util.Random;
public class Cuenta {
    Random random = new Random();

    private double saldoDeCuenta;
    private String nombreDelTitular;
    private long numeroDeCuenta;

    public Cuenta() {

    }

    public Cuenta(double saldoDeCuenta, String nombreDelTitular) {
        this.saldoDeCuenta = saldoDeCuenta;
        this.nombreDelTitular = nombreDelTitular;
        this.numeroDeCuenta=(long) (random.nextDouble() * 9_000_000_000L) + 1_000_000_000L;

    }

    public void setIngreso(double ingreso){
        this.saldoDeCuenta+=ingreso;

    }
    public void setRetiro(double retiro){
        this.saldoDeCuenta-=retiro;

    }

    public double getSaldoDeCuenta() {
        return saldoDeCuenta;
    }

    public String getDatosCuenta() {
        return "El titular de la cuenta es : "+this.nombreDelTitular+" El saldo de la cuenta es: "+this.saldoDeCuenta+" El numnero de cuenta es: "+this.numeroDeCuenta;
    }

}
