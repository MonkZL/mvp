package zl.com.myapplication.bean;

import java.util.List;

/**
 * Created by Mon on 2016/11/29.
 */
public class Person {


    /**
     * list : [{"children":[{"children":[],"icon":"http://cdn.img.028tg.cn/system/20160825/1794bdd5-a220-4fbe-b4ed-e797dd966b55.jpg@200w_200h_100Q_100sh.jpg","itemCateId":50006843,"keywords":"休闲鞋","title":"休闲鞋"},{"children":[],"icon":"http://cdn.img.028tg.cn/system/20160830/59b7c1c6-937a-4bbb-8f80-be2b38ae9124.jpg@200w_200h_100Q_100sh.jpg","itemCateId":50006843,"keywords":"新款","title":"新款上线"},{"children":[],"icon":"http://cdn.img.028tg.cn/system/20160814/cb70482a-795b-40b7-80ee-7ab9bb605218.jpg@200w_200h_100Q_100sh.jpg","itemCateId":50012027,"keywords":"低帮鞋","title":"低帮鞋"},{"children":[],"icon":"http://cdn.img.028tg.cn/system/20160918/e42f6d5f-133f-4034-bf02-0b2a58e160cd.png@200w_200h_100Q_100sh.jpg","itemCateId":50012032,"keywords":"","title":"凉鞋"},{"children":[],"icon":"http://cdn.img.028tg.cn/system/20160902/8d428d3f-7d96-4fc3-bbe4-ac5447544cfb.jpg@200w_200h_100Q_100sh.jpg","itemCateId":50012033,"keywords":"人字拖","title":"人字拖"},{"children":[],"icon":"http://cdn.img.028tg.cn/system/20160902/8d428d3f-7d96-4fc3-bbe4-ac5447544cfb.jpg@200w_200h_100Q_100sh.jpg","itemCateId":50006843,"keywords":"豆豆鞋","title":"豆豆鞋"},{"children":[],"icon":"http://cdn.img.028tg.cn/system/20160902/8d428d3f-7d96-4fc3-bbe4-ac5447544cfb.jpg@200w_200h_100Q_100sh.jpg","itemCateId":50006843,"keywords":"乐福鞋","title":"乐福鞋"},{"children":[],"icon":"http://cdn.img.028tg.cn/system/20160814/cb70482a-795b-40b7-80ee-7ab9bb605218.jpg@200w_200h_100Q_100sh.jpg","itemCateId":50006843,"keywords":"松糕鞋","title":"松糕鞋"},{"children":[],"icon":"http://cdn.img.028tg.cn/system/20160814/cb70482a-795b-40b7-80ee-7ab9bb605218.jpg@200w_200h_100Q_100sh.jpg","itemCateId":50006843,"keywords":"平底鞋","title":"平底鞋"},{"children":[],"icon":"http://cdn.img.028tg.cn/system/20160804/d3ba452c-b256-4b64-ab01-972ff8a46ef0.jpg@200w_200h_100Q_100sh.jpg","itemCateId":50006843,"keywords":"高跟鞋","title":"高跟鞋"},{"children":[],"icon":"http://cdn.img.028tg.cn/system/20160825/1794bdd5-a220-4fbe-b4ed-e797dd966b55.jpg@200w_200h_100Q_100sh.jpg","itemCateId":50006843,"keywords":"板鞋","title":"板鞋"},{"children":[],"icon":"http://cdn.img.028tg.cn/system/20160804/541bba26-a25f-416b-87bb-cdff8c16b0b8.jpg@200w_200h_100Q_100sh.jpg","itemCateId":50006843,"keywords":"布洛克","title":"布洛克"},{"children":[],"icon":"http://cdn.img.028tg.cn/system/20160823/613eab59-00c4-4995-b987-c80273bb0f9f.jpg@200w_200h_100Q_100sh.jpg","itemCateId":50006843,"keywords":"懒人鞋","title":"懒人鞋"},{"children":[],"icon":"http://cdn.img.028tg.cn/system/20160817/cf829bf5-b268-403b-a692-aeae036b3f3a.jpg@200w_200h_100Q_100sh.jpg","itemCateId":50006843,"keywords":"罗马鞋","title":"罗马鞋"}],"icon":"http://cdn.img.028tg.cn/system/20160830/59b7c1c6-937a-4bbb-8f80-be2b38ae9124.jpg@200w_200h_100Q_100sh.jpg","itemCateId":50006843,"keywords":"","title":"时尚女鞋"}]
     * success : true
     */

