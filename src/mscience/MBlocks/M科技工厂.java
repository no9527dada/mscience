package mscience.MBlocks;

import arc.math.Mathf;
import mindustry.content.Liquids;
import mindustry.graphics.Pal;
import mindustry.type.ItemStack;
import mindustry.type.LiquidStack;
import mindustry.world.Block;
import mindustry.world.blocks.production.SolidPump;
import mindustry.world.draw.*;
import mindustry.world.meta.Attribute;
import mindustry.world.meta.Env;
import mscience.Mscience.M科技lib;

import static mindustry.type.Category.*;
import static mindustry.type.ItemStack.with;
import static mscience.M科技地板.*;
import static mscience.M科技资源.*;

public class M科技工厂 {
    public static Block
            M碎晶工厂 = new M科技lib.M科技物品基础工厂(
            "M碎晶工厂", 3, 450, 90, 1.5f, M碎晶, 3) {{
        consumeItems(with(
                硅, 1, 玻璃, 2
        ));
        requirements(crafting, with(
                钛, 120
                , 铜, 100
                , 铅, 60
                , 硅, 50
        ));
    }}, M晶体工厂 = new M科技lib.M科技物品基础工厂(
            "M晶体工厂", 2, 450, 90, 0.5f, M晶体, 1) {{
        consumeItems(with(
                钛, 1, M碎晶, 1
        ));
        requirements(crafting, with(
                钛, 120
                , 铜, 100
                , 铅, 60
                , M碎晶, 50
        ));
    }}, 幻光石工厂 = new M科技lib.M科技物品基础工厂(
            "幻光石工厂", 2, 450, 60, 1f, 幻光石, 2) {{
        consumeItems(with(
                钛, 1, 玻璃, 2
        ));
        requirements(crafting, with(
                石墨, 40
                , 铜, 60
                , 铅, 20
                , M晶体, 20
        ));
    }}, 星辉铜工厂 = new M科技lib.M科技物品基础工厂(
            "星辉铜工厂", 2, 450, 70, 0.5f, 星辉铜, 1) {{
        consumeItems(with(
                幻光石, 1, 铜, 1
        ));
        requirements(crafting, with(
                石墨, 35,
                钛, 60
                , 铜, 80
                , 铅, 60
                , M晶体, 20
        ));
    }}, 幽影铁工厂 = new M科技lib.M科技物品基础工厂(
            "幽影铁工厂", 2, 450, 70, 0.5f, 幽影铁, 1) {{
        consumeItems(with(
                幻光石, 1, 铅, 1
        ));
        requirements(crafting, with(
                石墨, 35
                , 钛, 60
                , 铜, 80
                , 铅, 60
                , M晶体, 20
        ));
    }}, 蓝美晶工厂 = new M科技lib.M科技物品基础工厂(
            "蓝美晶工厂", 2, 450, 100, 0.5f, 蓝美晶, 1) {{
        consumeItems(with(
                星辉铜, 1, 幽影铁, 1
        ));
        requirements(crafting, with(
                钛, 120
                , 星辉铜, 100
                , 幻光石, 60
                , M晶体, 50,
                合金, 50
        ));
    }}, 炽炎硫工厂 = new M科技lib.M科技物品基础工厂(
            "炽炎硫工厂", 2, 450, 100, 1.5f, 炽炎硫, 1) {{
        consumeItems(with(
                爆混, 1, 石墨, 3
        ));
        requirements(crafting, with(
                钍, 120
                , 铜, 100
                , 幽影铁, 60
                , M晶体, 80,
                合金, 30
        ));
    }}, 硫工厂 = new M科技lib.M科技物品基础工厂(
            "硫工厂", 2, 450, 150, 0.5f, 硫, 3) {{
        consumeItems(with(
                煤, 1, M晶体, 2
        ));
        requirements(crafting, with(
                钛, 120
                , 石墨, 100
                , 星辉铜, 60
                , M晶体, 50
        ));
    }}, 爆混工厂 = new M科技lib.M科技物品基础工厂(
            "爆混工厂", 2, 450, 220, 2f, 爆混, 3) {{
        consumeItems(with(
                硫, 1, M晶体, 2
        ));
        requirements(crafting, with(
                布, 30
                , 星辉铜, 100
                , 幽影铁, 60
                , M晶体, 50
        ));
    }}, 月银工厂 = new M科技lib.M科技物品基础工厂(
            "月银工厂", 2, 450, 150, 1f, 月银, 2) {{
        consumeItems(with(
                幻光石, 2, 炽炎硫, 2
        ));
        requirements(crafting, with(
                布, 30
                , 星辉铜, 100
                , 幽影铁, 60
                , M晶体, 50
        ));
    }}, M抽水机 = new SolidPump("M抽水机") {{
        description = "";
        result = 水;
        pumpAmount = 30 / 60f;
        size = 2;
        liquidCapacity = 30f;
        rotateSpeed = 1.4f;
        attribute = Attribute.water;
        envRequired |= Env.groundWater;
        consumePower(150 / 60f);
        requirements(production, with(
                星辉铜, 100
                , 幽影铁, 60
                , M晶体, 50
        ));
    }}, 梦境翡翠工厂 = new M科技lib.M科技物品基础工厂(
            "梦境翡翠工厂", 2, 650, 190, 2f, 梦境翡翠, 1) {{
        consumeItems(with(
                塑钢, 2, 布, 1
        ));
        requirements(crafting, with(
                月银, 30
                , 星辉铜, 100
                , 幽影铁, 60
                , 蓝美晶, 35
                , M晶体, 50
        ));
    }}, 曙光金工厂 = new M科技lib.M科技物品基础工厂(
            "曙光金工厂", 4, 700, 320, 4f, 曙光金, 1) {{
        consumeItems(with(
                合金, 2, 梦境翡翠, 2, 蓝美晶, 2, 月银, 2
        ));
        consumeLiquid(冷冻液, 6 / 60f);
        requirements(crafting, with(
                梦境翡翠, 30
                , 星辉铜, 130
                , 幽影铁, 160
                , 蓝美晶, 35
                , M晶体, 150
        ));
    }}, 高级M晶体工厂 = new M科技lib.M科技物品基础工厂(
            "高级M晶体工厂", 2, 450, 130, 2f, M晶体, 5) {{
        consumeItems(with(
                钍, 1, 硅, 2
        ));
        consumeLiquid(水, 30 / 60f);
        requirements(crafting, with(
                曙光金, 30
                , 星辉铜, 100
                , 幽影铁, 60
                , M晶体, 50
        ));
    }}, 塑钢工厂 = new M科技lib.M科技物品基础工厂(
            "塑钢工厂", 2, 700, 200, 1.5f, 塑钢, 5) {{
        consumeItems(with(
                幻光石, 2
        ));
        consumeLiquid(石油, 3 / 60f);
        requirements(crafting, with(
                梦境翡翠, 30
                , 星辉铜, 130
                , 幽影铁, 160
                , 蓝美晶, 35
                , M晶体, 150
        ));
    }}, 石油工厂 = new M科技lib.M科技液体基础工厂(
            "石油工厂", 2, 700, 200, 1.5f, 石油, 40) {{
        consumeItems(with(
                孢子荚, 2
        ));
        consumeLiquid(石油, 3 / 60f);
        requirements(crafting, with(
                梦境翡翠, 30,
                月银, 20
                , 蓝美晶, 35
                , M晶体, 150
        ));
    }}, 资源转换器铜 = new M科技lib.M科技物品基础工厂(
            "资源转换器铜", 2, 700, 300, 0.2f, 铅, 1) {{
        consumeItems(with(
                铜, 1
        ));
        requirements(crafting, with(
                曙光金, 100
                , 星辉铜, 130
                , 幽影铁, 160
                , M晶体, 150
        ));
    }}, 资源转换器铅 = new M科技lib.M科技物品基础工厂(
            "资源转换器铅", 2, 700, 300, 0.2f, 铜, 1) {{
        consumeItems(with(
                铅, 1
        ));
        requirements(crafting, with(
                曙光金, 100
                , 星辉铜, 130
                , 幽影铁, 160
                , M晶体, 150
        ));
    }}, 资源分解器铜铅 = new M科技lib.M科技物品基础工厂(
            "资源分解器铜铅", 2, 700, 180, 0.2f, null, 0) {{
        consumeItems(with(
                废料, 2
        ));
        outputItems = ItemStack.with(铜, 2, 铅, 2);
        requirements(crafting, with(
                曙光金, 100
                , 星辉铜, 130
                , 幽影铁, 160
                , M晶体, 150,
                月银, 60
        ));
    }}, 资源转换器废料 = new M科技lib.M科技物品基础工厂(
            "资源转换器废料", 2, 700, 150, 0.2f, 废料, 3) {{
        consumeItems(with(
                铜, 1, 铅, 1
        ));
        requirements(crafting, with(
                曙光金, 100
                , 星辉铜, 130
                , 幽影铁, 160
                , M晶体, 150
        ));
    }}, 资源融合器M碎晶 = new M科技lib.M科技物品基础工厂(
            "资源融合器M碎晶", 2, 700, 210, 0.5f, M碎晶, 2) {{
        consumeItems(with(
                废料, 5
        ));
        outputItems = ItemStack.with(M碎晶, 2);
        requirements(crafting, with(
                曙光金, 100
                , 蓝美晶, 120
                , 梦境翡翠, 150
                , M晶体, 150,
                月银, 70
        ));
    }}, 资源分解器钛钍 = new M科技lib.M科技物品基础工厂(
            "资源分解器钛钍", 2, 700, 600, 0.5f, null, 0) {{
        consumeItems(with(
                蓝美晶, 1
        ));
        outputItems = ItemStack.with(钛, 3, 钍, 1);
        requirements(crafting, with(
                曙光金, 100
                , 星辰铜精, 130
                , 幽冥铁精, 160
                , M晶体, 150
        ));
    }}, 流光晶工厂 = new M科技lib.M科技物品基础工厂(
            "流光晶工厂", 3, 750, 190, 1.5f, 流光晶, 1) {{
        consumeItems(with(
                蓝美晶, 2, 合金, 2
        ));
        consumeLiquid(冷冻液, 3 / 60f);
        drawer = new DrawMulti(new DrawRegion("-bottom")
                , new DrawLiquidTile(Liquids.cryofluid) {{
            drawLiquidLight = true;
        }}
                , new DrawDefault());
        requirements(crafting, with(
                梦境翡翠, 90
                , 曙光金, 80
                , 蓝美晶, 135
                , M晶体, 200
        ));
    }}, 虚空黑曜石工厂 = new M科技lib.M科技物品基础工厂(
            "虚空黑曜石工厂", 2, 750, 180, 2f, 虚空黑曜石, 1) {{
        consumeItems(with(
                流光晶, 2, 月银, 2
        ));
        requirements(crafting, with(
                梦境翡翠, 140,
                流光晶, 130
                , 蓝美晶, 35
                , M晶体, 150
        ));
    }}, 流光液工厂 = new M科技lib.M科技液体基础工厂(
            "流光液工厂", 3, 750, 150, 1.5f, 流光液, 9) {{
        consumeItems(with(
                流光晶, 1, 炽炎硫, 2
        ));
        consumeLiquid(岩浆, 9 / 60f);
        drawer = new DrawMulti(new DrawRegion("-bottom")
                , new DrawLiquidTile(岩浆) {{
            drawLiquidLight = true;
        }}
                , new DrawLiquidTile(流光液) {{
            drawLiquidLight = true;
        }}
                , new DrawDefault());
        requirements(crafting, with(
                梦境翡翠, 160,
                流光晶, 80
                , 虚空黑曜石, 40
                , M晶体, 220
        ));
    }}, 巨浪合金工厂 = new M科技lib.M科技物品基础工厂(
            "巨浪合金工厂", 3, 750, 200, 2f, 合金, 6) {{
        consumeItems(with(
                钛, 2, M晶体, 2
        ));
        consumeLiquid(流光液, 3 / 60f);
        drawer = new DrawMulti(new DrawRegion("-bottom")
                , new DrawLiquidTile(流光液) {{
            drawLiquidLight = true;
        }}
                , new DrawDefault());
        requirements(crafting, with(
                梦境翡翠, 180,
                曙光金, 110
                , 虚空黑曜石, 60
                , M晶体, 230
        ));
    }}, 幻影幽晶工厂 = new M科技lib.M科技物品基础工厂(
            "幻影幽晶工厂", 3, 800, 200, 3f, 幻影幽晶, 2) {{
        consumeItems(with(
                虚空黑曜石, 2, 梦境翡翠, 2
        ));
        requirements(crafting, with(
                流光晶, 90,
                曙光金, 90
                , 虚空黑曜石, 100,
                月银, 150
                , M晶体, 230
        ));
    }}, 高级硅工厂 = new M科技lib.M科技物品基础工厂(
            "高级硅工厂", 3, 450, 350, 1f, 硅, 10) {{
        consumeItems(with(
                钍, 2, 沙, 5
        ));
        itemCapacity = 20;
        requirements(crafting, with(
                曙光金, 30,
                幻影幽晶, 30
                , 星辉铜, 100
                , 幽影铁, 60
                , M晶体, 50
        ));
    }}, 星辰铜精工厂 = new M科技lib.M科技物品基础工厂(
            "星辰铜精工厂", 3, 800, 220, 2f, 星辰铜精, 2) {{
        consumeItems(with(
                星辉铜, 2, 曙光金, 1
        ));
        consumeLiquid(流光液, 3 / 60f);
        drawer = new DrawMulti(new DrawRegion("-bottom")
                , new DrawLiquidTile(流光液) {{
            drawLiquidLight = true;
        }}
                , new DrawDefault());
        requirements(crafting, with(
                流光晶, 90,
                曙光金, 120
                , 虚空黑曜石, 100,
                幻影幽晶, 360
                , M晶体, 250
        ));
    }}, 幽冥铁精工厂 = new M科技lib.M科技物品基础工厂(
            "幽冥铁精工厂", 3, 800, 220, 2f, 幽冥铁精, 2) {{
        consumeItems(with(
                幽影铁, 2, 曙光金, 1
        ));
        consumeLiquid(流光液, 3 / 60f);
        drawer = new DrawMulti(new DrawRegion("-bottom")
                , new DrawLiquidTile(流光液) {{
            drawLiquidLight = true;
        }}
                , new DrawDefault());
        requirements(crafting, with(
                流光晶, 90,
                曙光金, 120
                , 虚空黑曜石, 100,
                幻影幽晶, 360
                , M晶体, 250
        ));
    }}, 月幻石工厂 = new M科技lib.M科技物品基础工厂(
            "月幻石工厂", 3, 800, 230, 2f, 月幻石, 1) {{
        consumeItems(with(
                幻光石, 2, 蓝美晶, 1
        ));
        consumeLiquid(岩浆, 3 / 60f);
        drawer = new DrawMulti(new DrawRegion("-bottom")
                , new DrawLiquidTile(岩浆) {{
            drawLiquidLight = true;
        }}
                , new DrawDefault());
        requirements(crafting, with(
                幽冥铁精, 80,
                曙光金, 150
                , 星辰铜精, 80,
                幻影幽晶, 360
                , M晶体, 280
        ));
    }}, 炽炎晶工厂 = new M科技lib.M科技物品基础工厂(
            "炽炎晶工厂", 3, 830, 270, 2f, 炽炎晶, 1) {{
        consumeItems(with(
                炽炎硫, 3, 月幻石, 1
        ));
        consumeLiquid(流光液, 3 / 60f);
        drawer = new DrawMulti(new DrawRegion("-bottom")
                , new DrawLiquidTile(流光液) {{
            drawLiquidLight = true;
        }}
                , new DrawDefault());
        requirements(crafting, with(
                梦境翡翠, 180,
                曙光金, 150
                , 月银, 180,
                幻影幽晶, 400
                , M晶体, 300
        ));
    }}, 魂炎晶工厂 = new M科技lib.M科技物品基础工厂(
            "魂炎晶工厂", 3, 830, 300, 3f, 魂炎晶, 1) {{
        consumeItems(with(
                炽炎晶, 2, 曙光金, 1
        ));
        requirements(crafting, with(
                梦境翡翠, 180,
                曙光金, 150
                , 月银, 180,
                幻影幽晶, 400
                , M晶体, 300
        ));
    }}, 流光提炼机 = new M科技lib.M科技物品分解工厂(
            "流光提炼机", 4, 900, 220, 0.3f) {{
        consumeLiquid(流光液, 2 / 60f);
        results = ItemStack.with(
                石墨, 100,
                爆混, 75,
                布, 50,
                幻光石, 25
        );
        requirements(crafting, with(
                炽炎晶, 50,
                曙光金, 130
                , 星辰铜精, 200,
                幽冥铁精, 200
                , M晶体, 350
        ));
    }}, 寒霜液工厂 = new M科技lib.M科技液体基础工厂(
            "寒霜液工厂", 3, 850, 260, 1.5f, 寒霜液, 12) {{
        consumeItems(with(
                月银, 2
        ));
        consumeLiquid(冷冻液, 12 / 60f);
        drawer = new DrawMulti(new DrawRegion("-bottom")
                , new DrawLiquidTile(冷冻液) {{
            drawLiquidLight = true;
        }}
                , new DrawLiquidTile(寒霜液) {{
            drawLiquidLight = true;
        }}
                , new DrawDefault());
        requirements(crafting, with(
                魂炎晶, 70,
                虚空黑曜石, 130
                , 月银, 270,
                幽冥铁精, 150
                , M晶体, 350
        ));
    }}, 寒霜石工厂 = new M科技lib.M科技物品基础工厂(
            "寒霜石工厂", 3, 870, 330, 2f, 寒霜石, 1) {{
        consumeItems(with(
                星辰铜精, 2, 幽冥铁精, 2
        ));
        consumeLiquid(寒霜液, 6 / 60f);
        drawer = new DrawMulti(new DrawRegion("-bottom")
                , new DrawLiquidTile(寒霜液) {{
            drawLiquidLight = true;
        }}
                , new DrawDefault());
        requirements(crafting, with(
                魂炎晶, 70,
                虚空黑曜石, 130
                , 幻影幽晶, 210,
                梦境翡翠, 230,
                曙光金, 150
                , M晶体, 350
        ));
    }}, 抽冷冻液机 = new SolidPump("抽冷冻液机") {{
        description = "";
        result = 冷冻液;
        health = 560;
        pumpAmount = 30 / 60f;
        size = 2;
        liquidCapacity = 30f;
        rotateSpeed = 1.4f;
        attribute = Attribute.water;
        envRequired |= Env.groundWater;
        consumePower(230 / 60f);
        requirements(production, with(
                寒霜石, 80
                , 幻影幽晶, 60,
                流光晶, 130
                , M晶体, 180
        ));
    }}, 幽蓝石工厂 = new M科技lib.M科技物品基础工厂(
            "幽蓝石工厂", 3, 880, 350, 3f, 幽蓝石, 1) {{
        consumeItems(with(
                幻影幽晶, 2, 虚空黑曜石, 2
        ));
        requirements(crafting, with(
                魂炎晶, 70,
                寒霜石, 100
                , 幻影幽晶, 210,
                梦境翡翠, 230,
                曙光金, 150
                , M晶体, 350
        ));
    }}, 曙光神金工厂 = new M科技lib.M科技物品基础工厂(
            "曙光神金工厂", 3, 1000, 700, 6f, 曙光神金, 1) {{
        consumeItems(with(
                寒霜石, 2, 魂炎晶, 2, 幽蓝石, 2, 曙光金, 2
        ));
        requirements(crafting, with(
                星辰铜精, 30,
                幽冥铁精, 300
                , 幻影幽晶, 210,
                梦境翡翠, 220,
                月幻石, 150
                , M晶体, 500
        ));
    }}


