public class FAQBotHandler extends AbstractSupportHandler {
    @Override
    public void handle(String issue) {
        if (issue.equals("password_reset")) {
            System.out.println("[FAQBot] Handled password_reset");
        } else if (next != null) {
            System.out.println("[FAQBot] Cannot handle, escalating...");
            next.handle(issue);
        }
    }
}
