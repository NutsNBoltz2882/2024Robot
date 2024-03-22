// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
  /** Creates a new Intake. */
    private final CANSparkMax rollerMotor;
    private final CANSparkMax liftMotor;


  public Intake(int rm, int lm) {
    rollerMotor = new CANSparkMax(rm, MotorType.kBrushless);
    liftMotor = new CANSparkMax(lm, MotorType.kBrushless);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void setRollerSpd(double spd){
    rollerMotor.set(spd);
  }
  public void setLiftSpd(double spd){
    //use if statement to set limit
    liftMotor.set(spd);
  }
  public void stopLift(){
    liftMotor.set(0);
  }
}