            //第三科技树
            , 灵虚石工厂 = new M科技lib.M科技物品基础工厂(
            "灵虚石工厂", 2, 1000, 300, 1f, 灵虚石, 1) {{
        consumeItems(with(
                煤, 2, 钍, 1
        ));
        requirements(crafting, with(
                M晶体, 190
                , 蓝美晶, 130
                , 月幻石, 70
                , 寒霜石, 60
                , 曙光神金, 10
        ));
    }}, 幻域紫晶工厂 = new M科技lib.M科技物品基础工厂(
            "幻域紫晶工厂", 2, 1050, 320, 1f, 幻域紫晶, 1) {{
        consumeItems(with(
                灵虚石, 2, 星辰铜精, 2
        ));
        requirements(crafting, with(
                M晶体, 190
                , 幻影幽晶, 80
                , 幽蓝石, 50
                , 幽冥铁精, 130
        ));
    }}, 灵能石工厂 = new M科技lib.M科技物品基础工厂(
            "灵能石工厂", 2, 1050, 320, 1f, 灵能石, 1) {{
        consumeItems(with(
                沙, 2, 钛, 1
        ));
        requirements(crafting, with(
                M晶体, 190
                ,灵虚石, 35
                , 曙光神金, 10
                , 炽炎晶, 80
                , 幽蓝石, 70
                , 虚空黑曜石, 130
        ));
    }}, 幽冥灵露‌工厂 = new M科技lib.M科技液体基础工厂(
            "幽冥灵露工厂", 3, 1120, 340, 1.5f, 幽冥灵露, 12) {{
        consumeItems(with(
                灵能石, 1, 幽冥铁精, 2
        ));
        consumeLiquid(水, 6 / 60f);
        drawer = new DrawMulti(new DrawRegion("-bottom")
                , new DrawLiquidTile(水) {{
            drawLiquidLight = true;
        }}
                , new DrawDefault());
        requirements(crafting, with(
                M晶体, 200
                , 灵虚石, 35
                , 魂炎晶, 80
                , 幽蓝石, 60
                , 幻影幽晶, 120
        ));
    }}, 星魂玉工厂 = new M科技lib.M科技物品基础工厂(
            "星魂玉工厂", 2, 1120, 330, 1f, 星魂玉, 1) {{
        consumeItems(with(
                幻域紫晶, 2
        ));
        consumeLiquid(幽冥灵露, 12 / 60f);
        requirements(crafting, with(
                M晶体, 210
                , 幻域紫晶, 35
                , 寒霜石, 75
                , 幽蓝石, 80
                , 梦境翡翠, 150
        ));
    }}, 虚空晶工厂 = new M科技lib.M科技物品基础工厂(
            "虚空晶工厂", 2, 1150, 350, 1f, 虚空晶, 1) {{
        consumeItems(with(
                虚空黑曜石, 2, 星魂玉, 1
        ));
        requirements(crafting, with(
                M晶体, 220
                , 幻域紫晶, 35
                , 曙光神金, 50
                , 星辰铜精, 80
                , 魂炎晶, 150
        ));
    }}, 高级虚空黑曜石工厂 = new M科技lib.M科技物品基础工厂(
            "高级虚空黑曜石工厂", 2, 1150, 340, 0.5f, 虚空黑曜石, 1) {{
        consumeItems(with(
                幻光玉, 3
        ));
        consumeLiquid(冷冻液, 6 / 60f);
        drawer = new DrawMulti(new DrawRegion("-bottom")
                , new DrawLiquidTile(冷冻液) {{
            drawLiquidLight = true;
        }}
                , new DrawDefault());
        requirements(crafting, with(
                M晶体, 240
                , 幻域紫晶, 35
                , 曙光神金, 50
                , 幽冥铁精, 80
                , 星辰铜精, 80
                , 虚空晶, 45
        ));
    }}, 天启晶工厂 = new M科技lib.M科技物品基础工厂(
            "天启晶工厂", 2, 1200, 370, 1f, 天启晶, 1) {{
        consumeItems(with(
                量子砂, 5
        ));
        consumeLiquid(流光液, 18 / 60f);
        drawer = new DrawMulti(new DrawRegion("-bottom")
                , new DrawLiquidTile(流光液) {{
            drawLiquidLight = true;
        }}
                , new DrawDefault());
        requirements(crafting, with(
                M晶体, 280
                , 幻域紫晶, 100
                , 曙光神金, 150
                , 幽冥铁精, 200
                , 星辰铜精, 200
        ));
    }}, 量子提炼机 = new M科技lib.M科技物品分解工厂(
            "量子提炼机", 4, 1240, 340, 0.3f) {{
        consumeLiquid(流光液, 3 / 60f);
        consumeItems(with(
                量子砂, 1
        ));
        results = ItemStack.with(
                流光晶, 100,
                炽炎硫, 50,
                月幻石, 40,
                混沌石, 5
        );
        requirements(crafting, with(
                天启晶, 50
                , 幻域紫晶, 120
                , 曙光神金, 130
                , 寒霜石, 150
                , 魂炎晶, 160
                , M晶体, 250
        ));
    }}, 光墟玉工厂 = new M科技lib.M科技物品基础工厂(
            "光墟玉工厂", 3, 1270, 380, 1f, 光墟玉, 1) {{
        consumeItems(with(
                虚空晶, 2, 量子砂, 3
        ));
        consumeLiquid(流光液, 18 / 60f);
        drawer = new DrawMulti(new DrawRegion("-bottom")
                , new DrawLiquidTile(流光液) {{
            drawLiquidLight = true;
        }}
                , new DrawDefault());
        requirements(crafting, with(
                天启晶, 80
                , 幻域紫晶, 100
                , 曙光神金, 160
                , 虚空黑曜石, 150
                , 月幻石, 200
                , M晶体, 270
        ));
    }}, 灵墟晶工厂 = new M科技lib.M科技物品基础工厂(
            "灵墟晶工厂", 2, 1330, 370, 2f, 灵墟晶, 1) {{
        consumeItems(with(
                光墟玉, 2, 炽炎晶, 3
        ));
        requirements(crafting, with(
                虚空晶, 120
                , 幻域紫晶, 100
                , 曙光神金, 130
                , 寒霜石, 150
                , M晶体, 300
        ));
    }}, 抽岩浆机 = new SolidPump("抽岩浆机") {{
        description = "";
        result = 岩浆;
        health = 1040;
        pumpAmount = 30 / 60f;
        size = 2;
        liquidCapacity = 30f;
        rotateSpeed = 1.4f;
        attribute = Attribute.sand;
        envRequired |= Env.groundWater;
        consumePower(260 / 60f);
        requirements(production, with(
                魂炎晶, 100
                , 灵墟晶, 60,
                虚空黑曜石, 130
                , M晶体, 450
        ));
    }}, 星陨晶工厂 = new M科技lib.M科技物品基础工厂(
            "星陨晶工厂", 2, 1330, 380, 1f, 星陨晶, 1) {{
        consumeItems(with(
                灵墟晶, 2, 寒霜石, 2
        ));
        requirements(crafting, with(
                虚空晶, 120
                , 天启晶, 100
                , 光墟玉, 130
                , 幽蓝石, 150
                , M晶体, 330
        ));
    }}, 熵炎埃工厂 = new M科技lib.M科技物品基础工厂(
            "熵炎埃工厂", 3, 1500, 420, 3f, 熵炎埃, 1) {{
        consumeItems(with(
                魂炎晶, 1, 天启晶, 3
        ));
        requirements(crafting, with(
                虚空晶, 120
                , 幻影幽晶, 100
                , 曙光神金, 130
                , 魂炎晶, 300
                , M晶体, 350
        ));
    }}, 曙光混沌金工厂 = new M科技lib.M科技物品基础工厂(
            "曙光混沌金工厂", 6, 1800, 1200, 6f, 曙光混沌金, 1) {{
        consumeItems(with(
                熵炎埃, 1, 混沌石, 3, 星陨晶, 3, 曙光神金, 2
        ));
        consumeLiquid(幽冥灵露, 24 / 60f);
        drawer = new DrawMulti(new DrawRegion("-bottom")
                , new DrawLiquidTile(幽冥灵露) {{
            drawLiquidLight = true;
        }}
                , new DrawDefault());
        requirements(crafting, with(
                虚空晶, 150
                , 灵墟晶, 100
                , 曙光神金, 200
                , 星辰铜精, 300
                , 幽冥铁精, 300
                , M晶体, 800
        ));
    }}


