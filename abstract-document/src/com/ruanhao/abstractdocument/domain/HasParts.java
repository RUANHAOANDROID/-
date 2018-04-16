package com.ruanhao.abstractdocument.domain;

import java.util.stream.Stream;

import com.ruanhao.abstractdocument.Document;
/**
 * 这个类用于静态访问 “Parts”属性
 * @author rh
 *
 */
public interface HasParts extends Document {
	String PROPERTY = "parts";

	default Stream<Part> getParts() {
		return children(PROPERTY, Part::new);
	}
}
