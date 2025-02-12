/**
* @author Francesco Baldi
* @mail francesco.baldi1987@gmail.com
* @class com.bld.generator.report.junit.entity.GenereSheet.java
*/
package bld.report.generator.junit.entity;

import jakarta.validation.constraints.Size;

import com.bld.generator.report.excel.SheetData;
import com.bld.generator.report.excel.annotation.ExcelHeaderLayout;
import com.bld.generator.report.excel.annotation.ExcelMarginSheet;
import com.bld.generator.report.excel.annotation.ExcelSheetLayout;


/**
 * The Class GenereSheet.
 */
@ExcelHeaderLayout
@ExcelSheetLayout(landscape = false)
@ExcelMarginSheet(bottom = 1.5,left = 1.5,right = 1.5,top = 1.5)
public class GenereSheet extends SheetData<GenereRow>{
	
	

	/**
	 * Instantiates a new genere sheet.
	 *
	 * @param nameSheet the name sheet
	 */
	public GenereSheet(@Size(max = 30) String nameSheet) {
		super(nameSheet);
	}


	
}