            //第四科技树

            , 高级流光液工厂 = new M科技lib.M科技液体基础工厂(
            "高级流光液工厂", 2, 1850, 420, 0.5f, 流光液, 12) {{
        consumeItems(with(
                幻光玉, 2
        ));
        drawer = new DrawMulti(new DrawRegion("-bottom")
                , new DrawLiquidTile(流光液) {{
            drawLiquidLight = true;
        }}
                , new DrawDefault());
        requirements(crafting, with(
                M晶体, 400
                , 灵墟晶, 60
                , 月幻石, 260
                , 熵炎埃, 30

        ));
    }}, 幻能核心工厂 = new M科技lib.M科技物品基础工厂(
            "幻能核心工厂", 3, 1880, 420, 2f, 幻能核心, 1) {{
        consumeItems(with(
                辉烁玉, 2
        ));
        consumeLiquid(流光液, 24 / 60f);
        drawer = new DrawMulti(new DrawRegion("-bottom")
                , new DrawLiquidTile(流光液) {{
            drawLiquidLight = true;
        }}
                , new DrawDefault());
        requirements(crafting, with(
                M晶体, 440
                , 灵墟晶, 60
                , 曙光金, 180
                , 幽蓝石, 230

        ));
    }}, 紫霄玉工厂 = new M科技lib.M科技物品基础工厂(
            "紫霄玉工厂", 3, 1880, 440, 2f, 紫霄玉, 1) {{
        consumeItems(with(
                辉烁玉, 3, 幻光玉, 3
        ));
        requirements(crafting, with(
                M晶体, 440
                , 灵墟晶, 40
                , 曙光金, 130
                , 光墟玉, 120

        ));
    }}, 龙磁髓工厂 = new M科技lib.M科技物品基础工厂(
            "龙磁髓工厂", 3, 1900, 450, 4f, 龙磁髓, 2) {{
        consumeItems(with(
                紫霄玉, 1, 幻能核心, 1
        ));
        requirements(crafting, with(
                M晶体, 460
                , 月银, 300
                , 流光晶, 230
                , 光墟玉, 160
                , 虚空晶, 130
                , 熵炎埃, 90

        ));
    }}, 龙芯熔液采集器 = new M科技lib.M科技液体泵("龙芯熔液采集器") {{
        floor = FloorLiquid龙芯熔液;//需要的地板
        size = 3;
        health = 1830;
        pumpAmount = 0.1f / 3f;//每格地板提供2点液体输出
        liquidCapacity = 30f;
        hasPower = true;
        consumePower(380 / 60f);
        requirements(liquid, with(
                M晶体, 350
                , 幻域紫晶, 230
                , 月幻石, 90
                , 魂炎晶, 110
                , 曙光神金, 50
        ));
        drawer = new DrawMulti(
                new DrawRegion("-bottom"),
                new DrawLiquidTile(),
                new DrawRegion("-spinner", 3, true),
                new DrawDefault()
        );
    }}, 熵烬血浆工厂 = new M科技lib.M科技液体基础工厂(
            "熵烬血浆工厂", 3, 1930, 430, 2f, 熵烬血浆, 6) {{
        consumeItems(with(
                龙磁髓, 4
        ));
        consumeLiquid(龙芯熔液, 12 / 60f);
        hasLiquids = true;
        drawer = new DrawMulti(new DrawRegion("-bottom")
                , new DrawLiquidTile(龙芯熔液) {{
            drawLiquidLight = true;
        }}
                , new DrawLiquidRegion(熵烬血浆) {{
            drawLiquidLight = true;
            suffix = "-熵烬血浆";
        }}
                , new DrawDefault());
        requirements(crafting, with(
                M晶体, 470
                , 幻域紫晶, 240
                , 幻能核心, 170
                , 星陨晶, 130
                , 虚空晶, 140
                , 曙光混沌金, 40
        ));
    }},
            时渊髓液凝聚器 = new M科技lib.M科技液体泵("时渊髓液凝聚器") {{
                floor = FloorLiquid时渊髓液;//需要的地板
                size = 3;
                health = 1860;
                pumpAmount = 0.1f / 3f;
                liquidCapacity = 30f;
                hasPower = true;
                consumePower(390 / 60f);
                requirements(liquid, with(
                        M晶体, 350
                        , 幻域紫晶, 230
                        , 幻能核心, 90
                        , 虚空晶, 110
                        , 曙光神金, 50
                ));

                drawer = new DrawMulti(
                        new DrawRegion("-bottom"),
                        new DrawPistons() {{
                            sinMag = 2.75f;
                            sinScl = 5f;
                            sides = 8;//8个活塞
                          /*   public float sinMag = 4.0F;// 正弦波的振幅
                               public float sinScl = 6.0F;    // 正弦波的缩放因子
                               public float sinOffset = 50.0F;  // 正弦波的偏移量
                               public float sideOffset = 0.0F; // 每个侧面的偏移量
                               public float lenOffset = -1.0F;  // 活塞长度的偏移量
                               public float horiOffset = 0.0F;    // 活塞水平方向的偏移量
                               public float angleOffset = 0.0F;    // 活塞角度的偏移量
                           */
                            sideOffset = Mathf.PI / 2f;
                        }},
                        new DrawRegion("-bottom2"),
                        new DrawLiquidTile(时渊髓液, 38f / 4f) {{
                            drawLiquidLight = true;
                        }},
                        new DrawDefault(),
                        new DrawGlowRegion() {{//发光 一闪一闪的
                            alpha = 1f;
                            glowScale = 5f;
                            color = Pal.slagOrange;
                        }}
                );
            }},
            星虹凝露工厂 = new M科技lib.M科技液体基础工厂(
                    "星虹凝露工厂", 4, 1930, 460, 1f, 星虹凝露, 6) {{
                consumeLiquids(LiquidStack.with(时渊髓液, 18f / 60f, 寒霜液, 6f / 60f));
                hasLiquids = true;
                drawer = new DrawMulti(new DrawRegion("-bottom")
                        , new DrawLiquidRegion(时渊髓液) {{
                    drawLiquidLight = true;
                    suffix = "-时渊髓液";
                }}
                        , new DrawLiquidRegion(寒霜液) {{
                    drawLiquidLight = true;
                    suffix = "-寒霜液";
                }}
                        , new DrawLiquidTile(星虹凝露) {{
                    drawLiquidLight = true;
                }}
                        , new DrawDefault());
                requirements(crafting, with(
                        M晶体, 470
                        , 幻域紫晶, 240
                        , 幻能核心, 170
                        , 星陨晶, 130
                        , 虚空晶, 140
                        , 曙光混沌金, 40

                ));
            }}, 星辰秘液工厂 = new M科技lib.M科技液体基础工厂(
            "星辰秘液工厂", 3, 1930, 450, 2f, 星辰秘液, 24) {{
        consumeItems(with(
                星辰泪滴石, 6
        ));
        consumeLiquid(幽冥灵露, 6 / 60f);
        drawer = new DrawMulti(new DrawRegion("-bottom")
                , new DrawLiquidTile(幽冥灵露) {{
            drawLiquidLight = true;
        }}
                , new DrawLiquidTile(星辰秘液) {{
            drawLiquidLight = true;
        }}
                , new DrawDefault());
        requirements(crafting, with(
                M晶体, 470
                , 幻域紫晶, 180
                , 幻能核心, 130
                , 月幻石, 220
                , 光墟玉, 100
                , 曙光混沌金, 30

        ));
    }}, 魔影幻月石工厂 = new M科技lib.M科技物品基础工厂(
            "魔影幻月石工厂", 3, 1980, 490, 4f, 魔影幻月石, 2) {{
        consumeItems(with(
                龙磁髓, 8, 幻能核心, 4
        ));
        requirements(crafting, with(
                M晶体, 560
                , 龙磁髓, 60
                , 幻能核心, 130
                , 熵炎埃, 130

        ));
    }}, 幻月精髓工厂 = new M科技lib.M科技液体基础工厂(
            "幻月精髓工厂", 3, 1950, 460, 3f, 幻月精髓, 6) {{
        consumeItems(with(
                辉烁玉, 5
        ));
        consumeLiquids(LiquidStack.with(星辰秘液, 6f / 60f));
        drawer = new DrawMulti(new DrawRegion("-bottom")
                , new DrawLiquidTile(星辰秘液) {{
            drawLiquidLight = true;
        }}
                , new DrawLiquidTile(幻月精髓) {{
            drawLiquidLight = true;
        }}
                , new DrawDefault());
        requirements(crafting, with(
                M晶体, 560
                , 灵墟晶, 160
                , 紫霄玉, 140
                , 星魂玉, 180
                , 曙光混沌金, 60

        ));
    }}, 魔影流浆工厂 = new M科技lib.M科技液体基础工厂(
            "魔影流浆工厂", 4, 1970, 520, 4f, 魔影流浆, 6) {{
        consumeItems(with(
                魔影幻月石, 2
        ));
        consumeLiquids(LiquidStack.with(星虹凝露, 18f / 60f, 幻月精髓, 6f / 60f));
        drawer = new DrawMulti(new DrawRegion("-bottom")
                , new DrawLiquidTile(魔影流浆) {{
            drawLiquidLight = true;
        }}
                , new DrawDefault());
        requirements(crafting, with(
                M晶体, 560
                , 幽冥铁精, 160
                , 幻影幽晶, 140
                , 熵炎埃, 180
                , 曙光混沌金, 90

        ));
    }}, 冥焰晶簇工厂 = new M科技lib.M科技物品基础工厂(
            "冥焰晶簇工厂", 2, 1990, 550, 5f, 冥焰晶簇, 2) {{
        consumeLiquid(魔影流浆, 12 / 60f);
        requirements(crafting, with(
                M晶体, 600
                , 龙磁髓, 160
                , 魔影幻月石, 140
                , 熵炎埃, 180
                , 灵能石, 230
                , 曙光混沌金, 100

        ));
    }}, 虚空灵璃工厂 = new M科技lib.M科技物品基础工厂(
            "虚空灵璃工厂", 3, 1990, 470, 3f, 虚空灵璃, 1) {{
        consumeItems(with(
                幽荧星砂, 5, 星辰泪滴石, 3
        ));
        requirements(crafting, with(
                M晶体, 620
                , 龙磁髓, 150
                , 幻能核心, 160
                , 熵炎埃, 140
                , 幽蓝石, 220
                , 曙光混沌金, 100
        ));
    }}, 星芒液抽取钻井 = new M科技lib.M科技液体泵("星芒液抽取钻井") {{
        floor = FloorLiquid星芒液;//需要的地板
        size = 3;
        health = 1880;
        pumpAmount = 0.1f / 3f;//每格地板提供2点液体输出
        liquidCapacity = 30f;
        hasPower = true;
        consumePower(420 / 60f);
        requirements(liquid, with(
                M晶体, 580
                , 灵墟晶, 230
                , 月幻石, 120
                , 幻能核心, 110
                , 曙光神金, 50
        ));
        drawer = new DrawMulti(//这个和 龙芯熔液采集器一样的
                new DrawRegion("-bottom"),
                new DrawLiquidTile(),
                new DrawRegion("-spinner", 3, true),
                new DrawDefault()
        );
    }}, 虚空凝露工厂 = new M科技lib.M科技液体基础工厂(
            "虚空凝露工厂", 3, 1890, 470, 2f, 虚空凝露, 6) {{
        consumeItems(with(
                虚空灵璃, 2
        ));
        consumeLiquids(LiquidStack.with(星芒液, 12f / 60f));
        drawer = new DrawMulti(new DrawRegion("-bottom")
                , new DrawLiquidTile(星芒液) {{
            drawLiquidLight = true;
        }}
                , new DrawLiquidTile(虚空凝露) {{
            drawLiquidLight = true;
        }}
                , new DrawDefault());
        requirements(crafting, with(
                M晶体, 620
                , 灵墟晶, 230
                , 月幻石, 120
                , 幻能核心, 110
                , 曙光神金, 50

        ));
    }}, 光蚀晶体工厂 = new M科技lib.M科技物品基础工厂(
            "光蚀晶体工厂", 4, 1930, 490, 3f, 光蚀晶体, 1) {{
        consumeItems(with(
                幽荧星砂, 3, 量子砂, 5
        ));
        consumeLiquids(LiquidStack.with(星芒液, 6f / 60f));
        drawer = new DrawMulti(new DrawRegion("-bottom")
                , new DrawLiquidTile(星芒液) {{
            drawLiquidLight = true;
        }}
                , new DrawDefault());
        requirements(crafting, with(
                M晶体, 630
                , 紫霄玉, 230
                , 星陨晶, 160
                , 幻能核心, 100
                , 曙光神金, 50
        ));
    }}, 灵量子工厂 = new M科技lib.M科技物品基础工厂(
            "灵量子工厂", 3, 1950, 500, 1.5f, 灵量子, 1) {{
        consumeItems(with(
                光蚀晶体, 1, 量子砂, 3
        ));
        requirements(crafting, with(
                M晶体, 650
                , 紫霄玉, 230
                , 天启晶, 160
                , 幻能核心, 100
                , 灵能石, 260
        ));
    }}, 量子妖露工厂 = new M科技lib.M科技液体基础工厂(
            "量子妖露工厂", 3, 1980, 590, 6f, 量子妖露, 6) {{
        consumeItems(with(
                灵量子, 2
        ));
        consumeLiquids(LiquidStack.with(虚空凝露, 12f / 60f));
        drawer = new DrawMulti(new DrawRegion("-bottom")
                , new DrawLiquidTile(虚空凝露) {{
            drawLiquidLight = true;
        }}
                , new DrawLiquidTile(量子妖露) {{
            drawLiquidLight = true;
        }}
                , new DrawDefault());
        requirements(crafting, with(
                M晶体, 800
                , 紫霄玉, 230
                , 星陨晶, 160
                , 魔影幻月石, 70
                , 曙光混沌金, 40

        ));
    }}, 幽冥梦魇晶工厂 = new M科技lib.M科技物品基础工厂(
            "幽冥梦魇晶工厂", 4, 2020, 610, 8f, 幽冥梦魇晶, 1) {{
        consumeItems(with(
                灵魂星尘矿, 100
        ));
        itemCapacity = 200;
        hasLiquids = true;
        //consumeLiquid(幻月精髓, 3 / 60f);
        consumeLiquids(LiquidStack.with(幻月精髓, 6f / 60f, 幽冥灵露, 6f / 60f));
        drawer = new DrawMulti(new DrawRegion("-bottom")
                , new DrawLiquidRegion(幻月精髓) {{
            drawLiquidLight = true;
            suffix = "-幻月精髓";
        }}
                , new DrawLiquidRegion(幽冥灵露) {{
            drawLiquidLight = true;
            suffix = "-幽冥灵露";
        }}
                , new DrawDefault());
        requirements(crafting, with(
                M晶体, 800
                , 龙磁髓, 240
                , 熵炎埃, 360
                , 魔影幻月石, 230
                , 曙光混沌金, 150

        ));
    }}, 虚识之潮冶泵器 = new M科技lib.M科技液体泵("虚识之潮冶泵器") {{
        floor = FloorLiquid虚识之潮;//需要的地板
        size = 4;
        health = 1880;
        pumpAmount = 0.1f / 3f;//每格地板提供2点液体输出
        liquidCapacity = 30f;
        hasPower = true;
        consumePower(420 / 60f);
        drawer = new DrawMulti(
                new DrawRegion("-bottom"),
                new DrawLiquidTile(),
                new DrawPistons() {{
                    sinMag = 2.5f;
                    sinScl = 5f;
                    sides = 6;//6个活塞
                    sideOffset = 8;
                }},
                new DrawRegion("-spinner", 3, true),//有个转子
                new DrawGlowRegion() {{//发光 一闪一闪的
                    alpha = 1f;
                    glowScale = 5f;
                    color = Pal.slagOrange;
                }},
                new DrawDefault()
        );
        requirements(liquid, with(
                M晶体, 720
                , 龙磁髓, 150
                , 光墟玉, 300
                , 魔影幻月石, 150
                , 曙光混沌金, 80

        ));
    }}, 曙光神髓工厂 = new M科技lib.M科技液体基础工厂(
            "曙光神髓工厂", 6, 2500, 2100, 2.5f, 曙光神髓, 8) {{

        consumeItems(with(
                冥焰晶簇, 2
        ));
        consumeLiquids(LiquidStack.with(
                量子妖露, 6f / 60f
                , 虚识之潮, 64f / 60f
                , 熵烬血浆, 6f / 60f

        ));
        hasLiquids = true;
        drawer = new DrawMulti(new DrawRegion("-bottom")
                , new DrawLiquidRegion(虚识之潮) {{
            drawLiquidLight = true;
            suffix = "-虚识之潮";
        }}
                , new DrawLiquidRegion(熵烬血浆) {{
            drawLiquidLight = true;
            suffix = "-熵烬血浆";
        }}
                , new DrawLiquidRegion(量子妖露) {{
            drawLiquidLight = true;
            suffix = "-量子妖露";
        }}
                , new DrawLiquidTile(曙光神髓) {{
            drawLiquidLight = true;
        }}
                , new DrawDefault());
        requirements(crafting, with(
                M晶体, 2000
                , 幻能核心, 650
                , 灵能石, 800
                , 魔影幻月石, 550
                , 曙光混沌金, 500
                , 幽冥梦魇晶, 350

        ));
    }}, 高级曙光神金工厂 = new M科技lib.M科技物品基础工厂(
            "高级曙光神金工厂", 3, 2130, 630, 2f, 曙光神金, 2) {{
        consumeLiquids(LiquidStack.with(曙光神髓, 0.4f / 60f));
        drawer = new DrawMulti(new DrawRegion("-bottom")
                , new DrawLiquidTile(曙光神髓) {{
            drawLiquidLight = true;
        }}
                , new DrawDefault());
        requirements(crafting, with(
                M晶体, 700
                , 幻能核心, 130
                , 灵能石, 220
                , 魔影幻月石, 120
                , 曙光混沌金, 60

        ));
    }},


