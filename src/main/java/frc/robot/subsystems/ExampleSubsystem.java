// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

public class ExampleSubsystem extends SubsystemBase {

  TalonFX motor1;

  /** Creates a new ExampleSubsystem. */
  public ExampleSubsystem() {
    motor1 = new TalonFX(10);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }

  public void drive(double speed) {
    motor1.set(ControlMode.PercentOutput, speed);
  }

}
