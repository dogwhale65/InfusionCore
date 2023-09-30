package infusion.infusioncore;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.potion.PotionEffectType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GiveEffects implements Listener {
    private InfusionCore plugin;
    public GiveEffects(InfusionCore plugin) {
        this.plugin = plugin;
    }
    int min = 1;
    int max = 14;
    int randNumberPositive = (int)Math.floor(Math.random() * (max - min + 1) + min);
    int randNumberNegative = (int)Math.floor(Math.random() * (max - min + 1) + min);
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        Player victim = event.getEntity().getPlayer();
        Player killer = victim.getKiller();
        victim.getActivePotionEffects().remove(PotionEffectType.INVISIBILITY);
        victim.getActivePotionEffects().remove(PotionEffectType.NIGHT_VISION);
        victim.getActivePotionEffects().remove(PotionEffectType.INCREASE_DAMAGE);
        victim.getActivePotionEffects().remove(PotionEffectType.SPEED);
        victim.getActivePotionEffects().remove(PotionEffectType.REGENERATION);
        victim.getActivePotionEffects().remove(PotionEffectType.DAMAGE_RESISTANCE);
        victim.getActivePotionEffects().remove(PotionEffectType.HEALTH_BOOST);
        victim.getActivePotionEffects().remove(PotionEffectType.LUCK);
        victim.getActivePotionEffects().remove(PotionEffectType.DOLPHINS_GRACE);
        victim.getActivePotionEffects().remove(PotionEffectType.FAST_DIGGING);
        victim.getActivePotionEffects().remove(PotionEffectType.WATER_BREATHING);
        victim.getActivePotionEffects().remove(PotionEffectType.SATURATION);
        victim.getActivePotionEffects().remove(PotionEffectType.CONDUIT_POWER);
        victim.getActivePotionEffects().remove(PotionEffectType.FIRE_RESISTANCE);


        if (randNumberNegative == 1) {
            victim.addPotionEffect(PotionEffectType.BLINDNESS.createEffect(-1, 1));
        }else if (randNumberNegative == 2) {
            victim.addPotionEffect(PotionEffectType.DARKNESS.createEffect(-1, 1));
        }else if (randNumberNegative == 3) {
            victim.addPotionEffect(PotionEffectType.SLOW_FALLING.createEffect(-1, 1));
        }else if (randNumberNegative == 4) {
            victim.addPotionEffect(PotionEffectType.UNLUCK.createEffect(-1, 1));
        }else if (randNumberNegative == 5) {
            victim.addPotionEffect(PotionEffectType.GLOWING.createEffect(-1, 1));
        }else if (randNumberNegative == 6) {
            victim.addPotionEffect(PotionEffectType.SLOW.createEffect(-1, 1));
        }else if (randNumberNegative == 7) {
            victim.addPotionEffect(PotionEffectType.HUNGER.createEffect(-1, 1));
        }else if (randNumberNegative == 8) {
            victim.addPotionEffect(PotionEffectType.SLOW_DIGGING.createEffect(-1, 1));
        }else if (randNumberNegative == 9) {
            victim.addPotionEffect(PotionEffectType.WEAKNESS.createEffect(-1, 1));
        }else if (randNumberNegative == 10) {
            victim.addPotionEffect(PotionEffectType.JUMP.createEffect(-1, 1));
        }else if (randNumberNegative == 11) {
            victim.addPotionEffect(PotionEffectType.POISON.createEffect(-1, 1));
        }else if (randNumberNegative == 12) {
            victim.addPotionEffect(PotionEffectType.BAD_OMEN.createEffect(-1, 1));
        }else if (randNumberNegative == 13) {
            victim.addPotionEffect(PotionEffectType.CONFUSION.createEffect(-1, 1));
        }else if (randNumberNegative == 14) {
            victim.addPotionEffect(PotionEffectType.LEVITATION.createEffect(-1, 1));
        }

        if (!(killer == null)) {
            List<String> myList = Arrays.asList("A", "B", "C", "D");
            Random r = new Random();

            int randomitem = r.nextInt(myList.size());
            String randomElement = myList.get(randomitem);
            killer.getActivePotionEffects().remove(PotionEffectType.values());

            if (randNumberPositive == 1) {
                killer.addPotionEffect(PotionEffectType.INVISIBILITY.createEffect(-1, 1));
            }else if (randNumberPositive == 2) {
                killer.addPotionEffect(PotionEffectType.NIGHT_VISION.createEffect(-1, 1));
            }else if (randNumberPositive == 3) {
                killer.addPotionEffect(PotionEffectType.INCREASE_DAMAGE.createEffect(-1, 1));
            }else if (randNumberPositive == 4) {
                killer.addPotionEffect(PotionEffectType.SPEED.createEffect(-1, 1));
            }else if (randNumberPositive == 5) {
                killer.addPotionEffect(PotionEffectType.REGENERATION.createEffect(-1, 1));
            }else if (randNumberPositive == 6) {
                killer.addPotionEffect(PotionEffectType.DAMAGE_RESISTANCE.createEffect(-1, 1));
            }else if (randNumberPositive == 7) {
                killer.addPotionEffect(PotionEffectType.HEALTH_BOOST.createEffect(-1, 1));
            }else if (randNumberPositive == 8) {
                killer.addPotionEffect(PotionEffectType.LUCK.createEffect(-1, 1));
            }else if (randNumberPositive == 9) {
                killer.addPotionEffect(PotionEffectType.DOLPHINS_GRACE.createEffect(-1, 1));
            }else if (randNumberPositive == 10) {
                killer.addPotionEffect(PotionEffectType.FAST_DIGGING.createEffect(-1, 1));
            }else if (randNumberPositive == 11) {
                killer.addPotionEffect(PotionEffectType.WATER_BREATHING.createEffect(-1, 1));
            }else if (randNumberPositive == 12) {
                killer.addPotionEffect(PotionEffectType.SATURATION.createEffect(-1, 1));
            }else if (randNumberPositive == 13) {
                killer.addPotionEffect(PotionEffectType.CONDUIT_POWER.createEffect(-1, 1));
            }else if (randNumberPositive == 14) {
                killer.addPotionEffect(PotionEffectType.FIRE_RESISTANCE.createEffect(-1, 1));
            }
        }

    }
}
