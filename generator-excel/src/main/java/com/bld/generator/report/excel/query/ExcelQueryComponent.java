/*
 * @author Francesco Baldi
 * @mail francesco.baldi1987@gmail.com
 * @class com.bld.generator.report.excel.query.ExcelQueryComponent.java
 */
package com.bld.generator.report.excel.query;

import com.bld.generator.report.excel.QuerySheetData;
import com.bld.generator.report.excel.RowSheet;

/**
 * The Interface ExcelQueryComponent.
 */
public interface ExcelQueryComponent {

	/**
	 * Execute query.
	 *
	 * @param <T>            the generic type
	 * @param querySheetData the query sheet data
	 * @throws Exception the exception
	 */
	public <T extends RowSheet> void executeQuery(QuerySheetData<T> querySheetData) throws Exception;

}
