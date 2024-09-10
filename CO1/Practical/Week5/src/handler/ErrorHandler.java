package handler;

public class ErrorHandler extends LogHandler {
	protected boolean canHandle(LogLevel level) {
		return level == LogLevel.ERROR;
	}
	protected void log(String message) {
		System.out.println("ERROR: "+message);
	}

}
