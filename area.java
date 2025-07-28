class room {
    float length;
    float width;    
    void get(float l, float w) {
        length = l;
        width = w;
    }
}
public class area {
    public static void main(String a[]) {
        room r = new room();
        r.get(5.0f, 3.0f);
        float area = r.length * r.width;
        System.out.println("Area of the room is: " + area);
    }

    
        
    }
                          


