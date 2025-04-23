public abstract class AbstractSupportHandler implements SupportHandler {
  protected SupportHandler next;

   @Override
    public SupportHandler setNext(SupportHandler handler) {
        this.next = handler;
        return handler;
}
