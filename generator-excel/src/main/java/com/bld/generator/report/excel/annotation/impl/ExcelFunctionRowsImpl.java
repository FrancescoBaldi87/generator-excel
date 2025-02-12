/**
* @author Francesco Baldi
* @mail francesco.baldi1987@gmail.com
* @class com.bld.generator.report.excel.annotation.impl.ExcelFunctionRowsImpl.java
*/
package com.bld.generator.report.excel.annotation.impl;

import java.util.Arrays;

import com.bld.generator.report.excel.annotation.ExcelFunctionMergeRow;
import com.bld.generator.report.excel.annotation.ExcelFunctionRow;
import com.bld.generator.report.excel.annotation.ExcelFunctionRows;


/**
 * The Class ExcelFunctionRowsImpl.
 */
public class ExcelFunctionRowsImpl extends ExcelAnnotationImpl<ExcelFunctionRows>{

	
	/** The excel functions. */
	private ExcelFunctionRow[] excelFunctions;
	
	/** The excel function merges. */
	private ExcelFunctionMergeRow[] excelFunctionMerges;
	

	/**
	 * Instantiates a new excel function rows impl.
	 */
	public ExcelFunctionRowsImpl() {
		super();
	}

	/**
	 * Instantiates a new excel function rows impl.
	 *
	 * @param excelFunctions      the excel functions
	 * @param excelFunctionMerges the excel function merges
	 */
	public ExcelFunctionRowsImpl(ExcelFunctionRow[] excelFunctions, ExcelFunctionMergeRow[] excelFunctionMerges) {
		super();
		this.excelFunctions = excelFunctions;
		this.excelFunctionMerges = excelFunctionMerges;
	}

	/**
	 * Hash code.
	 *
	 * @return the int
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(excelFunctionMerges);
		result = prime * result + Arrays.hashCode(excelFunctions);
		return result;
	}

	/**
	 * Equals.
	 *
	 * @param obj the obj
	 * @return true, if successful
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExcelFunctionRowsImpl other = (ExcelFunctionRowsImpl) obj;
		if (!Arrays.equals(excelFunctionMerges, other.excelFunctionMerges))
			return false;
		if (!Arrays.equals(excelFunctions, other.excelFunctions))
			return false;
		return true;
	}

	/**
	 * Gets the excel functions.
	 *
	 * @return the excel functions
	 */
	public ExcelFunctionRow[] getExcelFunctions() {
		return excelFunctions;
	}

	/**
	 * Sets the excel functions.
	 *
	 * @param excelFunctions the new excel functions
	 */
	public void setExcelFunctions(ExcelFunctionRow[] excelFunctions) {
		this.excelFunctions = excelFunctions;
	}

	/**
	 * Gets the excel function merges.
	 *
	 * @return the excel function merges
	 */
	public ExcelFunctionMergeRow[] getExcelFunctionMerges() {
		return excelFunctionMerges;
	}

	/**
	 * Sets the excel function merges.
	 *
	 * @param excelFunctionMerges the new excel function merges
	 */
	public void setExcelFunctionMerges(ExcelFunctionMergeRow[] excelFunctionMerges) {
		this.excelFunctionMerges = excelFunctionMerges;
	}
	
	

}
