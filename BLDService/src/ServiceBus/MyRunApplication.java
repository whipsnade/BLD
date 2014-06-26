package ServiceBus;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;

public class MyRunApplication extends Application {
	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> empty = new HashSet<Class<?>>();

	public MyRunApplication() {
		singletons.add(new ConfigUtilService());
	}

	@Override
	public Set<Class<?>> getClasses() {
		return empty;
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
