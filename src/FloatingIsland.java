import java.awt.*;
import java.awt.image.BufferedImage;

public class FloatingIsland extends GameObject {
    public BufferedImage image;

    public FloatingIsland() {
        super();
        this.position = new Vector2D();
        this.velocity= new Vector2D(50f,0);
    }

    public FloatingIsland(Vector2D position, BufferedImage image, int width, int height) {
        this.position.set(position);
        this.image = image;
        this.width=width;
        this.height=height;;
        this.velocity= new Vector2D(25f,0);
    }

    public void set(FloatingIsland FI){
        this.position = FI.position;
        this.image = FI.image;
        this.width = FI.width;
        this.height = FI.height;
        this.velocity= new Vector2D(100f,0);
    }

    public void run(){
//        if((player.position.x>=this.position.x
//                && player.position.x+25<=this.position.x+this.width
//                && player.position.y+player.height+player.velocity.y>=this.position.y
//                )
//                || (player.position.x+player.width-25>=this.position.x
//                && player.position.x+player.width<=this.position.x+this.width
//                && player.position.y+player.height+player.velocity.y>=this.position.y
//        ) ){
//            player.onIsland=true;
//            //player.templeVelocity.set(new Vector2D(0, this.position.y-player.position.y-height));
//        }

        if (KeyboardInput.instance.isSpace) {
            this.position.subtractBy(this.velocity);
        }
    }

    public void render(Graphics graphics) { graphics.drawImage(this.image, (int) this.position.x, (int) this.position.y, this.width, this.height, null);
    }
}
