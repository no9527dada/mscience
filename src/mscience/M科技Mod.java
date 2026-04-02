package mscience;

import mindustry.Vars;
import mindustry.content.StatusEffects;
import mindustry.mod.Mod;
import mindustry.type.StatusEffect;
import mscience.MBlocks.M科技方块;
import mscience.TP.M科技InfoDialog;
import mscience.TP.M科技InfoDialog2;

import static CtCoreSystem.CoreSystem.compareVersions.compareVersions;
import static CtCoreSystem.CtCoreSystem.加载CT2;


public class M科技Mod extends Mod {
    public static String modName = "mscience";
    public M科技Mod() {

    }
    static String MinVersion = "1.23";
    public void loadContent() {
        if ((Vars.mods.locateMod("ctcoresystem") != null)) {
            if (compareVersions(Vars.mods.getMod("ctcoresystem").meta.version, MinVersion) >= 0) {
                new M科技资源();
                if(加载CT2()){
                    //在加载CT2时加载本mod更多内容
                }
                StatusEffects.unmoving.permanent = true;//静止状态永久存在  用于完成任务后用世处给玩家，使其不可移动操作
                new M科技地板();
                M科技Planets.load();
                new M科技方块();
                M科技地图.load();
                M科技科技树.load();


            }
        }
    }
    public void init() {
        if (Vars.mods.locateMod("ctcoresystem") == null) {
            M科技InfoDialog.show();
        } else {
            if (compareVersions(Vars.mods.getMod("ctcoresystem").meta.version, MinVersion) < 0) {
                M科技InfoDialog2.show();
            }
        }

    }


}
