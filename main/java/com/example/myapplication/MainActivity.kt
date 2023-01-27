package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var main1 =0.0;

    var sec1 = "";
    var whichfun="jamw";
    var justfun = false;
    var thetext ="";
    var thisIsTheFirst =true;
    override fun onCreate(savedInstanceState: Bundle?) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater.cloneInContext(this))
        setContentView(binding.root)
    }

    fun onDigitClicked(view: View)
    {

        if (whichfun != "mosavi") {
            if (!thisIsTheFirst) {

                if (justfun) {
                    sec1 = "";
                }
                val clickButton = view as Button
                thetext = ((clickButton.text).toString())
                sec1 += (thetext.replace(" ", ""))
                if(sec1.count()<7)
                {binding.viewInput.textSize = 80F}
                else if(sec1.count()<8)
                {binding.viewInput.textSize = 70F}
                else if(sec1.count()<9)
                {binding.viewInput.textSize = 60F}
                else if(sec1.count()<11)
                {binding.viewInput.textSize = 45F}
                else
                {binding.viewInput.textSize = 35F}
                binding.viewInput.text = sec1
                justfun = false
                if (sec1=="")
                {binding.butti.text = "AC"}
                else
                {binding.butti.text = "C"}

            }
            else
            {
                if (justfun) {
                    sec1 = "";
                }
                val clickButton = view as Button
                if(clickButton.text== " 0")
                {
                    binding.viewInput.textSize = 80F
                binding.viewInput.text = "0"
                justfun = false
                    if (sec1=="")
                    {binding.butti.text = "AC"}
                    else
                    {binding.butti.text = "C"}

                }
                else
                {                thetext = ((clickButton.text).toString())
                    sec1 += (thetext.replace(" ", ""))

                    if(sec1.count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if(sec1.count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if(sec1.count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if(sec1.count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = sec1
                    justfun = false
                    thisIsTheFirst =false;
                    if (sec1=="")
                    {binding.butti.text = "AC"}
                    else
                    {binding.butti.text = "C"}
                }
            }
        }
    }
    fun AC_Clicked(view: View){
        val clickButton = view as Button
        if(clickButton.text== "AC")
        {
        main1 = 0.0;
        sec1 = "";
        whichfun = "jamw";
        justfun = false;
            binding.viewInput.textSize = 80F
        binding.viewInput.text = "0";}
        else if ( thisIsTheFirst !=true && sec1 != "")
        {sec1=""
            if(sec1.count()<7)
            {binding.viewInput.textSize = 80F}
            else if(sec1.count()<8)
            {binding.viewInput.textSize = 70F}
            else if(sec1.count()<9)
            {binding.viewInput.textSize = 60F}
            else if(sec1.count()<11)
            {binding.viewInput.textSize = 45F}
            else
            {binding.viewInput.textSize = 35F}
            binding.viewInput.text = sec1
            binding.butti.text = "AC"
        }

    }
    fun virgol_Clicked(view: View) {
        if (whichfun != "mosavi")
        {if (justfun) {
            sec1 = "";
        }
        sec1 = sec1.replace(".","")
        if(sec1=="")
        {sec1="0"}
        thetext = "."
        sec1 += (thetext.replace(" ", ""))
            if(sec1.count()<7)
            {binding.viewInput.textSize = 80F}
            else if(sec1.count()<8)
            {binding.viewInput.textSize = 70F}
            else if(sec1.count()<9)
            {binding.viewInput.textSize = 60F}
            else if(sec1.count()<11)
            {binding.viewInput.textSize = 45F}
            else
            {binding.viewInput.textSize = 35F}
            binding.viewInput.text = sec1
        justfun = false}
    }
    fun buttvvvvv_Clicked(view: View) {

        if (whichfun == "zarb")
        {
            if (sec1 != "")
            {
                main1 = main1 * (sec1.toDouble())
            }
            if((main1.toString()).count()>2) {
                if ((((main1.toString())[(main1.toString()).length-1]).toString()) == "0" && (((main1.toString())[(main1.toString()).length-2]).toString()) == ".")
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString()).dropLast(2)
                }
                else
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString())
                }
            }
            else
            {if((main1.toString()).count()<7)
            {binding.viewInput.textSize = 80F}
            else if((main1.toString()).count()<8)
            {binding.viewInput.textSize = 70F}
            else if((main1.toString()).count()<9)
            {binding.viewInput.textSize = 60F}
            else if((main1.toString()).count()<11)
            {binding.viewInput.textSize = 45F}
            else
            {binding.viewInput.textSize = 35F}
                binding.viewInput.text = (main1.toString())}
        }

        if (whichfun == "taghsim")
        {
            if (sec1 != "")
            {
                main1 = main1 / (sec1.toDouble())
            }
            if((main1.toString()).count()>2) {
                if ((((main1.toString())[(main1.toString()).length-1]).toString()) == "0" && (((main1.toString())[(main1.toString()).length-2]).toString()) == ".")
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString()).dropLast(2)
                }
                else
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString())
                }
            }
            else
            {if((main1.toString()).count()<7)
            {binding.viewInput.textSize = 80F}
            else if((main1.toString()).count()<8)
            {binding.viewInput.textSize = 70F}
            else if((main1.toString()).count()<9)
            {binding.viewInput.textSize = 60F}
            else if((main1.toString()).count()<11)
            {binding.viewInput.textSize = 45F}
            else
            {binding.viewInput.textSize = 35F}
                binding.viewInput.text = (main1.toString())}
        }

        if (whichfun == "menha")
        {
            if (sec1 != "")
            {
                main1 = main1 - (sec1.toDouble())
            }
            if((main1.toString()).count()>2) {
                if ((((main1.toString())[(main1.toString()).length-1]).toString()) == "0" && (((main1.toString())[(main1.toString()).length-2]).toString()) == ".")
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString()).dropLast(2)
                }
                else
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString())
                }
            }
            else
            {if((main1.toString()).count()<7)
            {binding.viewInput.textSize = 80F}
            else if((main1.toString()).count()<8)
            {binding.viewInput.textSize = 70F}
            else if((main1.toString()).count()<9)
            {binding.viewInput.textSize = 60F}
            else if((main1.toString()).count()<11)
            {binding.viewInput.textSize = 45F}
            else
            {binding.viewInput.textSize = 35F}
                binding.viewInput.text = (main1.toString())}
        }

        if (whichfun == "jamw")
        {
            if (sec1 != "")
            {
                main1 = main1 + (sec1.toDouble())
            }
            if((main1.toString()).count()>2) {
                if ((((main1.toString())[(main1.toString()).length-1]).toString()) == "0" && (((main1.toString())[(main1.toString()).length-2]).toString()) == ".")
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString()).dropLast(2)
                }
                else
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString())
                }
            }
            else
            {if((main1.toString()).count()<7)
            {binding.viewInput.textSize = 80F}
            else if((main1.toString()).count()<8)
            {binding.viewInput.textSize = 70F}
            else if((main1.toString()).count()<9)
            {binding.viewInput.textSize = 60F}
            else if((main1.toString()).count()<11)
            {binding.viewInput.textSize = 45F}
            else
            {binding.viewInput.textSize = 35F}
                binding.viewInput.text = (main1.toString())}
        }
        sec1 = "";
        justfun = true;
        whichfun = "taghsim";
        binding.butti.text = "AC"
    }

    fun buttvvvv_Clicked(view: View) {

        if (whichfun == "zarb")
        {
            if (sec1 != "")
            {
                main1 = main1 * (sec1.toDouble())
            }
            if((main1.toString()).count()>2) {
                if ((((main1.toString())[(main1.toString()).length-1]).toString()) == "0" && (((main1.toString())[(main1.toString()).length-2]).toString()) == ".")
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString()).dropLast(2)
                }
                else
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString())
                }
            }
            else
            {if((main1.toString()).count()<7)
            {binding.viewInput.textSize = 80F}
            else if((main1.toString()).count()<8)
            {binding.viewInput.textSize = 70F}
            else if((main1.toString()).count()<9)
            {binding.viewInput.textSize = 60F}
            else if((main1.toString()).count()<11)
            {binding.viewInput.textSize = 45F}
            else
            {binding.viewInput.textSize = 35F}
                binding.viewInput.text = (main1.toString())}
        }

        if (whichfun == "taghsim")
        {
            if (sec1 != "")
            {
                main1 = main1 / (sec1.toDouble())
            }
            if((main1.toString()).count()>2) {
                if ((((main1.toString())[(main1.toString()).length-1]).toString()) == "0" && (((main1.toString())[(main1.toString()).length-2]).toString()) == ".")
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString()).dropLast(2)
                }
                else
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString())
                }
            }
            else
            {if((main1.toString()).count()<7)
            {binding.viewInput.textSize = 80F}
            else if((main1.toString()).count()<8)
            {binding.viewInput.textSize = 70F}
            else if((main1.toString()).count()<9)
            {binding.viewInput.textSize = 60F}
            else if((main1.toString()).count()<11)
            {binding.viewInput.textSize = 45F}
            else
            {binding.viewInput.textSize = 35F}
                binding.viewInput.text = (main1.toString())}
        }

        if (whichfun == "menha")
        {
            if (sec1 != "")
            {
                main1 = main1 - (sec1.toDouble())
            }
            if((main1.toString()).count()>2) {
                if ((((main1.toString())[(main1.toString()).length-1]).toString()) == "0" && (((main1.toString())[(main1.toString()).length-2]).toString()) == ".")
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString()).dropLast(2)
                }
                else
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString())
                }
            }
            else
            {if((main1.toString()).count()<7)
            {binding.viewInput.textSize = 80F}
            else if((main1.toString()).count()<8)
            {binding.viewInput.textSize = 70F}
            else if((main1.toString()).count()<9)
            {binding.viewInput.textSize = 60F}
            else if((main1.toString()).count()<11)
            {binding.viewInput.textSize = 45F}
            else
            {binding.viewInput.textSize = 35F}
                binding.viewInput.text = (main1.toString())}
        }

        if (whichfun == "jamw")
        {
            if (sec1 != "")
            {
                main1 = main1 + (sec1.toDouble())
            }
            if((main1.toString()).count()>2) {
                if ((((main1.toString())[(main1.toString()).length-1]).toString()) == "0" && (((main1.toString())[(main1.toString()).length-2]).toString()) == ".")
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString()).dropLast(2)
                }
                else
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString())
                }
            }
            else
            {if((main1.toString()).count()<7)
            {binding.viewInput.textSize = 80F}
            else if((main1.toString()).count()<8)
            {binding.viewInput.textSize = 70F}
            else if((main1.toString()).count()<9)
            {binding.viewInput.textSize = 60F}
            else if((main1.toString()).count()<11)
            {binding.viewInput.textSize = 45F}
            else
            {binding.viewInput.textSize = 35F}
                binding.viewInput.text = (main1.toString())}
        }
        sec1 = "";
        justfun = true;
        whichfun = "zarb";
        binding.butti.text = "AC"
    }

    fun buttvvv_Clicked(view: View) {

        if (whichfun == "zarb")
        {
            if (sec1 != "")
            {
                main1 = main1 * (sec1.toDouble())
            }
            if((main1.toString()).count()>2) {
                if ((((main1.toString())[(main1.toString()).length-1]).toString()) == "0" && (((main1.toString())[(main1.toString()).length-2]).toString()) == ".")
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString()).dropLast(2)
                }
                else
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString())
                }
            }
            else
            {if((main1.toString()).count()<7)
            {binding.viewInput.textSize = 80F}
            else if((main1.toString()).count()<8)
            {binding.viewInput.textSize = 70F}
            else if((main1.toString()).count()<9)
            {binding.viewInput.textSize = 60F}
            else if((main1.toString()).count()<11)
            {binding.viewInput.textSize = 45F}
            else
            {binding.viewInput.textSize = 35F}
                binding.viewInput.text = (main1.toString())}
        }

        if (whichfun == "taghsim")
        {
            if (sec1 != "")
            {
                main1 = main1 / (sec1.toDouble())
            }
            if((main1.toString()).count()>2) {
                if ((((main1.toString())[(main1.toString()).length-1]).toString()) == "0" && (((main1.toString())[(main1.toString()).length-2]).toString()) == ".")
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString()).dropLast(2)
                }
                else
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString())
                }
            }
            else
            {if((main1.toString()).count()<7)
            {binding.viewInput.textSize = 80F}
            else if((main1.toString()).count()<8)
            {binding.viewInput.textSize = 70F}
            else if((main1.toString()).count()<9)
            {binding.viewInput.textSize = 60F}
            else if((main1.toString()).count()<11)
            {binding.viewInput.textSize = 45F}
            else
            {binding.viewInput.textSize = 35F}
                binding.viewInput.text = (main1.toString())}
        }

        if (whichfun == "menha")
        {
            if (sec1 != "")
            {
                main1 = main1 - (sec1.toDouble())
            }
            if((main1.toString()).count()>2) {
                if ((((main1.toString())[(main1.toString()).length-1]).toString()) == "0" && (((main1.toString())[(main1.toString()).length-2]).toString()) == ".")
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString()).dropLast(2)
                }
                else
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString())
                }
            }
            else
            {if((main1.toString()).count()<7)
            {binding.viewInput.textSize = 80F}
            else if((main1.toString()).count()<8)
            {binding.viewInput.textSize = 70F}
            else if((main1.toString()).count()<9)
            {binding.viewInput.textSize = 60F}
            else if((main1.toString()).count()<11)
            {binding.viewInput.textSize = 45F}
            else
            {binding.viewInput.textSize = 35F}
                binding.viewInput.text = (main1.toString())}

        }


        if (whichfun == "jamw")
        {
            if (sec1 != "")
            {
                main1 = main1 + (sec1.toDouble())
            }
            if((main1.toString()).count()>2) {
                if ((((main1.toString())[(main1.toString()).length-1]).toString()) == "0" && (((main1.toString())[(main1.toString()).length-2]).toString()) == ".")
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString()).dropLast(2)
                }
                else
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString())
                }
            }
            else
            {if((main1.toString()).count()<7)
            {binding.viewInput.textSize = 80F}
            else if((main1.toString()).count()<8)
            {binding.viewInput.textSize = 70F}
            else if((main1.toString()).count()<9)
            {binding.viewInput.textSize = 60F}
            else if((main1.toString()).count()<11)
            {binding.viewInput.textSize = 45F}
            else
            {binding.viewInput.textSize = 35F}
                binding.viewInput.text = (main1.toString())}
        }
        sec1 = "";
        justfun = true;
        whichfun = "menha";
        binding.butti.text = "AC"
    }

    fun buttvv_Clicked(view: View) {
        if (whichfun == "zarb")
        {
            if (sec1 != "")
            {
                main1 = main1 * (sec1.toDouble())
            }
            if((main1.toString()).count()>2) {
                if ((((main1.toString())[(main1.toString()).length-1]).toString()) == "0" && (((main1.toString())[(main1.toString()).length-2]).toString()) == ".")
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString()).dropLast(2)
                }
                else
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString())
                }
            }
            else
            {if((main1.toString()).count()<7)
            {binding.viewInput.textSize = 80F}
            else if((main1.toString()).count()<8)
            {binding.viewInput.textSize = 70F}
            else if((main1.toString()).count()<9)
            {binding.viewInput.textSize = 60F}
            else if((main1.toString()).count()<11)
            {binding.viewInput.textSize = 45F}
            else
            {binding.viewInput.textSize = 35F}
                binding.viewInput.text = (main1.toString())}
        }

        if (whichfun == "taghsim")
        {
            if (sec1 != "")
            {
                main1 = main1 / (sec1.toDouble())
            }
            if((main1.toString()).count()>2) {
                if ((((main1.toString())[(main1.toString()).length-1]).toString()) == "0" && (((main1.toString())[(main1.toString()).length-2]).toString()) == ".")
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString()).dropLast(2)
                }
                else
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString())
                }
            }
            else
            {if((main1.toString()).count()<7)
            {binding.viewInput.textSize = 80F}
            else if((main1.toString()).count()<8)
            {binding.viewInput.textSize = 70F}
            else if((main1.toString()).count()<9)
            {binding.viewInput.textSize = 60F}
            else if((main1.toString()).count()<11)
            {binding.viewInput.textSize = 45F}
            else
            {binding.viewInput.textSize = 35F}
                binding.viewInput.text = (main1.toString())}
        }

        if (whichfun == "menha")
        {
            if (sec1 != "")
            {
                main1 = main1 - (sec1.toDouble())
            }
            if((main1.toString()).count()>2) {
                if ((((main1.toString())[(main1.toString()).length-1]).toString()) == "0" && (((main1.toString())[(main1.toString()).length-2]).toString()) == ".")
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString()).dropLast(2)
                }
                else
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString())
                }
            }
            else
            {if((main1.toString()).count()<7)
            {binding.viewInput.textSize = 80F}
            else if((main1.toString()).count()<8)
            {binding.viewInput.textSize = 70F}
            else if((main1.toString()).count()<9)
            {binding.viewInput.textSize = 60F}
            else if((main1.toString()).count()<11)
            {binding.viewInput.textSize = 45F}
            else
            {binding.viewInput.textSize = 35F}
                binding.viewInput.text = (main1.toString())}
        }

        if (whichfun == "jamw")
        {
            if (sec1 != "")
            {
                main1 = main1 + (sec1.toDouble())
            }
            if((main1.toString()).count()>2) {
                if ((((main1.toString())[(main1.toString()).length-1]).toString()) == "0" && (((main1.toString())[(main1.toString()).length-2]).toString()) == ".")
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString()).dropLast(2)
                }
                else
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString())
                }
            }
            else
            {if((main1.toString()).count()<7)
            {binding.viewInput.textSize = 80F}
            else if((main1.toString()).count()<8)
            {binding.viewInput.textSize = 70F}
            else if((main1.toString()).count()<9)
            {binding.viewInput.textSize = 60F}
            else if((main1.toString()).count()<11)
            {binding.viewInput.textSize = 45F}
            else
            {binding.viewInput.textSize = 35F}
                binding.viewInput.text = (main1.toString())}
        }
        sec1 = "";
        justfun = true;
        whichfun = "jamw";
        binding.butti.text = "AC"
    }

    fun buttv_Clicked(view: View) {
        if (whichfun == "zarb")
        {
            if (sec1 != "")
            {
                main1 = main1 * (sec1.toDouble())
            }

            if((main1.toString()).count()>2) {
                if ((((main1.toString())[(main1.toString()).length-1]).toString()) == "0" && (((main1.toString())[(main1.toString()).length-2]).toString()) == ".")
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString()).dropLast(2)
                }
                else
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString())
                }
            }
            else
            {if((main1.toString()).count()<7)
            {binding.viewInput.textSize = 80F}
            else if((main1.toString()).count()<8)
            {binding.viewInput.textSize = 70F}
            else if((main1.toString()).count()<9)
            {binding.viewInput.textSize = 60F}
            else if((main1.toString()).count()<11)
            {binding.viewInput.textSize = 45F}
            else
            {binding.viewInput.textSize = 35F}
                binding.viewInput.text = (main1.toString())}
        }

        if (whichfun == "taghsim")
        {
            if (sec1 != "")
            {
                main1 = main1 / (sec1.toDouble())
            }
            if((main1.toString()).count()>2) {
                if ((((main1.toString())[(main1.toString()).length-1]).toString()) == "0" && (((main1.toString())[(main1.toString()).length-2]).toString()) == ".")
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString()).dropLast(2)
                }
                else
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString())
                }
            }
            else
            {if((main1.toString()).count()<7)
            {binding.viewInput.textSize = 80F}
            else if((main1.toString()).count()<8)
            {binding.viewInput.textSize = 70F}
            else if((main1.toString()).count()<9)
            {binding.viewInput.textSize = 60F}
            else if((main1.toString()).count()<11)
            {binding.viewInput.textSize = 45F}
            else
            {binding.viewInput.textSize = 35F}
                binding.viewInput.text = (main1.toString())}
        }

        if (whichfun == "menha")
        {
            if (sec1 != "")
            {
                main1 = main1 - (sec1.toDouble())
            }
            if((main1.toString()).count()>2) {
                if ((((main1.toString())[(main1.toString()).length-1]).toString()) == "0" && (((main1.toString())[(main1.toString()).length-2]).toString()) == ".")
                {   if((main1.toString()).count()<7)
                {binding.viewInput.textSize = 80F}
                else if((main1.toString()).count()<8)
                {binding.viewInput.textSize = 70F}
                else if((main1.toString()).count()<9)
                {binding.viewInput.textSize = 60F}
                else if((main1.toString()).count()<11)
                {binding.viewInput.textSize = 45F}
                else
                {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString()).dropLast(2)
                }
                else
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString())
                }
            }
            else
            {if((main1.toString()).count()<7)
            {binding.viewInput.textSize = 80F}
            else if((main1.toString()).count()<8)
            {binding.viewInput.textSize = 70F}
            else if((main1.toString()).count()<9)
            {binding.viewInput.textSize = 60F}
            else if((main1.toString()).count()<11)
            {binding.viewInput.textSize = 45F}
            else
            {binding.viewInput.textSize = 35F}
                binding.viewInput.text = (main1.toString())}
        }

        if (whichfun == "jamw")
        {
            if (sec1 != "")
            {
                main1 = main1 + (sec1.toDouble())
            }
            if((main1.toString()).count()>2) {
                if ((((main1.toString())[(main1.toString()).length-1]).toString()) == "0" && (((main1.toString())[(main1.toString()).length-2]).toString()) == ".")
                {if((main1.toString()).count()<7)
                {binding.viewInput.textSize = 80F}
                else if((main1.toString()).count()<8)
                {binding.viewInput.textSize = 70F}
                else if((main1.toString()).count()<9)
                {binding.viewInput.textSize = 60F}
                else if((main1.toString()).count()<11)
                {binding.viewInput.textSize = 45F}
                else
                {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString()).dropLast(2)
                }
                else
                {
                    if((main1.toString()).count()<7)
                    {binding.viewInput.textSize = 80F}
                    else if((main1.toString()).count()<8)
                    {binding.viewInput.textSize = 70F}
                    else if((main1.toString()).count()<9)
                    {binding.viewInput.textSize = 60F}
                    else if((main1.toString()).count()<11)
                    {binding.viewInput.textSize = 45F}
                    else
                    {binding.viewInput.textSize = 35F}
                    binding.viewInput.text = (main1.toString())


                }
            }
            else
            {if((main1.toString()).count()<7)
            {binding.viewInput.textSize = 80F}
            else if((main1.toString()).count()<8)
            {binding.viewInput.textSize = 70F}
            else if((main1.toString()).count()<9)
            {binding.viewInput.textSize = 60F}
            else if((main1.toString()).count()<11)
            {binding.viewInput.textSize = 45F}
            else
            {binding.viewInput.textSize = 35F}
                binding.viewInput.text = (main1.toString())}
        }
        sec1 = "";
        justfun = true;
        whichfun = "mosavi";
        binding.butti.text = "AC"
    }
    fun buttx_Clicked(view: View) {
        if ( thisIsTheFirst !=true && sec1 != "")
        { if (justfun) {
            sec1 = "";
        }
            if((sec1.get(0)).toString()!="-")
            {sec1=sec1.replace("+","")
                thetext = "-"}
            else
            {sec1= sec1.replace("-","")
                thetext = "+"}
        sec1 = (thetext.replace(" ", "")) + sec1
            if(sec1.count()<7)
            {binding.viewInput.textSize = 80F}
            else if(sec1.count()<8)
            {binding.viewInput.textSize = 70F}
            else if(sec1.count()<9)
            {binding.viewInput.textSize = 60F}
            else if(sec1.count()<11)
            {binding.viewInput.textSize = 45F}
            else
            {binding.viewInput.textSize = 35F}
            binding.viewInput.text = sec1
        justfun = false
        }
    }


    fun buttdarsad_Clicked(view: View) {
        if (whichfun != "mosavi")
        {if (justfun) {
            sec1 = "";
        }

            if(sec1=="")
            {sec1="0"}
            sec1 = (sec1.toDouble() / 100).toString()
            if(sec1.count()<7)
            {binding.viewInput.textSize = 80F}
            else if(sec1.count()<8)
            {binding.viewInput.textSize = 70F}
            else if(sec1.count()<9)
            {binding.viewInput.textSize = 60F}
            else if(sec1.count()<11)
            {binding.viewInput.textSize = 45F}
            else
            {binding.viewInput.textSize = 35F}
            binding.viewInput.text = sec1
            justfun = false}
    }




}
