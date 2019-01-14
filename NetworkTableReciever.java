package frc.team612.subsystems;


import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team612.NetworkTableThread;

public class NetworkTableReciever extends Subsystem{
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public static void receive(){
        NetworkTableThread networkTableThread = new NetworkTableThread();
    }

    public void initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
    }
}

