package nLayerdDemo.core;

import nLayerdDemo.jLogger.jLoggerManager;

public class JloggerManagerAdapter implements LoggerService{

	@Override
	public void logToSystem(String massege) {
		jLoggerManager jLoggerManager=new jLoggerManager();
		jLoggerManager.log(massege);
	}

}
