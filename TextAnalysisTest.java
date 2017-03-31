import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Rich on 31/03/2017.
 */
public class TextAnalysisTest {

    @Test
    public void test_textCounter_size1() throws Exception{
        List<String> textList = new ArrayList<String>();
        textList.add("test");
        TextAnalysis ta = new TextAnalysis(textList);
        ta.textCounter();
        Map<String, Integer> wcs = ta.getWordcounts();
        Assert.assertEquals(wcs.size(),1);
    }

    @Test
    public void test_textCounter_content() throws Exception{
        List<String> textList = new ArrayList<String>();
        textList.add("test");
        TextAnalysis ta = new TextAnalysis(textList);
        ta.textCounter();
        Map<String, Integer> wcs = ta.getWordcounts();
        Assert.assertEquals(wcs.get(Test),1);
    }

}
