// Generated code from Butter Knife. Do not modify!
package com.wenkey.sections.Profile.EditInfoActivity.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.wenkey.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class EditInfoActivity_ViewBinding implements Unbinder {
  private EditInfoActivity target;

  private View view2131230804;

  private View view2131230820;

  @UiThread
  public EditInfoActivity_ViewBinding(EditInfoActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public EditInfoActivity_ViewBinding(final EditInfoActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.current_work, "method 'onCurrentWorkClicked'");
    view2131230804 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCurrentWorkClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.education, "method 'onEducationClicked'");
    view2131230820 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onEducationClicked();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view2131230804.setOnClickListener(null);
    view2131230804 = null;
    view2131230820.setOnClickListener(null);
    view2131230820 = null;
  }
}
