package handler;

public class LogCommand implements Command {
        private LogHandler handler;
        private LogLevel level;
         public LogCommand(LogHandler handler, LogLevel level) {
        	 this.handler=handler;
        	 this.level=level;
         }
         public void execute(String message) {
        	 handler.handleLog(level,message);
         }
} 
