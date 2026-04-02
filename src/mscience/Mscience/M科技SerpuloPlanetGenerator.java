package mscience.Mscience;

import mindustry.type.Sector;

public class M科技SerpuloPlanetGenerator extends mindustry.maps.planet.SerpuloPlanetGenerator {
    //  @Override
    public void generateSector(Sector sector) {
        //no bases right now
        //无基地
    }

    public boolean allowLanding(Sector sector) {
        //TODO disallowed for now
        //关闭数字区块
        return false;
    }
}