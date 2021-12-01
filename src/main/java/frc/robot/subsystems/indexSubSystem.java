package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class indexSubSystem {
    WPI_TalonSRX IndexerMotor = new WPI_TalonSRX(6);

    DigitalInput IndexSensor = new DigitalInput(0);
    DigitalInput IndexSensor1 = new DigitalInput(1);
    DigitalInput IndexSensor2 = new DigitalInput(2);
}
