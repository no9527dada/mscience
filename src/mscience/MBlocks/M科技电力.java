package mscience.MBlocks;

import CtCoreSystem.CoreSystem.type.VXV.CreatorsPowerField;
import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.content.Liquids;
import mindustry.gen.Sounds;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.blocks.power.*;
import mindustry.world.draw.DrawDefault;
import mindustry.world.draw.DrawLiquidRegion;
import mindustry.world.draw.DrawMulti;
import mindustry.world.draw.DrawWarmupRegion;

import static CtCoreSystem.CoreSystem.type.CTClib.方块描述;
import static CtCoreSystem.CoreSystem.type.CTColor.C;
import static mindustry.type.ItemStack.with;
import static mscience.M科技Mod.modName;
import static mscience.M科技资源.*;

public class M科技电力 {
    public static Block
            曙光神金电力节点 = new PowerNode("曙光神金电力节点"){{

        requirements(Category.power, with(流光晶, 20, 星辰铜精, 10, 曙光神金,2));
        size = 2;
        health = 200;
        maxNodes = 35;
        laserRange = 25f;
    }},
            龙磁电力节点 = new PowerNode("龙磁电力节点"){{

                requirements(Category.power, with(辉烁玉, 50, 幻能核心, 25, 龙磁髓,5));
                size = 1;
                health = 400;
                maxNodes = 40;
                laserRange = 30f;
            }},
            虚空电力网 = new CreatorsPowerField("虚空电力网"){{

                requirements(Category.power, with(霓核体, 200, 灵蚀璃, 70, 虚空冥石,30));
                laserRange = 45;
                consumesPower = true;
                insulated = false;
                health = 1000;
                size = 3;
                drawAlphaA = 0.1f;
                drawAlphaB = 1;
                drawColor = C("edffa1");
                consumePower(1800 / 60f);
            }},
            灵虚电池 = new Battery("灵虚电池"){{

                requirements(Category.power, with(灵虚石,40, 幻影幽晶, 100, 星辰铜精, 100));
                outputsPower = true;
                consumesPower = true;
                health = 500;
                size = 4;
                consumePowerBuffered(300000);
            }},
            磁魂电池 = new Battery("磁魂电池"){{

                requirements(Category.power, with(磁魂石,120, 霓核体, 400, 云码矿, 2000));
                outputsPower = true;
                consumesPower = true;
                health = 2500;
                size = 6;
                consumePowerBuffered(9000000);
            }},

            钍堆 = new NuclearReactor("thorium-reactor") {{

        requirements(Category.power, with(
                Items.lead, 300,
                Items.silicon, 200,
                Items.graphite, 150,
                Items.thorium, 150,
                幻光石, 20));
        ambientSound = Sounds.loopHum;
        ambientSoundVolume = 0.24f;
        size = 3;
        health = 700;
        itemDuration = 360f;
        powerProduction = 1500 / 60f;
        heating = 0.02f;
        consumeItem(Items.thorium);
        consumeLiquid(Liquids.cryofluid, heating / coolantPower).update(false);
    }},
            流光发电机 = new ConsumeGenerator("流光发电机") {{

                requirements(Category.power, with(
                        Items.copper, 120,
                        硅, 80,
                        塑钢, 50,
                        幽影铁, 70,
                        蓝美晶, 40
                ));
                powerProduction = 4500 / 60f;
                itemDuration = 220f;
                health = 1200;
                hasLiquids = true;
                hasItems = true;
                size = 3;
                ambientSound = Sounds.loopDifferential;
                generateEffect = Fx.generatespark;
                ambientSoundVolume = 0.03f;
                drawer = new DrawMulti(new DrawDefault(), new DrawWarmupRegion(), new DrawLiquidRegion());
                consumeItem(炽炎硫);
                consumeLiquid(流光液, 0.1f);
            }},
            寒霜反应堆 = new NuclearReactor("寒霜反应堆") {{

                requirements(Category.power, with(
                        虚空黑曜石, 150,
                        幻影幽晶, 120,
                        月幻石, 130,
                        寒霜石, 80
                ));
                ambientSound = Sounds.loopHum;
                ambientSoundVolume = 0.24f;
                size = 4;
                health = 1800;
                itemDuration = 360f;
                powerProduction = 8500 / 60f;
                heating = 0.02f;
                consumeItem(炽炎晶);
                consumeLiquid(寒霜液, heating / coolantPower).update(false);
            }},

    灵能冲击发电机 = new ImpactReactor("灵能冲击发电机") {{

        float 启动电量 = 7500f;
        size = 6;
        health = 2500;
        powerProduction = (启动电量 + 37000) / 60f;
        itemDuration = 45f;
        ambientSound = Sounds.loopPulse;
        ambientSoundVolume = 0.07f;
        consumePower(启动电量 / 60f);
        consumeItem(灵能石, 2);
        consumeLiquid(幽冥灵露, 2 / 60f);
        requirements(Category.power, with(
                灵虚石, 400,
                幻域紫晶, 340,
                星魂玉, 300,
                灵墟晶, 230
        ));
    }},
            灵墟发电机 = new ConsumeGenerator("灵墟发电机") {{

                requirements(Category.power, with(
                        灵能石, 210,
                        幻域紫晶, 170,
                        灵墟晶, 120,
                        曙光神金, 170
                ));
                powerProduction = 6000 / 60f;
                itemDuration = 120f;
                health = 4300;
                // hasLiquids = true;
                hasItems = true;
                size = 4;
                ambientSound = Sounds.loopDifferential;
                generateEffect = Fx.generatespark;
                ambientSoundVolume = 0.03f;
                drawer = new DrawMulti(new DrawDefault(), new DrawWarmupRegion());
                consumeItem(幻光玉);
                //consumeLiquid(寒霜液, 0.1f);
            }},
            熵烬反应堆 = new NuclearReactor("熵烬反应堆") {{

                requirements(Category.power, with(
                        幻能核心, 400,
                        龙磁髓, 330,
                        魔影幻月石, 240,
                        虚空灵璃, 280
                ));
                ambientSound = Sounds.loopHum;
                ambientSoundVolume = 0.24f;
                size = 5;
                health = 8000;
                itemDuration = 480f;
                powerProduction = 35000 / 60f;
                heating = 0.02f;
                consumeItem(龙磁髓);
                consumeLiquid(熵烬血浆, heating / coolantPower).update(false);
            }},
            幻渊冲击发电机 = new ImpactReactor("幻渊冲击发电机") {{

                float 启动电量 = 13000f;
                size = 8;
                health = 25000;
                powerProduction = (启动电量 + 500000) / 60f;
                itemDuration = 140f;
                ambientSound = Sounds.loopPulse;
                ambientSoundVolume = 0.07f;
                consumePower(启动电量 / 60f);
                consumeItem(幻海深渊珀);
                consumeLiquid(魔影流浆, 12 / 60f);
                requirements(Category.power, with(
                        雷烁晶, 400,
                        灵蚀璃, 400,
                        暗能髓, 320,
                        迷雾幽灵石, 320,
                        宇宙秘宝, 700
                ));
            }};
}