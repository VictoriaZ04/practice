package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;

public class MoveIntake extends CommandBase{
    public MoveIntake(){
        addRequirements(RobotContainer.getIntake());
    }

    @Override
    public void initialize(){

    }

    @Override
    public void execute(){
        RobotContainer.getIntake().move(1);
    }

    @Override
    public boolean isFinished(){
        return !RobotContainer.getJoy().getRawButton(Constants.INTAKE_BUTTON);
    }

    @Override 
    public void end(boolean interrupted){
        RobotContainer.getIntake().stop();
    }
}
