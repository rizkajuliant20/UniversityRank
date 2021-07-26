package com.example.universityrank;

import java.util.ArrayList;

public class UniversityList {
    private static String[] uniNames = {
        "Massachusetts Institute of Technology (MIT)",
        "University of Oxford",
        "Stanford University",
        "Harvard University",
        "University of Cambridge",
        "California Institute of Technology (Caltech)",
        "Imperial College London",
        "ETH Zurich - Swiss Federal Institute of Technology",
        "UCL Bloomsbury",
        "University of Chicago",
    };

    private static String[] uniDesc = {
      //MIT
      "Applying to study at college is a huge life decision, and the thoroughness of the MIT application process reflects this. Candidates apply through an online application system known as MyMIT. The application fee is US$75 and initially candidates submit biographical details. They then answer short response questions and essays before listing and writing about four activities of particular significance to them and submitting information about coursework and grades. \n" +
          "\n" +
          "Additional requirements include letters of recommendation from two teachers (one math/science, one humanities), plus extra materials from a school counselor (typically including a transcript, a school profile and letter of recommendation). \n" +
          "\n" +
          "Applicants also complete standardized tests: native English speakers must submit SAT/ACT scores as well as undertake two SAT subject tests, in mathematics and science. Non-native English speakers are encouraged to take the TOEFL and two SAT subject tests. \n" +
          "\n" +
          "The final part of the process is the interview, which will usually be conducted locally by alumni or over Skype. Overall the process is highly competitive, with candidates who reach the interview stage typically having a 10.8 percent chance of being admitted. \n" +
          "\n" +
          "Fees and tuition for 2017–18 cost US$67,430 per academic year, which includes housing and dining, books, and personal expenses. Financial aid is available and is claimed by 91 percent of undergraduate students. The school stresses that 72 percent of its undergraduate students currently graduate debt free. \n" +
          "\n" +
          "Candidates apply to MIT as a whole, not to a specific major or school. First year students begin with an undeclared major then during their freshman year, attend academic fairs, lectures, seminars, and other programs to determine their major. \n" +
          "\n" +
          "There is a dizzying array of bachelor's degree and minor programs on offer, from nuclear science to political science, with all manner of arts, languages, and humanities subjects in between. There are also interdisciplinary majors, such as American Studies, as well as joint majors such as Chemistry and Biology, or Humanities and Engineering. \n" +
          "\n" +
          "However, life as an undergraduate at MIT isn’t all about studying: there is a flourishing center for the arts, over 500 student organizations, and thriving athletics and sports culture as well as a culture of elaborate practical jokes, known as “hacks”. \n" +
          "\n" +
          "Much of the fun on campus is also centered around MIT's residential life system, where different cultures thrive in different residence halls and living groups. About 90 percent of undergraduate students live in residence halls and fraternities, sororities, and independent living groups.",

      //OXFORD
      "Oxford offers 48 undergraduate degrees in a wide range of disciplines, from the traditional sciences through to humanities, law, languages, and fine art. Students can also study joint honors programs such as Philosophy and Theology, and Archaeology and Anthropology. \n" +
          "\n" +
          "Undergraduate degrees are usually three years in length and are taught inside the individual college to which students apply. Undergraduate study at Oxford is centered on the weekly tutorial, which is supported by classes, lectures, and laboratory work carried out in university faculties and departments. \n" +
          "\n" +
          "The admissions rate for Oxford is 21 percent, which seems high in comparison to Ivy League universities but is a reflection of the English system. The application period runs during the autumn for the following academic year. Applicants register to take a test, and prospective students might have to send in written work alongside the standard completed UCAS form. Shortlisted candidates are then invited to interview, and will know whether they have been successful by the end of the calendar year. \n" +
          "\n" +
          "Unlike the University of Cambridge, Oxford does not operate a pooling system for candidates invited to interview. Instead, it’s common for applicants to be asked to stay multiple days in the city (accommodation is provided) and, if there are no places available at their first-choice college, they may also be invited for interviews at other colleges which have less competition for places.\n" +
          "\n" +
          "Around 17 percent of applicants are international citizens, and there are no quotas for international students (with the exception of the medicine program). The application process is broadly the same for international students, with Oxford accepting school-leaving qualifications from many different countries. There are, however, additional elements to the application such as English language requirements. \n" +
          "\n" +
          "Tuition fees are currently set at the annual UK maximum of £9,250, with loans available from the UK government for the full amount. Loans are also available to cover living costs during the full three years of study. Students from outside the EU are charged a significantly higher tuition fee, of up to £24,000 a year, and an additional £7,570 a year college fee. This does not include accommodation or board. \n" +
          "\n" +
          "Terms at Oxford are actually shorter than at other UK higher education institutions, and their total duration amounts to less than half of the year. However, undergraduates are also expected to do some academic work during the three holidays, known as the Christmas, Easter, and Long Vacations.",

      //STANFORD
      "Stanford's four-year full-time undergraduate program aims to provide a liberal education which broadens knowledge and awareness in each of the major areas of human knowledge, while significantly deepening understanding in one or a couple of these areas. \n" +
              "\n" +
              "You can plan an individual program of study that takes into account personal educational goals, with the only compulsory areas, apart from the requirements of a major, being a writing requirement, a language requirement and the completion of courses entitled Ways of Thinking and Ways of Doing. \n" +
              "\n" +
              "You decide upon your major towards the end of your freshman year and can choose from a wide range of academic disciplines, spanning sciences, arts and humanities, languages, and social sciences. \n" +
              "\n" +
              "Stanford has had active fraternities and sororities on campus since 1891, although you are unable to apply to join until Spring quarter of your freshman year.\n" +
              "\n" +
              "The university’s proximity to Silicon Valley and first-class facilities make it an attractive proposition to many. As a result, Stanford is one of the top three most selective schools in the United States, with an acceptance rate of 4.7 percent in 2018. \n" +
              "\n" +
              "You apply by completing the Common or Coalition Application and submitting it along with letters of recommendation from teachers, official school transcripts, a mid-year transcript, a school report including a letter of recommendation from a school counselor, SAT with essay or ACT with writing test scores, and a non-refundable $US90 application fee. \n" +
              "\n" +
              "There are also Stanford essay questions you must answer, such as: “Tell us about something that is meaningful to you, and why.” Interviews are optional. If you’re an international student, you follow the same application procedure but must be able to demonstrate fluency in English.\n" +
              "\n" +
              "The academic year at Stanford is divided into quarters, with undergraduate tuition costing US$16,901 per quarter, with housing and board an extra cost. Around 97 per cent of undergraduates live in university housing, with undergraduate residences including traditional halls of residence, language and culture themed houses, cross-cultural themed houses, student-managed and cooperative houses, apartments, suites, fraternities, and sororities. \n" +
              "\n" +
              "Like many of the Ivy League institutions, Stanford runs a comprehensive need-based financial aid program for its undergraduates. If you apply to Stanford, you’re expected to apply for funding from all the available sources, be they state, federal or private, as well as contribute your own earnings from summer or part-time jobs. It is only after these avenues are exhausted and you still can’t meet the costs that the school will offer scholarship funds.\n",

    //HARVARD
      "The four-year, full-time undergraduate program at Harvard actually makes up a minority of enrolments at the university.  Since 2008, undergraduates have completed courses in eight general categories outside their chosen concentration or major. These eight categories are: Aesthetic and Interpretive Understanding, Culture and Belief, Empirical and Mathematical Reasoning, Ethical Reasoning, Science of Living Systems, Science of the Physical Universe, Societies of the World, and United States in the World. Harvard offers 49 concentrations, many of which are interdisciplinary, and there is no predetermined curriculum: students have the flexibility to craft their own in order to meet their own academic goals. \n" +
              "\n" +
              "If this sounds like an appealing study environment, be warned that applying to Harvard University is like climbing Everest. Only the strongest succeed. Harvard’s acceptance rate of around 5 percent is the lowest in the United States, a testament to the high caliber of candidates applying to the university. Although Harvard has made significant efforts to be meritocratic in its admissions process, like other Ivy League institutions it offers legacy preferences to children of alumni, a policy which has been criticized for favoring wealthy white applicants. An early admission program is also operated by Harvard, having been reintroduced in 2011.\n" +
              "\n" +
              "Applications can be submitted through the Common Application, Coalition Application, or Universal College Application. No one method of application is given preference by the university. The application includes the form and essay question answers; two teacher evaluations; a secondary school report including transcripts and a mid-year school report; as well as two SAT subject tests and an ACT test or writing component. The application fee is a standard US$75. \n" +
              "\n" +
              "Around 12 percent of the latest undergraduate intake were from international backgrounds, and international students go through exactly the same admissions process as American students. English language proficiency test marks can be submitted but are not obligatory. International candidates are, however, strongly encouraged to attend an interview. \n" +
              "\n" +
              "The annual cost of an undergraduate education at Harvard is US$73,600, inclusive of tuition, fees, room, board, personal expenses, and travel costs. It’s no small outlay, but Harvard University does offer need-based finance planning for families at all income levels, something which is taken up by 70 percent of its students. This can include scholarship funds, jobs on campus or student loans. As a result, 100 percent of students are able to graduate from Harvard debt-free, and 20 percent of students’ families pay nothing.",

    //CAMBRIDGE
      "To study at Cambridge is the dream of many a 17-year-old with academic aspirations, and the scholastic setting of the medieval city is almost uniquely suited to studying. The university employs a collegiate system, so you apply to your chosen college rather than the university itself. Should you be offered a place to study, this college is where you will live, eat, sleep, socialize and take classes. Cambridge guarantees most students college-owned accommodation for the three years of their degree, which is located either on college grounds or in apartments in and around the city. This system is unlike most British universities, where students must find private accommodation after their first year.\n" +
              "\n" +
              "Cambridge offers 30 undergraduate programs covering more than 65 subject areas, from chemical engineering to English, mathematics, medicine, and classics. Unusually for a UK university, undergraduate programs cover the subject area very broadly in the initial years before offering a wide range of options in which to specialize later on. \n" +
              "\n" +
              "Faculties arrange lectures, seminars and practicals which students from all of the colleges attend, while colleges arrange supervisions, which provide personal tuition. Each academic year consists of three eight-week terms. The pace and volume of work is notable and there’s much emphasis on independent and self-directed study. \n" +
              "\n" +
              "Competition for places at Cambridge is fierce, with an acceptance rate of 21 percent. This means you should not only research your subject area thoroughly before applying, but also think tactically when it comes to choosing your college. While some colleges may have an excellent reputation for certain subjects, they could prove more difficult to get into. \n" +
              "\n" +
              "Application is done through completing a UCAS form. In addition, you will be asked to complete a supplementary application questionnaire and take a written admission assessment. Everyone with a realistic chance of being offered a place is then invited to an interview day. Don’t be surprised if you are asked to attend multiple interviews while you’re there, as the process of selecting students can often last more than one round.\n" +
              "\n" +
              "When a decision is made about your application, you will either be offered a place, told your application to study was unsuccessful or be informed you’ve been added into a “pool” with other students. This means the college you applied to has no room for you, but that you have been offered to other colleges which might still have spaces. The pooling system is designed to ensure the best applicants still have a chance of gaining a place at Cambridge, even if the college they applied to was over-subscribed.\n" +
              "\n" +
              "Tuition fees are currently £9,250 a year for all courses, and living costs – accommodation, food, course costs, study materials, personal expenses and transport – cost around the same annual figure. Financial aid exists in the form of student loans for UK students, and there are Cambridge bursaries that can award up to £3,500 a year.",

    //CALTECH
      "The school’s full-time, four-year undergraduate program emphasizes instruction in both the arts and sciences. Students take a core curriculum consisting of three terms of mathematics and physics, two of chemistry, one of biology, two of lab courses, one of scientific communication, three of physical education, and 12 terms of humanities and social science. \n" +
              "\n" +
              "Caltech offers 24 majors and six minors across each of its six academic divisions. The most popular subjects to major in are chemical engineering, computer science, electrical engineering, mechanical engineering and physics, though students could alternatively opt for a humanities or social science subject as their major, such as English, history, or economics. \n" +
              "\n" +
              "Caltech is a highly selective school: of its undergraduate corpus, which numbers roughly 1,000, it welcomes only about 230 new freshmen and 10 to 15 new transfer students each fall. The admissions rate is eight percent, with 9 percent of the intake consisting of international students. There’s a ratio of female to male students of 46:54. \n" +
              "\n" +
              "To apply to Caltech is relatively straightforward. Applicants need to complete either the Common or Coalition Application (the QuestBridge National College Match is also acceptable) with specially tailored Caltech questions, and submit a $75 application fee, standardized test results (SAT and ACT), teacher evaluations, a secondary school report, and academic transcripts. \n" +
              "\n" +
              "International students apply in the same way but must also submit TOEFL scores if their native language isn’t English, or they haven’t studied at an English-speaking school. \n" +
              "\n" +
              "The total estimated cost of attending Caltech is US$68,901 per academic year, which includes tuition, fees, board, housing, and personal expenses (although not health insurance). Financial aid is available to all students to help cover these considerable costs, in the form of grants and scholarships based on financial need. There’s also a ‘work-study’ arrangement, where an amount of money is allotted which students then have to earn by working on campus. \n" +
              "\n" +
              "In addition, loans are available, allowing students to borrow money that will need to be repaid with interest after leaving school. There is a finite amount of financial aid available to all international students, which is allocated on the basis of need. \n" +
              "\n" +
              "Upon graduation, Caltech alumni have one of the highest median starting salaries among graduates of other colleges or universities. According to one study, by PayScale, the median starting salary for graduates in 2012–2013 was US$67,400, with mid-career median pay rising to US$120,700. Caltech was also found to offer the second highest return of investment of college education, at $1,991,000 over a 30-year period.",

    //IMPERIAL COLLEGE LONDON
      "Imperial offers three-year Bachelor's or four-year integrated Master's courses in engineering and natural sciences as well as degrees within the School of Medicine. Undergraduates can take advantage of courses in the Imperial College Business School; the Centre for Languages, Culture and Communication; and the I-Explore programme to broaden their studies. Many courses offer the opportunity to study or work overseas, and to engage in research. www.imperial.ac.uk/study",

    //ETH
      "ETH Zurich offers 24 Bachelor’s degrees in the following fields:\n" +
              "\n" +
              "Construction Sciences: Architecture; Civil, Environmental and Geospatial Engineering.\n" +
              "Engineering Sciences: Computer Science; Electrical Engineering and Information Technology; Materials Science; Mechanical Engineering\n" +
              "Natural Sciences and Mathematics: Biology; Chemistry; Biochemistry – Chemical Biology; Chemical Engineering and Biotechnology; Computational Science and Engineering; Interdisciplinary Sciences; Mathematics; Physics; Pharmaceutical Sciences\n" +
              "System-oriented Sciences: Agricultural Sciences; Food Sciences; Earth Sciences; Environmental Sciences; Health Sciences and Technology; Human Medicine\n" +
              "All Bachelor’s programmes are taught in German. If you haven’t previously studied in German and it’s not your first language you will need to prove your proficiency with a test such as TestDAF. Depending on your upper secondary education, you may need to sit an entrance exam.\n" +
              "\n" +
              "Bachelor’s degrees at ETH Zurich take six semesters (three years) to complete.",

    //UCL
      "UCL is one of the world’s top multidisciplinary research universities, with an international reputation for the quality of its research and teaching.\n" +
              "\n" +
              "Defining characteristics of a UCL education\n" +
              "\n" +
              "An exceptional learning environment\n" +
              "\n" +
              "Located in Bloomsbury, central London, UCL is surrounded by the greatest concentration of libraries, museums, archives and professional bodies in Europe.\n" +
              "UCL attracts top academics and students from more than 150 countries, resulting in a vibrant and cosmopolitan academic community.\n" +
              "Semester and year-long study abroad opportunities for students in most programmes.\n" +
              "\n" +
              "\n" +
              "A global leader in generating new knowledge\n" +
              "\n" +
              "UCL is the top-rated university in the UK for research strength in the most recent Research Excellence Framework (2014), by a measure of average research score multiplied by staff numbers submitted.\n" +
              "Pioneering UCL research feeds directly into our programmes, resulting in novel interdisciplinary programmes in emergent disciplines. Our research-based teaching methodology means that research is integrated into our degrees and students have the opportunity to make an original contribution to their field of study.",

    //CHICAGO
      "Entire fields of study such as ecology and sociology were established by the University of Chicago, so it’s hardly surprising that the College is home to some of the most venerated academic programs in the world.\n" +
              "\n" +
              " Focused on careful reading, analytical writing, and critical thinking, UChicago’s Core Curriculum is the perfect foundation for any major and all future endeavors. The university grants Bachelor of Arts and Bachelor of Science degrees in 52 academic majors and 46 minors. These are divided into five academic divisions: The Biological Sciences Collegiate Division, the Physical Sciences Collegiate Division, the Social Sciences Collegiate Division, the Humanities Collegiate Division, and the New Collegiate Division.\n" +
              "\n" +
              " Undergraduates can choose to study anything from astrophysics to molecular engineering, as well as a range of liberal arts, social sciences, anthropology, music, and language-focused degrees. Students choose electives from more than 3,000 courses offered in the College each year, and over 40% study abroad through nearly 60 faculty-designed and taught programs. UChicago also sponsors a wealth of undergraduate research opportunities in programs ranging from economics and psychology to astrophysics and sociology. More than 160 institutes and centers provide a home for true innovation.\n" +
              "\n" +
              " About 60 per cent of undergraduate students live on campus, in one of seven residence halls. These are divided into Harry Potter-esque “houses”, communities of affiliated faculty, staff, and students who all live, eat, debate, and play together. In total, there are 39 houses with a maximum of 105 students in each one. Each house also has its own unique traditions and customs, something which the university says is intended to encourage residents to feel pride in where they live.\n" +
              "\n" +
              " Undergraduate accommodation and the communities within it are intended to provide important social and intellectual outlets where spontaneous conversation and structured programming enrich the academic pursuits of students and faculty.\n" +
              "\n" +
              " As is to be expected with a top school, UChicago is highly selective, with only eight percent of applicants accepted. Candidates apply to the undergraduate College, which includes all majors, minors, and programs of study. UChicago accepts the Coalition or Common Application. Both ask for basic information about your background, academic profile, extracurricular activities, as well as a brief personal statement. You will also need to submit a secondary school report and transcript; two teacher evaluations; standardized test scores; and an application fee of US$75. UChicago also offers a test optional method of application and does not charge an application fee for students applying for need-based financial aid, veterans, or veteran dependents.\n" +
              "\n" +
              " On top of this, you must also tackle the supplementary essay, which contains questions that are designed to be provocative and thought-provoking. International candidates must also submit English language proficiency test scores. Fees and tuition for all applicants for the 2020-2021 academic year is US$57,642.\n" +
              "\n" +
              " Fortunately, the University of Chicago offers financial aid that can contribute up to 100 per cent of a family’s demonstrated need, as well as merit scholarships. Thanks to the university’s three scholarship and access initiative programs—UChicago Stand Together, No Barriers, and UChicago Empower—most students graduate debt-free, no matter their chosen major or background prior to enrollment.",
    };

    private static int[] uniImages = {
            R.drawable.uni_mit,
            R.drawable.uni_oxford,
            R.drawable.uni_stanford,
            R.drawable.uni_harvard,
            R.drawable.uni_cambridge,
            R.drawable.uni_caltech,
            R.drawable.uni_imperial2,
            R.drawable.uni_zurich,
            R.drawable.uni_ucl,
            R.drawable.uni_chicago
    };

    static ArrayList<University> getListData() {
        ArrayList<University> list = new ArrayList<>();
        for (int position = 0; position < uniNames.length; position++) {
            University university = new University();
            university.setName(uniNames[position]);
            university.setDetail(uniDesc[position]);
            university.setImage(uniImages[position]);
            list.add(university);
        }
        return list;
    }
}