    private boolean success;
    /**
     * children : [{"children":[],"icon":"http://cdn.img.028tg.cn/system/20160825/1794bdd5-a220-4fbe-b4ed-e797dd966b55.jpg@200w_200h_100Q_100sh.jpg","itemCateId":50006843,"keywords":"休闲鞋","title":"休闲鞋"},{"children":[],"icon":"http://cdn.img.028tg.cn/system/20160830/59b7c1c6-937a-4bbb-8f80-be2b38ae9124.jpg@200w_200h_100Q_100sh.jpg","itemCateId":50006843,"keywords":"新款","title":"新款上线"},{"children":[],"icon":"http://cdn.img.028tg.cn/system/20160814/cb70482a-795b-40b7-80ee-7ab9bb605218.jpg@200w_200h_100Q_100sh.jpg","itemCateId":50012027,"keywords":"低帮鞋","title":"低帮鞋"},{"children":[],"icon":"http://cdn.img.028tg.cn/system/20160918/e42f6d5f-133f-4034-bf02-0b2a58e160cd.png@200w_200h_100Q_100sh.jpg","itemCateId":50012032,"keywords":"","title":"凉鞋"},{"children":[],"icon":"http://cdn.img.028tg.cn/system/20160902/8d428d3f-7d96-4fc3-bbe4-ac5447544cfb.jpg@200w_200h_100Q_100sh.jpg","itemCateId":50012033,"keywords":"人字拖","title":"人字拖"},{"children":[],"icon":"http://cdn.img.028tg.cn/system/20160902/8d428d3f-7d96-4fc3-bbe4-ac5447544cfb.jpg@200w_200h_100Q_100sh.jpg","itemCateId":50006843,"keywords":"豆豆鞋","title":"豆豆鞋"},{"children":[],"icon":"http://cdn.img.028tg.cn/system/20160902/8d428d3f-7d96-4fc3-bbe4-ac5447544cfb.jpg@200w_200h_100Q_100sh.jpg","itemCateId":50006843,"keywords":"乐福鞋","title":"乐福鞋"},{"children":[],"icon":"http://cdn.img.028tg.cn/system/20160814/cb70482a-795b-40b7-80ee-7ab9bb605218.jpg@200w_200h_100Q_100sh.jpg","itemCateId":50006843,"keywords":"松糕鞋","title":"松糕鞋"},{"children":[],"icon":"http://cdn.img.028tg.cn/system/20160814/cb70482a-795b-40b7-80ee-7ab9bb605218.jpg@200w_200h_100Q_100sh.jpg","itemCateId":50006843,"keywords":"平底鞋","title":"平底鞋"},{"children":[],"icon":"http://cdn.img.028tg.cn/system/20160804/d3ba452c-b256-4b64-ab01-972ff8a46ef0.jpg@200w_200h_100Q_100sh.jpg","itemCateId":50006843,"keywords":"高跟鞋","title":"高跟鞋"},{"children":[],"icon":"http://cdn.img.028tg.cn/system/20160825/1794bdd5-a220-4fbe-b4ed-e797dd966b55.jpg@200w_200h_100Q_100sh.jpg","itemCateId":50006843,"keywords":"板鞋","title":"板鞋"},{"children":[],"icon":"http://cdn.img.028tg.cn/system/20160804/541bba26-a25f-416b-87bb-cdff8c16b0b8.jpg@200w_200h_100Q_100sh.jpg","itemCateId":50006843,"keywords":"布洛克","title":"布洛克"},{"children":[],"icon":"http://cdn.img.028tg.cn/system/20160823/613eab59-00c4-4995-b987-c80273bb0f9f.jpg@200w_200h_100Q_100sh.jpg","itemCateId":50006843,"keywords":"懒人鞋","title":"懒人鞋"},{"children":[],"icon":"http://cdn.img.028tg.cn/system/20160817/cf829bf5-b268-403b-a692-aeae036b3f3a.jpg@200w_200h_100Q_100sh.jpg","itemCateId":50006843,"keywords":"罗马鞋","title":"罗马鞋"}]
     * icon : http://cdn.img.028tg.cn/system/20160830/59b7c1c6-937a-4bbb-8f80-be2b38ae9124.jpg@200w_200h_100Q_100sh.jpg
     * itemCateId : 50006843
     * keywords :
     * title : 时尚女鞋
     */

    private List<ListBean> list;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        private String icon;
        private int itemCateId;
        private String keywords;
        private String title;
        /**
         * children : []
         * icon : http://cdn.img.028tg.cn/system/20160825/1794bdd5-a220-4fbe-b4ed-e797dd966b55.jpg@200w_200h_100Q_100sh.jpg
         * itemCateId : 50006843
         * keywords : 休闲鞋
         * title : 休闲鞋
         */

        private List<ChildrenBean> children;

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public int getItemCateId() {
            return itemCateId;
        }

        public void setItemCateId(int itemCateId) {
            this.itemCateId = itemCateId;
        }

        public String getKeywords() {
            return keywords;
        }

        public void setKeywords(String keywords) {
            this.keywords = keywords;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<ChildrenBean> getChildren() {
            return children;
        }

        public void setChildren(List<ChildrenBean> children) {
            this.children = children;
        }

        public static class ChildrenBean {
            private String icon;
            private int itemCateId;
            private String keywords;
            private String title;
            private List<?> children;

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public int getItemCateId() {
                return itemCateId;
            }

            public void setItemCateId(int itemCateId) {
                this.itemCateId = itemCateId;
            }

            public String getKeywords() {
                return keywords;
            }

            public void setKeywords(String keywords) {
                this.keywords = keywords;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public List<?> getChildren() {
                return children;
            }

            public void setChildren(List<?> children) {
                this.children = children;
            }
        }
    }
}
