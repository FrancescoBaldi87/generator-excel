/**
* @author Francesco Baldi
* @mail francesco.baldi1987@gmail.com
* @class bld.generator.report.excel.annotation.ExcelLayout.java
*/
package bld.generator.report.excel.annotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.apache.poi.ss.usermodel.BorderStyle;

// TODO: Auto-generated Javadoc
/**
 * The Interface ExcelLayout.
 */
@Retention(RUNTIME)
@Target(TYPE)
@Documented
public @interface ExcelLayout {

	/**
	 * Border.
	 *
	 * @return the border style
	 */
	public BorderStyle border() default BorderStyle.THIN;

	/**
	 * Margin.
	 *
	 * @return the excel margin sheet
	 */
	public ExcelMarginSheet margin() default @ExcelMarginSheet(top = 0.15, left = 0.15, right = 0.15, bottom = 0.15);
	
	
	
}
