package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase{
    CANSparkMax intake_motor;
    public Intake(){
        intake_motor = new CANSparkMax(Constants.INTAKE_MOTOR_ID, MotorType.kBrushless);
    }

    public void move(double speed){
        intake_motor.set(speed);
    }

    public void stop(){
        intake_motor.stopMotor();
    }
    
}
