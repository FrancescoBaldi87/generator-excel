/**
 * @author Francesco Baldi
 * @mail francesco.baldi1987@gmail.com
 */
package com.bld.read.report.excel.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.bld.context.annotation.config.EnableContextAnnotatation;

/**
 * The Class ExcelReadConfiguration.<br>
 * This class is for configurations.
 */
@Configuration
@ComponentScan({"com.bld.read","com.bld.common.spreadsheet"})
@EnableContextAnnotatation
public class EnableExcelReadConfiguration {
	
	
}
