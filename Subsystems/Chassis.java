import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.PIDOutput; 	
import edu.wpi.first.wpilibj.CANTalon;

public class Chassis extends Subsystem implements PIDOutput {
	
	private final CANTalon frontLeft = RobotMap.frontLeft;
	private final CANTalon backLeft = RobotMap.backLeft;
	private final CANTalon frontRight = RobotMap.frontRight;
	private final CANTalon backRight = RobotMap.backRight;
	private final RobotDrive robotDrive = RobotMap.driveRobot;
	
	double turnSpeed = 0.75;
	
	public void drive(Joystick s) {
        
		double deadZone = 0.1;
		double leftY = s.getRawAxis(2);
		double rightX = s.getRawAxis(4);
		
		if (leftY < deadZone && leftY > -deadZone) {
			leftY = 0;
		}
		if (rightX < deadZone && rightX > -deadZone) {
			rightX = 0;
		}
		if (leftY == 0 && rightX == 0) {
			return;
		}
		robotDrive.arcadeDrive(leftY, rightX*turnSpeed);
	}
	
	public void stop() {
		robotDrive.stopMotor();
	}
		
	protected void initDefaultCommand() {	
	}
        
	@Override
	public void pidWrite(double output) {
	}
}
