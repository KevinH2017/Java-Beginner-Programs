// Iterates through website's html code and prints the number of lines and the website source code
public class UsingIterables {
    public static void main(String[] args) {
        // Iterating through objects stored in another file
        UrlLibrary urlLibrary = new UrlLibrary();

        // Prints html code of each url
        for (String html : urlLibrary) {
            System.out.println(html.length());      // Lines of html code
            System.out.println(html);               // html code
        }
    }
}
