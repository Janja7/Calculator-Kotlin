package com.example.calculator

import android.os.Bundle
import android.text.InputFilter
import android.text.InputFilter.LengthFilter

import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import butterknife.BindView
import butterknife.ButterKnife


const val ADD = "+"
const val SUBTRACT = "-"
const val MULTYPLY = "*"
const val DIVIDE = "/"
const val PERCENTAGE = "%"

class MainActivity : AppCompatActivity() {

    @BindView(R.id.textview_result)
    lateinit var mTextViewResult : TextView

    @BindView(R.id.textview_operationFirstNum)
    lateinit var mTextOperationFirstNum : TextView

    @BindView(R.id.textview_operationSecondNum)
    lateinit var mTextOperationSecondNum : TextView

    @BindView(R.id.textview_operation)
    lateinit var mTextOperation : TextView

    @BindView(R.id.button_zero)
    lateinit var mZero : Button

    @BindView(R.id.button_one)
    lateinit var mOne : Button

    @BindView(R.id.button_two)
    lateinit var mTwo : Button

    @BindView(R.id.button_three)
    lateinit var mThree : Button

    @BindView(R.id.button_four)
    lateinit var mFour : Button

    @BindView(R.id.button_five)
    lateinit var mFive : Button

    @BindView(R.id.button_six)
    lateinit var mSix : Button

    @BindView(R.id.button_seven)
    lateinit var mSeven : Button

    @BindView(R.id.button_eight)
    lateinit var mEight : Button

    @BindView(R.id.button_nine)
    lateinit var mNine : Button

    @BindView(R.id.button_back_del)
    lateinit var mBackDelete : RelativeLayout

    @BindView(R.id.button_c_delete)
    lateinit var mCDelete : Button

    @BindView(R.id.button_percentage)
    lateinit var mPercentage : Button

    @BindView(R.id.button_divide)
    lateinit var mDivide : Button

    @BindView(R.id.button_multiply)
    lateinit var mMultiply : Button

    @BindView(R.id.button_minus)
    lateinit var mMinus : Button

    @BindView(R.id.button_plus)
    lateinit var mPlus : Button

    @BindView(R.id.button_equally)
    lateinit var mEqually : Button

    @BindView(R.id.button_comma)
    lateinit var mComma : Button

    @BindView(R.id.button_plus_minus)
    lateinit var mPlusMinus : Button

    var isClickedEqually = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ButterKnife.bind(this)

        mTextOperationFirstNum.filters = arrayOf<InputFilter>(LengthFilter(12))
        mTextOperationSecondNum.filters = arrayOf<InputFilter>(LengthFilter(12))
        mTextOperation.filters = arrayOf<InputFilter>(LengthFilter(1))

        mTextViewResult.setText("0").toString()

