package searchInput;

import base.CommonAPI;
import org.testng.annotations.Test;
import org.testng.annotations.*;

public class searchInput extends CommonAPI {
    @Test
    public void searchInputTest(){
        typeOnInputBox("edit-search-keys","schedule");

    }
}
