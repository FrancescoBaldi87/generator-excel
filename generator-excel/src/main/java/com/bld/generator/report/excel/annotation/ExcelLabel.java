/**
* @author Francesco Baldi
* @mail francesco.baldi1987@gmail.com
* @class com.bld.generatorator.report.excel.annotation.ExcelLabel.java
*/
package com.bld.generator.report.excel.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;


/**
 * The Interface ExcelLabel.<br>
 * ExcelLabel writes a label on the sheet and it must be added in the field within the {@link com.bld.generator.report.excel.SheetData} classes.<br>
 * It is composed by:
 * <ul>
 * <li>ExcelCellsLayout - to define cell layout</li>
 * <li>ColumnMerge - to set the number of merged cells</li>
 * </ul>
 * 
 */
@Retention(RUNTIME)
@Target({ FIELD })
@Documented
public @interface ExcelLabel {

	/**
	 * Label layout.
	 *
	 * @return the excel cell layout
	 */
	public ExcelCellLayout labelLayout() default @ExcelCellLayout(font = @ExcelFont(bold = true),rgbFont = @ExcelRgbColor(red=(byte)190,green=(byte)72,blue=(byte)10),rgbForeground = @ExcelRgbColor(red=(byte)255,green=(byte)233,blue=(byte)148));
	
	/**
	 * Column merge.
	 *
	 * @return the int
	 */
	public int columnMerge() default 1;

	
	
}
