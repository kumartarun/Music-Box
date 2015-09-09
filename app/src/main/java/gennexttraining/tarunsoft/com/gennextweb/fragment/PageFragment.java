package gennexttraining.tarunsoft.com.gennextweb.fragment;

/**
 * Created by tsharma3 on 9/9/2015.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import gennexttraining.tarunsoft.com.gennextweb.R;



import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Edwin on 15/02/2015.
 */
public class PageFragment  extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;

    public static PageFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        PageFragment fragment = new PageFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        int layoutId;
        switch(mPage)
        {
           case 1 :
               layoutId= R.layout.tab_1;
               break;
            case 2 :
                layoutId= R.layout.tab_2;
                break;
            case 3 :
                layoutId= R.layout.tab_3;
                break;
            default:
                layoutId= R.layout.tab_1;

        }
        View view = inflater.inflate(layoutId, container, false);

        return view;
    }
}
