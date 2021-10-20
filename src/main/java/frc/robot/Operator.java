package robot;

import robot.subsystems.*;
import edu.wpi.first.wpilibj.DoubleSolenoid.*;

public class Operator {
    Controller op;
    DoubleSolenoid cannonOne;
    DoubleSolenoid cannonTwo;
    DoubleSolenoid cannonThree;
    DoubleSolenoid cannonFour;
    DoubleSolenoid tankRefill;

    public Operator() {
        op = new XBOXController(1); 
        
        // TODO: fill in with proper port numbers when we get them
        cannonOne = new DoubleSolenoid(portNum);
        cannonTwo = new DoubleSolenoid(portNum);
        cannonThree = new DoubleSolenoid(portNum);
        cannonFour = new DoubleSolenoid(portNum);
        tankRefill = new DoubleSolenoid(portNum);
    }

    public void runOpControls() {
        solanoidControls();
    }

    public void solanoidControls() {
        if (op.getAButton()) {
            cannonOne.set(kForward);
            
            cannonOne.set(kReverse);
        }
        if (op.getXButton()) {
            // fire cannon 2
        }
        if (op.getBButton()) {
            // fire cannon 3
        }
        if (op.getYButton()) {
            // fire cannon 4
        }
        if (op.getLeftBumper()) {
            // refill mini tank
        }
    }
     
    public Controller getController() {
        return op;
    }
}