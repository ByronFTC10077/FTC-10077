package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpModeManager;
import com.qualcomm.robotcore.eventloop.opmode.OpModeRegister;

public class FtcOpModeRegister implements OpModeRegister {

  /**
   * The Op Mode Manager will call this method when it wants a list of all
   * available op modes. Add your op mode to the list to enable it.
   *
   * @param manager op mode manager
   */
  public void register(OpModeManager manager) {

    manager.register("NullOp", NullOp.class);
    manager.register("PushBotAuto", PushBotAuto.class);
    manager.register("PushBotManual", PushBotManual.class);
    manager.register("AutonomousMode", AutonomousMode.class);
    manager.register("TankOpTest", TankOpTest_v1.class);
    manager.register("linearTest", linearTest.class);
    manager.register("ArmControlOpMode", armControl.class);

  }
}