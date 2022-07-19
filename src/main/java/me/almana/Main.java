package me.almana;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Main {

    public static void main(String[] args) throws LoginException, InterruptedException {

        String token = Secret.token;
        JDA builder = JDABuilder.createDefault(token)
                .setActivity(Activity.listening("nothing"))
                .setStatus(OnlineStatus.IDLE)
                .build().awaitReady();

        System.out.println("[BOT]:- Discord Bot launched.");
    }
}
