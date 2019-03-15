package com.example.android.varanasitour;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ListView coordinatorLayout =(ListView) inflater.inflate(R.layout.tour_list,container,false);


        final ArrayList<Tour> tours =new ArrayList<>();
        tours.add(new Tour("Kachori Sabzi",R.drawable.kachori_625x300_1529059213693,"Kachori sabji makes for the most popular Kaleva (breakfast) option in Benaras. There are two different types of kachoris- badi and choti kachori. Badi kachori is stuffed with masala made of lentils called dal ki pithi and choti kachori is stuffed with a spicy potato mixture. Both of these kachoris are savoured with garam masala wali aloo ki sazi and desi ghee jalebi. What a way to start your day!"));
        tours.add(new Tour("Chena Dahi Vada",R.drawable.dahivada_625x300_1529059258778,"All the curd lovers raise your hands! Chena is similar to Rasmalai in terms of shape and is dipped in sweet yogurt and a hint of masala made of jeera and black salt. It makes for a perfect mix of sweet and sour. The coriander garnishing makes it more refreshing. A perfect dish to enjoy with your freinds and family."));
        tours.add(new Tour("Malaiyyo",R.drawable.malaiyo_625x300_1529059308425,"Makhan Malaiyyo or Nimish is a popular winter street dessert that is influenced by Persian way of cooking. Milk froth is flavoured with saffron and cardamoms and garnished with pistachios and almonds. Served in purva or kulhads, this creamy froth will literally melt in your mouth."));
        tours.add(new Tour("Choora Matar",R.drawable.beanschaat_625x300_1529059381784,"This street food is basically a Benarasi twist to the Poha or Kanda Poha. It is flattened rice soaked in desi ghee and tempered with various spices along with fresh green peas to which milk or cream is added along with raisins and saffron. It tastes best with a hot cup of masala chai."));
        tours.add(new Tour("Thandai And Lassi",R.drawable.lassi_625x300_1529059461450,"Varanasi is a city that produces lots of milk and curd and therefore, you'll find them in most of their preparations. Benarasi Thandai is made from seasonal fruit puree. Along with that, lassi is available at almost every other street shop from morning till wee hours of the night. It is served in a kulhad topped with Rabri and flavoured with rose essence.\n"));
        tours.add(new Tour("Dahi Chutney Wale Gol Gappe",R.drawable.chaat_625x300_1529059546877,"Dahi Chutney wale Gol Gappe are also popularly known as Meethe Golgappe that offer both spicy and sweet flavours. This street snack are just like chaat paapdi is, the only difference is that it uses wafer thin and crisp Gol Gappas instead of the paapdi. One can pair it with tangy jaljeera to enjoy it even more."));
        tours.add(new Tour("Laaiya Chana",R.drawable.chanachaat_625x300_1529059597626,"Laaiya Chana is similar to what Jhalmuri and Bhelpuri is but it has soaked boiled chana instead of puffed rice. It includes onions, tomatoes, peanuts and lots of masalas. This snack tastes best with a cup of tea. This recipe is famous not only because of its lip-smacking taste but also because of its easy recipe."));
        tours.add(new Tour("Baati Chokha",R.drawable.littichokha_625x300_1529059681416,"Baati Chokha, which is popularly savoured in Bihar makes for a tasty street snack in Varanasi too. Baati is a wheat ball stuffed with sattu and Chokha is a mash of brinjal and potatoes mixed with various spices. People like to keep the chokha simple and less spicy."));
        tours.add(new Tour("Tamatar Chaat",R.drawable.chaat_625x300_1529059756368,"Benaras has its own version of the famous chaat which is made with tomatoes and you'll only find it here. It is a spicy preparation in which tomatoes are mixed with hing, pounded ginger, green chillies and spices with the addition of boiled potatoes. It is served in a dona (bowl made with palash leaves) along with chaat masala and small sized crispy namak pare.\n"));

        ListView listView = (ListView)coordinatorLayout.findViewById(R.id.listView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Tour tour = tours.get(position);
                Intent intent = new Intent(getActivity(),ItemDetail.class);
                intent.putExtra("rId",tour.getImage());
                intent.putExtra("name",tour.getName());
                intent.putExtra("about",tour.getAbout());
                startActivity(intent);
            }
        });

        TourArrayAdapter tourArrayAdapter = new TourArrayAdapter(getActivity(),tours);

        listView.setAdapter(tourArrayAdapter);



        return coordinatorLayout;


    }
}
