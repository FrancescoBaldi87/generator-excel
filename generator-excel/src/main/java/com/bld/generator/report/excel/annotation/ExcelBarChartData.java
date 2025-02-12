/**
 * @author Francesco Baldi
 * @email francesco.baldi1987@gmail.com
 * @class com.bld.generatorator.report.excel.annotation.ExcelBarChartData.java
 * 
 */
package com.bld.generator.report.excel.annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.apache.poi.xddf.usermodel.chart.BarDirection;


/**
 * The Interface ExcelBarChartData.
 */
@Documented
@Retention(RUNTIME)
@Target(ElementType.TYPE)
public @interface ExcelBarChartData {

	
	/**
	 * Value.
	 *
	 * @return the bar direction
	 */
	public BarDirection value() default BarDirection.BAR;
	
}
