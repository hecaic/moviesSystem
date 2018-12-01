package cn.he.model;

import java.io.File;

import org.springframework.web.multipart.MultipartFile;

public class Film {
	/**
	 *  电影iD
	 */
	private int filmId;
	/**
	 * 电影名字
	 */
	private String filmName;
	/**
	 * 电影时长
	 */
	private int filmLong; 
	/**
	 * 电影导演
	 */
	private String director; 
	/**
	 * 电影主演
	 */
	private String actor; 
	/**
	 * 电影类型
	 */
	private String filmType; 
	/**
	 * 电影语言
	 */
	private String filmLanguage; 
	/**
	 * 电影图片
	 */
	private String filmImg; 
	/**
	 * 电影简介
	 */
	private String jianJie; 
	/**
	 *  电影价格
	 */
	private double price; 
	/**
	 * 电影播放影厅
	 */
	private String address; 
	/**
	 *  电影开始时间
	 */
	private String filmState; 
	/**
	 * 2D/3D
	 */
   private String playType;
   
   private String time;
   
	public Film() {
		super();
	}

	
	public int getFilmId() {
		return filmId;
	}

	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}

	public String getFilmName() {
		return filmName;
	}

	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}

	public int getFilmLong() {
		return filmLong;
	}

	public void setFilmLong(int filmLong) {
		this.filmLong = filmLong;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getFilmType() {
		return filmType;
	}

	public void setFilmType(String filmType) {
		this.filmType = filmType;
	}

	public String getFilmLanguage() {
		return filmLanguage;
	}

	public void setFilmLanguage(String filmLanguage) {
		this.filmLanguage = filmLanguage;
	}

	public String getFilmImg() {
		return filmImg;
	}

	public void setFilmImg(String filmImg) {
		this.filmImg = filmImg;
	}

	public String getJianJie() {
		return jianJie;
	}

	public void setJianJie(String jianJie) {
		this.jianJie = jianJie;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFilmState() {
		return filmState;
	}

	public void setFilmState(String filmState) {
		this.filmState = filmState;
	}

	private MultipartFile file ;//文件
	 private String fileName;//文件名
	 
	  public void setFile(MultipartFile file) {
	        this.file = file;
	    }
	    public MultipartFile getFile() {
	        return file;
	    }
	

	    public void setFileName(String fileName) {
	        this.fileName = fileName;
	    }
	    public String getFileName() {
	        return fileName;
	    }


		public String getPlayType() {
			return playType;
		}


		public void setPlayType(String playType) {
			this.playType = playType;
		}


		public String getTime() {
			return time;
		}


		public void setTime(String time) {
			this.time = time;
		}
  
}
