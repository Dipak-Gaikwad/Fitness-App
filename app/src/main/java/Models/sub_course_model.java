package Models;

public class sub_course_model
{
    int pic;
    int text;

    public sub_course_model(int pic, int text) {
        this.pic = pic;
        this.text = text;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public int getText() {
        return text;
    }

    public void setText(int text) {
        this.text = text;
    }
}
