package app.androidgrid.faysr.ui.fragments.player.explore;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.androidgrid.faysr.R;
import app.androidgrid.faysr.ui.fragments.player.AbsPlayerFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class ExplorePlayerFragment extends AbsPlayerFragment {


    public ExplorePlayerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_explore_player, container, false);
    }

    @Override
    public void onShow() {

    }

    @Override
    public void onHide() {

    }

    @Override
    public boolean onBackPressed() {
        return false;
    }

    @Override
    public int getPaletteColor() {
        return 0;
    }
}
