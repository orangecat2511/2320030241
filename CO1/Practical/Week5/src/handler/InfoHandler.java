package handler;

public class InfoHandler extends LogHandler {
        protected boolean canHandle(LogLevel level) {
        	return level == LogLevel.INFO;
        }
        protected void log(String message) {
        	System.out.println("INFO: "+message);
        }
}
