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


public class ImageCompositor {

    public ImageCompositor(){
        List<MarvinImage> images = new ArrayList<MarvinImage>();

        for(int i=1; i <=3; i++){
            images.add(MarvinImageIO.loadImage("/home/mhallot/IdeaProjects/memebot9000/res/0"+ i+ ".jpg"));
        }

        MarvinImagePlugin merge = MarvinPluginLoader.loadImagePlugin("org.marvinproject.image.combine.mergePhotos");
        merge.setAttribute("threshhold", 38);

        MarvinImage output = images.get(0).clone();
        merge.process(images,output);
        MarvinImageIO.saveImage(output, "/res/merge_output.jpg");
    }

}

