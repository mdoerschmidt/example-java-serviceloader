package examples.serviceloader.provider;

import examples.serviceloader.service.AwesomeService;

/**
 * An implementation of the {@link AwesomeService}.
 */
public class ToUpperCase implements AwesomeService {

	@Override
	public String transform(String s) {
		return s.toUpperCase();
	}

}
