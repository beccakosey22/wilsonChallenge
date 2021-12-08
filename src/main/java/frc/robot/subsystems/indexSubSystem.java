package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class indexSubSystem extends SubsystemBase{
    WPI_TalonSRX IndexerMotor = new WPI_TalonSRX(6);

    DigitalInput IndexSensor = new DigitalInput(0);
    DigitalInput IndexSensor1 = new DigitalInput(1);
    DigitalInput IndexSensor2 = new DigitalInput(2);

    
public void intake() {
     if (IndexSensor.get() == true && IndexSensor2.get() == true && IndexSensor1.get() == true) {
        IndexerMotor.set(0);
     } else if (IndexSensor2.get() == true && (IndexSensor1.get() == false || IndexSensor.get() == false)) {
        IndexerMotor.set(-.5);
     } else {
        IndexerMotor.set(0);
     }
    }
}