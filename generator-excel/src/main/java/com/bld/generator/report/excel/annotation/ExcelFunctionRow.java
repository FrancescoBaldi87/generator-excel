/**
* @author Francesco Baldi
* @mail francesco.baldi1987@gmail.com
* @class com.bld.generatorator.report.excel.annotation.ExcelFunctionRow.java
*/
package com.bld.generator.report.excel.annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.apache.poi.ss.usermodel.DataConsolidateFunction;
import org.apache.poi.ss.usermodel.HorizontalAlignment;


/**
 * The Interface ExcelFunctionRow.
 * ExcelFunctionMergeRow is used to configure the cell layout and define the excel function.<br>
 * It is composed from:
 * <ul>
 * <li>ExcelCellsLayout - to define cell layout</li>
 * <li>ExcelColumn - to define the header description and the position of column</li>
 * <li>ExcelFunction - to define the function</li>
 * <li>ExcelColumnWidth - to set column width</li>
 * <li>ExcelHeaderCellLayout - to define header cell layout</li>
 * <li>ExcelSubtotal - to execute subtotal function</li>
 * </ul>
 *  
 *  It is parameter of the annotation {@link com.bld.generator.report.excel.annotation.ExcelFunctionRows}.
 */
@Retention(RUNTIME)
@Target({})
@Documented
public @interface ExcelFunctionRow {
	
	/**
	 * Excel cells layout.
	 *
	 * @return the excel cell layout
	 */
	public ExcelCellLayout excelCellsLayout() default @ExcelCellLayout(horizontalAlignment = HorizontalAlignment.RIGHT,precision = 2);
	
	/**
	 * Excel column.
	 *
	 * @return the excel column
	 */
	public ExcelColumn excelColumn();
	
	/**
	 * Excel function.
	 *
	 * @return the excel function
	 */
	public ExcelFunction excelFunction();
	
	/**
	 * Excel column width.
	 *
	 * @return the excel column width
	 */
	public ExcelColumnWidth excelColumnWidth() default @ExcelColumnWidth; 
	
	
	/**
	 * Excel header cell layout.
	 *
	 * @return the excel header cell layout
	 */
	public ExcelHeaderCellLayout excelHeaderCellLayout() default  @ExcelHeaderCellLayout;
	
	
	/**
	 * Excel subtotal.
	 *
	 * @return the excel subtotal
	 */
	public ExcelSubtotal excelSubtotal() default @ExcelSubtotal(enable=false,dataConsolidateFunction=DataConsolidateFunction.SUM);
	
	public ExcelNumberFormat excelNumberFormat() default @ExcelNumberFormat;
}
