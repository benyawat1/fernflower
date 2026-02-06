package org.jetbrains.java.decompiler.main;

public class ClassNode {
  public static final int CLASS_ROOT = 0;
  
  public int type;
  public String name;

  public ClassNode(int type, String name) {
    this.type = type;
    this.name = name;
  }
}