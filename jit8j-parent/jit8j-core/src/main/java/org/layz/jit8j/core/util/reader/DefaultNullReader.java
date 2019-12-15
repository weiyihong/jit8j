package org.layz.jit8j.core.util.reader;

import org.layz.jit8j.core.pojo.info.FieldColumnInfo;

public class DefaultNullReader implements DataReader{

	@Override
	public boolean supportType(Object object) {
		return null == object;
	}

	@Override
	public Object getObject(Object object, FieldColumnInfo fieldColumnInfo) {
		return null;
	}

}
