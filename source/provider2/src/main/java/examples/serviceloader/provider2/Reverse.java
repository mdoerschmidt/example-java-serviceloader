package examples.serviceloader.provider2;

import examples.serviceloader.service.AwesomeService;

/**
 * An implementation of the {@link AwesomeService}.
 */
public class Reverse implements AwesomeService {

	@Override
	public String transform(String s) {
		return new StringBuilder(s).reverse().toString();
	}

}
