package cjl_magistri;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created with IntelliJ IDEA.
 * User: larry
 * Date: 6/20/15
 * Time: 5:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class LoremIpsumTextTest {
    @Test
    public void getWord_SingleWord_ReturnsWord() {
        String source = "lorem";
        IntGenerator mockGenerator = mock(IntGenerator.class);
        when(mockGenerator.nextInt(1)).thenReturn(0);
        LoremIpsumText cut = new LoremIpsumText(source, mockGenerator);
        assertEquals(source, cut.nextWord());
    }

    @Test
    public void getWord_ManyWordsReverseSequencer_ReturnsReversedSequence() {
        List<String> words = new ArrayList<String>(Arrays.asList(new String[]{"lorem", "ipsum", "dolor"}));
        IntGenerator mockGenerator = mock(IntGenerator.class);
        when(mockGenerator.nextInt(3)).thenReturn(2, 1, 0);
        LoremIpsumText cut = new LoremIpsumText(StringUtils.join(words, ' '), mockGenerator);
        for (String expected : words) {
            assertThat(expected, equalTo(cut.nextWord()));
        }
    }
}
