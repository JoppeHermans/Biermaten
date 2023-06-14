package com.example.drinkinggame2.controller;


import com.example.drinkinggame2.Model.Player;
import com.example.drinkinggame2.Model.Tasks;
import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    private ArrayList<Tasks> tasksArrayList;
    private ArrayList<Player> playerArrayList;

    @RequestMapping("/")
    public String index(Model model) {
        return "index";
    }

    @RequestMapping("/inputNumberOfPlayers")
    public String NumberOfPlayers(Model model) {

        return "inputNumberOfPlayers";
    }

    @RequestMapping("/contact")
    public String contact(Model model) {

        return "contact";
    }

    @RequestMapping("/submitNumberOfPlayers")
    public String submitNewPlayer(@RequestParam("numberOfPlayers") int numberOfPlayers, Model model){
        model.addAttribute("numberOfPlayers", numberOfPlayers);

        return "inputNamePage";
    }

    @PostMapping("/submitPlayerNames")
    public String submitPlayerNames(HttpServletRequest request, Model model) {
        String[] playerNames = request.getParameterValues("playerNames");
        model.addAttribute("playerNames", playerNames);
        model.addAttribute("tasks", tasksArrayList);

        return "resultPage";
    }

    private ArrayList<Tasks> filltasks() {
        ArrayList<Tasks> taskList = new ArrayList<>();
        Tasks tasks1 = new Tasks("Drink 1 slok");
        Tasks tasks2 = new Tasks("Drink 2 slokken");
        Tasks tasks3 = new Tasks("Drink 3 slokken");
        Tasks tasks4 = new Tasks("Drink 4 slokken");
        Tasks tasks5 = new Tasks("Drink 5 slokken");
        Tasks tasks6 = new Tasks("Half atje!");
        Tasks tasks7 = new Tasks("Glas Leeg!");
        Tasks tasks8 = new Tasks("Iedereen doet een slok in een beker en jij drinkt het op");
        Tasks tasks9 = new Tasks("Kruip rond een tafel en drink voor elke poot een slok");
        Tasks tasks10 = new Tasks("Vingeren!");
        Tasks tasks11 = new Tasks("Blad steen schaar tegen de persoon links van je, de winnaar drinkt 4 slokken");
        Tasks tasks12 = new Tasks("Blad steen schaar tegen de persoon rechts van je, de winnaar drinkt 4 slokken");
        Tasks tasks13 = new Tasks("Staarwedstrijd tegen de persoon tegenover u, de verliezer drinkt 3 slokken");
        Tasks tasks14 = new Tasks("Pick a mate!");
        Tasks tasks15 = new Tasks("Pick a mate!");
        Tasks tasks16 = new Tasks("Pick a mate!");
        Tasks tasks17 = new Tasks("Floor is lava! Laatste persoon die de grond raakt drinkt 2 slokken");
        Tasks tasks18 = new Tasks("Thumbmaster!");
        Tasks tasks19 = new Tasks("Question Queen");
        Tasks tasks20 = new Tasks("Dicks 6 slokken");
        Tasks tasks21 = new Tasks("chicks 6 slokken");
        Tasks tasks22 = new Tasks("Never have I ever");
        Tasks tasks23 = new Tasks("Rijmen");
        Tasks tasks24 = new Tasks("Categoriën");
        Tasks tasks25 = new Tasks("Duimworstelen, de verliezer drinkt 2 slokken");
        Tasks tasks26 = new Tasks("Alle rokers/vapers 5 slokken");
        Tasks tasks27 = new Tasks("Walvis! de dikste persoon drinkt 4 slokken");
        Tasks tasks28 = new Tasks("Twin Towers! De 2 grootste spelers gaan naast elkaar zitten en zijn maten");
        Tasks tasks29 = new Tasks("Baby tweeling! De 2 kleinste spelers zijn maten en moeten de komende 20 min ingehaakt drinken");
        Tasks tasks30 = new Tasks("Degene met het minste in zijn glas drinkt dit leeg en gaat voor iedereen bier halen");
        Tasks tasks31 = new Tasks("Ga op de bus (6 kaarten)");
        Tasks tasks32 = new Tasks("Je bent de Hoer! roep voor elke keer dat je moet drinken: 'Kzen een Hoer!'");
        Tasks tasks33 = new Tasks("Surfplank! De smalste persoon drinkt 4 slokken");
        Tasks tasks34 = new Tasks("Fietser! Drink 1 slok per persoon die met de fiets gekomen is");
        Tasks tasks35 = new Tasks("Bier halen!");
        Tasks tasks36 = new Tasks("Als er ne cockblokker in de groep is, doe atje vieze naaier");
        Tasks tasks37 = new Tasks("Knapste persoon drinkt 3 slokken. wijzen 3..2..1");
        Tasks tasks38 = new Tasks("Lelijkste persoon drinkt 3 slokken. wijzen 3..2..1");
        Tasks tasks39 = new Tasks("Vertel een grap, drink een slok voor elke persoon die niet lacht");
        Tasks tasks40 = new Tasks("Complimenten ronde! iedereen vertelt een compliment aan de persoon links van hem/haar");
        Tasks tasks41 = new Tasks("Drink een slok voor elke ex");
        Tasks tasks42 = new Tasks("Doe een dansje! De andere spelers mogen dit beoordelen, drink een slok voor elke speler die minder dan 5 op 10 geeft");
        Tasks tasks43 = new Tasks("Iedereen neemt een kaart, degene met de laagste kaart drinkt 3 slokken");
        Tasks tasks44 = new Tasks("Zing een Liedje! De persoon links van je bepaald hoeveel slokken je moet drinken op basis van je zangkunsten");
        Tasks tasks45 = new Tasks("Vuile maagd! De persoon die het laatst op zijn gsm heeft gezeten drinkt 6 slokken");
        Tasks tasks46 = new Tasks("Deel 1 slok uit");
        Tasks tasks47 = new Tasks("Deel 2 slokken uit");
        Tasks tasks48 = new Tasks("Deel 3 slokken uit");
        Tasks tasks49 = new Tasks("Deel 4 slokken uit");
        Tasks tasks50 = new Tasks("Deel 5 slokken uit");
        Tasks tasks51 = new Tasks("Deel 6 slokken uit");
        Tasks tasks52 = new Tasks("Atje!!");
        Tasks tasks53 = new Tasks("Drakentemmer! Degene die de lelijkste persoon gekust heeft drinkt 5 slokken");
        Tasks tasks54 = new Tasks("Truth or Dare");
        Tasks tasks55 = new Tasks("Pistrein! De volgende persoon die gaat pissen drinkt 6 slokken");
        Tasks tasks56 = new Tasks("Doe een imitatie van een beroemdheid. Drink 2 slokken als niemand het raadt.");
        Tasks tasks57 = new Tasks("Vertel een geheim. Als iemand anders het al wist, drink 3 slokken.");
        Tasks tasks58 = new Tasks("Doe een handstand. Als je faalt, drink 4 slokken.");
        Tasks tasks59 = new Tasks("Zing het volkslied. Als je een fout maakt, drink 5 slokken.");
        Tasks tasks60 = new Tasks("Doe een dansje met de persoon rechts van je. Als je faalt, drinken jullie allebei 3 slokken.");
        Tasks tasks61 = new Tasks("Vertel een mop. Drink 2 slokken als niemand lacht.");
        Tasks tasks62 = new Tasks("Doe een imitatie van een dier. Drink 3 slokken als niemand het raadt.");
        Tasks tasks63 = new Tasks("Vertel een gênant verhaal. Drink 4 slokken als iemand anders het al wist.");
        Tasks tasks64 = new Tasks("Doe een radslag. Als je faalt, drink 5 slokken.");
        Tasks tasks65 = new Tasks("Zing een liedje in een andere taal. Als je een fout maakt, drink 6 slokken.");
        Tasks tasks66 = new Tasks("Doe een imitatie van een andere speler. Drink 2 slokken als niemand het raadt.");
        Tasks tasks67 = new Tasks("Vertel een raadsel. Drink 3 slokken als niemand het raadt.");
        Tasks tasks68 = new Tasks("Doe een gek dansje. Drink 4 slokken als niemand meedoet.");
        Tasks tasks69 = new Tasks("Zing een liedje achterstevoren. Als je een fout maakt, drink 5 slokken.");
        Tasks tasks70 = new Tasks("Vertel een verhaal met een plot twist. Drink 6 slokken als niemand verrast is.");
        taskList.add(tasks1);
        taskList.add(tasks2);
        taskList.add(tasks3);
        taskList.add(tasks4);
        taskList.add(tasks5);
        taskList.add(tasks6);
        taskList.add(tasks7);
        taskList.add(tasks8);
        taskList.add(tasks9);
        taskList.add(tasks10);
        taskList.add(tasks11);
        taskList.add(tasks12);
        taskList.add(tasks13);
        taskList.add(tasks14);
        taskList.add(tasks15);
        taskList.add(tasks16);
        taskList.add(tasks17);
        taskList.add(tasks18);
        taskList.add(tasks19);
        taskList.add(tasks20);
        taskList.add(tasks21);
        taskList.add(tasks22);
        taskList.add(tasks23);
        taskList.add(tasks24);
        taskList.add(tasks25);
        taskList.add(tasks26);
        taskList.add(tasks27);
        taskList.add(tasks28);
        taskList.add(tasks29);
        taskList.add(tasks30);
        taskList.add(tasks31);
        taskList.add(tasks32);
        taskList.add(tasks33);
        taskList.add(tasks34);
        taskList.add(tasks35);
        taskList.add(tasks36);
        taskList.add(tasks37);
        taskList.add(tasks38);
        taskList.add(tasks39);
        taskList.add(tasks40);
        taskList.add(tasks41);
        taskList.add(tasks42);
        taskList.add(tasks43);
        taskList.add(tasks44);
        taskList.add(tasks45);
        taskList.add(tasks46);
        taskList.add(tasks47);
        taskList.add(tasks48);
        taskList.add(tasks49);
        taskList.add(tasks50);
        taskList.add(tasks51);
        taskList.add(tasks52);
        taskList.add(tasks53);
        taskList.add(tasks54);
        taskList.add(tasks55);
        taskList.add(tasks56);
        taskList.add(tasks57);
        taskList.add(tasks58);
        taskList.add(tasks59);
        taskList.add(tasks60);
        taskList.add(tasks61);
        taskList.add(tasks62);
        taskList.add(tasks63);
        taskList.add(tasks64);
        taskList.add(tasks65);
        taskList.add(tasks66);
        taskList.add(tasks67);
        taskList.add(tasks68);
        taskList.add(tasks69);
        taskList.add(tasks70);

        return taskList;
    }
    private ArrayList<Player> fillplayer() {
        ArrayList<Player> playerList = new ArrayList<>();

        return playerList;
    }

    @PostConstruct
    private void fillData() {
        tasksArrayList = filltasks();
        playerArrayList = fillplayer();

    }
}


