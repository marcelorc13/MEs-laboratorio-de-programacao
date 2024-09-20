
//NAO TA FUNCIONANDO NEM FAZ NENHUM SENTIDO
//KKKKKKKKKKKKKKKKKKKKKKKKKKKKK

import java.io.FileNotFoundException;

public class TesteLeArquivosOK {

    private LeArquivoOK l;
    private String nomeArq = "123abcd.txt";
    private boolean abriu = false;

    public TesteLeArquivosOK(String entrada) {
        this.nomeArq = entrada;
    }

    public void tentaAbrir() {
        while (!abriu) {
            try {
                l = new LeArquivoOK(nomeArq);
                abriu = true;

            } catch (FileNotFoundException f) {
                System.out.println("Deu pau ! " + f.getMessage() + "\n");
                f.printStackTrace();
                nomeArq = "c:\\autoexec.bat";
            }
        }
        System.out.println("Abriu o arquivo " + nomeArq);
    }

    public static void main(String args[]) {
        TesteLeArquivosOK t = new TesteLeArquivosOK("123abcd.txt");
        t.tentaAbrir();

    }
}
