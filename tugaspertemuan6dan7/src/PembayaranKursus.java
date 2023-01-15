public class PembayaranKursus extends Pembayaran{

    PembayaranKursus(int biaya){
        super(biaya);
    }

    @Override
    int pembayaran() {
        return super.getBayarKursus();
    }
}
