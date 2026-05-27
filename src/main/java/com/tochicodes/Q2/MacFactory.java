package com.tochicodes.Q2;

public class MacFactory implements GUIFactory{
    public AbstractTextField createTextField()  { return new MacTextField(); }
    public AbstractPushButton createPushButton(){ return new MacPushButton(); }
    public AbstractListBox createListBox()      { return new MacListBox(); }
}
