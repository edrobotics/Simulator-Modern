// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ClimbSubsystem;

/** Modernized climb command that uses dependency injection.
 * It reads a supplied speed (for example from controller input) and runs the climb motor.
 */
public class ClimbCommand extends Command {
  private final ClimbSubsystem m_climb;
  private final DoubleSupplier m_speedSupplier;

  public ClimbCommand(ClimbSubsystem climb, DoubleSupplier speedSupplier) {
    m_climb = climb;
    m_speedSupplier = speedSupplier;
    addRequirements(climb);
  }

  @Override
  public void execute() {
    double speed = m_speedSupplier.getAsDouble();
    m_climb.run(speed);
  }

  @Override
  public void end(boolean interrupted) {
    m_climb.stop();
  }

  @Override
  public boolean isFinished() {
    return false; // typically run while a button/trigger is held
  }
}
