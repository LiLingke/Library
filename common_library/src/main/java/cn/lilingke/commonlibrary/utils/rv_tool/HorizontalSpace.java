package cn.lilingke.commonlibrary.utils.rv_tool;

import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * 水平方向的空白
 * Created by John on 2017/7/11.
 */
public class HorizontalSpace extends RecyclerView.ItemDecoration {

    private int space;

    public HorizontalSpace(int space) {
        this.space = space;
    }

    public HorizontalSpace(Resources resources, int dimenResId) {
        this.space = resources.getDimensionPixelSize(dimenResId);
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent,
        RecyclerView.State state) {

        if (parent.getChildAdapterPosition(view) != 0) {
            outRect.left = space;
        }
    }
}
