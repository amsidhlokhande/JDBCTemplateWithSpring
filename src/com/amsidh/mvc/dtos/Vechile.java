/**
 * 
 */
package com.amsidh.mvc.dtos;

import java.io.Serializable;

/**
 * @author amsidhlokhande
 * 
 */
public class Vechile implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7705979042474921968L;

	private Integer vechileId;
	private String vechileType;

	public Vechile(Integer vechileId, String vechileType) {
		super();
		this.vechileId = vechileId;
		this.vechileType = vechileType;
	}

	public Integer getVechileId() {
		return vechileId;
	}

	public void setVechileId(Integer vechileId) {
		this.vechileId = vechileId;
	}

	public String getVechileType() {
		return vechileType;
	}

	public void setVechileType(String vechileType) {
		this.vechileType = vechileType;
	}

}
