public class main extends MailBuilder {
    public static void main(String []arg) throws Exception {
        MailBuilder mailBuild = new MailBuilder();
        String mail = mailBuild.AddRecivier("Владимир")
                .AddBody("Это текст данного сообщения")
                .AddTheme("Тема сообщения")
                .AddNewRecivier("Олежа")
                .Build();
        System.out.println(mail);
    }
}