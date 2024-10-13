package by.tms.instaclone.storage;

import java.util.regex.Pattern;

public class KeeperConstants {
    public static final String CURRENT_USER_ATTRIBUTE = "currentUser";

    public static final String LF = "\n";
    public static final String SEPARATOR_CSV = ";";
    public static final String SLAGE = "/";
    public static final String BEGINNING_WORK_MESSAGE_TEMPLATE = "'%s' has started working";
    public static final String ENDING_WORK_MESSAGE_TEMPLATE = "'%s' completed the operation";
    public static final String LOGGER_MESSAGE_TEMPLATE = "%s -- %s" + LF;
    public static final String ERROR_TEMPLATE = "ERROR: %s";
    public static final String ERROR_IO_FILE_TEMPLATE = "there was a problem when reading the '%s' file";
    public static final String USERS_CSV_FILE = "csv/users.csv";
    public static final String COMMENTS_CSV_FILE = "csv/comments.csv";
    public static final String REACTIONS_CSV_FILE = "csv/reactions.csv";
    public static final String PHOTOS_CSV_FILE = "csv/photos.csv";
    public static final String PATH_TO_PHOTOS = KeeperConstants.class.getProtectionDomain().getCodeSource().getLocation().getPath().concat("photos/").substring(1);
    public static final String POSTS_CSV_FILE = "csv/posts.csv";
    public static final String SUBSCRIPTIONS_CSV_FILE = "csv/subscriptions.csv";
    public static final String LOGS_FILE = "logs/logs.txt";

    public static final String USERS_CSV_FORMAT_TEMPLATE = "%s" + SEPARATOR_CSV + "%s" + SEPARATOR_CSV + "%s" + SEPARATOR_CSV + "%s" + SEPARATOR_CSV + "%s" + SEPARATOR_CSV + LF;
    public static final String POSTS_CSV_FORMAT_TEMPLATE = "%s" + SEPARATOR_CSV + "%s" + SEPARATOR_CSV + "%s" + SEPARATOR_CSV + "%s" + SEPARATOR_CSV + LF;
    public static final String PHOTO_CSV_FORMAT_TEMPLATE = "%s" + SEPARATOR_CSV + "%s" + SEPARATOR_CSV + "%s" + SEPARATOR_CSV + "%s" + SEPARATOR_CSV + LF;
    public static final String SUBSCRIPTIONS_CSV_FORMAT_TEMPLATE = "%s" + SEPARATOR_CSV + "%s" + SEPARATOR_CSV + "%s" + SEPARATOR_CSV + "%s" + SEPARATOR_CSV + LF;
    public static final String COMMENTS_CSV_FORMAT_TEMPLATE = "%s" + SEPARATOR_CSV + "%s" + SEPARATOR_CSV + "%s" + SEPARATOR_CSV + "%s" + SEPARATOR_CSV + "%s" + SEPARATOR_CSV + LF;
    public static final String REACTIONS_CSV_FORMAT_TEMPLATE = "%s" + SEPARATOR_CSV + "%s" + SEPARATOR_CSV + "%s" + SEPARATOR_CSV + "%s" + SEPARATOR_CSV + "%s" + SEPARATOR_CSV + LF;
    public static final String DATE_TIME_LOGGER_TEMPLATE = "dd/MM/yyyy HH:mm:ss";
    public static final String DATE_TIME_CREATE_POST_TEMPLATE = "dd/MM/yyyy, HH:mm:ss";

    public static final String HOME_JSP = "/pages/home.jsp";
    public static final String HOME_USER_JSP = "/pages/homePageUser.jsp";
    public static final String REGISTRATION_JSP = "/pages/registration.jsp";
    public static final String PROFILE_JSP = "/pages/profile.jsp";
    public static final String LOGIN_JSP = "/pages/login.jsp";
    public static final String NEW_POST_JSP = "/pages/newPost.jsp";

    public static final String REGISTRATION_PATH = "/reg";
    public static final String LOGIN_PATH = "/login";
    public static final String USER_HOME_PATH = "/user/home";
    public static final String USER_NEW_POST_PATH = "/user/newPost";
    public static final String USER_LOGOUT_PATH = "/user/logout";
    public static final String USER_PROFILE_PATH = "/user/profile/*";


    public static final Pattern NAME_REGEX = Pattern.compile("^[a-zA-Z]{2,15}$");
    public static final Pattern USERNAME_REGEX = Pattern.compile("^[a-zA-Z0-9]{2,15}$");
    public static final Pattern PASSWORD_REGEX = Pattern.compile("([a-zA-Z0-9!@$%^&*()_\\-+]){8,}");

    // todo сделать присвоение из файла настройки
    public static final boolean IS_PERFORM_LOGGING = true;
    public static final boolean IS_PERFORM_FILE_LOGGING = true;
}
