package view;

public interface View {
	String getUserRequest();
	void start(String userRequest);
	void display(String fileName);
}
