//Title: Bubble
//        Abstract: To sort user data and check for plagiarism a microblog
//        Author: Trinity Stallworth
//        Date: September 15, 2023
public class Bubble
{
    private String emoticon;
    private String name;
    private String username;
    private boolean verified;
    private String bubbleText;
    private BubbleDate date;
    private static int numBubbles = 0;
    private static int numFakeBubbles = 0;

    public Bubble(String emoticon, String name, String username, Boolean verified)
    {
        this.name = name;
        this.username = username;
        this.emoticon = emoticon;
        this.verified = verified;
    }

    //should also check the length of the bubble
    public void setBText(String bubbleText)
    {
        StringBuilder Text = new StringBuilder(bubbleText);
        if (bubbleText.length() > 140)
        {
            Text.setLength(137);
            bubbleText = Text + "...";
        }
        this.bubbleText = bubbleText;
        numBubbles++;
    }

    public void setDate(BubbleDate date) {
        this.date = date;
    }
    public String getEmoticon() {
        return emoticon;
    }
    public void setEmoticon(String emoticon) {
        this.emoticon = emoticon;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public boolean isVerified() {
        return verified;
    }
    public void setVerified(boolean verified) {
        this.verified = verified;
    }
    public String getBubbleText() {
        return bubbleText;
    }


    public String toString()
    {
        if (verified)
        {
            return getEmoticon() + " " + getName() + " ✓ " + "@" + getUsername() +"\n" + getBubbleText() + "\n"+ getDate() +"\n";
        }
        else
        {
            return getEmoticon() + " " + getName() + " @" + getUsername() +"\n" + getBubbleText() + "\n"+ getDate()+ "\n";
        }

    }

    public BubbleDate getDate() {
        return date;
    }


    public boolean equals(Bubble otherBubble)
    {
        if (bubbleText.equals(otherBubble.bubbleText))
        {
            return true;
        } else
        {
            return false;
        }
    }

    public static int getNumBubbles() {
        return numBubbles;
    }

    public static int getNumFakeBubbles()
    {
        return numFakeBubbles;
    }
    public void plagiarismCheck(Bubble otherBubble)
    {
        if (equals(otherBubble))
        {
            numFakeBubbles++;
            numBubbles--;
            otherBubble.bubbleText = ("[Plagiarism detected. Text removed.]");
        }
    }

}
