package com.ruanhao.abstractdocument.domain;

import java.util.Map;

import com.ruanhao.abstractdocument.AbstractDocument;
/**
 * 零件实体
 * @author rh
 *
 */
public class Part extends AbstractDocument implements HasType, HasModel, HasPrice {

	public Part(Map<String, Object> properties) {
		super(properties);
	}

}
