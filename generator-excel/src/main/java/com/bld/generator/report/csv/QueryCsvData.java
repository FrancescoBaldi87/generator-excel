/*
 * @author Francesco Baldi
 * @mail francesco.baldi1987@gmail.com
 * @class com.bld.generatorator.report.excel.QuerySheetData.java
 */
package com.bld.generator.report.csv;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.collections4.MapUtils;

import com.bld.generator.report.QuerySpreadsheetData;


/**
 * The Class QueryCsvData.
 *
 * @param <T> the generic type
 */
public abstract class QueryCsvData<T extends CsvRow> extends CsvData<T> implements QuerySpreadsheetData<T> {

	/** The map parameters. */
	private Map<String, Object> mapParameters;

	/**
	 * Instantiates a new query csv data.
	 */
	public QueryCsvData() {
		super();
		this.mapParameters = new HashMap<>();
	}

	/**
	 * Gets the map parameters.
	 *
	 * @return the map parameters
	 */
	@Override
	public Map<String, Object> getMapParameters() {
		return mapParameters;
	}

	/**
	 * Adds the parameters.
	 *
	 * @param key   the key
	 * @param value the value
	 */
	@Override
	public void addParameters(String key, Object value) {
		this.mapParameters.put(key, value);
	}
	
	/**
	 * Reset parameters.
	 */
	@Override
	public void resetParameters() {
		this.mapParameters = new HashMap<>();
	}

	/**
	 * Adds the parameters.
	 *
	 * @param parameters the parameters
	 */
	@Override
	public void addParameters(Map<String, Object> parameters) {
		if (MapUtils.isNotEmpty(parameters))
			for (Entry<String, Object> parameter : parameters.entrySet())
				this.mapParameters.put(parameter.getKey(), parameter.getValue());
	}

	/**
	 * Hash code.
	 *
	 * @return the int
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((mapParameters == null) ? 0 : mapParameters.hashCode());
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
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		QueryCsvData<?> other = (QueryCsvData<?>) obj;
		if (mapParameters == null) {
			if (other.mapParameters != null)
				return false;
		} else if (!mapParameters.equals(other.mapParameters))
			return false;
		return true;
	}

}
