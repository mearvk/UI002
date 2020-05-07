package main;

import org.ui.harness.UIHarness;

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                UIHarness.Test01 test01 = new UIHarness.Test01();

                //UIHarness.Test02 test02 = new UIHarness.Test02();

                //UIHarness.Test03 test03 = new UIHarness.Test03();
            }
        });


    }
}

