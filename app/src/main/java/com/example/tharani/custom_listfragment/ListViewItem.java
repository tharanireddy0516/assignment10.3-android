package com.example.tharani.custom_listfragment;

import android.graphics.drawable.Drawable;

/**
 * Created by Tharani on 12/4/2017.
 */
//Here Created class ListViewItem
public class ListViewItem {
    public final Drawable icon;       // the drawable for the ListView item ImageView
    public final String title;        // the text for the ListView item title
    public final String description;  // the text for the ListView item description

    public ListViewItem(Drawable icon, String title, String description) {
        this.icon = icon;//giving reference to icon
        this.title = title;//giving reference to title
        this.description = description;//giving reference to description
    }
}
