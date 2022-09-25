public class Main {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade){
            case 'A' :
                System.out.println("Mükemmel : Geçtiniz!");
            case 'B' :
            case 'C' :
                System.out.println("Çok Güzel : Geçtiniz!");
                break;
            case 'D' :
                System.out.println("İyi : Geçtiniz!");
                break;
            case 'E' :
                System.out.println("Maalesef : Kaldınız.");
                break;
            default:
                System.out.println("Yanlış giriş yaptınız.");
        }

    }
}