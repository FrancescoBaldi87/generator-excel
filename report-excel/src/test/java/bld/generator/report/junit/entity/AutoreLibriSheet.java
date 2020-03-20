/**
* @author Francesco Baldi
* @mail francesco.baldi1987@gmail.com
* @class bld.generator.report.junit.entity.AutoreLibriSheet.java
*/
package bld.generator.report.junit.entity;

import javax.validation.constraints.Size;

import bld.generator.report.excel.SheetData;
import bld.generator.report.excel.annotation.ExcelFreezePane;
import bld.generator.report.excel.annotation.ExcelHeaderLayout;
import bld.generator.report.excel.annotation.ExcelLabel;
import bld.generator.report.excel.annotation.ExcelMarginSheet;
import bld.generator.report.excel.annotation.ExcelSheetLayout;

/**
 * The Class AutoreLibriSheet.
 */
@ExcelSheetLayout
@ExcelHeaderLayout
@ExcelMarginSheet(bottom = 1.5,left = 1.5,right = 1.5,top = 1.5)
@ExcelFreezePane(rowFreez = 3, columnFreez = 1)
public class AutoreLibriSheet extends SheetData<AutoreLibriRow>{

	/**
	 * Instantiates a new autore libri sheet.
	 *
	 * @param nameSheet the name sheet
	 */
	public AutoreLibriSheet(@Size(max = 30) String nameSheet) {
		super(nameSheet);
		
	}
	
	

	/**
	 * Instantiates a new autore libri sheet.
	 *
	 * @param nameSheet the name sheet
	 * @param label     the label
	 */
	public AutoreLibriSheet(@Size(max = 30) String nameSheet, String label) {
		super(nameSheet);
		this.label = label;
	}



	/**
	 * Gets the row class.
	 *
	 * @return the row class
	 */
	@Override
	public Class<AutoreLibriRow> getRowClass() {
		return AutoreLibriRow.class;
	}

	/** The label. */
	@ExcelLabel
	private String label;

	/**
	 * Gets the label.
	 *
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * Sets the label.
	 *
	 * @param label the new label
	 */
	public void setLabel(String label) {
		this.label = label;
	}
	
	
	
}
