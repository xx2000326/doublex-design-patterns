package liabilityModel.handler;

public class BossHandler implements BudgetHandler{
    @Override
    public void setNextHandler(BudgetHandler nextHandler) {

    }

    @Override
    public boolean handle(int amount) {
        return false;
    }
}
