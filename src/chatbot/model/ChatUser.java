package chatbot.model;
/**
 * Checks the various properties of the user of the chatbot application.
 * What the person's name is, how old they are what their favorite movie is,
 * and whether or not they are pierced or have a tattoo.
 */
public class ChatUser
{
	private String name;
	private int age;
	private String favoriteMovie;
	private boolean isPierced;
	private boolean isTattooed;
	/**
	 * The getters and setters of values specified above. This allows the program to read
	 * the information and return it to application to be displayed.
	 */
	public ChatUser()
	{
		
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getFavoriteMovie()
	{
		return favoriteMovie;
	}

	public void setFavoriteMovie(String favoriteMovie)
	{
		this.favoriteMovie = favoriteMovie;
	}

	public boolean isPierced()
	{
		return isPierced;
	}

	public void setPierced(boolean isPierced)
	{
		this.isPierced = isPierced;
	}

	public boolean isTattooed()
	{
		return isTattooed;
	}

	public void setTattooed(boolean isTattooed)
	{
		this.isTattooed = isTattooed;
	}
}
