package wicket_lecture.LINEClone;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.Link;
import wicket_lecture.LINEClone.Ver1.BeanListViewPage;
import wicket_lecture.LINEClone.Ver1.FormPage;
import wicket_lecture.LINEClone.Ver1.ListViewPage;

public class TopPage extends WebPage{

    public TopPage(){

        Link<Void> linkExample = new Link<Void>("linkExample"){

            @Override
            public void onClick() {
                System.out.println("click!");
            }
        };
        add(linkExample);


        //FormPageを作る時に追加してください
        Link<Void> toFormPage = new Link<Void>("toFormPage"){

            @Override
            public void onClick() {
                setResponsePage(new FormPage());
            }
        };
        add(toFormPage);

        //ListViewPageを作る時に追加してください
        Link<Void> toListViewPage = new Link<Void>("toListViewPage"){

            @Override
            public void onClick() {
                setResponsePage(new ListViewPage());
            }
        };
        add(toListViewPage);

        //BeanListViewPageを作る時に追加してください
        Link<Void> toBeanListViewPage = new Link<Void>("toBeanListViewPage"){

            @Override
            public void onClick() {
                setResponsePage(new BeanListViewPage());
            }
        };
        add(toBeanListViewPage);
    }

}
