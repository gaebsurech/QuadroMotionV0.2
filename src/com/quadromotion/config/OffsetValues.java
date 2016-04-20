package com.quadromotion.config;

public class OffsetValues {
	
	private OffsetConfig xConfig = null;
	private OffsetConfig yConfig = null;
	private OffsetConfig zConfig = null;
	private OffsetConfig spinConfig = null;
	
	/**
	 * 
	 */
	public OffsetValues(){
	
	xConfig = new OffsetConfig();
	yConfig = new OffsetConfig();
	zConfig = new OffsetConfig();
	spinConfig = new OffsetConfig();
	
	xConfig.XOffsetConfig(50, 50, 10, 15, 2.1);
	yConfig.XOffsetConfig(50, 50, 10, 15, 2.1);
	zConfig.XOffsetConfig(50, 50, 10, 15, 2.1);
	spinConfig.XOffsetConfig(50, 50, 10, 15, 2.1);
	
	}

	public OffsetConfig getxConfig() {
		return xConfig;
	}

	public OffsetConfig getyConfig() {
		return yConfig;
	}

	public OffsetConfig getzConfig() {
		return zConfig;
	}

	public OffsetConfig getSpinConfig() {
		return spinConfig;
	}
	

}
