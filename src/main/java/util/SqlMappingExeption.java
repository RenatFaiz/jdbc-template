package util;


public class SqlMappingExeption extends RuntimeException {
    public SqlMappingExeption() {
    }

    public SqlMappingExeption(String message) {
        super(message);
    }

    public SqlMappingExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public SqlMappingExeption(Throwable cause) {
        super(cause);
    }

    protected SqlMappingExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
