package visitor;

import java.util.ArrayList;
import java.util.List;

public class HtmlParentElement extends HtmlTag {

  private String tagName;
  private String startTag;
  private String endTag;
  private List<HtmlTag> childTagList;

  public HtmlParentElement(String tagName) {
    this.tagName = tagName;
    this.startTag = "";
    this.endTag = "";
    this.childTagList =  new ArrayList<>();
  }

  @Override
  public String getTagName() {
    return tagName;
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
  public String getStartTag() {
    return startTag;
  }

  @Override
  public String getEndTag() {
    return endTag;
  }

  @Override
  public void addChildTag(HtmlTag htmlTag) {
    childTagList.add(htmlTag);
  }

  @Override
  public void removeChildTag(HtmlTag htmlTag) {
    childTagList.remove(htmlTag);
  }

  @Override
  public List<HtmlTag> getChildren() {
    return childTagList;
  }

  @Override
  public void generateHtml() {
    System.out.println(startTag);

    /*old style:
    for(HtmlTag tag : childrenTagList) tag.generateHtml();

    lambda style : childrenTagList.forEach(tag -> tag.generateHtml);
     */
    //method reference style
    childTagList.forEach(HtmlTag::generateHtml);
    System.out.println(endTag);



  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}