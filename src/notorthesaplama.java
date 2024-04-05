import java.util.Scanner;
public class notorthesaplama {
    public static void main(String[] args) {

        //Değişkenler
        int mat, fizik, kimya, turkce, tarih, muzik;
        // Scanner tanımlama
        Scanner inp = new Scanner(System.in);
        //Kullanıcı girişi
        System.out.print("Matematik Notu: ");
        mat = inp.nextInt();
        System.out.print("Fizik Notu: ");
        fizik = inp.nextInt();
        System.out.print("Kimya Notu: ");
        kimya = inp.nextInt();
        System.out.print("Türkçe Notu: ");
        turkce = inp.nextInt();
        System.out.print("Tarih Notu: ");
        tarih = inp.nextInt();
        System.out.print("Müzik Notu: ");
        muzik = inp.nextInt();
        double toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6;
        System.out.println("Ortalama: " + sonuc);

    }

}
