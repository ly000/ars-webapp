package edu.myan.common.exception;

public class TechnicalException extends RuntimeException {
  private static final long serialVersionUID = 1L;

  public TechnicalException(String detailMessage) {
    super(detailMessage);
  }

  public TechnicalException(String detailMessage, Throwable t) {
    super(detailMessage, t);
  }

}
