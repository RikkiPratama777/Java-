class Superhero 
{
   //variabel instant
    private String nama;
    private String JenisKekuatan;
    private String CiriKhas;
    private String Kelemahan;
    private String MusuhUtama;
    private int TahunLahir;
    private String Motivasi_Yang_Didapat_Dari_Hero_Tersebut;
    

   //konstruktor
     public Superhero(String nama1,String JenisKekuatan1,String CiriKhas1,String Kelemahan1,String MusuhUtama1,int TahunLahir1,String Motivasi_Yang_Didapat_Dari_Hero_Tersebut1)
     {  this.nama=nama1;
        this.JenisKekuatan=JenisKekuatan1;
        this.CiriKhas=CiriKhas1;
        this.Kelemahan = Kelemahan1;
        this.MusuhUtama = MusuhUtama1;
          this.TahunLahir = TahunLahir1; 
          this.Motivasi_Yang_Didapat_Dari_Hero_Tersebut =Motivasi_Yang_Didapat_Dari_Hero_Tersebut1;
     }
//method
public void tampilData()
{ System.out.println("=======Data Smartphone=========");
   System.out.println("Nama Pahlawan        : "+ this.nama);
   System.out.println("Jenis Kekuatan       : "+ this.JenisKekuatan);
   System.out.println("Ciri Khas            : "+this.CiriKhas);
   System.out.println("Kelemahan            : "+this.Kelemahan);
   System.out.println("Musuh Utama          : "+this.MusuhUtama);
   System.out.println("Tahun Lahir          : "+this.TahunLahir);
   System.out.println("Movitasi untuk Kita  : "+this.Motivasi_Yang_Didapat_Dari_Hero_Tersebut);
   System.out.println("");
   System.out.println("");
}
} //end of class
 
 public class Superhero1{                 //untuk nama file
 public static void main(String[] args){
    //instant obyek
    Superhero Superhero2=new Superhero("Superman" ,"Power Up","Lambang S di Costum","Kryptonite","Pelaku Kejahatan",16, "Jangan Pernah Menyerah");
    Superhero2.tampilData();
   }
}   

