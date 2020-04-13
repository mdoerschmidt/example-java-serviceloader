# example-java-serviceloader
This project demonstrates how to use the ServiceLoader API.

## The ServiceLoader API
The ServiceLoader API allows one to write extensible code. 

The code is separated into three parts:
* The _service_ itself. In commons it defines an interface between the service consumer and the service provider.
* The _service provider_ implements the service.
* The _servce consumer_ or _client_ uses the service.

An example is the Java Cryptographic API, which provides a generic interface (= service) for different cryptographic algorithms (= service provider).


### Using the API
Define the service. It can be either an interface or an abstract class.
```java
package example.service;

public interface AwesomeService {
	public void doSomething();
}
```

Instantiate the ServiceLoader:
```java
ServiceLoader<AwesomeService> loader = ServiceLoader.load(AwesomeService.class);
```

Use the service loader:
```
for(AwesomeService service : loader) {
	// Do something with the service
}
```

That's all.

### Implementing a service provider
A service provider is a class implementing the service interface or abstract class. The service provider must either have the default constructor or a non-argument constructor.

The service provider must be configured, so it can be found by the service loader. The configuration is simple. A text file named after the service class / interface is placed in META-INF/services and contains a list of classes implementing the service. Each provider class is placed in a separated line.

On instantiation of the service loader, it searches for those files and instantiated the service providers listed there. 

## The example
The example shows how to 
* define services 
* use the service loader and
* implement service providers.

The example defines multiple service providers and places each component in a separate Jar file.
s  
### Running the example
To run the examples, just run
```
ant run
```
