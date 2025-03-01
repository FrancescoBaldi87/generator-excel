/**
 * @author Francesco Baldi
 * @email francesco.baldi1987@gmail.com
 * @class com.bld.generatorator.report.excel.exception.ExceptionExcelGenerator.java
 * 
 */
package com.bld.common.spreadsheet.exception;

/**
 * The Class ExceptionExcelGenerator.
 */
@SuppressWarnings("serial")
public class ExcelGeneratorException extends RuntimeException {

	/**
	 * Instantiates a new exception excel generator.
	 */
	public ExcelGeneratorException() {
		super();
	}

	/**
	 * Instantiates a new exception excel generator.
	 *
	 * @param message the message
	 * @param cause the cause
	 */
	public ExcelGeneratorException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new exception excel generator.
	 *
	 * @param message the message
	 */
	public ExcelGeneratorException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new exception excel generator.
	 *
	 * @param cause the cause
	 */
	public ExcelGeneratorException(Throwable cause) {
		super(cause);
	}

	
	
}
