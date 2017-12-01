package wicket_lecture.LINEClone;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.Link;
import wicket_lecture.LINEClone.Ver1.BeanListViewPage;
import wicket_lecture.LINEClone.Ver1.LabelFormPage;
import wicket_lecture.LINEClone.Ver1.ListViewPage;
import wicket_lecture.LINEClone.Ver1.SysOutFormPage;

public class TopPage extends WebPage{

    public TopPage(){

        //最初はここから
        Link<Void> linkExample = new Link<Void>("linkExample"){

            @Override
            public void onClick() {
                System.out.println("click!");
            }
        };
        add(linkExample);
        //ここまで

        //SysOutFormPageを作る時に追加 ここから
        Link<Void> toSysOutFormPage = new Link<Void>("toSysOutFormPage") {
            @Override
            public void onClick() {
                setResponsePage(new SysOutFormPage());
            }
        };
        add(toSysOutFormPage);
        //ここまで

        //LabelFormPageを作る時に追加　ここまで
        Link<Void> toLabelFormPage = new Link<Void>("toLabelFormPage"){

            @Override
            public void onClick() {
                setResponsePage(new LabelFormPage());
            }
        };
        add(toLabelFormPage);
        //ここまで

        //ListViewPageを作る時に追加　ここから
        Link<Void> toListViewPage = new Link<Void>("toListViewPage"){

            @Override
            public void onClick() {
                setResponsePage(new ListViewPage());
            }
        };
        add(toListViewPage);
        //ここまで

        //BeanListViewPageを作る時に追加 ここから
        Link<Void> toBeanListViewPage = new Link<Void>("toBeanListViewPage"){

            @Override
            public void onClick() {
                setResponsePage(new BeanListViewPage());
            }
        };
        add(toBeanListViewPage);
        //ここまで
    }

}
