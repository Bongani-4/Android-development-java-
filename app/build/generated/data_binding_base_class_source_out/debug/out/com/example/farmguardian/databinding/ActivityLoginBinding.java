// Generated by view binder compiler. Do not edit!
package com.example.farmguardian.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.farmguardian.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button Forgotpasword;

  @NonNull
  public final Button buttonLogin;

  @NonNull
  public final EditText editTextTextPassword;

  @NonNull
  public final EditText editTxtEMAIL;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView textRegister;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textViewLogin;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView, @NonNull Button Forgotpasword,
      @NonNull Button buttonLogin, @NonNull EditText editTextTextPassword,
      @NonNull EditText editTxtEMAIL, @NonNull ImageView imageView, @NonNull TextView textRegister,
      @NonNull TextView textView4, @NonNull TextView textViewLogin) {
    this.rootView = rootView;
    this.Forgotpasword = Forgotpasword;
    this.buttonLogin = buttonLogin;
    this.editTextTextPassword = editTextTextPassword;
    this.editTxtEMAIL = editTxtEMAIL;
    this.imageView = imageView;
    this.textRegister = textRegister;
    this.textView4 = textView4;
    this.textViewLogin = textViewLogin;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Forgotpasword;
      Button Forgotpasword = ViewBindings.findChildViewById(rootView, id);
      if (Forgotpasword == null) {
        break missingId;
      }

      id = R.id.buttonLogin;
      Button buttonLogin = ViewBindings.findChildViewById(rootView, id);
      if (buttonLogin == null) {
        break missingId;
      }

      id = R.id.editTextTextPassword;
      EditText editTextTextPassword = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPassword == null) {
        break missingId;
      }

      id = R.id.editTxtEMAIL;
      EditText editTxtEMAIL = ViewBindings.findChildViewById(rootView, id);
      if (editTxtEMAIL == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.textRegister;
      TextView textRegister = ViewBindings.findChildViewById(rootView, id);
      if (textRegister == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.textViewLogin;
      TextView textViewLogin = ViewBindings.findChildViewById(rootView, id);
      if (textViewLogin == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, Forgotpasword, buttonLogin,
          editTextTextPassword, editTxtEMAIL, imageView, textRegister, textView4, textViewLogin);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
