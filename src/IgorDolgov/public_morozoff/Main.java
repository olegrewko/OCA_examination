package IgorDolgov.public_morozoff;
class Morozoff {
    private int storage = 10; // семейные ценности в размере 10 чего-то там
    protected int vault() {
        int b = storage; // сохраним во временной переменной содержимое storage
        storage = 0; // обнулим хранилище – так как "все из него взяли"
        return b; // вернем то значение, которое ранее содержалось в хранилище
    }
}

public class Main {
    public static void main(String[] args) {
        PublicMorozoff publicMorozoff = new PublicMorozoff();
        System.out.println(publicMorozoff.vault());
        System.out.println(publicMorozoff.vault());
        System.out.println(publicMorozoff.vault());
        System.out.println(publicMorozoff.vault());
    }
}
 class PublicMorozoff extends Morozoff {
    @Override
    public int vault() {
        return super.vault();
    }
}
