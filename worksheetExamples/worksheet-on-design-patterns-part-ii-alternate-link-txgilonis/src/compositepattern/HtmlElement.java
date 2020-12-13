package compositepattern;

public class HtmlElement extends HtmlTag {
  private String s;
  private String startTag;
  private String endTag;
  private String tagBody;
  public HtmlElement(String s) {
    super();
    this.s = s;
  }

  @Override
  public String getTagName() {
    return s;
  }

  @Override
  public void setStartTag(String tag) {
    this.startTag = tag;
  }

  @Override
  public void setEndTag(String tag) {
    this.endTag = tag;
  }

  @Override
  public void setTagBody(String tagBody) {
    this.tagBody = tagBody;
  }

  @Override
  public void generateHtml() {
    System.out.printf("%s %s %s\n", startTag, tagBody, endTag);
  }
}
