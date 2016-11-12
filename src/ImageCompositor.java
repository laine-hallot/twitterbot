/**
 * Created by mhallot on 8/25/16.
 */



//marvin libraies
import marvin.image.MarvinImage;
import marvin.io.MarvinImageIO;
import marvin.plugin.MarvinImagePlugin;
import marvin.util.MarvinPluginLoader;

//twitter4j imports
import twitter4j.*;


public class ImageCompositor {

    private MarvinImage image,backupImage;
    private MarvinImagePlugin imagePlugin;

    public ImageCompositor(){
        loadImage();
        effect();
        saveImage();

    }

    private void loadImage(){
        image = MarvinImageIO.loadImage("/home/meyerhallot/IdeaProjects/memebot9000/res/01.jpg");
        backupImage = image.clone();
    }

    private void effect(){
        imagePlugin = MarvinPluginLoader.loadImagePlugin("org.marvinproject.image.color.invert.jar");
        imagePlugin.process(image, image);
    }

    private void saveImage(){
        MarvinImageIO.saveImage(image,"/home/meyerhallot/IdeaProjects/memebot9000/res/01Test.jpg");
    }

    public void getMediaFiles() throws TwitterException {


    }
}

