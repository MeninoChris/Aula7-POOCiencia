public abstract class Ciencia {
    private String area;
    public static int nObjs = 0;

    private Ciencia(String area) {
        this.area = area;
        nObjs++;
    }

    public abstract void descricao();{}

    public static Ciencia cria(String area){
        // --Fatory Method
        // -- FABRICA DE METODO ( PARA FABRICAR SEUS METODOS)
        switch(area.toLowerCase()) {
            case "historia":
                return new Historia();
            case "geografia":
                return new Geografia();
            case "Fisica":
                return new Natureza(AreasNat.fisica);
            case "quimica":
                return new Natureza(AreasNat.quimica);
            case "biologia":
                return new Natureza(AreasNat.biologia);
            default:
            return null;
        }
    }


    public void setArea(String area) {
        this.area = area;
    }
}
