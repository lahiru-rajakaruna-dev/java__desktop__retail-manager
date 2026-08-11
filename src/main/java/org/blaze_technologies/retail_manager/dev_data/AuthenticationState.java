package org.blaze_technologies.retail_manager.dev_data;

public class AuthenticationState {
	private static boolean AuthState;
	private static String LoggedInUserName;

	public static void login(String userName, String password) {
		LoggedInUserName = userName;
		AuthState = true;
	}

	public static void logOut() {
		AuthState = false;
	}

	public static boolean isAuthed() {
		return AuthState;
	}
}
