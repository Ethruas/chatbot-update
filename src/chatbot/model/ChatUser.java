package chatbot.model;

public class ChatUser
{
	private String name;
	private int age;
	private String favoriteMovie;
	private boolean isPierced;
	private boolean isTattooed;
	
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
