package frc.robot;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.subsystems.*;

public class Driver {
    XBOXController joy;
    Drivetrain drive;

    private SendableChooser<Byte> driveType;
    private final Byte arcade = 0;
    private final Byte tank = 1;

    public Driver(int port) {
        joy = new XBOXController(port);
        drive = new Drivetrain();

        driveType = new SendableChooser<>();
        driveType.setDefaultOption("Arcade", arcade);
        driveType.addOption("Tank", tank);
        SmartDashboard.putData("Drive Type", driveType);
    }

    public void runDriveControls() {
        //DRIVE CONTROLS
        if(driveType.getSelected().equals(arcade)) {
            drive.arcadeDrive(joy.getRightYAxis(), joy.getLeftTrigger(), joy.getRightTrigger());
        } else if(driveType.getSelected().equals(tank)) {
            drive.tankDrive(joy.getLeftYAxis(), joy.getRightYAxis());
        } else {
            System.out.println("Error: No drive type chosen");
        }
    }
}