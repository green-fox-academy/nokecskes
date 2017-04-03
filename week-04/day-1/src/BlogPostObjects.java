/**
 * Created by Connor on 2017.04.03..
 */

/*Create a few blog post objects:
        - "Lorem Ipsum" titled by John Doe posted at "2000.05.04."
        Lorem ipsum dolor sit amet.
        - "Wait but why" titled by Tim Urban posted at "2010.10.10."
        A popular long-form, stick-figure-illustrated blog about almost everything.
        - "One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."
        Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.*/


public class BlogPostObjects {

  public static void main(String[] args) {

    BlogPost blogOne = new BlogPost("Lorem Ipsum");
    blogOne.authorName = "John Doe";
    blogOne.publicationDate = "2000.05.04." ;
    blogOne.text = "Lorem ipsum dolor sit amet.";

    BlogPost blogTwo = new BlogPost("Wait but why");
    blogTwo.authorName = " Tim Urban";
    blogTwo.publicationDate = "2010.10.10.";
    blogTwo.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";

    BlogPost blogThree = new BlogPost("One Engineer Is Trying to Get IBM to Reckon With William Trump");
    blogThree.authorName = "William Turton";
    blogThree.publicationDate = "2017.03.28.";
    blogThree.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";

  }

}
