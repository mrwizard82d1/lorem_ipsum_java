package cjl_magistri;

import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: larry
 * Date: 6/20/15
 * Time: 5:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class LoremIpsumText {
    private final String[] _source;
    private final IntGenerator _intGenerator;

    public LoremIpsumText(String textSource, IntGenerator intGenerator) {
        _source = textSource.split("\\s+");
        _intGenerator = intGenerator;
    }

    public String nextWord() {
        return _source[_intGenerator.nextInt(_source.length)];
    }
}
