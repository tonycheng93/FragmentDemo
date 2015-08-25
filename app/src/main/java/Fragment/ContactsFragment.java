package Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tony.fragmentdemo.R;

/**
 * Created by Administrator on 2015/8/25.
 */
public class ContactsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View contactsLayout = inflater.inflate(R.layout.contacts_layout, container, false);
        return contactsLayout;
    }
}
