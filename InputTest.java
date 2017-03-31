/**
 * Created by Rich on 31/03/2017.
 */
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputTest {
    @Test
    public void test_getTextFromFile_size1() throws Exception{
        Input i = new Input();
        i.setInputsManually(5, "inputtest.txt",1);
        i.getTextFromFile();
        List<String> textList = i.getTextList();
        Assert.assertEquals(textList.size(),1);
    }
    @Test
    public void test_getTextFromFile_contentCheck() throws Exception{
        Input i = new Input();
        i.setInputsManually(5, "inputtest.txt",1);
        i.getTextFromFile();
        List<String> textList = i.getTextList();
        String word = textList.get(0);
        Assert.assertEquals(word,"Test");
    }
    @Test
    public void test_getTextFromFile_empty() throws Exception{
        Input i = new Input();
        i.setInputsManually(5, "testempty.txt",1);
        i.getTextFromFile();
        List<String> textList = i.getTextList();
        Assert.assertEquals(textList.size(),0);
    }
    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void test_getTextFromFile_wrongFileName() throws IOException {
        exception.expect(FileNotFoundException.class);
        Input i = new Input();
        i.setInputsManually(5, "idontexist.txt",1);
        i.getTextFromFile();
        List<String> textList = i.getTextList();
    }

}
