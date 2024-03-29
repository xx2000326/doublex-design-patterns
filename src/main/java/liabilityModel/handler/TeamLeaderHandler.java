package liabilityModel.handler;

public class TeamLeaderHandler implements BudgetHandler{
    @Override
    public void setNextHandler(BudgetHandler nextHandler) {

    }

    @Override
    public boolean handle(int amount) {
        return false;
    }
}
