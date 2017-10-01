package com.android.gawiapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.gawiapp.R;
import com.android.gawiapp.interfaces.ItemListener;
import com.android.gawiapp.model.MenuModel;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by DangQuang on 10/2/17.
 **/

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuHolder> {

    private ArrayList<MenuModel> mMenus;
    private ItemListener listener;

    public MenuAdapter(ArrayList<MenuModel> mMenus) {
        this.mMenus = mMenus;
    }

    @Override
    public MenuHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu, parent, false);
        return new MenuHolder(view);
    }

    @Override
    public void onBindViewHolder(final MenuHolder holder, int position) {
        MenuModel mMenu = mMenus.get(position);
        Glide.with(holder.imvImage.getContext()).load(mMenu.getImage()).into(holder.imvImage);
        holder.tvName.setText(mMenu.getName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClicked(holder.getAdapterPosition());
            }
        });
    }

    @Override
    public int getItemCount() {
        return mMenus != null ? mMenus.size() : 0;
    }

    public void setListener(ItemListener listener) {
        this.listener = listener;
    }

    static class MenuHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.itemMenu_imvImage)
        ImageView imvImage;
        @BindView(R.id.itemMenu_tvName)
        TextView tvName;

        MenuHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
