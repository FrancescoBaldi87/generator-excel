/**
* @author Francesco Baldi
* @mail francesco.baldi1987@gmail.com
* @class com.bld.generatorator.report.excel.annotation.ExcelSuperHeader.java
*/
package com.bld.generator.report.excel.annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;


/**
 * The Interface ExcelSuperHeader.<br>
 * ExcelSuperHeader defines the top level header cell and it sets the row height.<br>  
 * It is a property of the annotation {@link com.bld.generator.report.excel.annotation.ExcelSuperHeaders}.
 */
@Retention(RUNTIME)
public @interface ExcelSuperHeader {

	
	/**
	 * Header groups.
	 *
	 * @return the excel header group[]
	 */
	public ExcelSuperHeaderCell[] headerGroups() default {};
	

	/**
	 * Row height.
	 *
	 * @return the short
	 */
	public short rowHeight() default 2;
	
}
