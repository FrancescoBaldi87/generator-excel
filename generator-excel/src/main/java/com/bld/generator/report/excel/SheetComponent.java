/**
* @author Francesco Baldi
* @mail francesco.baldi1987@gmail.com
* @class com.bld.generator.report.excel.SheetComponent.java
*/
package com.bld.generator.report.excel;


/**
 * The Interface SheetComponent.
 * <br>
 * SheetComponet is implemented from:<br>
 * <ol> 
 * <li>{@link com.bld.generator.report.excel.SheetData}</li>
 * <li>{@link com.bld.generator.report.excel.SheetSummary}</li>
 * </ol>
 * <br>
 * Its is used to merge different sheet through the class {@link com.bld.generator.report.excel.MergeSheet} 
 */
public interface SheetComponent {

	/**
	 * Sets the sheet name.
	 *
	 * @param sheetName the new sheet name
	 */
	public void setSheetName(String sheetName);
}
