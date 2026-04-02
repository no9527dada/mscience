package mscience.MBlocks;

import CtCoreSystem.CoreSystem.type.Ovulam5480.CTOverdriveProjector;
import mindustry.content.Items;
import mindustry.content.UnitTypes;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.blocks.defense.OverdriveProjector;
import mindustry.world.blocks.storage.CoreBlock;
import mindustry.world.meta.BuildVisibility;

import static CtCoreSystem.CoreSystem.type.CTClib.方块描述;
import static mindustry.type.ItemStack.with;
import static mscience.M科技Mod.modName;
import static mscience.M科技资源.*;

public class M科技方块 {
    public static Block M科技=new Block("M科技"){{
        requirements(Category.effect, BuildVisibility.hidden, with());
        size=2;
    }},
    //敌人的隐形核心，作用于刷怪，不可被攻击和摧毁，只能用逻辑清除该方块，达到胜利的目的
    贡品台= new CoreBlock("贡品台") {
        {
            requirements(Category.effect, BuildVisibility.editorOnly, with());
            alwaysUnlocked = false;
            unitType = UnitTypes.emanate;
            health = 10000;
            itemCapacity = 10000;
            size = 6;
            //thrusterLength = 48/4f;//推进器长度？
            armor = 10f;
            incinerateNonBuildable = false;//焚烧非建筑资源 关
            buildCostMultiplier = 0f;
            requiresCoreZone = true;

            unitCapModifier = 0;
           // researchCostMultipliers.put(合金, 0.4f); //科技树研究需要的资源
            //researchCostMultiplier = 0.1f;//科技树研究需要的资源倍率
            buildType = Build::new;
        }

        class Build extends CoreBlock.CoreBuild {
            @Override
            public void damage(float damage) {

            }
                    }
    },

            塑钢超速器 = new CTOverdriveProjector("塑钢超速器"){{
                颜色=Items.plastanium.color;
                requirements(Category.effect, with(Items.lead, 100, Items.titanium, 75, Items.silicon, 75, Items.plastanium, 30));
                consumePower(3f);
                size = 3;
                speedBoost = 1.15001F;
                range = 25*8F;
                speedBoostPhase = phaseRangeBoost = 0F;
            }}
,
    蓝美超速器  = new CTOverdriveProjector("蓝美超速器"){{
        颜色=蓝美晶.color;
        requirements(Category.effect, with(Items.silicon, 100, Items.plastanium, 75, 幻光石, 75, Items.plastanium, 30,蓝美晶, 60));
        consumePower(5f);
        size = 3;
        speedBoost = 1.25F;
        range = 25*8F;
        consumeItem(布).boost();
        useTime = 10*60F;
        speedBoostPhase = 0.15F;
         phaseRangeBoost = 0F;
    }},
            曙光超速器  = new CTOverdriveProjector("曙光超速器"){{
                颜色=曙光金.color;
        requirements(Category.effect, with(合金, 100, 月银, 75, 蓝美晶, 75, 曙光金, 30));
        consumePower(8f);
        size = 3;
        speedBoost = 1.45F;
        range = 25*8F;
        speedBoostPhase = phaseRangeBoost = 0F;
    }},
                    寒霜超速器  = new CTOverdriveProjector("寒霜超速器"){{
                        颜色=寒霜石.color;
                        requirements(Category.effect, with(流光晶, 100, 幻影幽晶, 75, 月幻石, 75, 寒霜石, 30));
                        consumePower(480/60f);
                        size = 3;
                        speedBoost = 1.75F;
                        range = 25*8F;
                        speedBoostPhase = phaseRangeBoost = 0F;
                    }},
                    灵墟超速器  = new CTOverdriveProjector("灵墟超速器"){{
                        颜色=灵墟晶.color;
                        requirements(Category.effect, with(幻域紫晶, 100, 星魂玉, 75, 虚空晶, 75, 灵墟晶, 30));
                        consumePower(720/60f);
                        size = 3;
                        speedBoost = 2F;
                        range = 25*8F;
                        useTime = 2*60F;
                        consumeItem(幻光玉).boost();
                        speedBoostPhase = 0.2F;
                        phaseRangeBoost = 8*4F;
                    }},
                    魔影超速器  = new CTOverdriveProjector("魔影超速器"){{
                        颜色=魔影幻月石.color;
                        requirements(Category.effect, with(幻能核心, 100, 紫霄玉, 75, 龙磁髓, 75, 魔影幻月石, 30));
                        consumePower(1400/60f);
                        size = 3;
                        speedBoost = 2.3F;
                        range = 30*8F;
                       useTime = 15*60F;
                        consumeItem(幻能核心).boost();
                        speedBoostPhase = 0.25F;
                                phaseRangeBoost = 0F;
                    }},
                    深渊超速器  = new CTOverdriveProjector("深渊超速器"){{
                        颜色=幻海深渊珀.color;
                        requirements(Category.effect, with(霓核体, 100, 宙髓玉, 75, 迷雾幽灵石, 75, 幻海深渊珀, 30));
                        consumePower(3000/60f);
                        //description =方块描述(name,modName);
                        size = 4;
                        speedBoost = 2.8F;
                        range = 36*8F;
                        useTime = 8*60F;
                        consumeItem(霓核体).boost();
                        speedBoostPhase = 0.3F;
                        phaseRangeBoost = 8*9F;
                    }},
                    超速;

    public  void load() {
        new M科技工厂();
        new M科技物流();
        new M科技电力();

    }

}
