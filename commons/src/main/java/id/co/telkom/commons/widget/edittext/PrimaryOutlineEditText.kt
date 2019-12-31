package id.co.telkom.commons.widget.edittext

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import androidx.databinding.DataBindingUtil
import id.co.telkom.commons.R
import id.co.telkom.commons.databinding.CustomViewEditTextOutlineFloatBinding

class PrimaryOutlineEditText @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet?,
    defStyleAttr: Int = 0
) : FrameLayout(context, attributeSet, defStyleAttr) {

    private lateinit var binding: CustomViewEditTextOutlineFloatBinding

    init {
        attributeSet?.let {
            initView(it)
        }
    }

    fun initView(attributeSet: AttributeSet) {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(context), R.layout.custom_view_edit_text_outline_float,
            this, true
        )

        val typedArray = context.obtainStyledAttributes(
            attributeSet,
            R.styleable.PrimaryOutlineEditText
        )

        binding.tiPrimary.hint = typedArray?.getString(
            R.styleable.PrimaryOutlineEditText_textInputLayoutHint
        ) ?: ""
        typedArray.recycle()
    }
}