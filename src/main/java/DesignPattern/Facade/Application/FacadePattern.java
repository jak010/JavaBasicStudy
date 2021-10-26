package DesignPattern.Facade.Application;

import DesignPattern.Facade.FacadePattern.HelpSystem01;
import DesignPattern.Facade.FacadePattern.HelpSystem02;
import DesignPattern.Facade.FacadePattern.HelpSystem03;

public class FacadePattern {

    private HelpSystem01 helpSystem01;
    private HelpSystem02 helpSystem02;
    private HelpSystem03 helpSystem03;

    public FacadePattern() {
        helpSystem01 = new HelpSystem01();
        helpSystem02 = new HelpSystem02();
        helpSystem03 = new HelpSystem03();
    }

    public void process(){
        helpSystem01.process();
        helpSystem02.process();
        helpSystem03.process();
    }

}
