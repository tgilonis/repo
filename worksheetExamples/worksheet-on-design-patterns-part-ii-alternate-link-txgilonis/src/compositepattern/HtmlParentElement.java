package compositepattern;

import java.util.ArrayList;
import java.util.List;

public class HtmlParentElement extends HtmlTag {
  private String s;
  private String startTag;
  private String endTag;
    private List<HtmlTag> childList;
  public HtmlParentElement(String s) {
    super();
    this.s = s;
    this.childList = new ArrayList<>();
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
  public void addChildTag(HtmlTag htmlTag) {
    childList.add(htmlTag);
  }

  @Override
  public void removeChildTag(HtmlTag htmlTag) {
    childList.remove(htmlTag);
  }

  @Override
  public List<HtmlTag> getChildren() {
    return childList;
  }

  @Override
  public void generateHtml() {
    System.out.println(startTag);
    getChildren().forEach(HtmlTag::generateHtml);
    System.out.println(endTag);
  }


}
