// Generated by view binder compiler. Do not edit!
package com.example.farmguardian.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.farmguardian.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityHireAnimalCaretakerBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ListView listViewAcaretakers2;

  private ActivityHireAnimalCaretakerBinding(@NonNull RelativeLayout rootView,
      @NonNull ListView listViewAcaretakers2) {
    this.rootView = rootView;
    this.listViewAcaretakers2 = listViewAcaretakers2;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHireAnimalCaretakerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHireAnimalCaretakerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_hire_animal_caretaker, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHireAnimalCaretakerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.listViewAcaretakers2;
      ListView listViewAcaretakers2 = ViewBindings.findChildViewById(rootView, id);
      if (listViewAcaretakers2 == null) {
        break missingId;
      }

      return new ActivityHireAnimalCaretakerBinding((RelativeLayout) rootView,
          listViewAcaretakers2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
