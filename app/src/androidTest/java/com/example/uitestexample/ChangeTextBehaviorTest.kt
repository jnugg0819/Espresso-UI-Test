package com.example.uitestexample

import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import org.hamcrest.Matchers.allOf
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ChangeTextBehaviorTest{

    private lateinit var stringToBetyped:String

    @get:Rule
    var activityRule:ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)
    //var activityRule2:ActivityTestRule<Example> = ActivityTestRule(Example::class.java)

    @Before
    fun initValidString(){
        stringToBetyped="Espresso"
    }

    @Test
    fun changeText_sameActivity(){
        onView(withId(R.id.editText)).perform(typeText(stringToBetyped), ViewActions.closeSoftKeyboard())
        onView(withId(R.id.button)).perform(click())

        onView(withId(R.id.textView2)).check(matches(withText(stringToBetyped)))


    }

    @Test
    fun testChangeText_sameActivity(){
        onView(withId(R.id.editText)).perform(typeText(stringToBetyped), ViewActions.closeSoftKeyboard())
        onView(withId(R.id.button)).perform(click())
    }

    @Test
    fun check_buttonText(){
        onView(allOf(withId(R.id.button), withText("화면 이동")))
    }

}