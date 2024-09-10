package handler;

public class DebugHandler extends LogHandler {
            protected boolean canHandle(LogLevel level) {
            	return level == LogLevel.DEBUG;
            }
            protected void log(String message) {
            	System.out.println("DEBUG: "+message);
            }
}