    //第五科技树
    霓核体工厂 = new M科技lib.M科技物品基础工厂(
            "霓核体工厂", 2, 2130, 620, 1f, 霓核体, 3) {{
        consumeItems(with(
                曙光神金, 1, 银河幻银矿, 3
        ));
        requirements(crafting, with(
                M晶体, 720
                , 幻能核心, 130
                , 灵能石, 220
                , 紫霄玉, 120
                , 曙光神金, 160
        ));
    }},
            玄晶簇工厂 = new M科技lib.M科技物品基础工厂(
                    "玄晶簇工厂", 2, 2140, 630, 1f, 玄晶簇, 1) {{
                consumeItems(with(
                        霓核体, 2, 星辰泪滴石, 3
                ));
                requirements(crafting, with(
                        M晶体, 720
                        , 幻能核心, 150
                        , 龙磁髓, 240
                        , 虚空灵璃, 120
                ));
            }},
            雷烁晶工厂 = new M科技lib.M科技物品基础工厂(
                    "雷烁晶工厂", 2, 2140, 630, 1f, 雷烁晶, 2) {{
                consumeItems(with(
                        霓核体, 1, 幽荧星砂, 2
                ));
                requirements(crafting, with(
                        M晶体, 720
                        , 幻能核心, 150
                        , 龙磁髓, 240
                        , 光蚀晶体, 120
                ));
            }},
            灵蚀璃工厂 = new M科技lib.M科技物品基础工厂(
                    "灵蚀璃工厂", 2, 2160, 640, 1.5f, 灵蚀璃, 3) {{
                consumeItems(with(
                        光蚀晶体, 1, 虚空灵璃, 1
                ));
                requirements(crafting, with(
                        M晶体, 730
                        , 灵量子, 180
                        , 紫霄玉, 210
                        , 魔影幻月石, 100
                ));
            }},
            云码矿工厂 = new M科技lib.M科技物品基础工厂(
                    "云码矿工厂", 3, 2150, 610, 8f, 云码矿, 1) {{
                consumeItems(with(
                        灵蚀璃, 1, 雷烁晶, 1, 玄晶簇, 1
                ));
                requirements(crafting, with(
                        M晶体, 750
                        , 幽冥梦魇晶, 170
                        , 光蚀晶体, 140
                        , 魔影幻月石, 80
                ));
            }},
            暗能髓工厂 = new M科技lib.M科技物品基础工厂(
                    "暗能髓工厂", 3, 2180, 650, 3f, 暗能髓, 2) {{
                consumeItems(with(
                        云码矿, 3, 曙光混沌金, 3
                ));
                requirements(crafting, with(
                        M晶体, 750
                        , 幽冥梦魇晶, 170
                        , 光蚀晶体, 140
                        , 魔影幻月石, 80
                ));
            }},
            宙髓玉工厂 = new M科技lib.M科技物品基础工厂(
                    "宙髓玉工厂", 2, 2170, 700, 1.5f, 宙髓玉, 1) {{
                consumeItems(with(
                        云码矿, 2, 暗能髓, 2
                ));
                requirements(crafting, with(
                        M晶体, 750
                        , 冥焰晶簇, 150
                        , 光蚀晶体, 160
                        ,龙磁髓, 240
                        , 魔影幻月石, 120
                ));
            }},

