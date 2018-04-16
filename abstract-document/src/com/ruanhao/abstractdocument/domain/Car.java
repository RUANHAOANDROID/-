package com.ruanhao.abstractdocument.domain;

import java.util.Map;

import com.ruanhao.abstractdocument.AbstractDocument;
/**
 * 汽车实体
 * @author rh
 *
 */
public class Car extends AbstractDocument implements HasModel, HasPrice, HasParts{

	public Car(Map<String, Object> properties) {
		super(properties);
	}

}
