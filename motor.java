
class Motor extends Kendaraan{
    int jmlpenumpang;
    Motor(String jns, String mrk, int rda, int hrg, int a) {
        super(jns, mrk, rda, hrg);
        jmlpenumpang = a;
    }

    public String print(Motor r){
        return "\n Jenis : " + r.jenis + 
                "\n Merk : " + r.merk + 
                "\n Jml Roda : " + r.jumlahRoda + 
                "\n Harga : " + r.harga + 
                "\n Jumlah Penumpang : " + jmlpenumpang + "orang";
        
    }
}
