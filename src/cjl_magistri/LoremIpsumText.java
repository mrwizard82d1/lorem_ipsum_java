package cjl_magistri;

/**
 * Created with IntelliJ IDEA.
 * User: larry
 * Date: 6/20/15
 * Time: 5:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class LoremIpsumText {
    private final String _source;

    public LoremIpsumText(String textSource) {
        _source = textSource;
    }

    public String nextWord() {
        return _source;
    }
}
