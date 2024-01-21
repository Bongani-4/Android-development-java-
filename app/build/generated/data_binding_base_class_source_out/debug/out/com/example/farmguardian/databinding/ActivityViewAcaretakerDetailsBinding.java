// Generated by view binder compiler. Do not edit!
package com.example.farmguardian.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.farmguardian.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityViewAcaretakerDetailsBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button buttonBack;

  @NonNull
  public final LinearLayout linearLayout2;

  @NonNull
  public final TextView textViewAvailable;

  @NonNull
  public final TextView textViewContact;

  @NonNull
  public final TextView textViewDetailsTitle;

  @NonNull
  public final TextView textViewExperience;

  @NonNull
  public final TextView textViewFullNames;

  @NonNull
  public final TextView textViewLocation;

  private ActivityViewAcaretakerDetailsBinding(@NonNull RelativeLayout rootView,
      @NonNull Button buttonBack, @NonNull LinearLayout linearLayout2,
      @NonNull TextView textViewAvailable, @NonNull TextView textViewContact,
      @NonNull TextView textViewDetailsTitle, @NonNull TextView textViewExperience,
      @NonNull TextView textViewFullNames, @NonNull TextView textViewLocation) {
    this.rootView = rootView;
    this.buttonBack = buttonBack;
    this.linearLayout2 = linearLayout2;
    this.textViewAvailable = textViewAvailable;
    this.textViewContact = textViewContact;
    this.textViewDetailsTitle = textViewDetailsTitle;
    this.textViewExperience = textViewExperience;
    this.textViewFullNames = textViewFullNames;
    this.textViewLocation = textViewLocation;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityViewAcaretakerDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityViewAcaretakerDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_view_acaretaker_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityViewAcaretakerDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonBack;
      Button buttonBack = ViewBindings.findChildViewById(rootView, id);
      if (buttonBack == null) {
        break missingId;
      }

      id = R.id.linearLayout2;
      LinearLayout linearLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout2 == null) {
        break missingId;
      }

      id = R.id.textViewAvailable;
      TextView textViewAvailable = ViewBindings.findChildViewById(rootView, id);
      if (textViewAvailable == null) {
        break missingId;
      }

      id = R.id.textViewContact;
      TextView textViewContact = ViewBindings.findChildViewById(rootView, id);
      if (textViewContact == null) {
        break missingId;
      }

      id = R.id.textViewDetailsTitle;
      TextView textViewDetailsTitle = ViewBindings.findChildViewById(rootView, id);
      if (textViewDetailsTitle == null) {
        break missingId;
      }

      id = R.id.textViewExperience;
      TextView textViewExperience = ViewBindings.findChildViewById(rootView, id);
      if (textViewExperience == null) {
        break missingId;
      }

      id = R.id.textViewFullNames;
      TextView textViewFullNames = ViewBindings.findChildViewById(rootView, id);
      if (textViewFullNames == null) {
        break missingId;
      }

      id = R.id.textViewLocation;
      TextView textViewLocation = ViewBindings.findChildViewById(rootView, id);
      if (textViewLocation == null) {
        break missingId;
      }

      return new ActivityViewAcaretakerDetailsBinding((RelativeLayout) rootView, buttonBack,
          linearLayout2, textViewAvailable, textViewContact, textViewDetailsTitle,
          textViewExperience, textViewFullNames, textViewLocation);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
