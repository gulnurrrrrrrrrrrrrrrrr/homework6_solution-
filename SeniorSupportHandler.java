public class SeniorSupportHandler extends AbstractSupportHandler {
    public void handle(String issue) {
      if (issue.equals("account_ban") || issue.equals("data_loss")) {
            System.out.println("[SeniorSupport] Handled " + issue);
        } 
    }
}
