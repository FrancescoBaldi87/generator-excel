/**
 * @author Francesco Baldi
 * @email francesco.baldi1987@gmail.com
 * @class com.bld.generatorator.report.excel.annotation.ExcelFormulaAlias.java
 * 
 */
package com.bld.generator.report.excel.annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;


/**
 * The Interface ExcelFormulaAlias.
 */
@Retention(RUNTIME)
public @interface ExcelFormulaAlias {

	/**
	 * Alias.
	 *
	 * @return the string
	 */
	public String alias();
	
	/**
	 * Sheet.
	 *
	 * @return the string
	 */
	public String sheet() default "";
	
	/**
	 * Coordinate.
	 *
	 * @return the string
	 */
	public String coordinate();
	
	/**
	 * Block column.
	 *
	 * @return true, if successful
	 */
	public boolean blockColumn() default false;
	
	/**
	 * Block row.
	 *
	 * @return true, if successful
	 */
	public boolean blockRow() default false;
}
