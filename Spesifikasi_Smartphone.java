import java.util.Scanner;
class dataSmartphone{
   //variabel instant
    	protected String nama;
    	protected String merek;
    	protected int tahunprod;
    	protected int baterai;
    	protected int ram;
    	protected int rom;
    	protected int stok;
    	public String Satuan = "GB";
    	public String satuan = "mAH";
   //konstruktor
public dataSmartphone(String nama1,String merek1,int tahunprod1,int baterai1, int RAM1, int ROM1,int stok1){  
        	this.nama=nama1;
        	this.merek=merek1;
        	this.tahunprod=tahunprod1;
        	this.baterai = baterai1;
        	this.ram = RAM1;
        	this.rom = ROM1;
        	this.stok = stok1;}
   //method
public void tampilData(){ 
   	System.out.println("=======Data Smartphone=========");
   	System.out.println("Nama Smartphone    \t: "+this.nama);
   	System.out.println("Merek Smartphone  \t: "+this.merek);
   	System.out.println("Tahun produksi         \t: "+this.tahunprod);
   	System.out.println("Baterai               \t: "+this.baterai + satuan);
   	System.out.println("RAM                  \t: "+this.ram + Satuan);
   	System.out.println("ROM                  \t: "+this.rom + Satuan);
   	System.out.println("Stock                  \t: "+this.stok);
   	System.out.println("");
   	System.out.println("");}} //end of class

 class Smartphone extends Spesifikasi_Smartphone {

    private String Nama;
    private String Merek;
    protected int tahunprod;
    protected int baterai;
    protected int ram;
    protected int rom;
    protected int stok;
    protected String warna_favorit;
    // setter getter    

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getMerek() {
        return Merek;
    }

    public void setMerek(String Merek) {
        this.Merek = Merek;
    }

    public int getTahunprod() {
        return tahunprod;
    }

    public void setTahunprod(int tahunprod) {
        this.tahunprod = tahunprod;
    }

    public int getBaterai() {
        return baterai;
    }

    public void setBaterai(int baterai) {
        this.baterai = baterai;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    public String getWarna_Favorit() {
        return warna_favorit;
    }

    public void setWarna_Favorit(String warna_favorit) {
        this.warna_favorit = warna_favorit;
    }
   
}

 abstract public class Spesifikasi_Smartphone{ //untuk nama file
 public static void main(String [] args){
    //instant obyek
	System.out.println("");
	System.out.println("Nama \t: Rikki Pratama");
	System.out.println("NIM  \t: H1051181070");
    	System.out.println("");
    	dataSmartphone Smartphone1=new dataSmartphone("Xiaomi Redmi 5A" ,"Xiaomi",2017, 3000 , 2 ,16, 100);
    	Smartphone1.tampilData();
    	dataSmartphone Smartphone2=new dataSmartphone("Galaxy J Seven Prime" ,"Samsung",2016,3300, 3,32,250);
    	Smartphone2.tampilData();
    	dataSmartphone Smartphone3=new dataSmartphone("Oppo F9" ,"Oppo",2018,3500, 4 , 64 , 500);
    	Smartphone3.tampilData();
	Smartphone Rikki = new Smartphone();
        	Rikki.setNama("Xiaomi Redmi Note 2");
        	Rikki.setMerek("Xiaomi");
        	Rikki.setTahunprod(2000);
        	Rikki.setBaterai(3300);
        	Rikki.setRam(2);
        	Rikki.setRom(16);
        	Rikki.setStok(10);
	Rikki.setWarna_Favorit("Yellow");
        	System.out.println("My Smartphone \t\t\t: " +Rikki.getNama());
        	System.out.println("My Smartphone Merk \t\t: " +Rikki.getMerek());
        	System.out.println("My Smartphone Year \t\t: " +Rikki.getTahunprod());
        	System.out.println("My Smartphone Battery \t\t: " +Rikki.getBaterai()+" mAH");
        	System.out.println("My Smartphone Ram \t\t: " +Rikki.getRam()+ " GB");
        	System.out.println("My Smartphone Rom \t\t: " +Rikki.getRom()+" GB");
        	System.out.println("My Smartphone Stock \t\t: " +Rikki.getStok());
	System.out.println("My Smartphone Favorite color \t: " +Rikki.getWarna_Favorit());
	String nanya;
	Scanner masuk = new Scanner (System.in);
	System.out.print("Apakah Program ini Memuaskan ? (iya / tidak) : ");
	nanya = masuk.nextLine();
	if (nanya.equalsIgnoreCase("iya"))
	System.out.println ("Terima Kasih Atas Dukungan Anda");
	else if (nanya.equalsIgnoreCase("tidak"))
	System.out.println ("Mohon Maaf Program Ini Masih Berkembang");
 }
} 

