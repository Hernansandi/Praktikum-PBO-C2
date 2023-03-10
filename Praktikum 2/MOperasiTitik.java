/*
 * File : MOperasiTitik.java (01/03/2023)
 * Penulis : Hernan Sandi Laksono (24060121130078)
 * Deskripsi : kelas yang berisi program utama operasi Titik
 */

class MOperasiTitik{
  public static void main(String[] args){
    Titik titik1 = new Titik(1.0, 2.0);
    OperasiTitik operasiTitik = new OperasiTitik();

    System.out.println("titik1(" + titik1.getAbsis() + "," + titik1.getOrdinat() + ")");

    operasiTitik.refleksiX(titik1);
    System.out.println("\nRefleksi terhadap sumbu X");
    System.out.println("titik1(" + titik1.getAbsis() + "," + titik1.getOrdinat() + ")");

    operasiTitik.refleksiY(titik1);
    System.out.println("\nRefleksi terhadap sumbu Y");
    System.out.println("titik1(" + titik1.getAbsis() + "," + titik1.getOrdinat() + ")");
    
  }

}
