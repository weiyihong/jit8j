package org.layz.jit8j.core.util.factory;

import java.util.ArrayList;
import java.util.List;

import org.layz.jit8j.core.util.reader.DataReader;
import org.layz.jit8j.core.util.reader.DefaultArrayReader;
import org.layz.jit8j.core.util.reader.DefaultListReader;
import org.layz.jit8j.core.util.reader.DefaultMapReader;
import org.layz.jit8j.core.util.reader.DefaultNullReader;
import org.layz.jit8j.core.util.reader.DefaultObjectReader;
import org.layz.jit8j.core.util.reader.DefaultResultSetReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataReaderFactory {
	private static final Logger LOGGER = LoggerFactory.getLogger(DataReaderFactory.class);
	private static final List<DataReader> store = new ArrayList<DataReader>();
	private static final DataReader defaultReader = new DefaultNullReader();
	
	static {
		store.add(new DefaultResultSetReader());
		store.add(new DefaultListReader());
		store.add(new DefaultArrayReader());
		store.add(new DefaultMapReader());
		store.add(new DefaultObjectReader());
	}
	
	public static DataReader getDataReader(Object object){
		for (DataReader dataReader : store) {
			if(dataReader.supportType(object)) {
				return dataReader;
			}
		}
		LOGGER.debug("use defaultReader");
		return defaultReader;
	}
}
