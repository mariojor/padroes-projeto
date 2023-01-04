package padrao.projeto.prototype;

public abstract class NotaMusical implements Cloneable{
    public NotaMusical clone(){
        Object nota = null;
        try {
            nota = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (NotaMusical) nota;
    }
    public abstract void desenha();
}
