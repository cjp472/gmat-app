package org.zywx.wbpalmstar.widgetone.uex11597450.ui.center;

import org.zywx.wbpalmstar.widgetone.uex11597450.utils.C;

public class LangRecordFragment extends BaseSimuRecordFragment {

    private int pageNum = 1;

    @Override
    protected int getType() {
        return C.LANGUAGE;
    }

    @Override
    protected String getPageNumber(boolean isRefresh) {
        if (isRefresh) {
            pageNum = 1;
        } else {
            pageNum++;
        }
        return String.valueOf(pageNum);
    }
}
