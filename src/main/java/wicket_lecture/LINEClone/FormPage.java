package wicket_lecture.LINEClone;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;

public class FormPage extends WebPage{

    public FormPage(){
        IModel<String> bodyModel = Model.of("");

        Form<Void> form = new Form<>("form");
        add(form);

        TextField<String> bodyField = new TextField<>("bodyField", bodyModel);
        form.add(bodyField);

        Label bodyLabel = new Label("body", bodyModel);
        add(bodyLabel);
    }
}
