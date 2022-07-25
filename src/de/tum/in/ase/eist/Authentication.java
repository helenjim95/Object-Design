public interface Authentication {
    abstract boolean login(String, Map<LoginRequestType, String>)
}