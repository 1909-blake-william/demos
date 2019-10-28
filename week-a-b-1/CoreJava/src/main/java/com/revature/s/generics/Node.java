package com.revature.s.generics;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
	private T information;
	private List<Node<T>> children = new ArrayList<>();

	public Node(T information) {
		super();
		this.information = information;
	}

	public Node() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void addChild(Node<T> newNode) {
		children.add(newNode);
	}

	public void remove(Node<T> node) {
		children.remove(node);
	}

	public List<Node<T>> getChildren() {
		return children;
	}

	public T getInformation() {
		return information;
	}

	public void setInformation(T information) {
		this.information = information;
	}

}
