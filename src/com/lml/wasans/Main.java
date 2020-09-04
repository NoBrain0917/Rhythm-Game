package com.lml.wasans;

import com.sun.org.apache.xpath.internal.operations.Bool;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import net.minecraft.server.v1_12_R1.IPlayerFileData;
import net.minecraft.server.v1_12_R1.PacketPlayOutTitle;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.*;
import org.bukkit.util.Vector;

import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;


public class Main extends JavaPlugin implements Listener {


    Player playuser;
    Player preuser;
    int point = 0;
    Location vec;
    Boolean isStart = false;

    @Override
    public void onEnable(){
        getLogger().info("[Wa Sans] started.");
        Bukkit.getPluginManager().registerEvents(this,this);
    }

    @EventHandler
    public void PlayerItemHeldEvent(PlayerItemHeldEvent event) {
        if(playuser!=null||preuser!=null){
        if(isStart) {
            if (event.getPlayer().getName() == playuser.getName() || event.getPlayer().getName() == preuser.getName()) {
                if (event.getPlayer().getName() == playuser.getName()) {
                    if (playuser.getInventory().getHeldItemSlot() == 3) {
                        preuser.getInventory().setHeldItemSlot(4);
                        for (Entity entity : event.getPlayer().getNearbyEntities(20, 20, 20)) {
                            if (entity.getType() == EntityType.FALLING_BLOCK) {
                                double dis = entity.getLocation().distance(new Location(playuser.getWorld(), vec.getBlockX() + 16.7, vec.getBlockY() + 0.001, vec.getBlockZ() + 1.5));

                                if (dis < 1.1 && dis > 0.3) {

                                    if (!entity.isDead()) {
                                        entity.remove();
                                        point += 1;
                                        Score score = playuser.getScoreboard().getObjective(DisplaySlot.SIDEBAR).getScore(" " + playuser.getName());
                                        score.setScore(point);
                                        playuser.getPlayer().spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§a§lNICE"));
                                    }
                                    playuser.playSound(playuser.getLocation(), Sound.BLOCK_NOTE_BASEDRUM, 1, 1);

                                } else if (dis < 0.31) {
                                    if (!entity.isDead()) {
                                        entity.remove();
                                        point += 2;
                                        Score score = playuser.getScoreboard().getObjective(DisplaySlot.SIDEBAR).getScore(" " + playuser.getName());
                                        score.setScore(point);
                                        playuser.getPlayer().spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§b§lPERFECT"));
                                    }
                                    playuser.playSound(playuser.getLocation(), Sound.BLOCK_NOTE_BASEDRUM, 1, 1);


                                }
                            }


                        }

                    }
                    if (playuser.getInventory().getHeldItemSlot() == 2) {
                        preuser.getInventory().setHeldItemSlot(4);
                        for (Entity entity : event.getPlayer().getNearbyEntities(20, 20, 20)) {
                            if (entity.getType() == EntityType.FALLING_BLOCK) {
                                double dis = entity.getLocation().distance(new Location(playuser.getWorld(), vec.getBlockX() + 16.7, vec.getBlockY() + 0.001, vec.getBlockZ() + 2.5));
                                if (dis < 1.1 && dis > 0.3) {
                                    if (!entity.isDead()) {
                                        entity.remove();
                                        point += 1;
                                        Score score = playuser.getScoreboard().getObjective(DisplaySlot.SIDEBAR).getScore(" " + playuser.getName());
                                        score.setScore(point);
                                        playuser.getPlayer().spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§a§lNICE"));
                                    }
                                    playuser.playSound(playuser.getLocation(), Sound.BLOCK_NOTE_BASEDRUM, 1, 1);

                                } else if (dis < 0.31) {
                                    if (!entity.isDead()) {
                                        entity.remove();
                                        point += 2;
                                        Score score = playuser.getScoreboard().getObjective(DisplaySlot.SIDEBAR).getScore(" " + playuser.getName());
                                        score.setScore(point);
                                        playuser.getPlayer().spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§b§lPERFECT"));
                                    }
                                    playuser.playSound(playuser.getLocation(), Sound.BLOCK_NOTE_BASEDRUM, 1, 1);

                                }
                            }
                        }

                    }

                }
                if (playuser.getInventory().getHeldItemSlot() == 1) {
                    preuser.getInventory().setHeldItemSlot(4);
                    for (Entity entity : event.getPlayer().getNearbyEntities(20, 20, 20)) {
                        if (entity.getType() == EntityType.FALLING_BLOCK) {
                            double dis = entity.getLocation().distance(new Location(playuser.getWorld(), vec.getBlockX() + 16.7, vec.getBlockY() + 0.001, vec.getBlockZ() + 3.5));
                            if (dis < 1.1 && dis > 0.3) {
                                if (!entity.isDead()) {
                                    entity.remove();
                                    point += 1;
                                    Score score = playuser.getScoreboard().getObjective(DisplaySlot.SIDEBAR).getScore(" " + playuser.getName());
                                    score.setScore(point);
                                    playuser.getPlayer().spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§a§lNICE"));
                                }
                                playuser.playSound(playuser.getLocation(), Sound.BLOCK_NOTE_BASEDRUM, 1, 1);

                            } else if (dis < 0.31) {
                                if (!entity.isDead()) {
                                    entity.remove();
                                    point += 2;
                                    Score score = playuser.getScoreboard().getObjective(DisplaySlot.SIDEBAR).getScore(" " + playuser.getName());
                                    score.setScore(point);
                                    playuser.getPlayer().spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§b§lPERFECT"));
                                }
                                playuser.playSound(playuser.getLocation(), Sound.BLOCK_NOTE_BASEDRUM, 1, 1);

                            }
                        }


                    }

                }
                if (playuser.getInventory().getHeldItemSlot() == 0) {
                    preuser.getInventory().setHeldItemSlot(4);
                    for (Entity entity : event.getPlayer().getNearbyEntities(20, 20, 20)) {
                        if (entity.getType() == EntityType.FALLING_BLOCK) {
                            double dis = entity.getLocation().distance(new Location(playuser.getWorld(), vec.getBlockX() + 16.7, vec.getBlockY() + 0.001, vec.getBlockZ() + 4.5));
                            if (dis < 1.1 && dis > 0.3) {
                                if (!entity.isDead()) {
                                    entity.remove();
                                    point += 1;
                                    Score score = playuser.getScoreboard().getObjective(DisplaySlot.SIDEBAR).getScore(" " + playuser.getName());
                                    score.setScore(point);
                                    playuser.getPlayer().spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§a§lNICE"));
                                }
                                playuser.playSound(playuser.getLocation(), Sound.BLOCK_NOTE_BASEDRUM, 1, 1);

                            } else if (dis < 0.31) {
                                if (!entity.isDead()) {
                                    entity.remove();
                                    point += 2;
                                    Score score = playuser.getScoreboard().getObjective(DisplaySlot.SIDEBAR).getScore(" " + playuser.getName());
                                    score.setScore(point);
                                    playuser.getPlayer().spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§b§lPERFECT"));
                                }
                                playuser.playSound(playuser.getLocation(), Sound.BLOCK_NOTE_BASEDRUM, 1, 1);

                            }

                        }

                    }

                }

            }

        }
            if(event.getPlayer().getName() == preuser.getName()) {
                FallingBlock fb = null;
                    if(preuser.getInventory().getHeldItemSlot()==0) {
                        preuser.getInventory().setHeldItemSlot(4);
                        Location blue = new Location(event.getPlayer().getWorld(), vec.getBlockX()+1, vec.getBlockY()+0.001, vec.getBlockZ()+1.5);
                        fb = event.getPlayer().getWorld().spawnFallingBlock(blue, Material.CONCRETE, (byte) 3);
                    } else if(preuser.getInventory().getHeldItemSlot()==1){
                        preuser.getInventory().setHeldItemSlot(4);
                        Location blue = new Location(event.getPlayer().getWorld(), vec.getBlockX()+1, vec.getBlockY()+0.001, vec.getBlockZ()+2.5);
                        fb = event.getPlayer().getWorld().spawnFallingBlock(blue, Material.CONCRETE, (byte) 5);
                    } else if(preuser.getInventory().getHeldItemSlot()==2) {
                        preuser.getInventory().setHeldItemSlot(4);
                        Location blue = new Location(event.getPlayer().getWorld(), vec.getBlockX()+1, vec.getBlockY()+0.001, vec.getBlockZ()+3.5);
                        fb = event.getPlayer().getWorld().spawnFallingBlock(blue, Material.CONCRETE, (byte) 4);
                    } else if(preuser.getInventory().getHeldItemSlot()==3) {
                        preuser.getInventory().setHeldItemSlot(4);
                        Location blue = new Location(event.getPlayer().getWorld(), vec.getBlockX()+1, vec.getBlockY()+0.001, vec.getBlockZ()+4.5);
                        fb = event.getPlayer().getWorld().spawnFallingBlock(blue, Material.CONCRETE, (byte) 14);
                    }

                    fb.setGravity(false);
                    fb.setTicksLived(562);
                    fb.setDropItem(false);
                    Vector vec = new Vector(0.6, 0, 0);
                    fb.setVelocity(vec);

            }
        }

    }

