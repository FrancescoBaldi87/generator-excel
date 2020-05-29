/**
* @author Francesco Baldi
* @mail francesco.baldi1987@gmail.com
* @class bld.generator.report.excel.constant.ColumnDateFormat.java
*/
package bld.generator.report.excel.constant;

/**
 * The Enum ColumnDateFormat.<br>
 * ColumnDateFormat is used to set the format type on the property format on annotation ExcelDate.
 * 
 */
public enum ColumnDateFormat {

    /** The dd mm yyyy. */
    DD_MM_YYYY("dd/MM/yyyy"),
	
	/** The dd mm yyyy hh mm ss. */
	DD_MM_YYYY_HH_MM_SS("dd/MM/yyyy HH:mm:ss"),
	
	/** The yyyy mm dd. */
	YYYY_MM_DD("yyyy/mm/dd"),
	
	/** The yyyy mm dd hh mm ss. */
	YYYY_MM_DD_HH_MM_SS("yyyy/mm/dd HH:mm:ss"),
	
	/** The parameter. <br>
	 * This option is set on properties file
	 * */
	PARAMETER("${bld.commons.date.format}")
	;
	
	/** The value. */
	private String value;

	/**
	 * Instantiates a new column date format.
	 *
	 * @param value the value
	 */
	private ColumnDateFormat(String value) {
		this.value = value;
	}

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	
	
	
	
}
