// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.Intake;

/** Modernized intake command that reads controller buttons and runs the intake. */
public class PickUpFuel extends Command {
  private final Intake m_intake;
  private final CommandXboxController m_controller;

  public PickUpFuel(Intake intake, CommandXboxController controller) {
    m_intake = intake;
    m_controller = controller;
    addRequirements(intake);
  }

  @Override
  public void execute() {
    // Use A to pick up and B to eject (common Xbox mapping). Teams can change bindings in RobotContainer.
    boolean pickUp = m_controller.getHID().getAButton();
    boolean eject = m_controller.getHID().getBButton();
    if (pickUp == eject) {
      m_intake.setIntakeMotor(0);
    } else {
      m_intake.setIntakeMotor(pickUp ? 1 : -1);
    }
  }

  @Override
  public void end(boolean interrupted) {
    m_intake.setIntakeMotor(0);
  }

  @Override
  public boolean isFinished() {
    return false; // intended to be run while a trigger/button is held or scheduled explicitly
  }
}
