package liabilityModel.handler;

/**
 * 抽象处理器接口-定义规范
 */
public interface BudgetHandler {
    void setNextHandler(BudgetHandler nextHandler);

    boolean handle(int amount);
}
