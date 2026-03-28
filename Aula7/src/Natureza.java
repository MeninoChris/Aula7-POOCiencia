public class Natureza extends Ciencia {

    private AreasNat areaNatureza;

    public Natureza(AreasNat a) {
        super("");
        this.areaNatureza = a;
        switch(a){
            case fisica: setArea("Fisica");
            break;
            case quimica: setArea("Quimica");
            break;
            case biologia: setArea("Biologia");
            break;
        }
    }

    @Override
    public void descricao() {
        switch (this.areaNatureza){
            case fisica:
                System.out.println("A fisica estuda a natureza");
                break;
            case quimica:
                System.out.println("A quimica estuda os quimicos");
                break;
            case biologia:
                System.out.println("A biologia estuda a natureza");
                break;
        }

    }
}
