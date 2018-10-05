
public class nasabahBank {
    final int minSaldo = 50000;
    private String xNasabah;
    private int saldo;
    private String pesan;
    static int noTransaksi = 1;
    
    public void nasabah(String nama){
        xNasabah = nama;
        System.out.println("Nama Nasabah : " + xNasabah);
    }

    public void infoNasabah(){
        System.out.println("Nama Nasabah : " + xNasabah);
        System.out.println("Saldo anda saat ini : Rp." + saldo + "\n");
    }

    public int setTabung(int uang){
        return saldo = saldo + uang;
    }

     public void showSaldo(){
        System.out.println("Saldo anda saat ini : Rp." + saldo + "\n");
    }

    public void getSaldo(int tarik){
        if((saldo - tarik) < minSaldo ){
            System.out.println(noTransaksi + ". Penarikan tunai sebesar " + tarik + " gagal.");
            System.out.println("Maaf saldo anda tidak mencukupi untuk melakukan penarikan.");
        }
        else{
            saldo = saldo - tarik;
            System.out.println(noTransaksi + ". Penarikan tunai sebesar " + tarik + " sukses.");
            noTransaksi++;
        }
        
    }

     public void getSaldo(int tarik, String pesan){
        if((saldo - tarik) < minSaldo ){
            System.out.println(noTransaksi + ". Penarikan tunai sebesar " + tarik + " gagal.");
            System.out.println("Maaf saldo anda tidak mencukupi untuk melakukan penarikan.");
        }
        else{
            saldo = saldo - tarik;
            System.out.println(noTransaksi + ". Penarikan tunai sebesar " + tarik + " sukses.");
            System.out.println("    Self Note : " + pesan);
            noTransaksi++;
        }
        
    }
   
}
