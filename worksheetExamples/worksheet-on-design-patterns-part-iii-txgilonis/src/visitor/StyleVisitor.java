package visitor;

public class StyleVisitor implements Visitor {
  @Override
  public void visit(HtmlElement element) {
    element.setStartTag(element.getStartTag().replace(">", "'width:46px'>"));
  }

  @Override
  public void visit(HtmlParentElement parentElement) {
    parentElement.setStartTag(parentElement.getStartTag().replace(">", "'width:58px'>"));
  }
}
