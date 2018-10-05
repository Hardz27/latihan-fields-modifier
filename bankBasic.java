
public class bankBasic {

    public static void main(String[] args) {

        final String bank="Bank A";
        nasabahBank x=new nasabahBank();

        System.out.println("Nama Bank : " + bank);
        x.nasabah("Sofyan");
        x.setTabung(1000000);
        x.showSaldo();

        x.getSaldo(50000);
        x.showSaldo();

        x.getSaldo(200000,"Uang untuk bakar bakaran.");
        x.showSaldo();

        nasabahBank y=new nasabahBank();
        System.out.println("Nama Bank : " + bank);
        y.nasabah("Maulana");
        y.setTabung(1500000);
        y.showSaldo();

        y.getSaldo(250000);
        y.showSaldo();

        y.getSaldo(350000,"Uang untuk bakar bakaran.");
        y.showSaldo();

        y.getSaldo(1250000);
        y.showSaldo();

        System.out.println();

        //Pembuaktian penggunaan Heap Memmory
        x.infoNasabah();
        y.infoNasabah();
        
        // System.out.println("Total Transaksi Ambil Uang : " + y.noUrut);
        
    }
    
}
