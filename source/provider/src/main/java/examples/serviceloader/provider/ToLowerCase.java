package examples.serviceloader.provider;

import examples.serviceloader.service.AwesomeService;

/**
 * An implementation of the {@link AwesomeService}.
 */
public class ToLowerCase implements AwesomeService {

	@Override
	public String transform(String s) {
		return s.toLowerCase();
	}

}