    迷雾幽灵石工厂 = new M科技lib.M科技物品基础工厂(
                    "迷雾幽灵石工厂", 2, 2140, 680, 2f, 迷雾幽灵石, 1) {{
                consumeItems(with(
                        幻星砂, 3, 银河幻银矿, 2
                ));
                requirements(crafting, with(
                        M晶体, 730
                        , 霓核体, 150
                        ,雷烁晶, 130
                        , 魔影幻月石, 90
                ));
            }},
            磁魂石工厂 = new M科技lib.M科技物品基础工厂(
                    "磁魂石工厂", 3, 2170, 720, 2f, 磁魂石, 1) {{
                consumeLiquids(LiquidStack.with(时渊髓液, 12f / 60f));
                consumeItems(with(
                        迷雾幽灵石, 2
                ));
                requirements(crafting, with(
                        M晶体, 750
                        , 霓核体, 150
                        ,灵量子, 220
                        , 冥焰晶簇, 190
                ));
            }},
            熵溶工厂 = new M科技lib.M科技液体基础工厂(
                    "熵溶工厂", 3, 2130, 650, 2f, 熵溶, 6) {{
                consumeItems(with(
                        磁魂石, 2
                ));
                consumeLiquids(LiquidStack.with(虚识之潮, 12f / 60f));
                drawer = new DrawMulti(new DrawRegion("-bottom")
                        , new DrawLiquidTile(虚识之潮) {{
                    drawLiquidLight = true;
                }}
                        , new DrawLiquidTile(熵溶) {{
                    drawLiquidLight = true;
                }}
                        , new DrawDefault());
                requirements(crafting, with(
                        M晶体, 760
                        , 霓核体, 230
                        , 灵量子, 220
                        , 暗能髓, 110
                        , 迷雾幽灵石, 50

                ));
            }},
            虚空冥石工厂 = new M科技lib.M科技物品基础工厂(
                    "虚空冥石工厂", 2, 2210, 760, 3f, 虚空冥石, 1) {{
                consumeLiquids(LiquidStack.with(熵溶, 3f / 60f));
                consumeItems(with(
                        云码矿, 2
                ));
                requirements(crafting, with(
                        M晶体, 760
                        , 霓核体, 190
                        , 龙磁髓, 270
                        , 暗能髓, 140
                        , 灵蚀璃, 150
                ));
            }},
            宇宙秘宝工厂 = new M科技lib.M科技物品基础工厂(
                    "宇宙秘宝工厂", 2, 2230, 800, 6f, 宇宙秘宝, 2) {{
                consumeItems(with(
                        宙髓玉, 2, 磁魂石, 2
                ));
                requirements(crafting, with(
                        M晶体, 800
                        , 霓核体, 200
                        , 迷雾幽灵石, 90
                        , 玄晶簇, 130
                        , 灵蚀璃, 140
                ));
            }},
            幻海深渊珀工厂 = new M科技lib.M科技物品基础工厂(
                    "幻海深渊珀工厂", 2, 2240, 900, 3f, 幻海深渊珀, 1) {{
                consumeItems(with(
                        宇宙秘宝, 1, 虚空冥石, 2
                ));
                requirements(crafting, with(
                        M晶体, 800
                        , 幽冥梦魇晶, 200
                        , 迷雾幽灵石, 90
                        , 暗能髓, 130
                        , 灵蚀璃, 140
                ));
            }},
            灵枢醚炼制器 = new M科技lib.M科技液体泵("灵枢醚炼制器") {{
                floor = FloorLiquid灵枢醚;//需要的地板
                size = 2;
                health = 2400;
                pumpAmount = 0.1f / 3f;
                liquidCapacity = 30f;
                hasPower = true;
                consumePower(700 / 60f);
                requirements(liquid, with(
                        M晶体, 800
                        , 宇宙秘宝, 120
                        , 迷雾幽灵石, 140
                        ,雷烁晶, 180
                        , 暗能髓, 140
                        , 幻海深渊珀, 50

                ));
                drawer = new DrawMulti(
                        new DrawRegion("-bottom"),
                        new DrawPistons() {{
                            sinMag = 2.75f;
                            sinScl = 5f;
                            sides = 8;//8个活塞
                            sideOffset = Mathf.PI / 2f;
                        }},
                        new DrawRegion("-bottom2"),
                        new DrawLiquidTile(时渊髓液, 38f / 4f) {{
                            drawLiquidLight = true;
                        }},
                        new DrawDefault(),
                        new DrawGlowRegion() {{//发光 一闪一闪的
                            alpha = 1f;
                            glowScale = 5f;
                            color = Pal.slagOrange;
                        }}
                );
            }},
            曙光幻神金工厂 = new M科技lib.M科技物品基础工厂(
                    "曙光幻神金工厂", 6, 3000, 5000, 15f, 曙光幻神金, 1) {{
                consumeItems(with(
                        虚空幽寂矿, 300, 幻星砂, 500,幻海深渊珀, 10, 曙光混沌金, 5
                ));
                itemCapacity = 500;
                consumeLiquids(LiquidStack.with(灵枢醚, 50f / 60f));
                requirements(crafting, with(
                        M晶体, 1200
                        , 宇宙秘宝, 270
                        , 迷雾幽灵石, 360
                        ,曙光混沌金, 450
                        , 暗能髓, 320
                        , 幻海深渊珀, 200
                ));
            }},
            创世之星工厂 = new M科技lib.M科技物品基础工厂(
                    "创世之星工厂", 3, 3500, 75000, 300f, 创世之星, 1) {{
                consumeItems(with(
                        曙光幻神金, 100
                ));
                itemCapacity = 200;
                requirements(crafting, with(
                        M晶体, 3500
                        , 宇宙秘宝, 400
                        ,曙光幻神金, 80
                        , 暗能髓, 340
                        , 幻海深渊珀, 210

                ));
            }},
            创星解析仪 = new M科技lib.M科技物品基础工厂(
                    "创星解析仪", 4, 3800, 45000, 150f, 创世微子, 14) {{
                consumeItems(with(
                        创世之星,1,幻海深渊珀, 30
                        ));
                itemCapacity = 60;
                consumeLiquids(LiquidStack.with(曙光神髓, 8f / 60f));
                requirements(crafting, with(
                        M晶体, 5000
                        , 宇宙秘宝, 300
                        ,曙光幻神金, 70
                        , 幻海深渊珀, 180

                ));
            }},
            创世纪 = new M科技lib.M科技物品基础工厂(
                    "创世纪", 4, 5000, 38000, 120f, 创世之星, 1) {{
                consumeItems(with(
                        创世微子,4,曙光幻神金, 10
                ));
                requirements(crafting, with(
                        M晶体, 10000
                        , 宇宙秘宝, 500
                        ,曙光幻神金, 100
                        , 幻海深渊珀, 300
                ));
            }},

