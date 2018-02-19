package rwilk.learnenglish.main;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import rwilk.learnenglish.R;
import rwilk.learnenglish.utils.SectionsPagerAdapter;


public class MainActivity extends AppCompatActivity {

    private Context mContext;
    private SectionsPagerAdapter mAdapter;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mActionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        initializeView();
        setDrawerNavigationView();

    }

    private void initializeView() {
        //initialize Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //initialize DrawerNavigationView
        mDrawerLayout = findViewById(R.id.drawer_layout);
        mActionBarDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,
                R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mActionBarDrawerToggle);
        mActionBarDrawerToggle.syncState();

        //initialize ViewPager
        mAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mAdapter.addFragment(new DashboardFragment());
        mAdapter.addFragment(new ProfileFragment());

        ViewPager mViewPager = findViewById(R.id.container);
        mViewPager.setAdapter(mAdapter);
        mViewPager.setOffscreenPageLimit(2);

        //initialize BottomNavigationView
        BottomNavigationViewEx bottomNavigationViewEx = findViewById(R.id.bottomNavViewBar);
        bottomNavigationViewEx.inflateMenu(R.menu.bottom_navigation_menu);
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.setupWithViewPager(mViewPager, true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_menu_settings:
                Toast.makeText(this, getString(R.string.settings), Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_menu_about:
                Toast.makeText(this, getString(R.string.about), Toast.LENGTH_SHORT).show();
                break;
        }
        if (mActionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return true;
        //return super.onOptionsItemSelected(item);
    }

    private void setDrawerNavigationView() {
        NavigationView navigationView = findViewById(R.id.drawer_navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.ic_home:
                        Toast.makeText(mContext, getString(R.string.dashboard), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ic_profile:
                        Toast.makeText(mContext, getString(R.string.profile), Toast.LENGTH_SHORT).show();
                        break;
                }
                mDrawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });
    }
}
