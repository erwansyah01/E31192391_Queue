/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31192391_queue;

/**
 *
 * @author ASUS
 */
class linked{
    queue head,tail;
    public linked(){
        head=null;
        tail=null;
    }
    
    // method untuk enque atau penambahan data baru
    public void enque(){
        queue baru=new queue();
        baru.input();
        if(head==null)head=baru;
        else tail.next=baru;
        tail=baru;
    }
    
    // method untuk deque atau menghapus data lama
    public void deque(){
        if(head==null)System.out.println("- Kosong -");
        else{
            System.out.println("Keluar Data Dengan Id : "+head.id);
            head=head.next;
        }
    }
    
    // method untuk menampilkan data yang ada / yang telah ditambahkan dan belum dihapus
    public void view(){
        if(head==null)System.out.println("- Kosong -");
        else{
            System.out.println("|| Id \t|| Nama \t|| Keperluan \t||");
            System.out.println("===================================");
            for(queue a=head; a!=null; a=a.next) a.read();
        }
    }
}
