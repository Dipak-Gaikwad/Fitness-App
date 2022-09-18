package Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.fitness_app.frag_advance;
import com.example.fitness_app.frag_beginner;
import com.example.fitness_app.frag_intermediate;

public class Pager extends FragmentPagerAdapter {
    private int tabNumber;
    public Pager(@NonNull FragmentManager fm, int behavior, int tabs) {
        super(fm, behavior);
        this.tabNumber=tabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new frag_beginner();
            case 1:
                return new frag_intermediate();
            case 2:
                return new frag_advance();
            default:
                return  null;
        }

    }

    @Override
    public int getCount() {
        return tabNumber;
    }
}
