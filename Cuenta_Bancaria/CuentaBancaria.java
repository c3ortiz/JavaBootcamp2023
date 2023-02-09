import java.util.Random;

public class CuentaBancaria {
    private String tipoCuenta = "";
    private double saldoCuentaCorriente = 0, saldoCuentaAhorros = 0;
    private static int numeroCuentasCreadas = 0;
    private static double saldoTotalCuentasCorriente = 0, saldoTotalCuentasAhorros = 0;
    private Long numeroCuenta;

    public CuentaBancaria(String tipoCuenta) {
        if (tipoCuenta.equals("CA") || tipoCuenta.equals("CC")) {
            this.tipoCuenta = tipoCuenta;
            System.out.println("Su numero de cuenta es: " + numeroCuenta());
        } else {
            System.out.println("Tipo de cuenta invalido");
        }
        numeroCuentasCreadas++;
    }

    public int getNumeroCuentasCreadas() {
        return numeroCuentasCreadas;
    }

    public double getSaldoCuenta() {
        return (tipoCuenta.equals("CA")) ? saldoCuentaAhorros : saldoCuentaCorriente;
    }

    public Long getNumeroCuenta() {
        return numeroCuenta;
    }

    public static double getSaldoTotalCuentasCorriente() {
        return saldoTotalCuentasCorriente;
    }

    public static double getSaldoTotalCuentasAhorros() {
        return saldoTotalCuentasAhorros;
    }

    public void depositarDinero(double montoDeposito) {
        if (tipoCuenta.equals("CA")) {
            saldoCuentaAhorros += montoDeposito;
            saldoTotalCuentasAhorros += montoDeposito;
        } else if (tipoCuenta.equals("CC")) {
            saldoCuentaCorriente += montoDeposito;
            saldoTotalCuentasCorriente += montoDeposito;
        }
    }

    public void retirarDinero(double montoRetiro) {
        if (tipoCuenta.equals("CA")) {
            if (saldoCuentaAhorros >= montoRetiro) {
                saldoCuentaAhorros -= montoRetiro;
                saldoTotalCuentasAhorros -= montoRetiro;
            } else {
                System.out.println("Fondos insuficientes");
            }
        } else if (tipoCuenta.equals("CC")) {
            if (saldoCuentaCorriente >= montoRetiro) {
                saldoCuentaCorriente -= montoRetiro;
                saldoTotalCuentasCorriente -= montoRetiro;
            } else {
                System.out.println("Fondos insuficientes");
            }
        }
    }

    Random randMachine = new Random();

    private Long numeroCuenta() {
        numeroCuenta = randMachine.nextLong(1000000000L, 9999999999L);

        return numeroCuenta;
    }
}
