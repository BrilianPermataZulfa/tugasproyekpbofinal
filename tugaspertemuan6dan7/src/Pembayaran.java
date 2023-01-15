abstract public class Pembayaran {

    int biayaKursus;

    Pembayaran(int biaya){
        this.biayaKursus = biaya;
    }

    public int getBayarKursus(){
        return biayaKursus;
    }

    abstract int pembayaran();
}
