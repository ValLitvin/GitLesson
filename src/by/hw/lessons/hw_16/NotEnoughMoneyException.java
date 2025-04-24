package by.hw.lessons.hw_16;

public class NotEnoughMoneyException extends RuntimeException {
    private String errorCode;

    public NotEnoughMoneyException(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}