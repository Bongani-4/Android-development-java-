// Generated by view binder compiler. Do not edit!
package com.example.farmguardian.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.farmguardian.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAcaretakerProfile2Binding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button buttonSetACprofile;

  @NonNull
  public final CheckBox checkBoxAVailable;

  @NonNull
  public final EditText editTextContacts;

  @NonNull
  public final EditText editTextExperiance;

  @NonNull
  public final EditText editTextLocation;

  @NonNull
  public final EditText editTextProfileNames;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textViewProfile;

  private ActivityAcaretakerProfile2Binding(@NonNull ScrollView rootView,
      @NonNull Button buttonSetACprofile, @NonNull CheckBox checkBoxAVailable,
      @NonNull EditText editTextContacts, @NonNull EditText editTextExperiance,
      @NonNull EditText editTextLocation, @NonNull EditText editTextProfileNames,
      @NonNull TextView textView4, @NonNull TextView textViewProfile) {
    this.rootView = rootView;
    this.buttonSetACprofile = buttonSetACprofile;
    this.checkBoxAVailable = checkBoxAVailable;
    this.editTextContacts = editTextContacts;
    this.editTextExperiance = editTextExperiance;
    this.editTextLocation = editTextLocation;
    this.editTextProfileNames = editTextProfileNames;
    this.textView4 = textView4;
    this.textViewProfile = textViewProfile;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAcaretakerProfile2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAcaretakerProfile2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_acaretaker_profile2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAcaretakerProfile2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonSetACprofile;
      Button buttonSetACprofile = ViewBindings.findChildViewById(rootView, id);
      if (buttonSetACprofile == null) {
        break missingId;
      }

      id = R.id.checkBoxAVailable;
      CheckBox checkBoxAVailable = ViewBindings.findChildViewById(rootView, id);
      if (checkBoxAVailable == null) {
        break missingId;
      }

      id = R.id.editTextContacts;
      EditText editTextContacts = ViewBindings.findChildViewById(rootView, id);
      if (editTextContacts == null) {
        break missingId;
      }

      id = R.id.editTextExperiance;
      EditText editTextExperiance = ViewBindings.findChildViewById(rootView, id);
      if (editTextExperiance == null) {
        break missingId;
      }

      id = R.id.editTextLocation;
      EditText editTextLocation = ViewBindings.findChildViewById(rootView, id);
      if (editTextLocation == null) {
        break missingId;
      }

      id = R.id.editTextProfileNames;
      EditText editTextProfileNames = ViewBindings.findChildViewById(rootView, id);
      if (editTextProfileNames == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.textViewProfile;
      TextView textViewProfile = ViewBindings.findChildViewById(rootView, id);
      if (textViewProfile == null) {
        break missingId;
      }

      return new ActivityAcaretakerProfile2Binding((ScrollView) rootView, buttonSetACprofile,
          checkBoxAVailable, editTextContacts, editTextExperiance, editTextLocation,
          editTextProfileNames, textView4, textViewProfile);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
