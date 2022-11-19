package com.android.example.recyclerview

import androidx.lifecycle.ViewModel

class CityModel:ViewModel() {

    val cities = loadData()


    private fun loadData():List<City> {
        val city1 = City(R.drawable.paris_list,R.drawable.paris_detail,"Paris","30 millions","La Tour Eiffel","Paris est la ville capitale et la plus grande de France. elle est située sur la Seine, dans le nord de la " +
                "France, au cœur de l’Île-de-France. Elle dispose de 2 millions d’habitants et est la cinquième des villes " +
                "les plus peuplées du monde. La ville est une des centres les plus influentes dans le monde entier, ainsi que " +
                "culturel, politique et économique très forte à la fois près at et près national. La ville est administrée " +
                "par un maire. Entouré d’un conseil municipal, il décide du budjet de la ville, des impots locaux, des grands " +
                "équipements d’infrastucture, de logement et de loisir. L’Hotel de Ville est le siège des institutions municipales.")

        val city2 = City(R.drawable.london_list,R.drawable.london_detail,"Londres","20 millions","Big Ben","Londres est connue pour être l’une des plus belle ville du monde, mais aussi l’une des plus diversifiée en\n" +
                "terme de culture avec 50 nationalités parlant plus de 300 langues différentes. La ville légendaire est aussi " +
                "renommée pour la richesse de son histoire et de sa culture qui s’étalent sur presque 2000 ans. Plusieurs " +
                "adjectifs peuvent caractériser la ville de Londres. Elle est fascinante (par son histoire), Délicieuse (par " +
                " sa cuisine), subjuguante et attirante (par ses animations et ses couleurs) mais on est surtout ébloui par sa beauté.")

        val city3 = City(R.drawable.barcelona_list,R.drawable.barcelone_detail,"Barcelone","15 millions","Plaça Catalunya","Barcelone compte aujourd'hui 1,7 million d'habitants, ce qui en fait la deuxième ville d'Espagne, après\n" +
                "Madrid. Ville jeune, elle accueille un nombre important d'étudiants venus du monde entier qui renouvellent " +
                "et réveillent la ville la nuit venue. Son port et son dynamisme économique en font la principale rivale de " +
                "la capitale madrilène. Barcelone bénéficie également d'un véritable bouillonnement artistique. Elle a vu " +
                "passer de grands maîtres tels que Picasso, Dali ou le célèbre architecte Gaudí... Son caractère cosmopolite " +
                "lui confère le statut de pôle culturel incontournable. Mais avant tout, c'est la capitale de la guerre de " +
                "Succession. ! Barcelone est fière de son identité culturelle. Les habitants parlent catalan et elle abrite " +
                "le siège de la Generalitat, le gouvernement autonome de la province.")

        val city4 = City(R.drawable.istanbul_list,R.drawable.istanbul_detail,"Istanbul","10 millions",">La Mosquée Bleue","Sur un promontoire dominant la rive européenne du détroit du Bosphore, contrôlant ainsi le passage vers " +
                "l'Asie, Istanbul est traversée par l'estuaire de la Corne d'Or, ce qui accentue sa position défensive. " +
                "Entre les Balkans et l'Anatolie, la mer Noire et la mer Méditerranée, elle est à la croisée des routes " +
                "terrestres et maritimes. Le coeur de la ville, à l'est, est entouré d'eau sur trois de ses côtés; et un " +
                "rempart (413, modifié par la suite) marque la limite terrestre de Constantinople. On la disait, comme Rome, " +
                "construite sur sept collines. À l'époque, un lieu précis marquait, au coeur de la ville, le point de départ " +
                "des routes terrestres de l'Empire; et une artère traversait la ville d'est en ouest, se ramifiant vers les " +
                "portes. Aujourd'hui encore, au milieu d'un tracé urbain serré, on distingue une telle armature.")

        val city5 = City(R.drawable.roma_list,R.drawable.rome_detail,"Rome","8 millions","Fontaine de Trevi","Paris est la ville capitale et la plus grande de France. elle est située sur la Seine, dans le nord de la " +
                "France, au cœur de l’Île-de-France. Elle dispose de 2 millions d’habitants et est la cinquième des villes " +
                "les plus peuplées du monde. La ville est une des centres les plus influentes dans le monde entier, ainsi que " +
                "culturel, politique et économique très forte à la fois près at et près national. La ville est administrée " +
                "par un maire. Entouré d’un conseil municipal, il décide du budjet de la ville, des impots locaux, des grands " +
                "équipements d’infrastucture, de logement et de loisir. L’Hotel de Ville est le siège des institutions municipales.")
        val list = mutableListOf(city1,city2,city3,city4,city5)
        return  list
    }
}