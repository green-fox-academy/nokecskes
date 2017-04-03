/**
 * Created by Connor on 2017.04.03..
 */

/***
Create a PostIt class that has
        a backgroundColor
        a text on it
        a textColor
Create a few example post-it objects:
        an orange with blue text: "Idea 1"
        a pink with black text: "Awesome"
        a yellow with green text: "Superb!"
 ***/


public class PostIt {

  String backgroundColor;
  String text;
  String textColor;

  public PostIt() { }

  public static void main(String[] args) {

    PostIt ideas = new PostIt();
    ideas.backgroundColor = "orange";
    ideas.text = "Idea 1";
    ideas.textColor = "blue";

    PostIt satisfaction = new PostIt();
    satisfaction.backgroundColor = "pink";
    satisfaction.text = "black";
    satisfaction.textColor = "Awesome!";

    PostIt happiness = new PostIt();
    happiness.backgroundColor = "yellow";
    happiness.text = "Superb!";
    happiness.textColor = "green";
  }

}