        setButtonClicksAndOperation()

    }

    private fun setButtonClicksAndOperation() {

        mZero.setOnClickListener {
            if (mTextOperation.text.toString().isEmpty()) {
                var s = mTextOperationFirstNum.text.toString()
                if (s == "0") {
                    Toast.makeText(
                        applicationContext,
                        R.string.toast,
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    s += "0"
                    mTextOperationFirstNum.text = s
                }
            } else {
                var s = mTextOperationSecondNum.text.toString()
                if (s == "0") {
                    Toast.makeText(
                        applicationContext,
                        R.string.toast,
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    s += "0"
                    mTextOperationSecondNum.text = s
                }
            }

            if (!mTextOperationSecondNum.text.toString().isEmpty()) {
                isClickedEqually = false
                result()
            }
        }

        mOne.setOnClickListener {
            if (mTextOperation.text.toString().isEmpty()) {
                var s = mTextOperationFirstNum.text.toString()
                if (s == "0") {
                    s += ".1"
                    mTextOperationFirstNum.text = s
                } else {
                    s += "1"
                    mTextOperationFirstNum.text = s
                }
            } else {
                var s = mTextOperationSecondNum.text.toString()
                if (s == "0") {
                    s += ".1"
                    mTextOperationSecondNum.text = s
                } else {
                    s += "1"
                    mTextOperationSecondNum.text = s
                }
            }

            if (!mTextOperationSecondNum.text.toString().isEmpty()) {
                isClickedEqually = false
                result()
            }
        }

        mTwo.setOnClickListener {
            if (mTextOperation.text.toString().isEmpty()) {
                var s = mTextOperationFirstNum.text.toString()
                if (s == "0") {
                    s += ".2"
                    mTextOperationFirstNum.text = s
                } else {
                    s += "2"
                    mTextOperationFirstNum.text = s
                }
            } else {
                var s = mTextOperationSecondNum.text.toString()
                if (s == "0") {
                    s += ".2"
                    mTextOperationSecondNum.text = s
                } else {
                    s += "2"
                    mTextOperationSecondNum.text = s
                }
            }

            if (!mTextOperationSecondNum.text.toString().isEmpty()) {
                isClickedEqually = false
                result()
            }
        }

        mThree.setOnClickListener {
            if (mTextOperation.text.toString().isEmpty()) {
                var s = mTextOperationFirstNum.text.toString()
                if (s == "0") {
                    s += ".3"
                    mTextOperationFirstNum.text = s
                } else {
                    s += "3"
                    mTextOperationFirstNum.text = s
                }
            } else {
                var s = mTextOperationSecondNum.text.toString()
                if (s == "0") {
                    s += ".3"
                    mTextOperationSecondNum.text = s
                } else {
                    s += "3"
                    mTextOperationSecondNum.text = s
                }
            }

            if (!mTextOperationSecondNum.text.toString().isEmpty()) {
                isClickedEqually = false
                result()
            }
        }

        mFour.setOnClickListener {
            if (mTextOperation.text.toString().isEmpty()) {
                var s = mTextOperationFirstNum.text.toString()
                if (s == "0") {
                    s += ".4"
                    mTextOperationFirstNum.text = s
                } else {
                    s += "4"
                    mTextOperationFirstNum.text = s
                }
            } else {
                var s = mTextOperationSecondNum.text.toString()
                if (s == "0") {
                    s += ".4"
                    mTextOperationSecondNum.text = s
                } else {
                    s += "4"
                    mTextOperationSecondNum.text = s
                }
            }

            if (!mTextOperationSecondNum.text.toString().isEmpty()) {
                isClickedEqually = false
                result()
            }
        }

        mFive.setOnClickListener {
            if (mTextOperation.text.toString().isEmpty()) {
                var s = mTextOperationFirstNum.text.toString()
                if (s == "0") {
                    s += ".5"
                    mTextOperationFirstNum.text = s
                } else {
                    s += "5"
                    mTextOperationFirstNum.text = s
                }
            } else {
                var s = mTextOperationSecondNum.text.toString()
                if (s == "0") {
                    s += ".5"
                    mTextOperationSecondNum.text = s
                } else {
                    s += "5"
                    mTextOperationSecondNum.text = s
                }
            }

            if (!mTextOperationSecondNum.text.toString().isEmpty()) {
                isClickedEqually = false
                result()
            }
        }

        mSix.setOnClickListener {
            if (mTextOperation.text.toString().isEmpty()) {
                var s = mTextOperationFirstNum.text.toString()
                if (s == "0") {
                    s += ".6"
                    mTextOperationFirstNum.text = s
                } else {
                    s += "6"
                    mTextOperationFirstNum.text = s
                }
            } else {
                var s = mTextOperationSecondNum.text.toString()
                if (s == "0") {
                    s += ".6"
                    mTextOperationSecondNum.text = s
                } else {
                    s += "6"
                    mTextOperationSecondNum.text = s
                }
            }

            if (!mTextOperationSecondNum.text.toString().isEmpty()) {
                isClickedEqually = false
                result()
            }
        }

        mSeven.setOnClickListener {
            if (mTextOperation.text.toString().isEmpty()) {
                var s = mTextOperationFirstNum.text.toString()
                if (s == "0") {
                    s += ".7"
                    mTextOperationFirstNum.text = s
                } else {
                    s += "7"
                    mTextOperationFirstNum.text = s
                }
            } else {
                var s = mTextOperationSecondNum.text.toString()
                if (s == "0") {
                    s += ".7"
                    mTextOperationSecondNum.text = s
                } else {
                    s += "7"
                    mTextOperationSecondNum.text = s
                }
            }

            if (!mTextOperationSecondNum.text.toString().isEmpty()) {
                isClickedEqually = false
                result()
            }
        }

        mEight.setOnClickListener {
            if (mTextOperation.text.toString().isEmpty()) {
                var s = mTextOperationFirstNum.text.toString()
                if (s == "0") {
                    s += ".8"
                    mTextOperationFirstNum.text = s
                } else {
                    s += "8"
                    mTextOperationFirstNum.text = s
                }
            } else {
                var s = mTextOperationSecondNum.text.toString()
                if (s == "0") {
                    s += ".8"
                    mTextOperationSecondNum.text = s
                } else {
                    s += "8"
                    mTextOperationSecondNum.text = s
                }
            }

            if (!mTextOperationSecondNum.text.toString().isEmpty()) {
                isClickedEqually = false
                result()
            }
        }

        mNine.setOnClickListener {
            if (mTextOperation.text.toString().isEmpty()) {
                var s = mTextOperationFirstNum.text.toString()
                if (s == "0") {
                    s += ".9"
                    mTextOperationFirstNum.text = s
                } else {
                    s += "9"
                    mTextOperationFirstNum.text = s
                }
            } else {
                var s = mTextOperationSecondNum.text.toString()
                if (s == "0") {
                    s += ".9"
                    mTextOperationSecondNum.text = s
                } else {
                    s += "9"
                    mTextOperationSecondNum.text = s
                }
            }

            if (!mTextOperationSecondNum.text.toString().isEmpty()) {
                isClickedEqually = false
                result()
            }
        }

        mPlus.setOnClickListener {
            if (!mTextOperationFirstNum.text.toString().isEmpty()) {
                if (mTextOperation.text.toString().isEmpty()) {
                    mTextOperation.setText("+").toString()
                } else {
                    mTextOperation.text = mTextOperation.text.toString()
                        .replace(mTextOperation.text.toString(), "+")
                }
            }

            if (!mTextOperationSecondNum.text.toString().isEmpty()) {
                isClickedEqually = false
                result()
            }
        }

        mMinus.setOnClickListener {
            if (!mTextOperationFirstNum.text.toString().isEmpty()) {
                if (mTextOperation.text.toString().isEmpty()) {
                    mTextOperation.setText("-").toString()
                } else {
                    mTextOperation.text = mTextOperation.text.toString()
                        .replace(mTextOperation.text.toString(), "-")
                }
            }

            if (!mTextOperationSecondNum.text.toString().isEmpty()) {
                isClickedEqually = false
                result()
            }
        }

        mMultiply.setOnClickListener {
            if (!mTextOperationFirstNum.text.toString().isEmpty()) {
                if (mTextOperation.text.toString().isEmpty()) {
                    mTextOperation.setText("*").toString()
                } else {
                    mTextOperation.text = mTextOperation.text.toString()
                        .replace(mTextOperation.text.toString(), "*")
                }
            }

            if (!mTextOperationSecondNum.text.toString().isEmpty()) {
                isClickedEqually = false
                result()
            }
        }

        mDivide.setOnClickListener {
            if (!mTextOperationFirstNum.text.toString().isEmpty()) {
                if (mTextOperation.text.toString().isEmpty()) {
                    mTextOperation.setText("/").toString()
                } else {
                    mTextOperation.text = mTextOperation.text.toString()
                        .replace(mTextOperation.text.toString(), "÷")
                }
            }

            if (!mTextOperationSecondNum.text.toString().isEmpty()) {
                isClickedEqually = false
                result()
            }
        }

        mPercentage.setOnClickListener {
            if (!mTextOperationFirstNum.text.toString().isEmpty()) {
                if (mTextOperation.text.toString().isEmpty()) {
                    mTextOperation.setText("%").toString()
                } else {
                    mTextOperation.text = mTextOperation.text.toString()
                        .replace(mTextOperation.text.toString(), "%")
                }
            }

            if (!mTextOperationSecondNum.text.toString().isEmpty()) {
                isClickedEqually = false
                result()
            }
        }

        mComma.setOnClickListener {
            if (mTextOperation.text.toString().isEmpty()) {
                var str = mTextOperationFirstNum.text.toString()
                if (str.isEmpty() || str.contains(".")) {
                    Toast.makeText(applicationContext,
                        R.string.toast,
                        Toast.LENGTH_LONG)
                        .show()
                } else {
                    str += "."
                    mTextOperationFirstNum.setText(str).toString()
                }
            } else {
                var str = mTextOperationSecondNum.text.toString()
                if (str.isEmpty() || str.contains(".")) {
                    Toast.makeText(applicationContext,
                        R.string.toast,
                        Toast.LENGTH_LONG)
                        .show()
                } else {
                    str += "."
                    mTextOperationSecondNum.setText(str).toString()
                }
            }

            if (!mTextOperationSecondNum.text.toString().isEmpty()) {
                isClickedEqually = false
                result()
            }
        }

        mPlusMinus.setOnClickListener {
            if (mTextOperation.text.toString().isEmpty()) {
                var str = mTextOperationFirstNum.text.toString()
                if (str.isEmpty() || str.contains("-")) {
                    str = str.replace("-", "")
                    mTextOperationFirstNum.setText(str).toString()
                } else {
                    str = "-" + str
                    mTextOperationFirstNum.setText(str).toString()
                }
            } else {
                var str = mTextOperationSecondNum.text.toString()
                if (str.isEmpty() || str.contains("-")) {
                    str = str.replace("-", "")
                    mTextOperationSecondNum.setText(str).toString()
                } else {
                    str = "-" + str
                    mTextOperationSecondNum.setText(str).toString()
                }
            }

            if (!mTextOperationSecondNum.text.toString().isEmpty()) {
                isClickedEqually = false
                result()
            }
        }

        mBackDelete.setOnClickListener {
            var s1 = mTextOperationFirstNum.text.toString()
            var s2 = mTextOperationSecondNum.text.toString()
            var s3 = mTextOperation.text.toString()

            if (!s2.isEmpty()) {
                mTextOperationSecondNum.setText(s2.substring(0, s2.length - 1)).toString()
            } else {
                if (!s3.isEmpty()) {
                    mTextOperation.setText("").toString()
                } else {
                    if (s1.isEmpty()) {
                        Toast.makeText(applicationContext,
                            R.string.field,
                            Toast.LENGTH_LONG)
                            .show()
                    } else {
                        mTextOperationFirstNum.setText(s1.substring(0, s1.length - 1)).toString()
                    }
                }
            }

            if (!mTextOperationSecondNum.text.toString().isEmpty()) {
                isClickedEqually = false
                result()
            }
        }

        mCDelete.setOnClickListener {
            mTextOperationFirstNum.setText("").toString()
            mTextOperationSecondNum.setText("").toString()
            mTextOperation.setText("").toString()
            mTextViewResult.setText("0").toString()

            if (!mTextOperationSecondNum.text.toString().isEmpty()) {
                isClickedEqually = false
                result()
            }
        }

        mEqually.setOnClickListener {
            isClickedEqually = true
            result()
        }

    }

    fun result() {
        var numOne = mTextOperationFirstNum.text.toString()
        var numTwo = mTextOperationSecondNum.text.toString()
        var operation = mTextOperation.text.toString()

        var result = ""

        when (operation) {
            ADD -> {
                result = Operations.add(numOne, numTwo)
                mTextViewResult.setText(result).toString()

                if (isClickedEqually) {
                    mTextOperationFirstNum.setText(result).toString()
                    mTextOperationSecondNum.setText("").toString()
                    mTextOperation.setText("").toString()
                }
            }

            MULTYPLY -> {
                result = Operations.multiply(numOne, numTwo)
                mTextViewResult.setText(result).toString()

                if (isClickedEqually) {
                    mTextOperationFirstNum.setText(result).toString()
                    mTextOperationSecondNum.setText("").toString()
                    mTextOperation.setText("").toString()
                }
            }

            SUBTRACT -> {
                result = Operations.subtract(numOne, numTwo)
                mTextViewResult.setText(result).toString()

                if (isClickedEqually) {
                    mTextOperationFirstNum.setText(result).toString()
                    mTextOperationSecondNum.setText("").toString()
                    mTextOperation.setText("").toString()
                }
            }

            DIVIDE -> {
                result = Operations.divide(numOne, numTwo)
                mTextViewResult.setText(result).toString()

                if (isClickedEqually) {
                    mTextOperationFirstNum.setText(result).toString()
                    mTextOperationSecondNum.setText("").toString()
                    mTextOperation.setText("").toString()
                }
            }

            PERCENTAGE -> {
                result = Operations.percentage(numOne, numTwo)
                mTextViewResult.setText(result).toString()

                if (isClickedEqually) {
                    mTextOperationFirstNum.setText(result).toString()
                    mTextOperationSecondNum.setText("").toString()
                    mTextOperation.setText("").toString()
                }
            }
        }
    }

}
