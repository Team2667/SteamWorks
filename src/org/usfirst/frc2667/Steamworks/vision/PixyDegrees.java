package org.usfirst.frc2667.Steamworks.vision;


import java.nio.ByteBuffer;

import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.I2C.Port;

public class PixyDegrees {
	static I2C Wire = new I2C(Port.kOnboard, 4);
	
	private static PixyOutput getPixyOutput()
	{
		int numbytes = 16;
		
		byte[] ReturnData = new byte[numbytes];
		Wire.readOnly( ReturnData, numbytes);
		PixyOutput memes = new PixyOutput(getNthIntFromByteArray(1,ReturnData), getNthIntFromByteArray(2,ReturnData), getNthIntFromByteArray(3,ReturnData), getNthIntFromByteArray(4,ReturnData));
		//System.out.println("First integer " + getNthIntFromByteArray(1,ReturnData));
		//System.out.println("Second integer " + getNthIntFromByteArray(2,ReturnData));
		//System.out.println("third integer " + getNthIntFromByteArray(3,ReturnData));
		//System.out.println("forth integer " + getNthIntFromByteArray(4,ReturnData));
		
		return memes;
	}
	
	public static double getDirection()
	{
		PixyOutput dank;
		dank = getPixyOutput();
		int x = (dank.getX1()+dank.getX2())/2;
		return (32.5/160)*(160-x);
	}
	
	
	
	private static int getNthIntFromByteArray(int intPos, byte[] byteArray){
		return ByteBuffer.wrap(byteArray,(intPos -1) * 4, 4).getInt();
	}
}
