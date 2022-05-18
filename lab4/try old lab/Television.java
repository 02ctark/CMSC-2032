
/** 
*The purpose of this class is to model a television
*
*	Chris Tark
*/

public class Television {
	
	//declared all the attributes/variables/properties/fields
	
	//The manufacturer attribute will hold the brand name. 
	//This cannot change once the television is created, so will be a named constant.
	private String manufacturer;
	
	//The screenSize attribute will hold the size of the television screen.
	//This cannot change once the television has been created so will be a named constant.
	private int SCREEN_SIZE;
	
	//powerOn attribute will hold the value true if the power is on, and false if the power is off.
	//task 2
	private boolean powerOn;
	
	//channel attribute will hold the value of the station that the television is showing
	private int channel;
	
	//The volume attribute will hold a number value representing the loudness (0 being no sound)
	//task 2
	private int volume;
	
	
	
	//creating all the methods in the UML
	
	//First the constructor with the parameters brand and size
	//these parameters will bring in information
	public Television(String brand, int size) {
		
		//task 2
		this.manufacturer = brand;
		this.SCREEN_SIZE = size;
		this.powerOn = false;
		this.channel = 2;
		this.volume = 20;
		
		
	}

	
	/**
	 * setChannel method will store the desired station in the channel field
	 * 
	 * @param station
	 */
	public void setChannel(int station) {
		
		this.channel = station;
		
	}
	
	
	/**
	 * The power method will toggle the power between on and off, changing
	 * the value stored in the powerOn field from true to false or from false to true
	 * 
	 */
	public void power() {
		
		
		this.powerOn = !powerOn;
	}
	
	
	/**
	 * The increaseVolume method will increase the value stored in the volume field by 1
	 * 
	 */
	public void increaseVolume() {
		
		volume++;
		
	}
	
	
	/**
	 * decreaseVolume method will decrease the value stored in the current value by 1
	 * 
	 */
	public void decreaseVolume() {
		
		volume--;
		
	}
	
	
	/**
	 * 
	 * 
	 * @return the current value of the field channel
	 */
	public int getChannel() {
	
		//task 3 
		// accessor methods of getVolume, getChannel, getManufacturer, and
		//getScreenSize that return the value of the corresponding field.

		
		return channel;
	}
	
	
	
	/**
	 * 
	 * 
	 * @return the current value of the field volume.
	 */
	public int getVolume() {
		
		
		return this.volume;
	}
	
	/**
	 * 
	 * 
	 * @return return the string held in manufacturer field.
	 */
	public String getManufacturer() {
		
		
		return manufacturer;
	}

	
	/**
	 * 
	 * @return return constant integer stored in SCREEN_SIZE field.
	 */
	public int getScreenSize() {
		
		
		return SCREEN_SIZE;
	}
}
