package frc.team4373.robot.commands.wheelspinner;

import edu.wpi.first.wpilibj.command.Command;
import frc.team4373.robot.RobotMap;
import frc.team4373.robot.subsystems.WheelSpinner;

public class DeploySpinnerCommand extends Command {
    private WheelSpinner spinner;

    public DeploySpinnerCommand() {
        requires(this.spinner = WheelSpinner.getInstance());
    }

    @Override
    protected void initialize() {
        setTimeout(RobotMap.SPINNER_DEPLOY_TIME_SEC);
    }

    @Override
    protected void execute() {
        this.spinner.deploySpinner();
    }

    @Override
    protected boolean isFinished() {
        return isTimedOut();
    }
}
