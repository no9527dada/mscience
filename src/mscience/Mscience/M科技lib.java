package mscience.Mscience;


import CtCoreSystem.CoreSystem.type.CTBurstDrill;
import arc.Core;
import arc.graphics.Blending;
import arc.graphics.Color;
import arc.graphics.g2d.Draw;
import arc.graphics.g2d.TextureRegion;
import arc.math.Mathf;
import arc.util.Time;
import arc.util.Tmp;
import mindustry.Vars;
import mindustry.content.Blocks;
import mindustry.content.Fx;
import mindustry.content.Liquids;
import mindustry.entities.Effect;
import mindustry.entities.bullet.MassDriverBolt;
import mindustry.game.Team;
import mindustry.gen.Building;
import mindustry.gen.Bullet;
import mindustry.graphics.Drawf;
import mindustry.graphics.Layer;
import mindustry.graphics.Pal;
import mindustry.type.Item;
import mindustry.type.ItemStack;
import mindustry.type.Liquid;
import mindustry.type.LiquidStack;
import mindustry.world.Block;
import mindustry.world.Tile;
import mindustry.world.blocks.environment.Floor;
import mindustry.world.blocks.liquid.LiquidBlock;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.storage.CoreBlock;
import mindustry.world.draw.*;

import static CtCoreSystem.CoreSystem.type.CTClib.方块描述;
import static CtCoreSystem.CoreSystem.type.CTColor.C;
import static mindustry.Vars.*;
import static mindustry.Vars.state;
import static mindustry.type.Category.crafting;
import static mindustry.type.Category.production;
import static mindustry.type.ItemStack.with;
import static mindustry.world.meta.BlockGroup.transportation;
import static mscience.M科技Mod.modName;
import static mscience.M科技资源.M晶体;
import static mscience.M科技资源.M碎晶;

public class M科技lib {

    public static class M科技物品基础工厂 extends GenericCrafter {
        Effect 制作中特效 = updateEffect;
        Effect 产出特效 = craftEffect;

        // public float 生产时间=craftTime * 60;
        public M科技物品基础工厂(String name, int 尺寸, int 血量, float 耗电, float 生产时间, Item 产出物, int 数量) {
            super(name);
            description =方块描述(name,modName);
            consumePower(耗电 / 60f);
            outputItem = new ItemStack(产出物, 数量);
            // canOverdrive = false;//不可超速 禁止超速
            health = 血量;
            itemCapacity = 10;
            size = 尺寸;
            group = transportation;
            产出特效 = Fx.hitLancer;
            制作中特效 = Fx.hitLancer;
            craftTime = 生产时间 * 60f;
            updateEffectChance = 0.1F;
            researchCostMultiplier = 0.5f;//科技树研究需要的资源倍率
            drawer = new DrawMulti(new DrawDefault(), new DrawFlame(C("ffef99")));
            requirements(crafting, with(
                    M晶体, 100

            ));
        }
    }

    public static class M科技液体基础工厂 extends GenericCrafter {
        Effect 制作中特效 = updateEffect;
        Effect 产出特效 = craftEffect;

        // public float 生产时间=craftTime * 60;
        public M科技液体基础工厂(String name, int 尺寸, int 血量, float 耗电, float 生产时间, Liquid 液体物, int 数量) {
            super(name);
            description =方块描述(name,modName);
            consumePower(耗电 / 60f);
            // canOverdrive = false;//不可超速 禁止超速
            health = 血量;
            itemCapacity = 10;
            liquidCapacity = 30;
            size = 尺寸;
            group = transportation;
            产出特效 = Fx.hitLancer;
            制作中特效 = Fx.hitLancer;
            craftTime = 生产时间 * 60f;
            outputLiquid = new LiquidStack(液体物, 数量 / 60f);
            updateEffectChance = 0.1F;
            drawer = new DrawMulti(new DrawDefault(), new DrawFlame(C("ffef99")));
            researchCostMultiplier = 0.5f;//科技树研究需要的资源倍率
            requirements(crafting, with(
                    M晶体, 100

            ));
        }
    }
    public static class M科技液体泵 extends Pump {{

    }
        public Floor floor;//需要的地板
        public M科技液体泵(String name) {
            super(name);
        }
        @Override
        public boolean canPlaceOn(Tile tile, Team team, int rotation){
            boolean hasF = false, hasO = false;
            for(Tile other : tile.getLinkedTilesAs(this, tempTiles)){
                if(other.floor() == floor) {
                    hasF = true;
                }else if(other.floor().liquidDrop != null){
                    hasO = true;
                }
            }
            return hasF && !hasO;
        }


    }
    public static class M科技液体地板工厂 extends GenericCrafter {
        Effect 制作中特效 = updateEffect;
        Effect 产出特效 = craftEffect;
        public M科技液体地板工厂(String name, int 尺寸, int 血量, float 耗电, float 生产时间, Liquid 液体物, int 数量) {
            super(name);
            floor = (Floor) Blocks.water;//需要的地板
            description =方块描述(name,modName);
            consumePower(耗电 / 60f);
            // canOverdrive = false;//不可超速 禁止超速
            health = 血量;
            itemCapacity = 10;
            liquidCapacity = 30;
            size = 尺寸;
            group = transportation;
            产出特效 = Fx.hitLancer;
            制作中特效 = Fx.hitLancer;
            craftTime = 生产时间 * 60f;
            outputLiquid = new LiquidStack(液体物, 数量 / 60f);
            updateEffectChance = 0.1F;
            drawer = new DrawMulti(new DrawDefault(), new DrawFlame(C("ffef99")));
            researchCostMultiplier = 0.5f;//科技树研究需要的资源倍率
            requirements(crafting, with(
                    M晶体, 100

            ));
        }
        /**
         * 通用地板限制
         */
        public Floor floor;//需要的地板

