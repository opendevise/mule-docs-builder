package org.mule.docs;

import org.junit.Test;
import org.mule.docs.util.Utilities;

import java.io.File;

import static org.junit.Assert.*;

/**
 * Created by sean.osterberg on 5/28/15.
 */
public class SectionNavigatorTest {

    @Test
    public void getHtmlForPage_WithValidPageAndSections_ReturnsValidHtml() {
        AsciiDocPage page = AsciiDocPage.fromFile(getValidFile());
        String result = SectionNavigator.getHtmlForPage(page);
        assertTrue(result != null);
    }

    private File getValidFile() {
        String path = Utilities.getConcatPath(new String[] { TestUtilities.getPathToMasterFolder(), "cloudhub", "index.ad" });
        return new File(path);
    }
}
