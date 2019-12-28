package org.layz.hx.core.util.factory;

import java.util.LinkedList;
import java.util.List;

import org.layz.hx.core.util.SpringContextUtil;
import org.layz.hx.core.util.formater.Dataformater;
import org.layz.hx.core.util.formater.DefaultDataformater;

public class DataformaterFactory {
	private static List<Dataformater> repository = new LinkedList<Dataformater>();
	private static Dataformater defaultFormater = new DefaultDataformater();
	
	static {
		repository.add(new DefaultDataformater());
	}
	/**
	 * 获取转换器
	 * @param formatType
	 * @param name
	 * @return
	 */
	public static Dataformater getDataformater(String formatType, String name) {
		if(Dataformater.CONTEXT.equals(formatType)) {
			return SpringContextUtil.getBean(name);
		}
		for (Dataformater dataformater : repository) {
			if(dataformater.support(formatType)) {
				return dataformater;
			}
		}
		return defaultFormater;
	}
}
