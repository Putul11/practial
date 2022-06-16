package com.jid.Exceptions;

public class APIFormatChangeException extends Exception {
	/**
	 * 
	 */
	//private static final long serialVersionUID = 8619102265570976848L;
	private String response;
	private String elementName;
	private String partner;
	
	public APIFormatChangeException(String response, String elementName, String partner) {
		super("Response: "+ response + ", Element:" + elementName + ", Partner:" + partner);
		this.response = response;
		this.elementName = elementName;
		this.partner = partner;
	}
	/*public APIFormatChangeException(String message) {
		super(message);
	}*/

	public void printStackTrace() {
		// TODO Auto-generated method stub
		
	}

	public String getResponse() {
		return response;
	}

	public String getElementName() {
		return elementName;
	}

	public String getPartner() {
		return partner;
	}
	

}
