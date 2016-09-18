/**
 * Created by mhallot on 8/25/16.
 */

//java native libraires
import java.util.ArrayList;
import java.util.List;


//marvin libraies
import marvin.image.MarvinImage;
import marvin.io.MarvinImageIO;
import marvin.plugin.MarvinImagePlugin;
import marvin.util.MarvinPluginLoader;

//twitter4j imports
import twitter4j.*;


public class ImageCompositor {

    public ImageCompositor(){

        // 1. load images 01.jpg, 02.jpg, ..., 05.jpg into a List
        List<MarvinImage> images = new ArrayList<MarvinImage>();
        for(int i=1; i<=3; i++){
            images.add(MarvinImageIO.loadImage("./res/0"+i+".jpg"));
        }

        // 2. Load plug-in and process the image
        MarvinImagePlugin merge = MarvinPluginLoader.loadImagePlugin("org.marvinproject.image.combine.mergePhotos");
        merge.setAttribute("threshold", 38);

        // 3. Process the image list and save the output
        MarvinImage output = images.get(0).clone();
        merge.process(images, output);
        MarvinImageIO.saveImage(output, "./res/merge_output.jpg");
    }

    public void getMediaFiles() throws TwitterException {


    }
}

