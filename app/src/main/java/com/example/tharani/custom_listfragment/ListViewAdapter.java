package com.example.tharani.custom_listfragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Tharani on 12/4/2017.
 */
//created java class ListViewAdapter
public class ListViewAdapter extends ArrayAdapter {
   /*Here ListViewAdapter extends ArrayAdapter
   Extended Adapter that is the bridge between a ListView and the data that backs the list
    The ListView can display any data provided that it is wrapped in a ListAdapter.
    array adapter creates a view by calling toString() on each data object in the collection you provide, and places the result in a TextView*/
    Context context;
    // Context allows access to application-specific resources and classes

    public ListViewAdapter(Context context,List<ListViewItem> items) {
        super(context, R.layout.row_fragment, items);
        //The super keyword in java is a reference variable which is used to refer immediate parent class object
        this.context = context;
        //by using this giving reference to context
    }
    //here taking private so it can access only with this class
    private static class ViewHolder {
        //declaring variables
        ImageView imgIcon;
        TextView txtTitle;
        TextView txtDescription;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        ViewHolder viewHolder;
        //ViewHolder implementations to store data that makes binding view contents easier
        if(convertView == null) {//if statement decides whether this statement will get execute or not
            //here we are inflate the GridView item layout,LayoutInflater is used to manipulate Android screen
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.row_fragment, parent, false);

            //here we are initializing the view holder for imgIcon,txtTitle,txtDescription
            viewHolder = new ViewHolder();
            viewHolder.imgIcon =  convertView.findViewById(R.id.imgIcon);
            viewHolder.txtTitle = convertView.findViewById(R.id.txtTitle);
            viewHolder.txtDescription =  convertView.findViewById(R.id.txtDescription);
            convertView.setTag(viewHolder);
        } else {
            //here we are recycling the already inflated view
            viewHolder = (ViewHolder) convertView.getTag();
        }
        //here we are updating the item view
        ListViewItem listItem= (ListViewItem) getItem(position);
        viewHolder.imgIcon.setImageDrawable(listItem.icon);
        viewHolder.txtTitle.setText(listItem.title);
        viewHolder.txtDescription.setText(listItem.description);

        return convertView;//returns convertView
    }

}
