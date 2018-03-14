package com.example.domowe19c;

import java.util.ArrayList;
import java.util.List;

public class PalindromDatabase{

private List<Palindrom> palindromsDB;

public PalindromDatabase(){
	palindromsDB = new ArrayList<>();
}

public List<Palindrom> getPalindromsDB(){
		return palindromsDB;
	}

}