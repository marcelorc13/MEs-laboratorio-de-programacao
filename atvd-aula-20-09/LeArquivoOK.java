
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeArquivoOK {

    private final FileReader entrada;

    public LeArquivoOK(String nomeArquivo) throws FileNotFoundException {
        this.entrada = new FileReader(nomeArquivo);
    }

    public String pegaPalavra() throws IOException {
        int c;
        StringBuilder buf = new StringBuilder();
        do {
            c = entrada.read();
            if (Character.isWhitespace((char) c)) {
                return buf.toString();
            } else {
                buf.append((char) c);
            }
        } while (c != -1);
        return buf.toString();
    }

    public static void main(String args[]) {

    }
}
