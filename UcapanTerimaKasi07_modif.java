import java.util.Scanner;
public class UcapanTerimaKasi07_modif {
    
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner (System.in);
        System.out.print("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;       
    }
    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n" + "You inspired in me a love for learning and me feel like i could ask you anything." );
    }
    public static void UcapanTambahan (String ucapan){
        System.out.println(ucapan);
    }
    public static void main(String[] args) {
        UcapanTerimaKasih();
        String ucapan = "Terima Kasih Semoga sehat selalu";
        UcapanTambahan(ucapan);
    }
}
