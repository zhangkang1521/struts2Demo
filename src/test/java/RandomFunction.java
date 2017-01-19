import freemarker.template.TemplateMethodModel;
import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModelException;

import java.util.List;
import java.util.Random;

/**
 * 生成随机数函数
 */
public class RandomFunction implements TemplateMethodModelEx {

    final static Random rnd_seed = new Random(System.currentTimeMillis());


    @SuppressWarnings("unchecked")
    public Object exec(List args) throws TemplateModelException {
        return rnd_seed.nextInt(Integer.parseInt(args.get(0).toString()));
    }

}