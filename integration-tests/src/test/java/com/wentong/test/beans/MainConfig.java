package com.wentong.test.beans;

import com.wentong.test.beans.filter.CustomTypeFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(value = "com.wentong.test.beans", includeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM, value = {CustomTypeFilter.class})}, useDefaultFilters = false)

public class MainConfig {

}
