package uk.akane.omni.ui.components

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.materialswitch.MaterialSwitch

class MaterialSwitchCompat @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = com.google.android.material.R.attr.materialSwitchStyle
) : MaterialSwitch(context, attrs, defStyleAttr) {

    // https://issuetracker.google.com/issues/189446951
    override fun isLaidOut(): Boolean = true
}
