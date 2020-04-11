package examples.serviceloader.consumer;

import java.util.ServiceLoader;

import examples.serviceloader.service.AwesomeService;

public final class ServiceConsumer {

	public static final String INPUT = "The quick Brown Fox jumped over The Lazy Dog.";
	
	public static final void main(final String[] args) {
		final ServiceLoader<AwesomeService> serviceLoader = ServiceLoader.load(AwesomeService.class);
		
		System.out.println("Calling the service providers:");
		
		for(final AwesomeService service : serviceLoader) {
			System.out.println(String.format(
					"Service '%s' returned : %s",
					service.getClass().getCanonicalName(),
					service.transform(INPUT)
					));
		}
		
		System.out.println("Done");
	}

}
