/**
 * @author Francesco Baldi
 *
 * @mail francesco.baldi1987@gmail.com
 * @date 3-ago-2019
 */
package bld.generator.report.excel;

import java.util.List;
import java.util.Map;

/**
 * The Interface ExcelStatistico.
 */
public interface SheetStatistica {

	/**
	 * Checks if is grafico.
	 *
	 * @return true, if is grafico
	 */
	public boolean isGrafico();

	/**
	 * Gets the list charts.
	 *
	 * @return the list charts
	 */
	public Map<String, List<String[]>> getMapCharts();

	/**
	 * Gets the asse x.
	 *
	 * @return the asse x
	 */
	public List<String> getAsseX();

	/**
	 * Gets the asse y.
	 *
	 * @return the asse y
	 */
	public String getAsseY();
}
