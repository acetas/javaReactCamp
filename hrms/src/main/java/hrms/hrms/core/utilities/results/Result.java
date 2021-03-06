package hrms.hrms.core.utilities.results;

public class Result {
	
	boolean success;
	String message;
	
	public Result(boolean success) {
		super();
		this.success = success;
	}
	
	public Result(boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}
	
	public boolean isSuccess() {
		return this.success;
	}
	
	public String getMessage() {
		return this.message;
	}
	
}
