import java.awt.*;
import java.awt.image.BufferedImage;

public class FloatingIsland extends GameObject {
    public BufferedImage image;
    public int width;
    public int height;
    //public BoxCollider boxCollider;

    public FloatingIsland() {
        super();
    }

    public FloatingIsland(Vector2D position, BufferedImage image, int width, int height) {
        this.position.set(position);
        this.image = image;
        this.width=width;
        this.height=height;
        //this.boxCollider = new BoxCollider(width, height);
    }

    public void run(Player player){
        if((player.position.x>=this.position.x
                && player.position.x+25<=this.position.x+this.width
                && player.position.y+player.height+player.velocity.y>=this.position.y
                )
                || (player.position.x+player.width-25>=this.position.x
                && player.position.x+player.width<=this.position.x+this.width
                && player.position.y+player.height+player.velocity.y>=this.position.y
        ) ){
            player.onIsland=true;
            //player.templeVelocity.set(new Vector2D(0, this.position.y-player.position.y-height));
        }
    }

    public void render(Graphics graphics) { graphics.drawImage(this.image, (int) this.position.x, (int) this.position.y, this.width, this.height, null);
    }
}
