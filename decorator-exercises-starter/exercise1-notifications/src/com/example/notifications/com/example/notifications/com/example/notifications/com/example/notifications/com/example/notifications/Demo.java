package com.example.notifications;
public class Demo {
    public static void main(String[] args) {
        Notifier base = new EmailNotifier("user@example.com");

        System.out.println("--- Baseline: Email only ---");
        base.notify("Baseline email only.");
        System.out.println();

        System.out.println("--- Combination a) Email + SMS ---");
        Notifier emailAndSms = new SmsDecorator(base, "+91-99999-11111");
        emailAndSms.notify("Build is green ✅");
        System.out.println();
        
        System.out.println("--- Combination b) Email + WhatsApp ---");
        Notifier emailAndWhatsApp = new WhatsAppDecorator(base, "user_whatsapp_id");
        emailAndWhatsApp.notify("New feature available!");
        System.out.println();

        System.out.println("--- Combination c) Email + Slack ---");
        Notifier emailAndSlack = new SlackDecorator(base, "#deployments");
        emailAndSlack.notify("Deployment started.");
        System.out.println();

        System.out.println("--- Combination d) Email + WhatsApp + Slack ---");
        Notifier fullStack = new SlackDecorator(new WhatsAppDecorator(base, "user_whatsapp_id"), "#general");
        fullStack.notify("Deployment completed successfully 🚀");
        System.out.println();
    }
}