        @Override
        public boolean canPlaceOn(Tile tile, Team team, int rotation) {
            CoreBlock.CoreBuild core = team.core();
            if (tile == null) return false;
            if (Vars.state.isEditor()) return true;
            if ((!state.rules.infiniteResources && !core.items.has(requirements, state.rules.buildCostMultiplier)))
                return false;

            tile.getLinkedTilesAs(this, tempTiles);
            return !tempTiles.contains(o -> o.floor() != floor);
        }

        @Override
        public void drawPlace(int x, int y, int rotation, boolean valid) {

            if (!canPlaceOn(world.tile(x, y), player.team(), rotation)) {

                drawPlaceText(Core.bundle.get(

                        (player.team().core() != null && player.team().core().items.has(requirements, state.rules.buildCostMultiplier)) || state.rules.infiniteResources ?
                                "bar.floor" + floor.localizedName :
                                "bar.noresources"
                ), x, y, valid);
            }
        }

    }
    public static class M科技物品分解工厂 extends Separator {
        // public float 生产时间=craftTime * 60;
        public M科技物品分解工厂(String name, int 尺寸, int 血量, float 耗电, float 生产时间) {
            super(name);
            description =方块描述(name,modName);
            consumePower(耗电 / 60f);
            //  canOverdrive = false;//不可超速 禁止超速
            health = 血量;
            itemCapacity = 10;
            size = 尺寸;
            group = transportation;
            craftTime = 生产时间 * 60f;
            results = ItemStack.with(
                    M晶体, 100
            );
            researchCostMultiplier = 0.5f;//科技树研究需要的资源倍率
            drawer = new DrawMulti(new DrawRegion("-bottom"), new DrawLiquidTile(), new DrawDefault());
            requirements(crafting, with(
                    M晶体, 100

            ));
        }
    }

    public static class M科技基础钻头 extends Drill {
        Effect 制作中特效 = updateEffect;
        Effect 产出特效 = drillEffect;

        // public float 生产时间=craftTime * 60;
        public M科技基础钻头(String name, int 尺寸, int 血量, float 耗电, int 勘钻等级, float 勘钻速度, Liquid 液体物, float 数量, float 液体强化倍率) {
            super(name);
            description =方块描述(name,modName);
            consumePower(耗电 / 60f);
            researchCostMultiplier = 0.5f;//科技树研究需要的资源倍率
            // canOverdrive = false;//不可超速 禁止超速
            health = 血量;
            itemCapacity = 10;
            size = 尺寸;
            tier = 勘钻等级;
            drillTime = 勘钻速度;//越大越慢
            group = transportation;
            制作中特效 = Fx.pulverizeMedium;
            updateEffectChance = 0.1F;
            产出特效 = Fx.mineBig;
            consumeLiquid(液体物, 数量 / 60f).boost();
            liquidBoostIntensity =  Mathf.sqrt(液体强化倍率);
            requirements(production, with(
                    M晶体, 100

            ));
        }

    }

    public static class M科技爆裂钻头 extends CTBurstDrill {
        Effect 制作中特效 = updateEffect;
        Effect 产出特效 = drillEffect;

        // public float 生产时间=craftTime * 60;
        public M科技爆裂钻头(String name, int 尺寸, int 血量, float 耗电, int 勘钻等级, float 勘钻速度, Liquid 液体物, int 数量, float 液体强化倍率) {
            super(name);
            description =方块描述(name,modName);
            consumePower(耗电 / 60f);
            researchCostMultiplier = 0.5f;//科技树研究需要的资源倍率
            // canOverdrive = false;//不可超速 禁止超速
            health = 血量;
            itemCapacity = 10;
            size = 尺寸;
            tier = 勘钻等级;
            drillTime = 勘钻速度;//越大越慢
            group = transportation;
            制作中特效 = Fx.pulverizeMedium;
            updateEffectChance = 0.1F;
            产出特效 = Fx.mineImpactWave.wrap(Color.valueOf("90ffff"), 20);
            consumeLiquid(液体物, 数量 / 60f).boost();
            liquidBoostIntensity = 液体强化倍率;
            requirements(production, with(
                    M晶体, 100

            ));
        }
    }


    public static class MDrawLiquidRegion extends DrawBlock {
        public String suffix;
        public TextureRegion 遮盖贴图;
        public Liquid liquid;
        public int w, h, x, y;
        public boolean has遮盖;

        public MDrawLiquidRegion(Liquid liquid, String suffix, int w, int h, int x, int y, boolean has遮盖) {
            this.liquid = liquid;
            this.suffix = suffix;
            this.x = x;
            this.y = y;
            this.w = w;
            this.h = h;
            this.has遮盖 = has遮盖;
        }

        @Override
        public void draw(Building build) {
            Tmp.tr1.set(renderer.fluidFrames[liquid.gas ? 1 : 0][liquid.getAnimationFrame()]);
            Tmp.tr1.setWidth(w);
            Tmp.tr1.setHeight(h);

            Color color = Tmp.c1.set(liquid.color).a(1f);
            Drawf.liquid(Tmp.tr1, build.x + x, build.y + y, build.liquids.get(liquid) / build.block.liquidCapacity, color);

            if (has遮盖) Draw.rect(遮盖贴图, build.x, build.y);
        }

        @Override
        public void load(Block block) {
            if (has遮盖) 遮盖贴图 = Core.atlas.find(block.name + suffix);
        }

    }
}
