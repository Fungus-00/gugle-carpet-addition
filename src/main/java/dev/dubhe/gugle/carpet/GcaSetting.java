package dev.dubhe.gugle.carpet;

import carpet.api.settings.Rule;

public class GcaSetting {

    public static final String GCA = "GCA";
    public static final String EXPERIMENTAL = "experimental";

    // 允许玩家打开假人背包
    @Rule(
            categories = {GCA, EXPERIMENTAL}
    )
    public static boolean openFakePlayerInventory = false;

    // 允许玩家打开假人末影箱
    @Rule(
            categories = {GCA, EXPERIMENTAL}
    )
    public static boolean openFakePlayerEnderChest = false;

    // 退出存档时保留假人
    @Rule(
            categories = {GCA, EXPERIMENTAL}
    )
    public static boolean fakePlayerResident = false;

    // 退出存档时保留假人动作
    @Rule(
            categories = {GCA, EXPERIMENTAL}
    )
    public static boolean fakePlayerReloadAction = false;

    // 让假人自动补货
    @Rule(
            categories = {GCA, EXPERIMENTAL}
    )
    public static boolean fakePlayerAutoReplenishment = false;

    // 让假人自动钓鱼
    @Rule(
            categories = {GCA, EXPERIMENTAL}
    )
    public static boolean fakePlayerAutoFish = false;

    // 让假人自动切换快损坏的工具
    @Rule(
            categories = {GCA, EXPERIMENTAL}
    )
    public static boolean fakePlayerAutoReplaceTool = false;

    // 让放置的栅栏门与你点击的栅栏门拥有相同的方块状态
    @Rule(
            categories = {GCA, EXPERIMENTAL}
    )
    public static boolean betterFenceGatePlacement = false;

    // 仅允许名称中包含“去皮”的斧头对原木去皮
    @Rule(
            categories = {GCA, EXPERIMENTAL}
    )
    public static boolean betterWoodStrip = false;

    // 右键告示牌时与之附着的方块产生交互
    @Rule(
            categories = {GCA, EXPERIMENTAL}
    )
    public static boolean betterSignInteraction = false;

    // 快速合成时在物品栏保留一份物品
    @Rule(
            categories = {GCA, EXPERIMENTAL}
    )
    public static boolean betterQuickCrafting = false;

    // 流浪商人生成提示
    @Rule(
        categories = {GCA, EXPERIMENTAL}
    )
    public static boolean traderSpawnTips = false;

    // 设置LC值为多少高度时的值
    @Rule(
        categories = {GCA, EXPERIMENTAL}
    )
    public static int qnmdLC = -1;

//    // 方便快捷的假人管理菜单
//    @Rule(
//            categories = {GCA, EXPERIMENTAL}
//    )
//    public static boolean botManagement = false;
}
