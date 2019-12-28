package org.layz.hx.core.util.factory;

import java.util.ArrayList;
import java.util.List;

import org.layz.hx.core.util.converter.DataConverter;
import org.layz.hx.core.util.converter.DefaultBigDecimalDataConverter;
import org.layz.hx.core.util.converter.DefaultBooleanDataConverter;
import org.layz.hx.core.util.converter.DefaultDateDataConverter;
import org.layz.hx.core.util.converter.DefaultDoubleDataConverter;
import org.layz.hx.core.util.converter.DefaultFloatDataConverter;
import org.layz.hx.core.util.converter.DefaultIntegerDataConverter;
import org.layz.hx.core.util.converter.DefaultLongDataConverter;
import org.layz.hx.core.util.converter.DefaultObjectDataConverter;
import org.layz.hx.core.util.converter.DefaultStringDataConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * 对象转换工厂
 *
 */
public class DataConverterFactory {
	private static final Logger LOGGER = LoggerFactory.getLogger(DataConverterFactory.class);
	private static final List<DataConverter> store = new ArrayList<DataConverter>();
	private static final DataConverter defaultConverter = new DefaultObjectDataConverter();
	
	private DataConverterFactory(){
		
	}
	
	static {
		LOGGER.info("init DataConverter");
		store.add(new DefaultStringDataConverter());
		store.add(new DefaultDateDataConverter());
		store.add(new DefaultLongDataConverter());
		store.add(new DefaultIntegerDataConverter());
		store.add(new DefaultDoubleDataConverter());
		store.add(new DefaultBooleanDataConverter());
		store.add(new DefaultFloatDataConverter());
		store.add(new DefaultBigDecimalDataConverter());
	}
	
	public static DataConverter getConverter(Class<?> clazz){
		for (DataConverter converter : store) {
			if(converter.support(clazz)) {
				return converter;
			}
		}
		LOGGER.debug("use defaultConverter");
		return defaultConverter;
	}
}
