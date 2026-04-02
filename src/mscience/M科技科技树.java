package mscience;

//import mindustry.content.Planets;

import arc.Core;
import arc.struct.Seq;
import mindustry.content.Items;
import mindustry.content.Liquids;
import mindustry.content.TechTree;
import mindustry.game.Objectives;
import mindustry.game.Objectives.OnSector;
import mindustry.game.Objectives.Research;
import mindustry.game.Objectives.SectorComplete;
import mindustry.type.ItemStack;

import static mindustry.content.Blocks.*;
import static mindustry.content.SectorPresets.*;
import static mindustry.content.TechTree.node;
import static mindustry.content.TechTree.nodeProduce;
import static mscience.MBlocks.M科技工厂.*;
import static mscience.MBlocks.M科技方块.*;
import static mscience.MBlocks.M科技物流.*;
import static mscience.MBlocks.M科技电力.*;
import static mscience.MBlocks.M科技钻头.*;
import static mscience.M科技Planets.M科技星球;
import static mscience.M科技地图.*;
import static mscience.M科技资源.*;

public class M科技科技树 {
    // public static float 倍率 = T2Items/4*400;


    public static void load() {
/*        M科技星球.techTree = TechTree.nodeRoot(Core.bundle.format("Mscience"), M科技, true, () -> {

            //S星球的工厂物品

            node(M科技星球, () -> {
            });
        });*/
        M科技星球.techTree = TechTree.nodeRoot(Core.bundle.format("Mscience"), M科技星球, true, () -> {
                node(coreShard, () -> {
                    node(coreFoundation, () -> {
                        node(coreNucleus, () -> {});
                    });
                    node(conveyor, () -> {
                        node(junction, () -> {
                            node(router, () -> {
                                node(distributor);
                                node(sorter, () -> {
                                    node(invertedSorter);
                                    node(overflowGate, () -> {
                                        node(underflowGate);
                                    });
                                });
                                node(container, Seq.with(new Objectives.SectorComplete(biomassFacility)), () -> {
                                    node(unloader);
                                    node(vault, Seq.with(new Objectives.SectorComplete(stainedMountains)), () -> {

                                    });
                                });

                                node(itemBridge, () -> {
                                    node(titaniumConveyor,  () -> {
                                        node(phaseConveyor, () -> {
                                            node(massDriver, () -> {

                                            });
                                        });

                                        node(payloadConveyor, () -> {
                                            node(payloadRouter, () -> {

                                            });
                                        });

                                        node(armoredConveyor, () -> {
                                            node(plastaniumConveyor, () -> {

                                            });
                                        });
                                    });
                                });
                            });
                        });
                    });
                    node(mechanicalDrill, () -> {

                        node(mechanicalPump, () -> {
                            node(conduit, () -> {
                                node(liquidJunction, () -> {
                                    node(liquidRouter, () -> {
                                        node(liquidContainer, () -> {
                                            node(liquidTank);
                                        });

                                        node(bridgeConduit);

                                        node(pulseConduit, Seq.with(new Objectives.SectorComplete(windsweptIslands)), () -> {
                                            node(phaseConduit, () -> {

                                            });

                                            node(platedConduit, () -> {

                                            });

                                            node(rotaryPump, () -> {
                                                node(impulsePump, () -> {

                                                });
                                            });
                                        });
                                    });
                                });
                            });
                        });

                        node(graphitePress, () -> {
                            node(pneumaticDrill, Seq.with(new SectorComplete(frozenForest)), () -> {
                                node(cultivator, Seq.with(new SectorComplete(biomassFacility)), () -> {

                                });

                                node(laserDrill, () -> {
                                    node(blastDrill, Seq.with(new SectorComplete(nuclearComplex)), () -> {

                                    });

                                    node(waterExtractor, Seq.with(new SectorComplete(saltFlats)), () -> {
                                        node(oilExtractor, () -> {

                                        });
                                    });
                                });
                            });

                            node(pyratiteMixer, () -> {
                                node(blastMixer, Seq.with(new SectorComplete(facility32m)), () -> {

                                });
                            });

                            node(siliconSmelter, () -> {

                                node(sporePress, () -> {
                                    node(coalCentrifuge, () -> {
                                        node(multiPress, () -> {
                                            node(siliconCrucible, () -> {

                                            });
                                        });
                                    });

                                    node(plastaniumCompressor, Seq.with(new SectorComplete(windsweptIslands), new OnSector(tarFields)), () -> {
                                        node(phaseWeaver, Seq.with(new SectorComplete(tarFields)), () -> {

                                        });
                                    });
                                });

                                node(kiln,  () -> {
                                    node(pulverizer, () -> {
                                        node(incinerator, () -> {
                                            node(melter, () -> {
                                                node(surgeSmelter, () -> {

                                                });

                                                node(separator, () -> {
                                                    node(disassembler, () -> {

                                                    });
                                                });

                                                node(cryofluidMixer, () -> {

                                                });
                                            });
                                        });
                                    });
                                });

                                //logic disabled until further notice
                                node(microProcessor, () -> {
                                    node(switchBlock, () -> {
                                        node(message, () -> {
                                            node(logicDisplay, () -> {
                                                node(largeLogicDisplay, () -> {

                                                });
                                            });

                                            node(memoryCell, () -> {
                                                node(memoryBank, () -> {

                                                });
                                            });
                                        });

                                        node(logicProcessor, () -> {
                                            node(hyperProcessor, () -> {

                                            });
                                        });
                                    });
                                });

                                node(illuminator, () -> {

                                });
                            });
                        });


                        node(combustionGenerator, Seq.with(new Research(Items.coal)), () -> {
                            node(powerNode, () -> {
                                node(powerNodeLarge, () -> {
                                    node(diode, () -> {
                                        node(surgeTower, () -> {

                                        });
                                    });
                                });

                                node(battery, () -> {
                                    node(batteryLarge, () -> {

                                    });
                                });
                                node(steamGenerator, () -> {
                                    node(thermalGenerator, () -> {
                                        node(differentialGenerator, () -> {
                                            node(thoriumReactor, Seq.with(new Research(Liquids.cryofluid)), () -> {
                                                node(impactReactor, () -> {

                                                });

                                                node(rtgGenerator, () -> {

                                                });
                                            });
                                        });
                                    });
                                });

                                node(solarPanel, () -> {
                                    node(largeSolarPanel, () -> {

                                    });
                                });
                            });
                        });
                    });


                    nodeProduce(Items.copper, () -> {
                        nodeProduce(Liquids.water, () -> {

                        });

                        nodeProduce(Items.lead, () -> {
                            nodeProduce(Items.titanium, () -> {
                                nodeProduce(Liquids.cryofluid, () -> {

                                });

                                nodeProduce(Items.thorium, () -> {
                                    nodeProduce(Items.surgeAlloy, () -> {

                                    });

                                    nodeProduce(Items.phaseFabric, () -> {

                                    });
                                });
                            });

                            nodeProduce(Items.metaglass, () -> {

                            });
                        });

                        nodeProduce(Items.sand, () -> {
                            nodeProduce(Items.scrap, () -> {
                                nodeProduce(Liquids.slag, () -> {

                                });
                            });

                            nodeProduce(Items.coal, () -> {
                                nodeProduce(Items.graphite, () -> {
                                    nodeProduce(Items.silicon, () -> {

                                    });
                                });

                                nodeProduce(Items.pyratite, () -> {
                                    nodeProduce(Items.blastCompound, () -> {

                                    });
                                });

                                nodeProduce(Items.sporePod, () -> {

                                });

                                nodeProduce(Liquids.oil, () -> {
                                    nodeProduce(Items.plastanium, () -> {

                                    });
                                });
                            });
                        });
                    });
                });
                node(贡品台, ItemStack.with(合金, 1000), () -> {

                    //   node(M科技星球, () -> {
                    node(coreShard, () -> {
                        nodeProduce(M晶体, () -> {
                            nodeProduce(钛, () -> {
                            });
                            nodeProduce(M碎晶, () -> {
                                nodeProduce(硅, () -> {
                                });
                                nodeProduce(玻璃, () -> {
                                });
                            });
                        });
                        node(关卡01, Seq.with(
                                new Objectives.Research(贡品台)//研究
                        ), () -> {
                            node(关卡01B, Seq.with(
                                    Seq.with(new Objectives.SectorComplete(关卡01))
                            ), () -> {
                            });
                            node(关卡02, Seq.with(
                                    Seq.with(new Objectives.SectorComplete(关卡01))
                            ), () -> {
                            });
                        });

                    });
                    //     });
                    node(M碎晶工厂, () -> {
                        node(M晶体工厂, () -> {
                            node(高级M晶体工厂, () -> {
                            });
                            node(幻光石工厂, () -> {
                                node(星辉铜工厂, () -> {
                                });
                                node(幽影铁工厂, () -> {
                                });
                                node(蓝美晶工厂, () -> {
                                    node(炽炎硫工厂, Seq.with(new Objectives.SectorComplete(关卡01)), () -> {
                                        node(月银工厂, () -> {
                                            node(梦境翡翠工厂, () -> {
                                                node(曙光金工厂, () -> {
                                                });
                                            });
                                        });
                                    });
                                });

                            });
                        });
                        node(硫工厂, () -> {
                            node(爆混工厂, () -> {
                            });
                        });
                        node(石油工厂, () -> {
                            node(塑钢工厂, () -> {
                            });  // node(gc , () -> {});
                        });
                        node(巨浪合金工厂, () -> {
                        });
                        node(高级硅工厂, () -> {
                        });
                    });
                    node(资源转换器铜, () -> {
                        node(资源转换器铅, () -> {
                            node(资源分解器铜铅, () -> {
                            });
                            node(资源转换器废料, () -> {
                                node(资源融合器M碎晶, Seq.with(new Objectives.SectorComplete(关卡01B)), () -> {
                                });
                            });
                        });
                        node(流光晶工厂, Seq.with(new Objectives.SectorComplete(关卡02)), () -> {
                            node(虚空黑曜石工厂, () -> {
                                node(流光液工厂, () -> {
                                    node(流光提炼机, () -> {
                                    });
                                    node(高级流光液工厂, () -> {
                                    });
                                });

                                node(幻影幽晶工厂, () -> {
                                    node(星辰铜精工厂, () -> {
                                    });
                                    node(幽冥铁精工厂, () -> {

                                    });
                                    node(月幻石工厂, () -> {
                                        node(炽炎晶工厂, () -> {
                                            node(魂炎晶工厂, () -> {

                                            });
                                        });
                                    });
                                });
                                node(寒霜液工厂, () -> {
                                    node(寒霜石工厂, () -> {
                                        node(幽蓝石工厂, () -> {
                                            node(曙光神金工厂, () -> {
                                                node(高级曙光神金工厂, () -> {
                                                });
                                            });
                                        });
                                    });
                                });
                            });

                        });

                    });
                    node(灵虚石工厂, () -> {
                        node(幻域紫晶工厂, () -> {
                            node(星魂玉工厂, () -> {
                                node(虚空晶工厂, () -> {
                                    node(高级虚空黑曜石工厂, () -> {
                                    });
                                    node(光墟玉工厂, () -> {
                                        node(灵墟晶工厂, () -> {
                                            node(星陨晶工厂, () -> {
                                            });
                                        });
                                    });
                                });
                            });
                            node(天启晶工厂, () -> {
                                node(量子提炼机, () -> {
                                });
                                node(熵炎埃工厂, () -> {
                                    node(曙光混沌金工厂, () -> {
                                    });
                                });
                            });
                        });
                        node(灵能石工厂, () -> {
                            node(幽冥灵露‌工厂, () -> {
                            });
                        });
                    });


                    node(幻能核心工厂, () -> {
                        node(紫霄玉工厂, () -> {
                            node(光蚀晶体工厂, () -> {
                                node(灵量子工厂, () -> {
                                    node(量子妖露工厂, () -> {
                                    });
                                });
                            });
                        });
                        node(龙磁髓工厂, () -> {
                            node(熵烬血浆工厂, () -> {
                            });
                            node(魔影幻月石工厂, () -> {
                            });
                            node(虚空灵璃工厂, () -> {
                                node(虚空凝露工厂, () -> {
                                });
                            });
                        });
                        node(星虹凝露工厂, () -> {
                            node(魔影流浆工厂, () -> {
                                node(冥焰晶簇工厂, () -> {
                                    node(曙光神髓工厂, () -> {
                                    });
                                });
                            });
                        });
                        node(星辰秘液工厂, () -> {
                            node(幻月精髓工厂, () -> {
                                node(幽冥梦魇晶工厂, () -> {
                                });
                            });
                        });
                    });

                    node(霓核体工厂, () -> {
                        node(玄晶簇工厂, () -> {
                        });
                        node(雷烁晶工厂, () -> {
                            node(迷雾幽灵石工厂, () -> {
                                node(磁魂石工厂, () -> {
                                    node(熵溶工厂, () -> {
                                        node(虚空冥石工厂, () -> {
                                        });
                                    });
                                });
                            });
                        });
                        node(灵蚀璃工厂, () -> {
                            node(云码矿工厂, () -> {
                                node(暗能髓工厂, () -> {
                                    node(宙髓玉工厂, () -> {
                                        node(宇宙秘宝工厂, () -> {
                                            node(幻海深渊珀工厂, () -> {
                                                node(曙光幻神金工厂, () -> {
                                                    node(创世之星工厂, () -> {
                                                        node(创星解析仪, () -> {
                                                            node(创世纪, () -> {
                                                            });
                                                        });
                                                        node(创世神髓工厂, () -> {
                                                            node(创世神工厂, () -> {
                                                            });
                                                        });
                                                    });
                                                });
                                            });
                                        });
                                    });
                                });
                            });
                        });
                    });


                    node(M抽水机, () -> {
                        node(抽冷冻液机, () -> {
                            node(抽岩浆机, () -> {
                                node(龙芯熔液采集器, () -> {
                                });
                                node(时渊髓液凝聚器, () -> {
                                });
                                node(星芒液抽取钻井, () -> {
                                });
                                node(虚识之潮冶泵器, () -> {
                                    node(灵枢醚炼制器, () -> {
                                    });
                                });
                            });
                        });
                    });


                    node(塑钢超速器, Seq.with(new Objectives.SectorComplete(关卡01B)), () -> {
                        node(蓝美超速器, () -> {
                            node(曙光超速器, () -> {
                                node(寒霜超速器, () -> {
                                    node(灵墟超速器, () -> {
                                        node(魔影超速器, () -> {
                                            node(深渊超速器, () -> {
                                            });
                                        });
                                    });
                                });
                            });
                        });
                    });
                    node(蓝美连接器, () -> {
                        node(曙光运输带, () -> {
                            node(月银运输桥, () -> {
                                node(曙光仓库, () -> {
                                });
                                node(幻影运输带, () -> {
                                    node(幻影驱动器, () -> {
                                        node(幽蓝质量驱动器, () -> {
                                            node(天启物品万向桥, () -> {
                                                node(虚空物资提取器, () -> {
                                                    node(虚空物资分发器, () -> {
                                                    });
                                                });
                                            });
                                        });
                                    });
                                });
                            });
                        });
                    });
                    node(流光储液罐, () -> {
                        node(月幻导管, () -> {
                            node(寒霜镀层导管, () -> {

                            });
                            node(月幻导管桥, () -> {
                                node(星陨流体万向桥, () -> {
                                    node(虚空液体分发器, () -> {
                                    });
                                });

                            });
                        });
                    });
                    node(曙光神金电力节点, () -> {
                        node(灵虚电池, () -> {
                            node(磁魂电池, () -> {
                            });
                        });
                        node(龙磁电力节点, () -> {
                            node(虚空电力网, () -> {

                            });
                        });
                        node(钍堆, () -> {
                            node(流光发电机, () -> {
                                node(寒霜反应堆, () -> {
                                    node(灵能冲击发电机, () -> {
                                        node(灵墟发电机, () -> {
                                            node(熵烬反应堆, () -> {
                                                node(幻渊冲击发电机, () -> {
                                                });
                                            });
                                        });
                                    });
                                });
                            });
                        });
                    });

                    // });
                    node(blastDrill, () -> {
                        node(曙光钻头, () -> {
                            node(寒霜钻头, () -> {
                                node(光神钻头, () -> {
                                    node(虚空钻头, () -> {
                                        node(混沌金钻头, () -> {
                                            node(龙磁钻头, () -> {
                                                node(暗能钻头, () -> {
                                                    node(深渊钻头, () -> {


                                                    });
                                                });
                                            });
                                        });
                                    });
                                });
                            });
                        });
                    });


                    //资源
                    nodeProduce(创世神, () -> {

                        nodeProduce(创世之星, () -> {
                            nodeProduce(创世微子, () -> {
                                nodeProduce(创世之星, () -> {
                                    nodeProduce(曙光幻神金, () -> {
                                    });
                                    nodeProduce(幻海深渊珀, () -> {
                                        nodeProduce(宇宙秘宝, () -> {
                                            nodeProduce(宙髓玉, () -> {
                                                nodeProduce(暗能髓, () -> {
                                                    nodeProduce(曙光混沌金, () -> {
                                                    });
                                                    nodeProduce(云码矿, () -> {
                                                        nodeProduce(玄晶簇, () -> {
                                                            nodeProduce(霓核体, () -> {
                                                                nodeProduce(曙光神金, () -> {
                                                                });
                                                                nodeProduce(银河幻银矿, () -> {
                                                                });
                                                            });
                                                            nodeProduce(星辰泪滴石, () -> {
                                                            });
                                                        });
                                                        nodeProduce(雷烁晶, () -> {
                                                            nodeProduce(霓核体, () -> {
                                                            });
                                                            nodeProduce(幽荧星砂, () -> {
                                                            });
                                                        });
                                                        nodeProduce(灵蚀璃, () -> {
                                                            nodeProduce(光蚀晶体, () -> {
                                                            });
                                                            nodeProduce(虚空灵璃, () -> {
                                                            });
                                                        });
                                                    });
                                                });
                                                nodeProduce(云码矿, () -> {
                                                    nodeProduce(暗能钻头, () -> {
                                                    });
                                                });
                                            });
                                            nodeProduce(磁魂石, () -> {
                                                nodeProduce(时渊髓液, () -> {
                                                });
                                                nodeProduce(迷雾幽灵石, () -> {
                                                    nodeProduce(银河幻银矿, () -> {
                                                    });
                                                    nodeProduce(幻星砂, () -> {
                                                    });
                                                });
                                            });
                                        });
                                        nodeProduce(虚空冥石, () -> {
                                            nodeProduce(云码矿, () -> {
                                            });
                                            nodeProduce(熵溶, () -> {
                                                nodeProduce(虚识之潮, () -> {
                                                });
                                                nodeProduce(磁魂石, () -> {
                                                });
                                            });
                                        });
                                    });
                                });

                            });
                            nodeProduce(曙光幻神金, () -> {
                                nodeProduce(虚空幽寂矿, () -> {
                                });
                                nodeProduce(幻星砂, () -> {
                                });
                                nodeProduce(幻海深渊珀, () -> {
                                });
                                nodeProduce(曙光混沌金, () -> {
                                    nodeProduce(曙光神金, () -> {
                                        nodeProduce(曙光金, () -> {
                                            nodeProduce(蓝美晶, () -> {
                                                nodeProduce(星辉铜, () -> {
                                                    nodeProduce(幻光石, () -> {
                                                        nodeProduce(钛, () -> {
                                                        });
                                                        nodeProduce(玻璃, () -> {
                                                        });
                                                    });
                                                    nodeProduce(铜, () -> {
                                                    });
                                                });
                                                nodeProduce(幽影铁, () -> {
                                                    nodeProduce(幻光石, () -> {
                                                    });
                                                    nodeProduce(铅, () -> {
                                                    });
                                                });
                                            });
                                            nodeProduce(合金, () -> {
                                            });
                                            nodeProduce(月银, () -> {
                                                nodeProduce(幻光石, () -> {
                                                });
                                                nodeProduce(炽炎硫, () -> {
                                                    nodeProduce(爆混, () -> {
                                                    });
                                                    nodeProduce(石墨, () -> {
                                                    });
                                                });
                                            });
                                            nodeProduce(梦境翡翠, () -> {
                                                nodeProduce(塑钢, () -> {
                                                });
                                                nodeProduce(布, () -> {
                                                });
                                            });
                                        });
                                        nodeProduce(魂炎晶, () -> {
                                            nodeProduce(炽炎晶, () -> {
                                                nodeProduce(炽炎硫, () -> {
                                                });
                                                nodeProduce(月幻石, () -> {
                                                    nodeProduce(幻光石, () -> {
                                                    });
                                                    nodeProduce(蓝美晶, () -> {
                                                    });
                                                    nodeProduce(岩浆, () -> {
                                                    });
                                                });
                                                nodeProduce(流光液, () -> {
                                                    nodeProduce(流光晶, () -> {
                                                    });
                                                    nodeProduce(炽炎硫, () -> {
                                                    });
                                                });
                                            });
                                            nodeProduce(曙光金, () -> {

                                            });
                                        });
                                        nodeProduce(幽蓝石, () -> {
                                            nodeProduce(幻影幽晶, () -> {
                                                nodeProduce(虚空黑曜石, () -> {
                                                    nodeProduce(流光晶, () -> {
                                                        nodeProduce(蓝美晶, () -> {
                                                        });
                                                        nodeProduce(合金, () -> {
                                                        });
                                                    });
                                                    nodeProduce(月银, () -> {
                                                    });
                                                });
                                                nodeProduce(梦境翡翠, () -> {
                                                });
                                            });
                                            nodeProduce(虚空黑曜石, () -> {
                                            });
                                        });
                                        nodeProduce(寒霜石, () -> {
                                            nodeProduce(星辰铜精, () -> {
                                                nodeProduce(星辉铜, () -> {
                                                });
                                                nodeProduce(曙光金, () -> {
                                                });
                                                nodeProduce(流光液, () -> {
                                                });
                                            });
                                            nodeProduce(幽冥铁精, () -> {
                                                nodeProduce(幽影铁, () -> {
                                                });
                                                nodeProduce(曙光金, () -> {
                                                });
                                                nodeProduce(流光液, () -> {
                                                });
                                            });
                                            nodeProduce(寒霜液, () -> {
                                                nodeProduce(月银, () -> {
                                                });
                                                nodeProduce(冷冻液, () -> {
                                                });
                                            });
                                        });
                                    });
                                    nodeProduce(星陨晶, () -> {
                                        nodeProduce(灵墟晶, () -> {
                                            nodeProduce(光墟玉, () -> {
                                                nodeProduce(量子砂, () -> {
                                                    nodeProduce(虚空钻头, () -> {
                                                    });
                                                });
                                                nodeProduce(虚空晶, () -> {
                                                    nodeProduce(虚空黑曜石, () -> {
                                                        nodeProduce(幻光玉, () -> {
                                                            nodeProduce(虚空钻头, () -> {
                                                            });
                                                        });
                                                        nodeProduce(冷冻液, () -> {
                                                        });
                                                    });
                                                    nodeProduce(星魂玉, () -> {
                                                        nodeProduce(幻域紫晶, () -> {
                                                            nodeProduce(灵虚石, () -> {
                                                                nodeProduce(煤, () -> {
                                                                });
                                                                nodeProduce(钍, () -> {
                                                                });
                                                            });
                                                            nodeProduce(星辰铜精, () -> {
                                                                nodeProduce(光神钻头, () -> {
                                                                });
                                                            });
                                                        });
                                                        nodeProduce(幽冥灵露, () -> {
                                                            nodeProduce(灵能石, () -> {
                                                                nodeProduce(沙, () -> {
                                                                });
                                                                nodeProduce(钛, () -> {
                                                                });
                                                            });
                                                            nodeProduce(幽冥铁精, () -> {
                                                                nodeProduce(光神钻头, () -> {
                                                                });
                                                            });
                                                        });
                                                    });
                                                });
                                            });
                                            nodeProduce(炽炎晶, () -> {
                                                nodeProduce(量子提炼机, () -> {
                                                });
                                            });
                                        });
                                        nodeProduce(寒霜石, () -> {
                                            nodeProduce(星辰铜精, () -> {
                                                nodeProduce(光神钻头, () -> {
                                                });

                                            });
                                            nodeProduce(幽冥铁精, () -> {
                                                nodeProduce(光神钻头, () -> {
                                                });

                                            });
                                            nodeProduce(寒霜液, () -> {
                                                nodeProduce(月银, () -> {
                                                });
                                                nodeProduce(冷冻液, () -> {
                                                    nodeProduce(抽冷冻液机, () -> {
                                                    });
                                                });
                                            });
                                        });
                                    });
                                    nodeProduce(熵炎埃, () -> {
                                        nodeProduce(魂炎晶, () -> {
                                        });
                                        nodeProduce(天启晶, () -> {
                                            nodeProduce(量子砂, () -> {
                                            });
                                            nodeProduce(流光液, () -> {
                                                nodeProduce(流光晶, () -> {
                                                });
                                                nodeProduce(炽炎硫, () -> {
                                                });
                                                nodeProduce(岩浆, () -> {
                                                    nodeProduce(抽岩浆机, () -> {
                                                    });
                                                });
                                            });
                                        });
                                    });
                                    nodeProduce(混沌石, () -> {
                                        nodeProduce(量子提炼机, () -> {
                                        });
                                    });

                                });
                                nodeProduce(灵枢醚, () -> {
                                    node(灵枢醚炼制器, () -> {
                                    });
                                });
                            });
                        });
                        nodeProduce(曙光神髓, () -> {
                            nodeProduce(冥焰晶簇, () -> {
                                nodeProduce(魔影流浆, () -> {
                                    nodeProduce(魔影幻月石, () -> {
                                        nodeProduce(龙磁髓, () -> {
                                        });
                                        nodeProduce(幻能核心, () -> {
                                        });
                                    });
                                    nodeProduce(星虹凝露, () -> {
                                        nodeProduce(时渊髓液, () -> {
                                            nodeProduce(时渊髓液凝聚器, () -> {
                                            });
                                        });
                                        nodeProduce(寒霜液, () -> {
                                        });
                                    });
                                    nodeProduce(幻月精髓, () -> {
                                        nodeProduce(辉烁玉, () -> {
                                            nodeProduce(混沌金钻头, () -> {
                                            });
                                        });
                                        nodeProduce(星辰秘液, () -> {
                                            nodeProduce(星辰泪滴石, () -> {
                                                nodeProduce(混沌金钻头, () -> {
                                                });
                                            });
                                            nodeProduce(幽冥灵露, () -> {
                                            });
                                        });
                                    });
                                });
                            });
                            nodeProduce(量子妖露, () -> {
                                nodeProduce(灵量子, () -> {
                                    nodeProduce(光蚀晶体, () -> {
                                        nodeProduce(幽荧星砂, () -> {
                                        });
                                        nodeProduce(量子砂, () -> {
                                        });
                                        nodeProduce(星芒液, () -> {
                                            nodeProduce(星芒液抽取钻井, () -> {
                                            });
                                        });
                                    });
                                    nodeProduce(量子砂, () -> {
                                    });
                                });

                                nodeProduce(虚空凝露, () -> {
                                    nodeProduce(虚空灵璃, () -> {
                                        nodeProduce(幽荧星砂, () -> {
                                            nodeProduce(混沌金钻头, () -> {
                                            });
                                        });
                                        nodeProduce(星辰泪滴石, () -> {
                                            nodeProduce(混沌金钻头, () -> {
                                            });
                                        });
                                    });
                                    nodeProduce(星芒液, () -> {
                                        nodeProduce(星芒液抽取钻井, () -> {
                                        });
                                    });
                                });
                            });
                            nodeProduce(虚识之潮, () -> {
                                nodeProduce(虚识之潮冶泵器, () -> {
                                });
                            });
                            nodeProduce(熵烬血浆, () -> {
                                nodeProduce(龙磁髓, () -> {
                                    nodeProduce(紫霄玉, () -> {
                                        nodeProduce(辉烁玉, () -> {
                                        });
                                        nodeProduce(幻光玉, () -> {
                                        });
                                    });
                                    nodeProduce(幻能核心, () -> {
                                        nodeProduce(辉烁玉, () -> {
                                        });
                                        nodeProduce(流光液, () -> {
                                            nodeProduce(高级流光液工厂, () -> {
                                                nodeProduce(幻光玉, () -> {
                                                    nodeProduce(虚空钻头, () -> {
                                                    });
                                                });
                                            });
                                        });
                                    });
                                });
                                nodeProduce(龙芯熔液, () -> {
                                    nodeProduce(龙芯熔液采集器, () -> {
                                    });
                                });
                            });
                            nodeProduce(幽冥梦魇晶, () -> {
                                nodeProduce(灵魂星尘矿, () -> {
                                    nodeProduce(龙磁钻头, () -> {
                                    });
                                });
                                nodeProduce(幻月精髓, () -> {
                                });
                                nodeProduce(幽冥灵露, () -> {
                                });
                            });
                        });
                    });
                });



        });


    }
}
