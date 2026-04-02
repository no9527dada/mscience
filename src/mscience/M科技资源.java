package mscience;

import arc.Events;
import arc.graphics.Color;
import arc.math.Mathf;
import arc.util.Time;
import mindustry.game.EventType;
import mindustry.type.Item;
import mindustry.type.Liquid;


import static CtCoreSystem.CoreSystem.type.CTClib.液体描述;
import static CtCoreSystem.CoreSystem.type.CTColor.C;
import static CtCoreSystem.CoreSystem.type.CTClib.资源描述;
import static mindustry.content.Items.*;
import static mindustry.content.Liquids.*;
import static mscience.M科技Mod.modName;

public class M科技资源 {

        public static class MItem extends Item{
                public MItem(String name, Color color){
                        super(name, color);
                        description= 资源描述(name,modName);
                }
                public MItem(String name){
                        super(name);
                        description= 资源描述(name,modName);
                }
        }
        public static class MLiquid extends Liquid{
                 public MLiquid(String name, Color color){
                super(name);
                this.color = new Color(color);
                description= 液体描述(name,modName);
        }

                /** For modding only.*/
    public MLiquid(String name){
            super(name, new Color(Color.black));
            description= 资源描述(name,modName);
        }
        }
        public static Liquid 水=water
                , 岩浆=slag
                , 石油=oil
                , 冷冻液=cryofluid
                ;
        public static Item 铜 = copper
                ,沙 = sand
                ,废料 = scrap
                ,煤 = coal
                ,铅 = lead
                ,石墨 = graphite
                ,玻璃 = metaglass
                ,硅 = silicon
                ,钛 = titanium
                ,钍 = thorium
                ,孢子荚 = sporePod
                ,硫 = pyratite
                ,爆混 = blastCompound
                ,塑钢 = plastanium
                ,布 = phaseFabric
                ,合金 = surgeAlloy

                ,M碎晶 = new MItem("M碎晶", Color.valueOf("ffffff"))
                ,M晶体 = new MItem("M晶体", Color.valueOf("ffffff")){{hardness = 6;}}
                ,幻光石 = new MItem("幻光石", Color.valueOf("ffffff"))
                ,星辉铜 = new MItem("星辉铜", Color.valueOf("ffffff"))
                ,幽影铁 = new MItem("幽影铁", Color.valueOf("ffffff"))
                ,蓝美晶 = new MItem("蓝美晶", Color.valueOf("ffffff"))
                ,炽炎硫 = new MItem("炽炎硫", Color.valueOf("ffffff"))
                ,月银 = new MItem("月银", Color.valueOf("ffffff"))
                ,梦境翡翠 = new MItem("梦境翡翠", Color.valueOf("ffffff"))
                ,曙光金 = new MItem("曙光金", Color.valueOf("ffffff"))

                ,流光晶 = new MItem("流光晶", Color.valueOf("ffffff"))
                ,虚空黑曜石 = new MItem("虚空黑曜石", Color.valueOf("ffffff"))
                ,幻影幽晶 = new MItem("幻影幽晶", Color.valueOf("ffffff"))
                ,星辰铜精 = new MItem("星辰铜精", Color.valueOf("ffffff")){{hardness = 7;}}
                ,幽冥铁精 = new MItem("幽冥铁精", Color.valueOf("ffffff")){{hardness = 7;}}
                ,月幻石 = new MItem("月幻石", Color.valueOf("ffffff"))
                ,炽炎晶 = new MItem("炽炎晶", Color.valueOf("ffffff"))
                ,魂炎晶 = new MItem("魂炎晶", Color.valueOf("ffffff"))
                ,寒霜石 = new MItem("寒霜石", Color.valueOf("ffffff"))
                ,幽蓝石 = new MItem("幽蓝石", Color.valueOf("ffffff"))
                ,曙光神金 = new MItem("曙光神金", Color.valueOf("ffffff"))

