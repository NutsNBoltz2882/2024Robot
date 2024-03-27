// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import java.util.function.Supplier;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
  /** Creates a new Shooter. */
  private final CANSparkMax leftMotor;
  private final CANSparkMax rightMotor;
  //private final Supplier<Boolean> buttonPressed;


  
  public Shooter(int leftID, int rightID) {
    leftMotor = new CANSparkMax(leftID, MotorType.kBrushless);
    rightMotor = new CANSparkMax(rightID, MotorType.kBrushless);
  
  }
  public void setSpeed(double spd){
    leftMotor.set(-spd);
    rightMotor.set(-spd);
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public Command shootCommand(){
    return run(
      () -> {
        leftMotor.set(.9);
      });
  }

  
  
  
}
