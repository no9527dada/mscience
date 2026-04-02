package mscience.MBlocks;

import CtCoreSystem.CoreSystem.type.Ovulam5480.液体分发器;
import CtCoreSystem.CoreSystem.type.Ovulam5480.物资分发器;
import CtCoreSystem.CoreSystem.type.Ovulam5480.物资提取器;
import CtCoreSystem.CoreSystem.type.VXV.CTMassDriver;
import CtCoreSystem.CoreSystem.type.guiY.CTPhaseNode;
import arc.graphics.g2d.Draw;
import mindustry.entities.bullet.MassDriverBolt;
import mindustry.gen.Bullet;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.liquid.ArmoredConduit;
import mindustry.world.blocks.liquid.Conduit;
import mindustry.world.blocks.liquid.LiquidBridge;
import mindustry.world.blocks.liquid.LiquidRouter;
import mindustry.world.blocks.storage.StorageBlock;
import mindustry.world.meta.BlockGroup;

import static CtCoreSystem.CoreSystem.CT3Sound.loadSound;
import static CtCoreSystem.CoreSystem.type.CTColor.C;
import static mindustry.type.Category.distribution;
import static mindustry.type.Category.liquid;
import static mindustry.type.ItemStack.with;
import static mindustry.world.meta.BlockGroup.liquids;
import static mindustry.world.meta.BlockGroup.transportation;
import static mscience.M科技资源.*;

public class M科技物流 {
    public static Block
            月银运输桥 = new ItemBridge("MSbridge") {{
        requirements(Category.distribution, with(蓝美晶, 3, 月银, 10));
        fadeIn = moveArrows = false;
        range = 15;
        pulse = true;
        itemCapacity = 20;
        arrowPeriod = 0.9f;
        arrowTimeScl = 2.75f;
        hasPower = false;
        transportTime = 2f;
        description = "";
        group = BlockGroup.transportation;
    }}, 蓝美连接器 = new Junction("MSjunction") {{
        requirements(Category.distribution, with(蓝美晶, 3));
        speed = 10;
        capacity = 6;
        health = 30;
        description = "";
    }}, 曙光运输带 = new ArmoredConveyor("MSconveyor") {
        {
            description = "";
            requirements(Category.distribution, with(梦境翡翠, 1, 曙光金, 1));
            health = 100;
            speed = 0.27f;
            displayedSpeed = 35f;
        }

        @Override
        public void init() {
            super.init();
            junctionReplacement = 蓝美连接器;
            bridgeReplacement = 月银运输桥;
        }
    },
            幻影运输带 = new StackConveyor("MStackconveyor") {{
                requirements(Category.distribution, with(幻影幽晶, 1, 曙光金, 3));
                health = 75;
                description = "";
                speed = 12f / 60f;
                itemCapacity = 10;
            }},

    幻影驱动器 = new MassDriver("幻影驱动器") {{
        //localizedName = "驱动器";
        requirements(distribution, with(
                曙光金, 20,
                幻影幽晶, 20,
                M晶体, 100
        ));

        size = 1;
        itemCapacity = 300;
        reload = 60f;
        range = 25 * 8f;
        knockback = 1;
        health = 150;
        shake = 0f;
        shootSound = loadSound("shootBigg");
        ;
        rotateSpeed = 5;//转速
        minDistribute = itemCapacity / 2;
        bullet = new MassDriverBolt() {
            public void draw(Bullet b) {
                float w = 3.0F;
                float h = 5.0F;
                Draw.color(C("ccfb5e"));
                Draw.rect("shell-back", b.x, b.y, w, h, b.rotation() + 90.0F);
                Draw.color(C("fb5e5e"));
                Draw.rect("shell", b.x, b.y, w, h, b.rotation() + 90.0F);
                Draw.reset();
            }
        };
        consumePower(150 / 60f);
        group = BlockGroup.transportation;
    }},
            幽蓝质量驱动器 = new CTMassDriver("幽蓝质量驱动器") {{
                description = "";
                Times = 3;//卸货速度倍率
                requirements(distribution, with(
                        幽冥铁精, 375,
                        星辰铜精, 375,
                        幽蓝石, 150,
                        曙光金, 120,
                        M晶体, 500
                ));
                bullet = new MassDriverBolt() {
                    public void draw(Bullet b) {
                        float w = 15F;
                        float h = 19F;
                        Draw.color(C("8cfff3"));
                        Draw.rect("shell-back", b.x, b.y, w, h, b.rotation() + 90.0F);
                        Draw.color(C("8cb1ff"));
                        Draw.rect("shell", b.x, b.y, w, h, b.rotation() + 90.0F);
                        Draw.reset();
                    }
                };
                minDistribute = itemCapacity / 2;
                size = 4;
                itemCapacity = 300;
                reload = 120f;
                range = 90 * 8;
                knockback = 6;
                health = 500;
                shake = 0.5f;
                consumePower(7f);
                group = BlockGroup.transportation;
            }},
            天启物品万向桥 = new CTPhaseNode("天启物品万向桥") {{
                health = 175;
                description = "";
                range = 15;
                liquidCapacity = 30;
                hasLiquids = false;
                hasItems = true;
                outputsLiquid = false;
                itemCapacity = 30;
                transportTime = 1f;
                requirements(distribution, with(
                        幻域紫晶, 25,
                        曙光神金, 10,
                        天启晶, 5,
                        M晶体, 550

                ));
            }},

