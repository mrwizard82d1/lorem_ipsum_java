package cjl_magistri;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: larry
 * Date: 6/20/15
 * Time: 5:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class LoremIpsumTextTest {
    @Test
    public void getWord_HasSingleWord_ReturnsWord() {
        String source = "lorem";
        LoremIpsumText cut = new LoremIpsumText(source);
        assertEquals(source, cut.nextWord());
    }
}
