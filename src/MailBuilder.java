public class MailBuilder
{
    public MailBuild AddRecivier(String recivier) throws Exception
    {
        if(recivier != null) {
            return new MailBuild(recivier);
        } else {
            throw new Exception("Нет данных о пользователе");
        }
    }
    public static class MailBuild
    {
        private String recivier;
        public MailBuild(String recivier)
        {
            this.recivier = recivier;
        }
        public FinalMailBuilder AddBody(String body) throws Exception {
            if(body != null){
                return new FinalMailBuilder (recivier , body);
            } else {
                throw new Exception("Нет тела сообщения");
            }
        }
    }
    public static class FinalMailBuilder
    {
        private String recivier;
        private String body;
        private String theme = "";
        public FinalMailBuilder(String recivier , String body)
        {
            this.recivier = recivier;
            this.body = body;
        }
        public FinalMailBuilder AddTheme(String theme)
        {
            this.theme = theme;
            return this;
        }
        public FinalMailBuilder AddNewRecivier(String recivier)
        {
            this.recivier += " " + recivier;
            return this;
        }
        public String Build()
        {
            return "" + recivier + "\n" + theme + "\n" + body;
        }
    }

}