package db;

//Exception personalizada para caso tenha erro ao abrir o BD
public class DbException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DbException (String msg) {
		super(msg);
	}
}
