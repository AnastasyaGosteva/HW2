public interface ActorBehavor {
    void setMakeOrder(boolean makeOrder);
    void setTakeOrder(boolean takeOrder);

    boolean isMakeOrder();
    boolean isTakeOrder();
}
