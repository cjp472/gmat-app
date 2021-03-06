package org.zywx.wbpalmstar.widgetone.uex11597450.ui.gmat.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import org.zywx.wbpalmstar.widgetone.uex11597450.utils.MeasureUtil;

public class CardAdapterHelper {
    //    private int mPagePadding = 8;
    private int mShowLeftCardWidth = 8;

    public void onCreateViewHolder(ViewGroup parent, View itemView) {
        RecyclerView.LayoutParams lp = (RecyclerView.LayoutParams) itemView.getLayoutParams();
        lp.width = (parent.getWidth() - MeasureUtil.dip2px(itemView.getContext(), (/*mPagePadding + */mShowLeftCardWidth))) * 15 / 32;
        itemView.setLayoutParams(lp);
    }

    public void onTeacherCreateViewHolder(ViewGroup parent, View itemView) {
        RecyclerView.LayoutParams lp = (RecyclerView.LayoutParams) itemView.getLayoutParams();
        lp.width = (parent.getWidth() - MeasureUtil.dip2px(itemView.getContext(), (mShowLeftCardWidth))) * 7/8;
        itemView.setLayoutParams(lp);
    }

    public void onBindViewHolder(View itemView, final int position, int itemCount) {
//        int padding = MeasureUtil.dip2px(itemView.getContext(), mPagePadding);
        int margin = MeasureUtil.dip2px(itemView.getContext(), mShowLeftCardWidth);
//        itemView.setPadding(padding, 0, padding, 0);
        int leftMarin = margin;//position == 0 ? margin /*+ ScreenUtil.dip2px(itemView.getContext(), mShowLeftCardWidth)*/ : 0;
        int rightMarin = position == itemCount - 1 ? margin/* + ScreenUtil.dip2px(itemView.getContext(), mShowLeftCardWidth)*/ : 0;
        setViewMargin(itemView, leftMarin, 0, rightMarin, 0);
    }

    private void setViewMargin(View view, int left, int top, int right, int bottom) {
        ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (lp.leftMargin != left || lp.topMargin != top || lp.rightMargin != right || lp.bottomMargin != bottom) {
            lp.setMargins(left, top, right, bottom);
            view.setLayoutParams(lp);
        }
    }

//    public void setPagePadding(int pagePadding) {
//        mPagePadding = pagePadding;
//    }

    public void setShowLeftCardWidth(int showLeftCardWidth) {
        mShowLeftCardWidth = showLeftCardWidth;
    }
}
