public class TestCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("CA");
        CuentaBancaria cuenta2 = new CuentaBancaria("CA");
        CuentaBancaria cuenta3 = new CuentaBancaria("CC");
        CuentaBancaria cuenta4 = new CuentaBancaria("CC");

        cuenta1.depositarDinero(200);
        System.out.println(cuenta1.getSaldoCuenta());
        cuenta2.depositarDinero(200);
        System.out.println(cuenta2.getSaldoCuenta());
        cuenta3.depositarDinero(300);
        System.out.println(cuenta3.getSaldoCuenta());
        cuenta4.depositarDinero(300);
        System.out.println(cuenta4.getSaldoCuenta());

        System.out.println(cuenta1.getSaldoTotalCuentasAhorros());
        System.out.println(cuenta1.getSaldoTotalCuentasCorriente());

        cuenta1.retirarDinero(100);
        System.out.println(cuenta1.getSaldoCuenta());
        System.out.println(cuenta1.getNumeroCuenta());
        cuenta2.retirarDinero(250);
        System.out.println(cuenta2.getSaldoCuenta());
        System.out.println(cuenta2.getNumeroCuenta());
        cuenta3.retirarDinero(300);
        System.out.println(cuenta3.getSaldoCuenta());
        System.out.println(cuenta3.getNumeroCuenta());
        cuenta4.retirarDinero(400);
        System.out.println(cuenta4.getSaldoCuenta());
        System.out.println(cuenta4.getNumeroCuenta());

        System.out.println(cuenta1.getSaldoTotalCuentasAhorros());
        System.out.println(cuenta1.getSaldoTotalCuentasCorriente());
    }
}
