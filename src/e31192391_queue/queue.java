/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31192391_queue;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class queue {
// deklarasi variable yang digunakan
    int id;
    String nama,perlu;
    queue next;
    // deklarasi untuk scanner agar bisa input 
    static Scanner in=new Scanner(System.in);
    static Scanner str=new Scanner(System.in);
    public void input(){
        System.out.print("Masukkan id        : ");
        id=in.nextInt();
        System.out.print("Masukkan nama      : ");
        nama=str.nextLine();
        System.out.print("Masukkan keperluan : ");
        perlu=str.nextLine();
        next=null;
    }
    
    //method untuk menampilkan data
    public void read(){
        System.out.println("|| "+id+" \t|| "+nama+" \t|| "+perlu+" \t||");
        
    }
    
    //main method yang digunakan
    public static void main(String[] args){
        int menu=0;
        linked que=new linked();
        while(menu!=4){
            System.out.print("1.Enqueue\n2.Dequeue\n3.View\n");
            menu=in.nextInt();
            if(menu==1)que.enque();
            else if(menu==2)que.deque();
            else if(menu==3)que.view();
            else System.out.println("- Salah -");
            System.out.println("");
        }
    }
}

    

