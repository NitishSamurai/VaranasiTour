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

public class UniversityFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ListView coordinatorLayout =(ListView) inflater.inflate(R.layout.tour_list,container,false);


        final ArrayList<Tour> tours =new ArrayList<>();
        tours.add(new Tour("BHU",R.drawable.download,"Banaras Hindu University (Hindi: [kaʃi hind̪u viʃvəvid̪yaləy], BHU), formerly Central Hindu College, is a public central university located in Varanasi, Uttar Pradesh. It was established in 1916 by Madan Mohan Malaviya.[2] With over 30,000 students residing in campus, it claims the title of largest residential university in Asia.[3]\n" +
                "\n" +
                "The university's main campus spread over 1,300 acres (5.3 km2) was built on land donated by the Kashi Naresh, the hereditary ruler of Banaras (\"Kashi\" being an alternative name for Banaras or Varanasi). The south campus, spread over 2,700 acres (11 km2),[4] hosts the Krishi Vigyan Kendra (Agriculture Science Centre)[5] and is located in Barkachha in Mirzapur district, about 60 km (37 mi) from Banaras. The University is also planning to set up a campus in Bihar.[6]\n" +
                "\n" +
                "BHU is organised into 6 institutes and 14 faculties (streams) and about 140 departments.[7][8] As of 2017, the total student enrollment at the university is 27,359[9] coming from 48 countries.[10] It has over 75 hostels for resident students. Several of its faculties and institutes include arts (FA - BHU), management studies (I.M.St. - BHU), science (I.Sc. - BHU), performing arts (FPA-BHU), law (FL-BHU), agricultural science (I.A.S. - BHU),medical science (I.M.S. - BHU) and environment and sustainable development (I.E.S.D. - BHU) along with departments of linguistics, journalism & mass communication, among others. The university's engineering institute was designated as Indian Institute of Technology in June 2012"));
        tours.add(new Tour("CIHTS",R.drawable.cits,"The Central Institute of Higher Tibetan Studies (CIHTS; Tibetan: ཝ་ཎ་མཐོ་སློབ, Wylie: wa Na mtho slob), formerly called Central University for Tibetan Studies (CUTS), is a Deemed University founded in Sarnath, Varanasi, India, in 1967, as an autonomous organisation under Union Ministry of Culture.[2] The CIHTS was founded by Pt. Jawahar Lal Nehru in consultation with Tenzin Gyatso, the Dalai of Lama, with the aim of educating Tibetan youths in exile and Himalayan border students as well as with the aim of retranslating into Sanskrit and translating into Hindi and other modern Indian languages lost Indo-Buddhist Sanskrit texts that now exist only in Tibetan.[3]\n" +
                "\n" +
                "Originally it functioned as a special constituent wing of Sampurnanand Sanskrit University, Varanasi. In the early 1970s the Government of India reviewed the progress of the institute and decided to accord it a status of an autonomous body under the Department of Culture, Ministry of Education, Government of India in 1977 with 100% financial support from the Indian government.\n" +
                "\n" +
                "The institute steadily progressed and the Indian government declared it a Deemed University on 5 April 1988. Formerly headed by the like of Kyabje Zong Rinpoche, Samdong Rinpoche (former Prime Minister of the Central Tibetan Administrations), and Ngawang Samten, also a former alumnus, the institute is headed by Lobsang Norbu Shastri.[4] Assisted by faculty members, with the goal of achieving excellence in the fields of Tibetology and Buddhology. The university attracts a large number[clarification needed] of students from many regions of the Himalayan family, with students coming from Kinnaur, Lahaul, Spiti, Ladakh, Monpas from Arunachal. Students from Nepal consist of students, from Sherpas, Lamas and many more from the bordering regions of Mustang and Dolpo. Other than these, students also come from Bhutan and Mongolia."));
        tours.add(new Tour("MGKV",R.drawable.mkgv25957,"Mahatma Gandhi Kashi Vidyapith is a public university located in Varanasi or Benaras, Uttar Pradesh, India. Established in 1921 as Kashi Vidyapith and later renamed, it is administered under the state legislature of the government of Uttar Pradesh. The university has more than 400+ affiliated colleges spread over six districts. It is one of the largest state universities in Uttar Pradesh, with hundreds of thousands of students, both rural and urban. It offers a range of professional and academic courses in arts, science, commerce, law, computing and management.Babu Shiv Prasad Gupta and Bhagwan Das established the university in Varanasi, on 10 February 1921, during the non-cooperation movement of the freedom struggle. Originally named Kashi Vidyapith, the university was renamed Mahatma Gandhi Kashi Vidyapith in 1995. It was inaugurated by Mahatma Gandhi.[1]\n" +
                "\n" +
                "Inspired by Gandhi's call for self-reliance and swaraj (self-rule), the Kashi Vidyapith was the first modern university organised by Indians in British India. The university, along with contemporaries such as the Jamia Millia Islamia and the Gujarat Vidyapith, were outside the control and support of British authorities, supported and managed entirely by Indian nationalists and educationalists. Attracting young Indians from across the country, its faculty included prominent nationalists and scholars such as Acharya Narendra Dev, Dr. Rajendra Prasad, Jivatram Kripalani, Babu Shriprakash and Babu Sampurnanand. Gandhi and Indian nationalists encouraged Indians to boycott British-run institutions in favour of institutions managed entirely by Indians. Many prominent Indian industrialists and politicians provided financial and administrative support to the university.\n" +
                "\n" +
                "Bhagwan Das was the first vice-chancellor. Others associated with the first board of management included Mahatma Gandhi, Lala Lajpat Rai, Jamuna Lal Bajaj, Jawahar Lal Nehru, Babu Shiv Prasad Gupta, Acharya Narendra Dev, Krishna Kant Malviya, and Purushottam Das Tandon. The founding ceremony of the Vidyapith reverberated with the recital of Vedic mantras as well as excerpts from the Quran in the presence of educationists, learned persons and nationalists such as Pandit Motilal Nehru, Maulana Mohammed Ali and Maulana Abul Kalam Azad."));
        tours.add(new Tour("Sampurnanand Sanskrit Vishwavidyalaya",R.drawable.sampurnanad1499699063_835x547,"Sampurnanand Sanskrit Vishwavidyalaya (IAST: Sampūrnānand Samskrit Vișvavidyālaya, Vāraṇāsī) is an Indian institution of higher learning located in Varanasi, Uttar Pradesh, India, specializing in the study of Sanskrit and related fields. It is India's oldest university which is still functional.In 1791, during the rule by the East India Company, a resident of the company, Jonathan Duncan, proposed the establishment of a Sanskrit college for the development and preservation of Sanskrit Vangmaya (grammar) to demonstrate British support for Indian education. The initiative was sanctioned by governor general Lord Cornwallis. The first teacher of the institution was Pandit Kashinath and the governor general sanctioned a budget of Rs. 20,000 per annum. The first principal of Government Sanskrit College was John Muir, followed by James R. Ballantyne, Ralph T. H. Griffith, George Thibaut, Arthur Venis, Sir Ganganath Jha and Gopinath Kaviraj.[1]\n" +
                "\n" +
                "In 1857, the college began postgraduate teaching. An examination system was adopted in 1880. In 1894, the famous Saraswati Bhavan Granthalaya building was built, where thousands of manuscripts remain preserved today. These manuscripts have been edited by the principal of the college and published in book form. More than 400 books have been published in a series known as Sarasvati Bhavana.\n" +
                "\n" +
                "In 1958, the efforts of Sampurnanand changed the status of the institution from that of a college to a Sanskrit university. In 1974, the name of the institution was formally changed to Sampurnanand Sanskrit University."));
        tours.add(new Tour("Harish Chandra Postgraduate College",R.drawable.campus,"Harish Chandra Postgraduate college is a government college and one of the oldest college in Maidagin, Varanasi, India A government college that offers undergraduate and postgraduate.The p.hD. degree programs are running in most of the departments.It was founded in 1860 by Bharatendu Harishchandra and opened in 1866 with five students. Admission is done through entrance exams conducted by the college every year[1][2]The college campus is now fully circulated by WiFi from oct 2018 onwards.In 1860, the Harish Chandra Vidyalaya Samiti (a non-profit charitable institution registered under Indian Society Act 1860) was incorporated and the same year Harish Chandra Postgraduate College was founded by Bharatendu Harishchandra. The college opened in 1866 with five students. In 1910, the institution started high school, and in 1939 intermediate classes were started.\n" +
                "\n" +
                "In October 1951, the college began undergraduate courses in arts and commerce."));
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
