package AbstractionAndInterface;

/*
 * Interface is nothing but an abstract class which guarantees 100% abstraction.
 * 
 * Interface starts with a keyword called interface followed by interface name.
 * 
 * All methods which are available in interface are abstract and public methods.
 * 
 * We can not create an object for interface.
 * 
 * Between a class and an interface to create a relationship(IS-A) 
 * always we use "implements" keyword.
 * 
 * The one which exists on left hand side of implements is always subclass
 * 
 * The one which exists on right hand side of implements is always an interface
 * 
 * Between interface --> Class = implements
 * Between Class --> Class = extends
 * Between abstract class --> class = extends
 * Between interface --> interface = extends
 */

public interface WebDriver {
	
	String name = "Selenium";
	
	void get();
	
	abstract void maximize();
	
	public abstract void close();
}
