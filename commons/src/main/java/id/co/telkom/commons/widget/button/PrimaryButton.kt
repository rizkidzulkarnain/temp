package id.co.telkom.commons.widget.button

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import android.util.TypedValue
import android.view.Gravity
import android.widget.Button
import androidx.core.content.ContextCompat
import id.co.telkom.commons.R

class PrimaryButton @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet?,
    defStyleAttr: Int = 0
) : Button(context, attributeSet, defStyleAttr) {

    init {
        val typeArray = context.obtainStyledAttributes(attributeSet, R.styleable.PrimaryButton)

        this.isActivated = true
        this.background = typeArray?.getDrawable(R.styleable.PrimaryButton_buttonColor)
        this.setTextColor(
            ContextCompat.getColor(
                context,
                R.color.all_selector_button_text_color
            )
        )
        this.gravity = Gravity.CENTER
        this.setTextSize(
            TypedValue.COMPLEX_UNIT_PX, context.resources
                .getDimension(R.dimen.text_14sp)
        )
        this.typeface = Typeface.create("sand-serif-medium", Typeface.NORMAL)
        typeArray.recycle()
    }
}