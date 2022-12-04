public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat blank = new Perangkat("Snappy",4,2.2f);
        Laptop ltp = new Laptop("Samsung", 8, 4.2f, false);
        Handphone hp = new Handphone("Xiaomi",8,1.8f,true);
        blank.informasi();
        System.out.println();
        ltp.informasi();
        ltp.bukaGame("Feeding Frenzy");
        ltp.kirimEmail("kirey@gmail.com");
        ltp.kirimEmail("kirey@gmail.com","kirey2@gmail.com");
        System.out.println();
        hp.informasi();
        hp.telfon(628112233);
        hp.kirimSMS(628112233);
        hp.kirimSMS(628112233,628101612);

    }
}