    虚空物资提取器 = new 物资提取器("虚空物资提取器") {{
        description = "";
        canOverdrive = false;
        consumePower(6500 / 60f);
        size = 4;
        range = 40;
        group = transportation;
        requirements(distribution, with(
                M晶体, 2500,
                辉烁玉, 375,
                幻能核心, 375,
                魔影幻月石, 150,
                虚空灵璃, 120


        ));
    }},
            虚空物资分发器 = new 物资分发器("虚空物资分发器") {{
                description = "";
                canOverdrive = false;
                consumePower(25000 / 60f);
                size = 4;
                range = 30;
                group = transportation;
                requirements(distribution, with(
                        M晶体, 12000,
                        霓核体, 375,
                        云码矿, 375,
                        暗能髓, 150,
                        虚空冥石, 120

                ));
            }},

    流光储液罐 = new LiquidRouter("流光储液罐") {{
        //localizedName = "大型储液罐";
        requirements(liquid, with(
                星辉铜, 100,
                幽影铁, 100,
                蓝美晶, 80,
                流光晶, 40
        ));
        size = 4;
        solid = true;
        liquidCapacity = 10000;
        health = 700;

    }},
            月幻导管桥 = new LiquidBridge("月幻导管桥") {{
                requirements(liquid, with(
                        流光晶, 55,
                        幻影幽晶, 35,
                        月幻石, 20
                ));
                liquidCapacity = 30;
                health = 240;
                consumePower(120 / 60f);
                range = 50;
                hasPower = true;
            }},
            月幻导管 = new Conduit("月幻导管") {
                {

                    requirements(liquid, with(
                            流光晶, 3,
                            月幻石, 2

                    ));
                    liquidCapacity = 40;
                    health = 240;
                    liquidPressure = 10f;

                }

                @Override
                public void init() {
                    super.init();

                    // junctionReplacement = junction;
                    bridgeReplacement = 月幻导管桥;
                }
            },

    寒霜镀层导管 = new ArmoredConduit("寒霜镀层导管") {
        {
            //localizedName = "钴制导管";
            requirements(liquid, with(
                    幻影幽晶, 3,
                    月幻石, 2,
                    寒霜石, 2

            ));
            liquidCapacity = 40;
            health = 240;
            liquidPressure = 10f;

        }

        @Override
        public void init() {
            super.init();

            // junctionReplacement = junction;
            bridgeReplacement = 月幻导管桥;
        }
    },
            星陨流体万向桥 = new CTPhaseNode("星陨流体万向桥") {{
                health = 275;
                description = "";
                range = 15;
                liquidCapacity = 30;
                //canOverdrive = false;
                hasLiquids = true;
                hasItems = false;
                outputsLiquid = true;
                consumePower(500 / 60f);
                hasPower = true;
                requirements(liquid, with(
                        幻域紫晶, 8,
                        虚空晶, 10,
                        星陨晶, 5,
                        M晶体, 350

                ));
            }},
            虚空液体分发器 = new 液体分发器("虚空液体分发器") {{
                description = "";
                canOverdrive = false;
                consumePower(12000 / 60f);
                size = 4;
                range = 30;
                group = liquids;
                requirements(liquid, with(
                        M晶体, 6000,
                        辉烁玉, 375,
                        幻能核心, 375,
                        魔影幻月石, 150,
                        虚空灵璃, 120

                ));
            }}, 曙光仓库 = new StorageBlock("曙光仓库") {{
        size = 8;
        health = 1200;
        itemCapacity = 50000;
        coreMerge = false;//仓库不贴核心
        requirements(Category.effect, with(
                曙光金, 30,
                幽影铁, 100
                , 星辉铜, 100
                , M晶体, 100
        ));
    }};


}