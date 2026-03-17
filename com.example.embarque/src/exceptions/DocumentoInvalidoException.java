package exceptions;

public class DocumentoInvalidoException extends RuntimeException {
    public DocumentoInvalidoException(String mensage) {
        super(mensage);
    }
}
