package com.mycompany.cmd;
import com.mycompany.a3.*;
import com.codename1.ui.Command;
import com.codename1.ui.Dialog;
import com.codename1.ui.events.ActionEvent;
public class CollideEnergyStationCommand extends Command{
    private GameWorld gw;
    public CollideEnergyStationCommand(GameWorld gw)
    {
        super("Collide with Energy Station");
        this.gw = gw;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        //gw.collsionEnergyStation();
        System.out.println("Hit Energy Station");
    }
}