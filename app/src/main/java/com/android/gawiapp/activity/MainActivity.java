package com.android.gawiapp.activity;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;

import com.android.gawiapp.R;
import com.android.gawiapp.adapter.MenuAdapter;
import com.android.gawiapp.base.BaseActivity;
import com.android.gawiapp.fragment.category.CategoryFragment;
import com.android.gawiapp.fragment.favorite.FavoriteFragment;
import com.android.gawiapp.fragment.newest.NewestFragment;
import com.android.gawiapp.fragment.popular.PopularFragment;
import com.android.gawiapp.fragment.settings.SettingsFragment;
import com.android.gawiapp.fragment.toprate.TopRatedFragment;
import com.android.gawiapp.interfaces.ItemListener;
import com.android.gawiapp.model.MenuModel;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements ItemListener {

    @BindView(R.id.actMain_dwlDrawerLayout)
    DrawerLayout mDrawerLayout;
    @BindView(R.id.actMain_rvMenu)
    RecyclerView rvMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initialize();
    }

    private void initialize() {
        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.drawer_open, R.string.drawer_close);
        mDrawerLayout.addDrawerListener(mDrawerToggle);
        mDrawerLayout.setScrimColor(getResources().getColor(android.R.color.transparent));

        ArrayList<MenuModel> mMenus = new ArrayList<>();
        mMenus.add(new MenuModel(R.drawable.ic_newest, getString(R.string.newest)));
        mMenus.add(new MenuModel(R.drawable.ic_toprated, getString(R.string.top_rated)));
        mMenus.add(new MenuModel(R.drawable.ic_popular, getString(R.string.popular)));
        mMenus.add(new MenuModel(R.drawable.ic_category, getString(R.string.category)));
        mMenus.add(new MenuModel(R.drawable.ic_favorite, getString(R.string.favorite)));
        mMenus.add(new MenuModel(R.drawable.ic_settings, getString(R.string.settings)));

        rvMenu.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        MenuAdapter menuAdapter = new MenuAdapter(mMenus);
        rvMenu.setAdapter(menuAdapter);
        menuAdapter.setListener(this);
    }

    @Override
    public void onItemClicked(int pos) {
        mDrawerLayout.closeDrawer(Gravity.START);
        switch (pos) {
            case 0:
                replaceFragment(new NewestFragment(), false);
                break;
            case 1:
                replaceFragment(new TopRatedFragment(), false);
                break;
            case 2:
                replaceFragment(new PopularFragment(), false);
                break;
            case 3:
                replaceFragment(new CategoryFragment(), false);
                break;
            case 4:
                replaceFragment(new FavoriteFragment(), false);
                break;
            case 5:
                replaceFragment(new SettingsFragment(), false);
                break;
        }
    }
}
