import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrary implements Iterable<String> {
    private LinkedList<String> urls = new LinkedList<>();

    private class UrlIterator implements Iterator<String> {

        // int variables automatically start at 0
        private int index;      // index = 0

        @Override
        public boolean hasNext() {
            // True as long as the index is less than the number of urls in the list
            return index < urls.size();
        }

        @Override
        public String next() {
            StringBuilder sb = new StringBuilder();

            try {
                // URL object to check if index is a valid URL
                URL url = new URL(urls.get(index));

                // Reads text values from InputStreamReader
                BufferedReader br = new BufferedReader(
                    // Reads bytes from url as default charset
                    new InputStreamReader(
                        url.openStream()
                    )
                );

                String line = null;

                // Reads each line in the reader
                while ((line = br.readLine()) != null) {
                    sb.append(line);
                    sb.append("\n");
                }
                // Closes BufferedReader
                br.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
            
            // Next url in list
            index++;

            return sb.toString();
        }

        @Override
        public void remove() {
            urls.remove(index);
        }

    }
    
    public UrlLibrary() {
        urls.add("https://www.google.com/");
        urls.add("https://www.youtube.com/");
        urls.add("https://github.com/");
    }

    @Override
    public Iterator<String> iterator() {
        return new UrlIterator();
    }

    // @Override
    // public Iterator<String> iterator() {
    //     return urls.iterator();
    // }
}
