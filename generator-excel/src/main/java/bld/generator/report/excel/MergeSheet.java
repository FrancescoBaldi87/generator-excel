/**
* @author Francesco Baldi
* @mail francesco.baldi1987@gmail.com
* @class bld.generator.report.excel.MergeSheet.java
*/
package bld.generator.report.excel;

import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class MergeSheet.
 */
public class MergeSheet extends BaseSheet {

	/** The list sheet. */
	private List<SheetComponent> listSheet;

	/**
	 * Instantiates a new merge sheet.
	 *
	 * @param listSheet the list sheet
	 * @param nameSheet the name sheet
	 */
	public MergeSheet(List<SheetComponent> listSheet,String nameSheet) {
		super(nameSheet);
		this.listSheet = listSheet;
	}

	/**
	 * Instantiates a new merge sheet.
	 *
	 * @param nameSheet the name sheet
	 */
	public MergeSheet(String nameSheet) {
		super(nameSheet);
	}

	/**
	 * Gets the list sheet.
	 *
	 * @return the list sheet
	 */
	public List<SheetComponent> getListSheet() {
		if(this.listSheet==null)
			this.listSheet=new ArrayList<>();
		return listSheet;
	}

	/**
	 * Sets the list sheet.
	 *
	 * @param listSheet the new list sheet
	 */
	public void setListSheet(List<SheetComponent> listSheet) {
		this.listSheet = listSheet;
	}

}
