package gennexttraining.tarunsoft.com.gennextweb.fragment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;

import gennexttraining.tarunsoft.com.gennextweb.R;

/**
 * Created by tsharma3 on 9/9/2015.
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 3;

    private String tabTitles[] = new String[] { "Albums", "Artist","Music"};
    private Context context;

    public MyFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment.newInstance(position + 1);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        // return tabTitles[position];
        return tabTitles[position];
    }
}
