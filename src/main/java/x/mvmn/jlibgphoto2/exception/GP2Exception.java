package x.mvmn.jlibgphoto2.exception;

public class GP2Exception extends RuntimeException {

	private static final long serialVersionUID = 1031237231932398086L;

	protected final int code;

	public GP2Exception(final int code) {
		super();
		this.code = code;
	}

	public GP2Exception(final int code, String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		this.code = code;
	}

	public GP2Exception(final int code, String message, Throwable cause) {
		super(message, cause);
		this.code = code;
	}

	public GP2Exception(final int code, String message) {
		super(message);
		this.code = code;
	}

	public GP2Exception(final int code, Throwable cause) {
		super(cause);
		this.code = code;
	}

	public int getCode() {
		return code;
	}
}