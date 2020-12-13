package interpreterpattern;

public class Substract implements Expression {
  private final Expression leftExpression;
  private final Expression rightExpression;

  public Substract(Expression left, Expression right) {
    this.leftExpression = left;
    this.rightExpression = right;
  }

  @Override
  public int interpret() {
    return leftExpression.interpret() - rightExpression.interpret();
  }
}
