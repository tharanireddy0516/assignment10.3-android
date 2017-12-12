package com.example.tharani.custom_listfragment;

import android.app.ListFragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tharani on 12/4/2017.
 */

public class Fragment extends ListFragment {
    /* Here Fragment extends ListFragment by using extends keyword
      A Fragment represents a behavior or a portion of user interface in an Activity
      It is a piece of activity which enables more activity design and is a kind of sub activity
      It has its own behavior,life cycle,layout*/
    private List<ListViewItem> items;
    @Override
     /*onCreate is the first method in the life cycle of an activity
     savedInstance passes data to super class,data is pull to store state of application
   * setContentView is used to set layout for the activity
   *R is a resource and it is auto generate file
   * activity_main assign an integer value*/
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //here we are creating the array list fore item using new
        items = new ArrayList<ListViewItem>();
        Resources resources= getResources();//gets resources
        /*here adding items
        * ContextCompat is used to retrieve resources
        * obtain a styled Drawable as Activity theme instructed
        * getApplicationContext:obtains context
        * Context allows access to application-specific resources and classes
        * gets image from drawable and displays description in output which was written here*/
        items.add(new ListViewItem(ContextCompat.getDrawable(getActivity().getApplicationContext()
                ,R.drawable.youtube), "YouTube"," YouTube is a video sharing service that allows users to watch videos "));

        items.add(new ListViewItem(ContextCompat.getDrawable(getActivity().getApplicationContext()
                ,R.drawable.blogger),"Blogger", "Blogger is a free Web log service from Google that allows users to share text, photos and videos" ));

        //here we are initializing and set the list adapter
        setListAdapter(new ListViewAdapter(getActivity(),items));

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
       /*onViewCreated Called immediately after onCreateView has returned
         but before any saved state has been restored in to the view.
         This gives subclasses a chance to initialize themselves once they know their view hierarchy has been completely created. */
        super.onViewCreated(view, savedInstanceState);
        // remove the dividers from the ListView of the ListFragment
        getListView().setDivider(null);

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        /*onListItemClick(ListView l, View v, int position, long id). This method will be called when an item in the list is selected*/
        super.onListItemClick(l, v, position, id);
        // retrieve theListView item
        ListViewItem item = items.get(position);
        // do something
        Toast.makeText(getActivity(), item.title, Toast.LENGTH_SHORT).show();
        /*Toast is a pop up message or  a view containing a quick little message
        LENGTH_SHORT display in short period of time*/

    }
}

