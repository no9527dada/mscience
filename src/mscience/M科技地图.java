package mscience;

//import mindustry.content.Planets;

import mindustry.content.TechTree;
import mindustry.type.SectorPreset;

import static mscience.M科技Planets.M科技星球;
import static mindustry.content.Blocks.coreShard;

public class M科技地图 {
   // public static float 倍率 = T2Items/4*400;
   public static SectorPreset 关卡01,关卡01B,关卡02;

    public static void load() {
         关卡01 = new SectorPreset("关卡01", M科技星球, 0) {{
            localizedName = "关卡1";
            // alwaysUnlocked = true;
            addStartingItems = true;
            difficulty = 0;
            overrideLaunchDefaults = true;
            noLighting = true;
            //startWaveTimeMultiplier = 3f;
        }};
        关卡01B = new SectorPreset("关卡01B", M科技星球, 96) {{
            localizedName = "关卡1B";
            // alwaysUnlocked = true;
            addStartingItems = true;
            difficulty = 0;
            overrideLaunchDefaults = true;
            noLighting = true;
            //startWaveTimeMultiplier = 3f;
        }};
        关卡02 = new SectorPreset("关卡02", M科技星球, 95) {{
            localizedName = "关卡2";
            // alwaysUnlocked = true;
            addStartingItems = true;
            difficulty = 0;
            overrideLaunchDefaults = true;
            noLighting = true;
            //startWaveTimeMultiplier = 3f;
        }};

    }
}