    创世神髓工厂 = new M科技lib.M科技液体基础工厂(
            "创世神髓工厂", 5, 7000, 65000, 65f, 创世神髓, 1) {{
        consumeItems(with(
                创世之星, 100
        ));
        canOverdrive = false;//不可超速 禁止超速
        consumeLiquids(LiquidStack.with(灵枢醚, 120f / 60f));
        drawer = new DrawMulti(new DrawRegion("-bottom")
                , new DrawLiquidTile(曙光神髓) {{
            drawLiquidLight = true;
        }}
                , new DrawLiquidTile(创世神髓) {{
            drawLiquidLight = true;
        }}
                , new DrawDefault());
        requirements(crafting, with(
                M晶体, 30000
                , 宇宙秘宝, 100
                ,曙光幻神金, 50
                , 创世微子, 10

        ));
    }},
            创世神工厂 = new M科技lib.M科技物品基础工厂(
                    "创世神成就", 5, 10000, 500000, 60*60f, 创世神, 1) {{
                consumeLiquids(LiquidStack.with(创世神髓, 1f / 60f));
                requirements(crafting, with(
                        M晶体, 660000
                        , 宇宙秘宝, 1000
                        ,曙光幻神金, 500
                        , 创世微子, 100

                ));
            }},










    /* 双液测试工厂 = new M科技lib.M科技液体基础工厂(
             "双液测试工厂", 3, 700, 150, 2f, slag, 6) {{
         //  outputLiquid = new LiquidStack(slag, 20/60f);
         consumeLiquids(LiquidStack.with(water, 18f / 60f, cryofluid, 6f / 60f));
         hasLiquids = true;
         drawer = new DrawMulti(
                 new DrawRegion("-bottom")
                 , new DrawLiquidRegion(water) {{
             drawLiquidLight = true;
             suffix = "-water";
         }}

                 // ,new DrawRegion("-cryofluid")
                 , new DrawLiquidRegion(cryofluid) {{
             drawLiquidLight = true;
             suffix = "-cryofluid";
         }}

                 //,new DrawRegion("-slag")
                 , new DrawLiquidRegion(slag) {{
             drawLiquidLight = true;
             suffix = "-slag";
         }}
                 , new DrawDefault());
         requirements(crafting, with(
         ));
     }}*/ 工厂;
}