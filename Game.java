/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program_OOP;
import java.util.Scanner;
class Player{
    public String Nama;int JumlahKekuatan; 
    //definisi method 
    void fight(){
        System.out.println(Nama+" After Training ... ");
        System.out.println("Jumlah Kekuatan : " + JumlahKekuatan);
        
    }
    boolean isLose(){
        if(JumlahKekuatan <= 0)return true;return false;
    }
    boolean isWin(){
        if(JumlahKekuatan > 999)return true;return false;
    }
     boolean Train(){
        if(JumlahKekuatan <=999 && JumlahKekuatan >0 )return true;return false;
    }
}

public class Game {
    public static void main(String[] args) {
        System.out.println("Kamu harus melawan Monster");
        System.out.println("Kamu Menang melawan monster Tersebut apabila\nJumlah Kekuatan mu Lebih dari atau sama dengan Seribu");
        System.out.println(" Jumlah Kekuatan Didapat dari jumlah latihan dikali dua\n dikali min satu ditambah min 1000 ditambah 100\n dikali min satu dikali dua ");
        int HP;
        Scanner masuk =new Scanner(System.in);
                System.out.println("Masukkan Jumlah Latihan: ");
                        HP = masuk.nextInt();
                        
        Player name = new Player();
        name.Nama = "YOU";
        name.JumlahKekuatan = +HP*2*-1+-1000+100*-1*2;
        name.fight();
               if(name.isLose()){
                   System.out.println("You Lose");}
                   if(name.isWin()){
                    System.out.println("You Win");}
                     if(name.Train()){
                            System.out.println("You Still must training...");
                            }
                           }
               }
               
        // TODO code application logic here

    

