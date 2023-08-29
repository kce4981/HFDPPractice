package src.HFDPPractice.Chpt2;

public class Entry {
    public static void main(String[] args) {
        NewsAgent newsAgent = new NewsAgent();
        Quote quote = new Quote();
        Forecast forecast = new Forecast();

        quote.subscribe(newsAgent);
        forecast.subscribe(newsAgent);


        int d = 1;
        System.out.println("=================");
        System.out.println("Day 1.");
        System.out.println("----");
        newsAgent.setData(d);

        System.out.println("=================");
        System.out.println("Day 2. Quote channel is laid off by the newsAgent due to financial issues");
        System.out.println("----");
        d++;
        quote.unSubscribe();
        newsAgent.setData(d);

        System.out.println("=================");
        System.out.println("Day 3. Even forecast crew got laid off :(");
        System.out.println("----");
        d++;
        forecast.unSubscribe();
        newsAgent.setData(d);

        System.out.println("=================");
        System.out.println("Day 4. forecast and quote channel was reemployed after BroadcastCompany acquired NewsAgent");
        System.out.println("----");
        BroadcastCompany broadcastCompany = new BroadcastCompany();
        quote.subscribe(broadcastCompany);
        forecast.subscribe(broadcastCompany);
        d++;
        broadcastCompany.setData(d);

        System.out.println("=================");
        System.out.println("Day 5. To compensate the revenue loss, the Broadcast company decided to allow commercials be played");
        System.out.println("----");
        HotDogCommerial hotDogCommerial = new HotDogCommerial();
        hotDogCommerial.subscribe(broadcastCompany);
        d++;
        broadcastCompany.setData(d);

    }
}
