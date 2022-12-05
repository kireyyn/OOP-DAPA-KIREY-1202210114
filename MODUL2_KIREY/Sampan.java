public class Sampan extends TransportasiAir{
        protected int layar;
       
        Sampan(int jumlahKursi,int biaya,int layar){
            super(jumlahKursi, biaya);
            this.layar = layar;
        }
        public void informasi(){
            System.out.printf("Transportasi air jenis %s sedang berlayar dengan mesin %d dengan kecepatan %.2f Ghz.\n",this.jumlahkursi,this.biaya,this.layar);
        }
    }

