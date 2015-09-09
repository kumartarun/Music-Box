# App based on REST API and Tab Layout 

Layout that allows the user to swipe left and right through "pages" of content which are usually different fragments. This is a common navigation mode to use instead of ActionBar Tabs with Fragments.

# Android Studio App 

> Material Design Specifications[Navigation Drawer](http://blog.teamtreehouse.com/add-navigation-drawer-android) 
> Creating Apps with Material Design[Material Design](http://developer.android.com/training/material/index.html) 

## Running Locally
Make sure you have [Android studio/Eclipse ADB](http://developer.android.com/tools/studio/index.html) 

```sh
    compile 'com.android.support:appcompat-v7:21.0.3'
    compile 'com.android.support:support-v4:21.0.3'
    compile 'com.android.support:appcompat-v7:22.2.1'
    compile 'com.android.support:design:22.2.0'
    compile 'com.android.support:cardview-v7:22.2.1'
```

## Create a Tab Layout and add fragment calls 


```sh
        pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(new MyFragmentPagerAdapter(getSupportFragmentManager(),
                MainActivity.this));

        // Assiging the Sliding Tab Layout View
        tabs = (SlidingTabLayout) findViewById(R.id.tabs);
        tabs.setDistributeEvenly(true); // To make the Tabs Fixed set this true, This makes the tabs Space Evenly in Available width

        // Setting Custom Color for the Scroll bar indicator of the Tab View
        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.tabsScrollColor);
            }
        });
```

## create adaptor to show Tabs 

```sh
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
```