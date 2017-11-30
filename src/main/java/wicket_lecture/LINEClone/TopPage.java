package wicket_lecture.LINEClone;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.Link;
import wicket_lecture.LINEClone.Ver1.BeanListViewPage;
import wicket_lecture.LINEClone.Ver1.LabelFormPage;
import wicket_lecture.LINEClone.Ver1.ListViewPage;
import wicket_lecture.LINEClone.Ver1.SysOutFormPage;

public class TopPage extends WebPage{

    public TopPage(){

        //一番最初に作る
        Link<Void> linkExample = new Link<Void>("linkExample"){

            @Override
            public void onClick() {
                System.out.println("click!");
            }
        };
        add(linkExample);

        //SysOutFormPageを作る時に追加してください
        Link<Void> toSysOutFormPage = new Link<Void>("toSysOutFormPage") {
            @Override
            public void onClick() {
                setResponsePage(new SysOutFormPage());
            }
        };
        add(toSysOutFormPage);

        //LabelFormPageを作る時に追加してください
        Link<Void> toLabelFormPage = new Link<Void>("toLabelFormPage"){

            @Override
            public void onClick() {
                setResponsePage(new LabelFormPage());
            }
        };
        add(toLabelFormPage);

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
