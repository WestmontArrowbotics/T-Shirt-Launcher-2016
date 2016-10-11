// DEFINE WHAT PACKAGE THIS IS IN
// IMPORT CORRECT PACKAGES

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Compressor;

public class RobotMap {
	
	public static CANTalon frontLeft;
	public static CANTalon backLeft;
	public static CANTalon frontRight;
	public static CANTalon backRight;
    
	public static RobotDrive driveRobot;
    
	public static Solenoid solenoid;
	public static Compressor compressor;
	
	public static void init() {
		frontRight = new CANTalon(1);
		backRight = new CANTalon(2);
		backLeft = new CANTalon(3);
		frontLeft = new CANTalon(4);
		driveRobot = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
	}
}
