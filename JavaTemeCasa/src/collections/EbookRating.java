/*
 * 
 * Class defines ebook rating mechanism 
 * 
 */
package collections;

/**
 * Class defines ebook rating mechanism
 * @author admin
 */
public class EbookRating {
 
    private float stars = 0;
    
    private String userId = "";
    
    private String description = "";

    
    
    public EbookRating(float veverita, String cuc, String parere) {
        stars = veverita;
        userId = cuc;
        description = parere;
    }

    
    
    
    
    

    /**
     * Get the value of description
     *
     * @return the value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the value of description
     *
     * @param description new value of description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Get the value of userId
     *
     * @return the value of userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Set the value of userId
     *
     * @param userId new value of userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }


    /**
     * Get the value of stars
     *
     * @return the value of stars
     */
    public float getStars() {
        return stars;
    }

    /**
     * Set the value of stars
     *
     * @param stars new value of stars
     */
    public void setStars(float stars) {
        this.stars = stars;
    }

}
