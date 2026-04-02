package mscience;

import mindustry.game.Schematics;
import mindustry.maps.planet.SerpuloPlanetGenerator;
import mindustry.type.Sector;
import mscience.Mscience.M科技SerpuloPlanetGenerator;
import arc.graphics.Color;
import mindustry.content.Items;
import mindustry.game.Team;
import mindustry.graphics.Pal;
import mindustry.graphics.g3d.HexMesh;
import mindustry.graphics.g3d.HexSkyMesh;
import mindustry.graphics.g3d.MultiMesh;
import mindustry.type.Planet;

import static mindustry.content.Blocks.*;
import static mindustry.content.Items.erekirItems;
import static mindustry.content.SectorPresets.extractionOutpost;
import static mindustry.content.UnitTypes.*;


public class M科技Planets {


    public static Planet
            M科技星球2,  M科技星球;

    public static void load(){
        M科技星球 = new Planet("M科技PlanetOne", mindustry.content.Planets.sun, 1f, 3){{

            localizedName ="[#57ff79]M[#ffffff]科技";

            generator = new SerpuloPlanetGenerator() {
                public boolean allowLanding(Sector sector) {
                    return false;
                }//关闭数字区块
                public void generateSector(Sector sector) {
                }//无基地
            };
            meshLoader = () -> new HexMesh(this, 6);
    /*        cloudMeshLoader = () -> new MultiMesh(
                    new HexSkyMesh(this, 11, 0.15f, 0.13f, 5, new Color().set(Pal.spore).mul(0.9f).a(0.75f), 2, 0.45f, 0.9f, 0.38f),
                    new HexSkyMesh(this, 1, 0.6f, 0.16f, 5, Color.white.cpy().lerp(Pal.spore, 0.55f).a(0.75f), 2, 0.45f, 1f, 0.41f)
            );*/
            orbitRadius=50;
            launchCapacityMultiplier = 0.5f;
            sectorSeed = 2;
            clearSectorOnLose = false;//扇区丢失时是否重置地图
            startSector = 0;
            allowWaves = true;

            enemyCoreSpawnReplace = false;//攻击图核心变刷怪点
            allowLaunchSchematics = false;//开启发射核心蓝图
            allowLaunchLoadout = true;//开启携带资源发射
            allowSectorInvasion = false;//模拟攻击图入侵
            ////allowWaveSimulation = false;//模拟后台波次
            prebuildBase = false;
            //itemWhitelist.addAll(erekirItems);
            ruleSetter = r -> {

               // r.hideBannedBlocks = false;
                r.waveTeam = Team.crux;
                r.placeRangeCheck = false;
                r.showSpawns = false;
                r.reactorExplosions=false;//反应堆不爆炸
                r.bannedBlocks.addAll(//禁用方块
                        launchPad//发射台
                        ,airFactory,//空军厂
                        groundFactory//陆军厂
                        ,navalFactory//海军厂
                       , additiveReconstructor
                       ,multiplicativeReconstructor
                      , exponentialReconstructor
                      , tetrativeReconstructor
                        ,thoriumReactor//钍堆
                        ,overdriveDome//超速
                        ,overdriveProjector//超速
                       ,advancedLaunchPad//发射台
                       ,landingPad//接受台
                        ,interplanetaryAccelerator//行星加速器
                       );
                r.bannedUnits.addAll(//禁用单位
                        flare,mono,retusa,nova
                );
            };
            iconColor = Color.valueOf("7d4dff");
            atmosphereColor = Color.valueOf("3c1b8f");
            atmosphereRadIn = 0.02f;
            atmosphereRadOut = 0.3f;
            alwaysUnlocked = true;
            landCloudColor = Pal.spore.cpy().a(0.5f);
          //  hiddenItems.addAll(erekirItems).removeAll(Items.serpuloItems);
        }};
        M科技星球2 = new Planet("M科技PlanetTow", mindustry.content.Planets.sun, 1f, 3){{

            localizedName ="[#ffec6b]M[#ffffff]科技";

            generator = new M科技SerpuloPlanetGenerator();
            meshLoader = () -> new HexMesh(this, 6);
            cloudMeshLoader = () -> new MultiMesh(
                    new HexSkyMesh(this, 11, 0.15f, 0.13f, 5, new Color().set(Pal.spore).mul(0.9f).a(0.75f), 2, 0.45f, 0.9f, 0.38f),
                    new HexSkyMesh(this, 1, 0.6f, 0.16f, 5, Color.white.cpy().lerp(Pal.spore, 0.55f).a(0.75f), 2, 0.45f, 1f, 0.41f)
            );
            orbitRadius=50;
            launchCapacityMultiplier = 0.5f;
            sectorSeed = 2;
            clearSectorOnLose = true;//扇区丢失时是否重置地图

            allowWaves = true;

            enemyCoreSpawnReplace = false;//攻击图核心变刷怪点
            allowLaunchSchematics = true;//开启发射核心蓝图
            allowLaunchLoadout = false;//开启携带资源发射
            allowSectorInvasion = false;//模拟攻击图入侵
          //  allowWaveSimulation = false;//模拟后台波次


            //doesn't play well with configs
            prebuildBase = false;
            ruleSetter = r -> {
                r.waveTeam = Team.crux;
                r.placeRangeCheck = false;
                r.showSpawns = false;
                r.bannedBlocks.addAll(//禁用方块
                        launchPad//发射台
                );
            };
            iconColor = Color.valueOf("7d4dff");
            atmosphereColor = Color.valueOf("3c1b8f");
            atmosphereRadIn = 0.02f;
            atmosphereRadOut = 0.3f;
            startSector = 0;
           // alwaysUnlocked = true;
            landCloudColor = Pal.spore.cpy().a(0.5f);
           // hiddenItems.addAll(erekirItems).removeAll(Items.serpuloItems);
        }};
    }

    }

