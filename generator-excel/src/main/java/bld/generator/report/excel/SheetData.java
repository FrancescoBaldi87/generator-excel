/**
 * @author Francesco Baldi
 *
 * @mail francesco.baldi1987@gmail.com
 * @date 3-ago-2019
 */
package bld.generator.report.excel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.Size;


/**
 * The Class ExcelDati.
 *
 * @param <T> the generic type
 */
public abstract class SheetData<T extends RowSheet> extends BaseSheet implements SheetComponent{
	
	private Map<String, Integer> mapFieldColumn;
		
	/**
	 * Instantiates a new sheet data.
	 *
	 * @param nameSheet the name sheet
	 */
	public SheetData(@Size(max = 30) String nameSheet) {
		super(nameSheet);
	}



	/** The list row sheet. */
	protected List<T> listRowSheet;
	

	/**
	 * Gets the list row excel.
	 *
	 * @return the list row excel
	 */
	public List<T> getListRowSheet() {
		if (listRowSheet == null)
			listRowSheet = new ArrayList<T>();
		return listRowSheet;
	}
	
	/**
	 * Sets the list row sheet.
	 *
	 * @param listRowSheet the new list row sheet
	 */
	public void setListRowSheet(List<T> listRowSheet) {
		this.listRowSheet = listRowSheet;
	}


	
	/**
	 * Gets the row class.
	 *
	 * @return the row class
	 */
	public abstract Class<T> getRowClass();

	public Map<String, Integer> getMapFieldColumn() {
		if(this.mapFieldColumn==null)
			this.mapFieldColumn=new HashMap<>();
		return mapFieldColumn;
	}

	protected void setMapFieldColumn(Map<String, Integer> mapFieldColumn) {
		this.mapFieldColumn = mapFieldColumn;
	}	
	
	
	
}
