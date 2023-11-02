package com.estudo.enums;

public enum ItemEnum {

	ARPAO("Arpão"),
	MACHADO("Machado"),
	PICARETA("Picareta");

	private String desc;

	private ItemEnum(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}
}
