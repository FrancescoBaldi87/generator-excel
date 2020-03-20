/**
* @author Francesco Baldi
* @mail francesco.baldi1987@gmail.com
* @class bld.generator.report.excel.annotation.ExcelFunction.java
*/
package bld.generator.report.excel.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

// TODO: Auto-generated Javadoc
/**
 * The Interface ExcelFunction.
 */
@Documented
@Retention(RUNTIME)
@Target(FIELD)
public @interface ExcelFunction {

	/**
	 * Function.
	 *
	 * @return the string
	 */
	public String function();
	
	/**
	 * Name function.
	 *
	 * @return the string
	 */
	public String nameFunction();
	
	/**
	 * Another table.
	 *
	 * @return true, if successful
	 */
	public boolean anotherTable() default true;
	
}
