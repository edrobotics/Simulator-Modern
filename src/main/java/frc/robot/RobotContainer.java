// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.GTADrive;
import frc.robot.subsystems.ClimbSubsystem;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Intake;

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in
 * the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of
 * the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...

  // Replace with CommandPS4Controller or CommandJoystick if needed
  public final static CommandXboxController m_driverController = new CommandXboxController(
        OperatorConstants.kDriverControllerPort);

  public final DriveTrain m_driveTrain = new DriveTrain();
  // New subsystems created here (previously referenced via legacy static Robot fields)
  public final Intake m_intake = new Intake();
  public final ClimbSubsystem m_climb = new ClimbSubsystem();

  // Swerve and vision subsystems removed. DriveTrain remains owned here.

  /**
   * The container for the robot. Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Note: configureBindings() is called from Robot constructor.
    // Migration note: legacy `OI` was replaced by the controller instances on RobotContainer.
    // - Use `RobotContainer.m_driverController` for controller input and trigger bindings.
    // - Vision and Swerve subsystems have been removed from this build.
  }


  public void configureBindings() {
    // Set GTADrive as the default command for DriveTrain using constructor injection.
    // At this point Robot.driveTrain is assigned, so passing the instance is safe.
    m_driveTrain.setDefaultCommand(new GTADrive(m_driveTrain));

    // Intake bindings: A to pick up, B to eject (while-held behavior)
    m_driverController.a().whileTrue(new RunCommand(() -> m_intake.setIntakeMotor(1.0), m_intake));
    m_driverController.b().whileTrue(new RunCommand(() -> m_intake.setIntakeMotor(-1.0), m_intake));

    // Climb bindings: Y to climb up, X to climb down while held
    m_driverController.y().whileTrue(new RunCommand(() -> m_climb.run(1.0), m_climb));
    m_driverController.x().whileTrue(new RunCommand(() -> m_climb.run(-1.0), m_climb));
  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // Simple example autonomous: drive forward for a short time.
    return new frc.robot.commands.Auto(m_driveTrain);
  }
}
// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

 
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.Constants.OperatorConstants;
import edu.wpi.first.wpilibj2.command.RunCommand;
import frc.robot.commands.GTADrive;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.ClimbSubsystem;

import edu.wpi.first.wpilibj2.command.RunCommand;
import frc.robot.commands.GTADrive;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.ClimbSubsystem;
>>>>>>> modernize/commands-integration

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in
 * the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of
 * the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  // TODO: Initialize your DriveSubsystem here...

  // Replace with CommandPS4Controller or CommandJoystick if needed
  public final static CommandXboxController m_driverController = new CommandXboxController(
        OperatorConstants.kDriverControllerPort);

  public final DriveTrain m_driveTrain = new DriveTrain();
  // New subsystems created here (previously referenced via legacy static Robot fields)
  public final Intake m_intake = new Intake();
  public final ClimbSubsystem m_climb = new ClimbSubsystem();
  // New subsystems created here (previously referenced via legacy static Robot fields)
  public final Intake m_intake = new Intake();
  public final ClimbSubsystem m_climb = new ClimbSubsystem();
>>>>>>> modernize/commands-integration
  // Swerve and vision subsystems removed. DriveTrain remains owned here.

  /**
   * The container for the robot. Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Note: configureBindings() is called from Robot constructor.
    // Migration note: legacy `OI` was replaced by the controller instances on RobotContainer.
    // - Use `RobotContainer.m_driverController` for controller input and trigger bindings.
    // - Vision and Swerve subsystems have been removed from this build.
  }


  /**
   * Use this method to define your trigger->command mappings. Triggers can be
   * created via the
   * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with
   * an arbitrary
   * predicate, or via the named factories in {@link
   * edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s subclasses for
   * {@link
   * CommandXboxController
   * Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
   * PS4} controllers or
   * {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
   * joysticks}.
   */

   
  public void configureBindings() {
  // Set GTADrive as the default command for DriveTrain using constructor injection.
  // At this point Robot.driveTrain is assigned, so passing the instance is safe.
  m_driveTrain.setDefaultCommand(new GTADrive(m_driveTrain));
    
    // Intake bindings: A to pick up, B to eject (while-held behavior)
    m_driverController.a().whileTrue(new RunCommand(() -> m_intake.setIntakeMotor(1.0), m_intake));
    m_driverController.b().whileTrue(new RunCommand(() -> m_intake.setIntakeMotor(-1.0), m_intake));

    // Climb bindings: Y to climb up, X to climb down while held
    m_driverController.y().whileTrue(new RunCommand(() -> m_climb.run(1.0), m_climb));
    m_driverController.x().whileTrue(new RunCommand(() -> m_climb.run(-1.0), m_climb));

    // Intake bindings: A to pick up, B to eject (while-held behavior)
    m_driverController.a().whileTrue(new RunCommand(() -> m_intake.setIntakeMotor(1.0), m_intake));
    m_driverController.b().whileTrue(new RunCommand(() -> m_intake.setIntakeMotor(-1.0), m_intake));

    // Climb bindings: Y to climb up, X to climb down while held
    m_driverController.y().whileTrue(new RunCommand(() -> m_climb.run(1.0), m_climb));
    m_driverController.x().whileTrue(new RunCommand(() -> m_climb.run(-1.0), m_climb));

>>>>>>> modernize/commands-integration
    // SwerveSubsystem removed; no default swerve command to set.
  }
  

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
<<<<<<< HEAD
    return null;
=======
    // Simple example autonomous: drive forward for a short time.
    return new frc.robot.commands.Auto(m_driveTrain);
>>>>>>> modernize/commands-integration
  }
}
