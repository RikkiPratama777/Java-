class dataSmartphone
{
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
     public dataSmartphone(String nama1,String merek1,int tahunprod1,int baterai1, int RAM1, int ROM1,int stok1)
     {  this.nama=nama1;
        this.merek=merek1;
        this.tahunprod=tahunprod1;
        this.baterai = baterai1;
        this.ram = RAM1;
        this.rom = ROM1;
        this.stok = stok1;
     }
//method
public void tampilData()
{ System.out.println("=======Data Smartphone=========");
   System.out.println("Nama Smartphone      : "+this.nama);
   System.out.println("Merek Smartphone     : "+this.merek);
   System.out.println("Tahun produksi       : "+this.tahunprod);
   System.out.println("Baterai              : "+this.baterai + satuan);
   System.out.println("RAM                  : "+this.ram + Satuan);
   System.out.println("ROM                  : "+this.rom + Satuan);
   System.out.println("Stock                : "+this.stok);
   System.out.println("");
   System.out.println("");
}
} //end of class
 
 public class dataSmartphone1{                 //untuk nama file
 public static void main(String[] args){
    //instant obyek
    dataSmartphone Smartphone2=new dataSmartphone("Xiaomi Redmi 5A" ,"Xiaomi",2017, 3000 , 2 ,16, 100);
    Smartphone2.tampilData();
    dataSmartphone Smartphone3=new dataSmartphone("Galaxy J Seven Prime" ,"Samsung",2016,3300, 3,32,250);
    Smartphone3.tampilData();
    dataSmartphone Smartphone4=new dataSmartphone("Oppo F9" ,"Oppo",2018,3500, 4 , 64 , 500);
    Smartphone4.tampilData();
   }
}   

