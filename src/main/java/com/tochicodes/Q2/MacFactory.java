package com.tochicodes.Q2;

public class MacFactory implements GUIFactory{
    public AbstractTextField createTextField()  { return new WinTextField(); }
    public AbstractPushButton createPushButton(){ return new WinPushButton(); }
    public AbstractListBox createListBox()      { return new WinListBox(); }
}