                ,灵虚石= new MItem("灵虚石", Color.valueOf("ffffff"))
                ,幻域紫晶 = new MItem("幻域紫晶", Color.valueOf("ffffff"))
                ,灵能石= new MItem("灵能石", Color.valueOf("ffffff"))
                ,星魂玉= new MItem("星魂玉", Color.valueOf("ffffff"))
                ,虚空晶= new MItem("虚空晶", Color.valueOf("ffffff"))
                ,幻光玉= new MItem("幻光玉", Color.valueOf("ffffff")){{hardness = 8;}}
                ,量子砂= new MItem("量子砂", Color.valueOf("ffffff")){{hardness = 8;}}
                ,天启晶= new MItem("天启晶", Color.valueOf("ffffff"))
                ,光墟玉= new MItem("光墟玉", Color.valueOf("ffffff"))
                ,灵墟晶= new MItem("灵墟晶", Color.valueOf("ffffff"))
                ,星陨晶= new MItem("星陨晶", Color.valueOf("ffffff"))
                ,熵炎埃 = new MItem("熵炎埃", Color.valueOf("ffffff"))
                ,混沌石= new MItem("混沌石", Color.valueOf("ffffff"))
                ,曙光混沌金 = new MItem("曙光混沌金", Color.valueOf("ffffff"))

                ,辉烁玉= new MItem("辉烁玉", Color.valueOf("ffffff")){{hardness = 9;}}
                ,幻能核心= new MItem("幻能核心", Color.valueOf("ffffff"))
                ,紫霄玉= new MItem("紫霄玉", Color.valueOf("ffffff"))
                ,龙磁髓= new MItem("龙磁髓", Color.valueOf("ffffff"))
                ,星辰泪滴石 = new MItem("星辰泪滴石", Color.valueOf("ffffff")){{hardness = 9;}}
                ,幽荧星砂= new MItem("幽荧星砂", Color.valueOf("ffffff")){{hardness = 9;}}
                ,魔影幻月石 = new MItem("魔影幻月石", Color.valueOf("ffffff"))
                ,冥焰晶簇= new MItem("冥焰晶簇", Color.valueOf("ffffff"))
                ,虚空灵璃= new MItem("虚空灵璃", Color.valueOf("ffffff"))
                ,光蚀晶体= new MItem("光蚀晶体", Color.valueOf("ffffff"))
                ,灵量子= new MItem("灵量子", Color.valueOf("ffffff"))
                ,灵魂星尘矿 = new MItem("灵魂星尘矿", Color.valueOf("ffffff")){{hardness = 10;}}
                ,幽冥梦魇晶 = new MItem("幽冥梦魇晶", Color.valueOf("ffffff"))
                //↑↑↑↑上面为曙光神髓的科技

                ,银河幻银矿 = new MItem("银河幻银矿", Color.valueOf("ffffff")){{hardness = 10;}}
                ,霓核体= new MItem("霓核体", Color.valueOf("ffffff"))

                ,玄晶簇= new MItem("玄晶簇", Color.valueOf("ffffff"))
                ,雷烁晶= new MItem("雷烁晶", Color.valueOf("ffffff"))
                ,灵蚀璃= new MItem("灵蚀璃", Color.valueOf("ffffff"))

                ,云码矿= new MItem("云码矿", Color.valueOf("ffffff")){{hardness = 11;}}
                ,暗能髓= new MItem("暗能髓", Color.valueOf("ffffff"))
                ,宙髓玉= new MItem("宙髓玉", Color.valueOf("ffffff"))

                ,幻星砂= new MItem("幻星砂", Color.valueOf("ffffff")){{hardness = 11;}}
                ,迷雾幽灵石 = new MItem("迷雾幽灵石", Color.valueOf("ffffff"))
                ,磁魂石= new MItem("磁魂石", Color.valueOf("ffffff"))
                ,虚空冥石 = new MItem("虚空冥石", Color.valueOf("ffffff"))
                ,宇宙秘宝 = new MItem("宇宙秘宝", Color.valueOf("ffffff"))
                ,幻海深渊珀 = new MItem("幻海深渊珀", Color.valueOf("ffffff"))
                ,虚空幽寂矿 = new MItem("虚空幽寂矿", Color.valueOf("ffffff")){{hardness = 12;}}
                ,曙光幻神金 = new MItem("曙光幻神金", Color.valueOf("ffffff"))
                ,创世微子 = new MItem("创世微子", Color.valueOf("ffffff"))
                ,创世之星 = new MItem("创世之星", Color.valueOf("ffffff")),
                创世神 = new MItem("创世神", Color.valueOf("ffffff"))
                        ;