    public static void delay(final Runnable runnable, int delay) {
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                runnable.run();
            }
        };
        timer.schedule(timerTask, delay);
    }


    @Override
    public boolean onCommand(final CommandSender sender, Command cmd, String label, final String[] args) {
        if(cmd.getName().equalsIgnoreCase("rhythm")) {
            String com = args[0];

            if(com.equalsIgnoreCase("start")) {
                playuser = Bukkit.getPlayer(args[1]);
                preuser = Bukkit.getPlayer(args[2]);
                if (playuser != preuser) {

                    Bukkit.getPlayer(args[2]).sendTitle("",ChatColor.BOLD+"3",0,20,10);
                    Bukkit.getPlayer(args[1]).sendTitle("",ChatColor.BOLD+"3",0,20,10);
                    Bukkit.getPlayer(args[1]).playSound(Bukkit.getPlayer(args[1]).getLocation(),Sound.BLOCK_NOTE_HAT,1,1);
                    Bukkit.getPlayer(args[2]).playSound(Bukkit.getPlayer(args[2]).getLocation(),Sound.BLOCK_NOTE_HAT,1,1);

                    delay(new Runnable() {
                        @Override
                        public void run() {
                            Bukkit.getPlayer(args[2]).sendTitle("",ChatColor.BOLD+"2",0,20,10);
                            Bukkit.getPlayer(args[1]).sendTitle("",ChatColor.BOLD+"2",0,20,10);
                            Bukkit.getPlayer(args[1]).playSound(Bukkit.getPlayer(args[1]).getLocation(),Sound.BLOCK_NOTE_HAT,1,1);
                            Bukkit.getPlayer(args[2]).playSound(Bukkit.getPlayer(args[2]).getLocation(),Sound.BLOCK_NOTE_HAT,1,1);
                        }
                    },1000);

                    delay(new Runnable() {
                        @Override
                        public void run() {
                            Bukkit.getPlayer(args[2]).sendTitle("",ChatColor.BOLD+"1",0,20,10);
                            Bukkit.getPlayer(args[1]).sendTitle("",ChatColor.BOLD+"1",0,20,10);
                            Bukkit.getPlayer(args[1]).playSound(Bukkit.getPlayer(args[1]).getLocation(),Sound.BLOCK_NOTE_HAT,1,1);
                            Bukkit.getPlayer(args[2]).playSound(Bukkit.getPlayer(args[2]).getLocation(),Sound.BLOCK_NOTE_HAT,1,1);
                        }
                    },2000);

                    delay(new Runnable() {
                        @Override
                        public void run() {
                            Bukkit.getPlayer(args[2]).sendTitle("",ChatColor.BOLD+"시작!",0,20,10);
                            Bukkit.getPlayer(args[1]).sendTitle("",ChatColor.BOLD+"시작!",0,20,10);
                            Bukkit.getPlayer(args[1]).playSound(Bukkit.getPlayer(args[1]).getLocation(),Sound.ENTITY_PLAYER_LEVELUP,1,1);
                            Bukkit.getPlayer(args[2]).playSound(Bukkit.getPlayer(args[2]).getLocation(),Sound.ENTITY_PLAYER_LEVELUP,1,1);
                        }
                    },3000);

                    isStart = true;
                    point = 0;
                    ScoreboardManager manager = Bukkit.getScoreboardManager();
                    Scoreboard board = manager.getNewScoreboard();
                    Objective o = board.registerNewObjective("point", "dummy");
                    o.setDisplayName(ChatColor.BOLD + "《 점수판 》");
                    o.setDisplaySlot(DisplaySlot.SIDEBAR);
                    Score score = o.getScore(" " + playuser.getName());
                    score.setScore(point);
                    for (Player player : Bukkit.getOnlinePlayers()) {
                        player.setScoreboard(board);
                    }
                    preuser.getInventory().setHeldItemSlot(4);
                    preuser.getInventory().setItem(3, new ItemStack(Material.CONCRETE, 1, (short) 14));
                    preuser.getInventory().setItem(2, new ItemStack(Material.CONCRETE, 1, (short) 4));
                    preuser.getInventory().setItem(1, new ItemStack(Material.CONCRETE, 1, (short) 5));
                    preuser.getInventory().setItem(0, new ItemStack(Material.CONCRETE, 1, (short) 3));
                    playuser.getInventory().setHeldItemSlot(4);
                    playuser.getInventory().setItem(0, new ItemStack(Material.CONCRETE, 1, (short) 14));
                    playuser.getInventory().setItem(1, new ItemStack(Material.CONCRETE, 1, (short) 4));
                    playuser.getInventory().setItem(2, new ItemStack(Material.CONCRETE, 1, (short) 5));
                    playuser.getInventory().setItem(3, new ItemStack(Material.CONCRETE, 1, (short) 3));
                    playuser.sendMessage(ChatColor.BOLD+"출제자가 내는 블록들을 리듬에 맞춰 터트려보세요!");
                    preuser.sendMessage(ChatColor.BOLD+"원하는 타이밍에 블록을 내보내보세요!");
                    playuser.playSound(playuser.getLocation(),Sound.BLOCK_NOTE_BELL,1,1);
                    preuser.playSound(playuser.getLocation(),Sound.BLOCK_NOTE_BELL,1,1);
                } else {
                    sender.sendMessage(ChatColor.RED + ""+ChatColor.BOLD+"이름이 같을 순 없습니다.");
                    Bukkit.getPlayer(sender.getName()).playSound(Bukkit.getPlayer(sender.getName()).getLocation(),Sound.BLOCK_NOTE_PLING,1,1);
                }
            } else if (com.equalsIgnoreCase("stop")) {
                isStart = false;
                playuser = null;
                preuser = null;
                point = 0;
                for(Player player:Bukkit.getOnlinePlayers()) {
                    player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
                }
                Bukkit.getPlayer(sender.getName()).sendMessage(ChatColor.BOLD+"게임을 멈췄습니다.");

            } else if(com.equalsIgnoreCase("init")) {
                vec = Bukkit.getPlayer(sender.getName()).getLocation();
                for(int x=0;x<17;x++) {
                    for(int z=0;z<6;z++) {
                        if (z==0||z==5) {
                            Block block = Bukkit.getPlayer(sender.getName()).getWorld().getBlockAt(vec.getBlockX() + x, vec.getBlockY() - 1, vec.getBlockZ()+z);
                            block.setType(Material.CONCRETE);
                            block.setData((byte) 0);
                        } else {
                            Block block = Bukkit.getPlayer(sender.getName()).getWorld().getBlockAt(vec.getBlockX() + x, vec.getBlockY() - 1, vec.getBlockZ()+z);
                            block.setType(Material.CONCRETE);
                            block.setData((byte) 15);
                        }
                    }
                }
                for(int z=0;z<6;z++) {
                    Block block = Bukkit.getPlayer(sender.getName()).getWorld().getBlockAt(vec.getBlockX()+17, vec.getBlockY() - 1, vec.getBlockZ()+z);
                    block.setType(Material.CONCRETE);
                    block.setData((byte) 14);
                }
                for(int z=0;z<6;z++) {
                    Block block = Bukkit.getPlayer(sender.getName()).getWorld().getBlockAt(vec.getBlockX()+18, vec.getBlockY(), vec.getBlockZ()+z);
                    block.setType(Material.CONCRETE);
                    block.setData((byte) 14);
                }
                for(int z=0;z<6;z++) {
                    Block block = Bukkit.getPlayer(sender.getName()).getWorld().getBlockAt(vec.getBlockX()+18, vec.getBlockY() +1, vec.getBlockZ()+z);
                    block.setType(Material.CONCRETE);
                    block.setData((byte) 14);
                }
                for(int z=0;z<6;z++) {
                    Block block = Bukkit.getPlayer(sender.getName()).getWorld().getBlockAt(vec.getBlockX()+17, vec.getBlockY() +1, vec.getBlockZ()+z);
                    block.setType(Material.BARRIER);
                }
                for(int x=0;x<2;x++) {
                    for (int z = 0; z < 6; z++) {
                        Block block = Bukkit.getPlayer(sender.getName()).getWorld().getBlockAt(vec.getBlockX() + 19+x, vec.getBlockY() + 1, vec.getBlockZ() + z);
                        block.setType(Material.CONCRETE);
                        block.setData((byte) 14);
                    }
                }
                Block block = Bukkit.getPlayer(sender.getName()).getWorld().getBlockAt(vec.getBlockX() , vec.getBlockY(), vec.getBlockZ() + 1);
                block.setType(Material.CONCRETE);
                block.setData((byte) 3);
                block = Bukkit.getPlayer(sender.getName()).getWorld().getBlockAt(vec.getBlockX() , vec.getBlockY(), vec.getBlockZ() + 2);
                block.setType(Material.CONCRETE);
                block.setData((byte) 5);
                block = Bukkit.getPlayer(sender.getName()).getWorld().getBlockAt(vec.getBlockX() , vec.getBlockY(), vec.getBlockZ() + 3);
                block.setType(Material.CONCRETE);
                block.setData((byte) 4);
                block = Bukkit.getPlayer(sender.getName()).getWorld().getBlockAt(vec.getBlockX() , vec.getBlockY(), vec.getBlockZ() + 4);
                block.setType(Material.CONCRETE);
                block.setData((byte) 14);
                Bukkit.getPlayer(sender.getName()).sendMessage(ChatColor.BOLD+""+vec.getBlockX()+" "+vec.getBlockY()+" "+vec.getBlockZ()+"을 기준으로 보드가 생성되었습니다.");

            }
            return false;
        }

        return true;
    }




}

