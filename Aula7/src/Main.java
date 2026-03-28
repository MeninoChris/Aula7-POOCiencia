

public class Main {
    public static void main(String[] args) {

        System.out.println(Ciencia.nObjs);

        // Ciencia c1 = new Historia();
        Ciencia c1 = Ciencia.cria("historia");
        c1.descricao();
        // Ciencia c2 = new Geografia();
        Ciencia c2 = Ciencia.cria("geografia");
        c2.descricao();
        // Ciencia c3 = new Natureza(AreasNat.fisica);
        Ciencia c3 = Ciencia.cria("fisica");
        c3.descricao();
        // Ciencia c4 = new Natureza(AreasNat.quimica);
        Ciencia c4 = Ciencia.cria("quimica");
        c4.descricao();
        // Ciencia c5 = new Natureza(AreasNat.biologia);
        Ciencia c5 = Ciencia.cria("biologia");
        c5.descricao();
    }
}