        public static Liquid
                  流光液= new MLiquid("流光液", Color.valueOf("ff76c5")){{lightColor = Color.valueOf("ee38a1").a(0.2F);temperature = 2.0F;}}
                , 寒霜液= new MLiquid("寒霜液", Color.valueOf("c3f65d")){{lightColor = Color.valueOf("92ce1c").a(0.2F);heatCapacity = 0.9F;temperature = 0.25F;}}

                , 幽冥灵露= new MLiquid("幽冥灵露", Color.valueOf("fffa84")){{lightColor = Color.valueOf("fff854").a(0.2F);}}
                , 龙芯熔液= new MLiquid("龙芯熔液", Color.valueOf("e43636"))//地板液体
                , 熵烬血浆= new MLiquid("熵烬血浆", Color.valueOf("a00808"))
                , 时渊髓液= new MLiquid("时渊髓液", Color.valueOf("7a1198"))//地板液体
                , 星虹凝露= new MLiquid("星虹凝露"){{
                Events.run(EventType.Trigger.update, () -> color.set(C("7beeff")).lerp(C("ff3af6"), Mathf.sinDeg(Time.time)*2f));
        }}
                , 星辰秘液= new MLiquid("星辰秘液", Color.valueOf("c88393")){{lightColor = Color.valueOf("c88393").a(0.2F);}}
                , 魔影流浆= new MLiquid("魔影流浆", Color.valueOf("b3b3b3"))
                , 幻月精髓= new MLiquid("幻月精髓", Color.valueOf("936e9b"))
                , 星芒液= new MLiquid("星芒液")//地板液体
        {{
            Events.run(EventType.Trigger.update, () -> color.set(C("ffd230")).lerp(C("e9feb8"), Mathf.sinDeg(Time.time*0.5f) *1f));
        }}
                , 虚空凝露= new MLiquid("虚空凝露", Color.valueOf("380b7a")){{lightColor = Color.valueOf("fbd8635").a(0.2F);}}
                , 量子妖露= new MLiquid("量子妖露", Color.valueOf("000000"))
                , 虚识之潮= new MLiquid("虚识之潮", Color.valueOf("bb8efd"))//地板液体
                , 曙光神髓= new MLiquid("曙光神髓", Color.valueOf("fbea54"))


                , 熵溶= new MLiquid("熵溶"){{
                Events.run(EventType.Trigger.update, () -> color.set(C("b82fbe")).lerp(C("57afff"), Mathf.sinDeg(Time.time*0.5f) *5f));
        }}
                , 灵枢醚= new MLiquid("灵枢醚"){{
                Events.run(EventType.Trigger.update, () -> color.set(C("959451")).lerp(C("fffc4d"), Mathf.sinDeg(Time.time*0.5f) *2f));
        }}//地板液体



                , 创世神髓= new MLiquid("创世神髓"){{
                Events.run(EventType.Trigger.update, () -> color.set(C("ff3c3c")).lerp(C("640c0c"), Mathf.sinDeg(Time.time*2f)));
        }}



            ;

        // 幽冥灵露‌：仿佛来自幽冥世界的神秘露水。
        // ‌星辰秘液‌：蕴含星辰之力的奇异液体。
        // ‌魔影流浆‌：流淌着魔影能量的诡异浆液。
        // ‌幻月精髓‌：幻月之下凝聚的神秘精髓。
        // ‌灵魂琼浆‌：似乎能触及灵魂的奇妙琼浆。
        // ‌幽冥血泪‌：如幽冥生物血泪般的诡异液体。
        // 创世神髓‌：宇宙深处神秘星体的精髓之液。

      //  public static final Attribute At时渊髓液 = add("时渊髓液");
      //  public static final Attribute At龙芯熔液 = add("龙芯熔液");
      //  public static final Attribute At星芒液 = add("星芒液");
      //  public static final Attribute At虚识之潮 = add("虚识之潮");



        public static void load(){

        }

}

