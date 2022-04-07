/**
 * @author Francesco Baldi
 * @mail francesco.baldi1987@gmail.com
 */
package bld.read.report.excel.domain;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bld.generator.report.excel.constant.ExcelConstant;
import bld.read.report.excel.constant.ExcelExceptionType;
import bld.read.report.excel.constant.ExcelType;
import bld.read.report.excel.exception.ExcelReaderException;

/**
 * The Class ExcelRead.<br>
 * ExcelRead is the object that represents the excel file.<br>
 * It is composed by:
 * <ul>
 * <li>ReportExcel - to set the excel file in byte array</li>
 * <li>ListSheetRead - to set a SheetRead list where each object is a new instance</li>
 * <li>MapSheet - to get result SheetRead list through class type</li>
 * <li>ExcelType - to set the xls or xlsx type</li>
 * </ul>
 */
public class ExcelRead {

	/** The report excel. */
	private byte[] reportExcel;
	
	/** The list class sheet. */
	private List<SheetRead<? extends RowSheetRead>> listSheetRead;
	
	
	private Map<String,SheetRead<?>> mapSheet;
	
	
	
	/** The excel type. */
	private ExcelType excelType;
	
	

	/**
	 * Instantiates a new excel read.
	 */
	public ExcelRead() {
		super();
		this.excelType=ExcelType.XLS;
		this.listSheetRead=new ArrayList<>();
		this.mapSheet=new HashMap<>();
	}

	
	
	/**
	 * Gets the sheet.
	 *
	 * @param <T>    the generic type
	 * @param classe the classe
	 * @return the sheet
	 */
	@SuppressWarnings("unchecked")
	public <T extends SheetRead<?>> T getSheet(Class<T>classSheetRead,String sheetName) {
		return (T)this.mapSheet.get(sheetName);
	}



	/**
	 * Gets the report excel.
	 *
	 * @return the report excel
	 */
	public byte[] getReportExcel() {
		return reportExcel;
	}



	/**
	 * Sets the report excel.
	 *
	 * @param reportExcel the new report excel
	 */
	public void setReportExcel(byte[] reportExcel) {
		this.reportExcel = reportExcel;
	}



	/**
	 * Gets the list class sheet.
	 *
	 * @return the list class sheet
	 */
	public List<SheetRead<? extends RowSheetRead>> getListSheetRead() {
		return listSheetRead;
	}

	@SuppressWarnings("unchecked")
	public <T extends SheetRead<? extends RowSheetRead>> void addSheetConvertion(Class<T>classSheetRead,String sheetName) throws Exception {
		Constructor<?> constructor = classSheetRead.getConstructor(String.class);
		T sheetRead= (T) constructor.newInstance(sheetName);
		this.listSheetRead.add(sheetRead);
		if(sheetName.length()>ExcelConstant.SHEET_NAME_SIZE)
			throw new ExcelReaderException(ExcelExceptionType.MAX_SHEET_NAME, null);
		if(this.mapSheet.containsKey(sheetName))
			throw new ExcelReaderException(ExcelExceptionType.MULTIPLE_SHEET_NAME,sheetName);
		this.mapSheet.put(sheetName, sheetRead);
	}

	

	/**
	 * Sets the list class sheet.
	 *
	 * @param listSheetRead the new list class sheet
	 */
	public void setListSheetRead(List<SheetRead<? extends RowSheetRead>> listSheetRead) {
		this.listSheetRead = listSheetRead;
	}




	/**
	 * Gets the excel type.
	 *
	 * @return the excel type
	 */
	public ExcelType getExcelType() {
		return excelType;
	}



	/**
	 * Sets the excel type.
	 *
	 * @param excelType the new excel type
	 */
	public void setExcelType(ExcelType excelType) {
		this.excelType = excelType;
	}



	public Map<String, SheetRead<?>> getMapSheet() {
		return mapSheet;
	}



	public void setMapSheet(Map<String, SheetRead<?>> mapSheetBySheetName) {
		this.mapSheet = mapSheetBySheetName;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((excelType == null) ? 0 : excelType.hashCode());
		result = prime * result + ((listSheetRead == null) ? 0 : listSheetRead.hashCode());
		result = prime * result + ((mapSheet == null) ? 0 : mapSheet.hashCode());
		result = prime * result + Arrays.hashCode(reportExcel);
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExcelRead other = (ExcelRead) obj;
		if (excelType != other.excelType)
			return false;
		if (listSheetRead == null) {
			if (other.listSheetRead != null)
				return false;
		} else if (!listSheetRead.equals(other.listSheetRead))
			return false;
		if (mapSheet == null) {
			if (other.mapSheet != null)
				return false;
		} else if (!mapSheet.equals(other.mapSheet))
			return false;
		if (!Arrays.equals(reportExcel, other.reportExcel))
			return false;
		return true;
	}



	

	


	
}
