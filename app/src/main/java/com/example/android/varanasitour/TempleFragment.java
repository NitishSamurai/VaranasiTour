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
import android.widget.ListView;

import java.util.ArrayList;

public class TempleFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ListView coordinatorLayout =(ListView) inflater.inflate(R.layout.tour_list,container,false);



        final ArrayList<Tour> tours =new ArrayList<>();
        tours.add(new Tour("Kashi Vishwanath Temple",R.drawable.vishwanath_temole,"Kashi Vishvanath Temple is one of the most famous Hindu temples dedicated to Lord Shiva. It is located in Varanasi, Uttar Pradesh, India. The temple stands on the western bank of the holy river Ganga, and is one of the twelve Jyotirlingas, the holiest of Shiva temples. The main deity is known by the name Vishvanatha or Vishveshvara meaning Ruler of The Universe. Varanasi city is also called Kashi, and hence the temple is popularly called Kashi Vishvanath Temple. Its name originally was Vishveshvara (broken down Vishwa: Universe, Ish: Lord; Vara: Excellent) or Lord of the Universe.\n" +
                "\n" +
                "The temple has been referred to in Hindu scriptures for a very long time as a central part of worship in the Shaiva philosophy. It has been destroyed and re-constructed a number of times in history. The last structure was demolished by Aurangzeb, the sixth Mughal emperor who constructed the Gyanvapi Mosque on its site.[1] The current structure was built on an adjacent site by the Maratha ruler, Ahilya Bai Holkar of Indore in 1780.[2]\n" +
                "\n" +
                "Since 1983, the temple has been managed by the government of Uttar Pradesh. During the religious occasion of Shivratri, Kashi Naresh (King of Kashi) is the chief officiating priest."+"\n"+"The temple has been mentioned in the Puranas including the Kashi Khanda (section) of Skanda Purana. The original Vishwanath temple was destroyed by the army of Qutb-ud-din Aibak in 1194 CE, when he defeated the Raja of Kannauj as a commander of Mohammad Ghori. The temple was rebuilt by a Gujarati merchant during the reign of Delhi's Sultan Iltutmish (1211-1266 CE). It was demolished again during the rule of either Hussain Shah Sharqi (1447-1458) or Sikandar Lodhi (1489-1517). Raja Man Singh built the temple during Mughal emperor Akbar's rule, but orthodox Hindus boycotted it as he had let the Mughals marry within his family. Raja Todar Mal further re-built the temple with Akbar's funding at its original site in 1585.[3]\n" +
                "\n" +
                "In 1669 CE, Emperor Aurangzeb destroyed the temple and built the Gyanvapi Mosque in its place.[4] The remains of the erstwhile temple can be seen in the foundation, the columns and at the rear part of the mosque."));
        tours.add(new Tour("Sankat Mochan Temple",R.drawable.sankat_mochan_temple,"Sankat Mochan Hanuman Temple is a Hindu temple in Varanasi, Uttar Pradesh, India and is dedicated to the Hindu God Hanuman. The temple was established by famous Hindu preacher and poet saint Sri Goswami Tulsidas in the early 1500s and is situated on the banks of the Assi river. The deity was named \"Sankat Mochan\" meaning the \"reliever from troubles\".[1]\n" +
                "\n" +
                "In the temple, offerings to Lord Hanuman (called Prasad) are sold like the special sweet \"besan ke ladoo\", which the devotees relish; the idol is also decked with a pleasant marigold flower garland as well. This temple has the unique distinction of having Lord Hanuman facing his Lord, Rama, whom he worshiped with steadfast and selfless devotion.\n" +
                "\n"+"It is believed that the temple has been built on the very spot where Tulsidas had a vision of Hanuman.[2] Sankat Mochan Temple was founded by Tulsidas who was the author of the Ramacharitamanasa, which is the greatest version of lord Ram story written in Avadhi (\"Most of the people having confusion that Ramacharitamanasa is a avadhi version of Valmiki Ramayana but Ramacharitamanasa is different from Sanskrit Ramayana written by rishi Valmiki as Baba Tulsidas Ji already told in Ramacharitamanasa that \"Nana bhanti Ram avatara, Ramayan sat koti apara\" means in each Kalp lord Ram takes Avatar & plays different-2 lilas(Act) so we have different stories of same lord Ram\").Tradition promises that regular visitors to the temple will gain the special favor of Lord Hanuman. Every Tuesday and Saturday thousands of people queue up in front of the temple to offer prayers to Lord Hanuman. According to Vedic Astrology, Hanuman saves human beings from the anger of the planet Shani (Saturn), and especially people who have an ill-placed Saturn in their horoscopes visit this temple for astrological remedies. This is supposed to be the most effective way for appeasing Shani. While it is suggested that Hanuman did not hesitate to engulfs in his mouth the sun, the lord of all planets, which humbled all the gods and angels, making them worship him for the Sun's release. Some astrologers believe that worshiping Hanuman can neutralize the ill-effect of Mangal (Mars) and practically any planet that has an ill effect on human life."));
        tours.add(new Tour("Kanaka Durga Temple",R.drawable.kanaka_durga_temple,"Durga Mandir (Hindi: दुर्गा मंदिर), also known as Durga Kund Mandir and Durga Temple, is one of the most famous temples in the holy city of Varanasi. This temple has great religious importance in Hinduism and is dedicated to the Maa Durga. Durga Mandir was constructed in 18th century by Bengali Maharani (Bengali Queen).Durga Mandir was constructed in 18th century by Bengali Maharani. The temple is dedicated to the Goddess Durga. Next to the temple, is a kund (pond) which was earlier connected to the river Ganges. It is believed that the existing icon of the goddess was not made by a man but appeared on its own in the temple.In adhyaya (chapter) 23 of the Devi-Bhagavata Purana, this temple's origin is explained. As per the text, Kashi Naresh (king of Varanasi) called for a Swayamvar for his daughter Sashikala's marriage. The King later learnt that the princess was in love with vanvasi prince Sudarshan. So Kashi Naresh got his daughter secretly married to the prince. When the other Kings (who were invited for Swayamvar) got to know about the marriage, they got angry and went on war with Kashi Naresh. Sudarshan then offered prayers to Durga, who came on a lion and fought the war for Kashi Naresh and Sudarshan. After the war, Kashi Naresh pleaded to Durga to protect Varanasi and with that belief, this temple was constructed."));
        tours.add(new Tour("Tulsi Manas Temple",R.drawable.tulsi_manas_temple,"Tulsi Manas Mandir (Hindi: तुलसी मानस मंदिर) (a.k.a. Tulsi Manas Mandir) is one of the most famous temples in the holy city of Varanasi. This temple has great historical and cultural importance in Hinduism since the ancient Hindu epic Ramcharitmanas was originally written at this place by Hindu poet-saint, reformer and philosopher Goswami Tulsidas in the 16th century (c.1532–1623)."+"\n"+"One of the famous Hindu epics, Ramayan was originally written in Sanskrit language by Sanskrit poet Valmiki between 500 and 100 BC. Being in Sanskrit language, this epic was not accessible to and understood by masses. In the 16th century, Goswami Tulsidas wrote the Ramayan in Awadhi dialect of Hindi language and the Awadhi version was called Ramcharitmanas (meaning Lake of the deeds of Rama).[3][4][5]\n" +
                "\n" +
                "In 1964, the Sureka family constructed a temple at the same place where Goswami Tulsidas wrote Ramcharitmanas."));
        tours.add(new Tour("Bharat Mata Temple",R.drawable.bharat_mata_temple,"Bharat Mata Mandir (meaning \"Mother India Temple\") is located on the Mahatma Gandhi Kashi Vidyapith campus in Varanasi, India. Instead of traditional statues of gods and goddesses, this temple has a huge map of undivided India carved in marble. This temple is dedicated to Bharat Mata and claims to be the only one of its kind in the world.Bharat Mata temple belongs to Mother India or Bharat Mata. The campus of Mahatma Gandhi Kashi Vidyapith has the Bharat Mata temple. The temple was set up around 1936 by Babu Shiv Prasad Gupta; a freedom fighter. Mahatma Gandhi; the father of the nation had inaugurated this temple. The temple enshrines a beautiful marble stone map depicting the undivided India.Bharat Mata Mandir was constructed in 1936 by freedom fighter Babu Shiv Prasad Gupta and was inaugurated by Mahatma Gandhi. The temple is built on the campus of Mahatma Gandhi Kashi Vidyapith."));
        tours.add(new Tour("Mrityunjay Mahadev Temple",R.drawable.mrityunjay_mahadev_temple,"This temple is dedicated to the Lord Shiva and situated on the way from Daranagar to Kalbhairav temple. There is an ancient well which has much religious importance and it is believed that its water is curable to several diseases. The temple opens early in the morning at 4.00 am and closed late night at 12.00 pm. Arti timings are at 5.30 am, 6.30 pm and 11.30 pm.Exact location of the temple is: K52/39 (adjacent to the Kalbhairav temple), Daranagar Visheshwarganj, Varanasi.\n" +
                "\n" +
                "History of Mrityunjay Mahadev Temple:\n" +
                "\n" +
                "Mrityunjay Mahadev Temple in Varanasi is the very famous and glorious temple. This temple is the holy place of worship and belongs to the Lord Mahadev (Known as Lord Shiva by pilgrims). The history of this temple is all behind an ancient well and “The Shivling”. The meaning of the word Mrityunjay Mahadev is “The God who triumphs over of death”. It is considered as, the Shivling in this temple keep away all the devotees from their unnatural death. Lord Shiva is worshiped as Mrityunjay Mahadev by devotees in order to get triumph over his unnatural death. People from all over India come here and perform “Mrityunjay Path” to get rid of their problems. In the campus of the temple there is an ancient well (also known as koop). The water of this well has therapeutic effect on human beings. It is considered as it has mixture of several underground water streams and has miraculous effect for curing numerous diseases.\n" +
                "\n" +
                "Another story behind the magical well is that, a famous person “Dhanvantari” (father of the Ayurveda) has poured all his medicine in that well, that’s why the water of this well is sacred and has medicinal effect as well as able to cure various diseases."));
        tours.add(new Tour("Shri Tilbhandeshwar Mahadev Mandir",R.drawable.shri_tilbhandeshwar_mahadev_mandir,"Tilbhandeshwar Temple is one of the oldest temples in the Varanasi city, located near to the Bengal Tola Inter College and next to the Madanpura (the most renowned weaver colony). Tilbhandeshwar Temple is dedicated to the Lord Shiva. It is believed that the Shiva Lingam present in the Tilbhandeshwar Temple increases every year by a nominal length. A unique combination of the Malyali and the Banarasi culture is represented by this temple. Hindu devotees celebrate here their famous festivals such as Mahashivratri, Shravan, Navratri, Makar Sankranti, Ayappa Puja etc. The statue of other Hindu deities is also visible in this temple such as Maa Parvati, Vibhandeshwar, Bhairav and Loed Ayappa. It is considered that Mata Sharda had spent some days in the Varanasi at this temple.\n" +
                "\n" +
                "Devotees of the Lord Shiva can realize the supreme power at the Tilbhandeshwar Temple. It is considered that the Shiva Lingam present in the Tilbhandeshwar Temple was emerged by itself many years ago and known as the Shvambhu. The temple has very calm environment and best place for the meditation. Devotees offer Jal to the Shiva Lingam and meditate in the feets of the Lord Shiva.\n" +
                "\n" +
                "Opening Time of the Tilbhandeshwar Temple\n" +
                "\n" +
                "Temple opens at 4.30 am in the morning and closed at 9 pm in the evening.\n" +
                "\n" +
                "Location of the Tilbhandeshwar Temple\n" +
                "\n" +
                "Tilbhandeshwar Temple is located about 5 km from the railway station Varanasi and 9 km from the Durga Temple. You can reach to the temple through the taxi, auto or rickshaw from any part of the Varanasi city."));
        tours.add(new Tour("Kaal Bhairav Temple",R.drawable.kaal_bhairav_temple,"Kaal Bhairav Mandir (Hindi: काल भैरव मंदिर) is one of the oldest Shiva temples in Varanasi, India. Situated in Bharonath, Vishweshwarganj (Varanasi), this temple has great historical and cultural importance in Hinduism; especially amongst the locals. The temple is dedicated to Bhairava (Kaal Bhairav), a fierce form of Shiva and wears a garland of skulls and carries a club of peacock feathers. The word \"Kaal\" means both \"death\" and \"fate\". It is believed that even death is afraid of Kaal Bhairav.\n" +
                "\n" +
                "Housed in the inner sanctum of the temple is a silver faced idol of Kal Bhairav who is seated on his vahana (vehicle), a dog and is holding a trident. Only the face of the icon decorated (with garlands) is visible to the visitors through the doorway. Rest of the icon is covered with a piece of cloth. On the rear door of the temple, there is an icon of Kshetrapal Bhairav, another aspect of Bhairava.Once, the gods Brahma and Vishnu were competing for supremacy. Then Shiva appeared as a powerful divine light between the duo. An angry Brahma stared at the pillar of light with his 5th head, which started to burn out of anger. Shiva has instantly created the new being Bhairava or Kaal Bhairav (King of \"Kaal\": \"Kaal Bhairav\"), who decapitated Brahma's 5th head. However, the head stuck to Kaal Bhairav's hand.\n" +
                "\n" +
                "Shiva then ordered Kaal Bhairav to go to various places but Brāhmanahatya, the sin of beheading Brahma personified as a gory woman, followed him until he reached Varanasi where Brahma's head fell on the ground. The place is called \"Kapal Mochan Teerth\". He was freed of the sin of Brāhmanahatya as he entered Varanasi. Shiva then pronounced that \"Kaal Bhairav\" will forever be in Varanasi in order to remove sins of his disciples."));
        tours.add(new Tour("Nepali Temple",R.drawable.nepali_temple_exterior,"Nepali Mandir (Hindi: नेपाली मंदिर), also known as (a.k.a. Kanthwala Mandir and Mini Khajuraho) (Kanthwala in Hindi means wooden), is one of the oldest and most famous temples in the holy city of Varanasi. This temple has great religious importance in Hinduism and is dedicated to the Lord Shiva. Constructed in the 19th century A.D by the King of Nepal, the temple is made of terracotta, stone and wood and is replica of the Pashupatinath Temple in Kathmandu.The King of Nepal, Rana Bahadur Shah took exile in Varanasi from 1800 to 1804 and titled himself as \"Swami Nirgunanda\". During his exile, he decided to build a replica of Pashupatinath Temple in Varanasi. Construction of the temple commenced during his exile / stay in Varanasi. During the construction, Shah moved back to Nepal. On 25 April 1806, Rana Bahadur Shah was stabbed to death by his stepbrother, Sher Bahadur Shah. His son Girvan Yuddha Bikram Shah Deva completed the project 20 years after the deadline. The land was later transferred to Rana Bahadur Shah by Kashi Naresh in the year 1843. The temple, adjacent area, Lalita Ghat and a dharamshala, belongs to the Nepal government."));
        tours.add(new Tour("Annapurna Devi Mandir",R.drawable.annpurna_mata_mandir,"Annapurna Devi Mandir (Hindi: अन्नपूर्णा देवी मंदिर), also known as Annapurna Mata Mandir and Annapurna Mandir, is one of the most famous Hindu temples (Mandir) in the holy city of Varanasi. This temple has great religious importance in Hinduism and is dedicated to the goddess Annapurna. Annapurna is the Hindu goddess for nourishment and is a form of the goddess Parvati. The current Annapurna Mandir was constructed in the 18th century by Maratha Peshwa Bajirao IThe temple is constructed in Nagara architecture and has sanctum with large pillared porch, which houses a picture of goddess Annapurna. The temple also houses two icons of the goddess; one made of gold and other of brass. The brass icon is available for daily darshan (viewing & worship). The gold icon can be only seen once a year; on Annakut day.In Hindu mythology, there are two popular beliefs behind the origin of this temple.\n" +
                "\n" +
                "According to one belief, once the goddess Parvati closed all three eyes of her husband Shiva. Due to this, the entire world was filled with darkness. Parvati stole her fair complexion (Gauri form). She asked Shiva for his help to reacquire her Gauri form. Shiva asked her to donate anna (food) in Varanasi. Hence, she took the form of Annapurna (the goddess of food) with a golden pot and ladle, and donated food in Varanasi.\n" +
                "\n" +
                "According to another belief, once Shiva commented that the entire world (including food) is maya (illusion). Parvati, the goddess of food, got angry and decided to demonstrate the importance of food by making all the food on earth disappear. The world started to suffer due to hunger. Shiva finally came to Parvati and acknowledged the importance of food, begging for food at her door. Parvati became happy, offered food by her own hands to Shiva and then made a kitchen in Varanasi for her devotees."));

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
