import javax.swing.*;

public abstract class Lista implements ListaInterface {
    protected final JFrame principal;

    public Lista(JFrame principal) {
        this.principal = principal;
    }
}
