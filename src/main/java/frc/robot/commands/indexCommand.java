package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.indexSubSystem;

public class indexCommand extends CommandBase{ 
    indexSubSystem indexSubSystem;
    public indexCommand(indexSubSystem indexerSubSystem ) {
        super();
        indexSubSystem = indexerSubSystem;
        addRequirements(indexerSubSystem);
    }
    @Override
    public void execute() {
        indexSubSystem.intake();
    }
    @Override
    public boolean isFinished() {
        return false;
    }
}
