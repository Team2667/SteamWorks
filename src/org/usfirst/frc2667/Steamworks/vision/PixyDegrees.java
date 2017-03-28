package org.usfirst.frc2667.Steamworks.vision;

import java.nio.ByteBuffer;

import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.I2C.Port;

public class PixyDegrees {
	private static int offset;
	private static int tolerance;
	private static I2C Wire = new I2C(Port.kOnboard, 4);
	private static int MIDDLE_POS = 160;

	public static class PixyOutput {

		private int x1, x2, y1, y2;

		public PixyOutput() {
		}

		public void setX1(int x) {
			this.x1 = x;
		}

		public void setX2(int x) {
			this.x2 = x;
		}

		public void setY1(int y) {
			this.y1 = y;
		}

		public void setY2(int y) {
			this.y2 = y;
		}

		public boolean isTargetInView() {
			System.out.println(x1);
			System.out.println(x2);
			return !(this.x1 == -1 || this.x2 == -1);
		}

		public int getRobotCentricLineUpVector() {
			int pixFromCenter = Math.abs(getTargetPosition() - MIDDLE_POS);
			if (pixFromCenter < tolerance) {
				return 0;
			} else if (pixFromCenter > 0) {
				return 1;
			} else {
				return -1;
			}
		}

		private int getTargetPosition() {
			int targetPos = ((x1 + x2) / 2) + offset;
			return targetPos;
		}
	}

	public static PixyOutput getPixyOutput() {
		int numbytes = 16;

		byte[] ReturnData = new byte[numbytes];
		Wire.readOnly(ReturnData, numbytes);
		PixyOutput pxOutput = new PixyOutput();
		pxOutput.setX1(getNthIntFromByteArray(1, ReturnData));
		pxOutput.setX2(getNthIntFromByteArray(2, ReturnData));
		pxOutput.setY1(getNthIntFromByteArray(3, ReturnData));
		pxOutput.setY2(getNthIntFromByteArray(4, ReturnData));

		return pxOutput;
	}

	public void setOffset(int value) {
		offset = value;
	}

	public void setTolerance(int value) {
		tolerance = value;
	}

	private static int getNthIntFromByteArray(int intPos, byte[] byteArray) {
		return ByteBuffer.wrap(byteArray, (intPos - 1) * 4, 4).getInt();
	}
}