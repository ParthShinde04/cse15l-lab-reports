# Part 1: Bugs
This is the buggy code. 

```
public class ArrayExamples {
    // Changes the input array to be in reversed order
    static void reverseInPlace(int[] arr) {
        for(int i = 0; i < arr.length; i += 1) {
            arr[i] = arr[arr.length - i - 1];
        }
    }

    // Returns a *new* array with all the elements of the input array in reversed
    // order
    static int[] reversed(int[] arr) {
        int[] newArray = new int[arr.length];
        for(int i = 0; i < arr.length; i += 1) {
            arr[i] = newArray[arr.length - i - 1];
        }
        return arr;
    }

    // Averages the numbers in the array (takes the mean), but leaves out the
    // lowest number when calculating. Returns 0 if there are no elements or just
    // 1 element in the array
    static double averageWithoutLowest(double[] arr) {
        if (arr.length < 2) { return 0.0; }
            double lowest = arr[0];
        for(double num: arr) {
            if (num < lowest) { lowest = num; }
        }
        double sum = 0;
        for(double num: arr) {
            if (num != lowest) { sum += num; }
        }
        return sum / (arr.length - 1);
    }
}
```

### Failure Inducing Input

This input (JUnit test case) fails

```
public class ArrayTests {
    @Test
    public void testWillFail() {
        int[] input1 = {1, 2, 3, 4, 5};
        ArrayExamples.reverseInPlace(input1);
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, input1);
    }
}
```

### Non-failure Inducing Input

This input (JUnit test case) doesn't fail

```
public class ArrayTests {
    @Test
    public void testReverseInPlace() {
        int[] input1 = {1};
        ArrayExamples.reverseInPlace(input1);
        assertArrayEquals(new int[]{1}, input1);
	}
}
```

### The Symptoms

Image of test results
![Image 1]()



# Part 2: Researching Commands
### 1. Case-Insensitive Search (-i)
The `-i` option allows `grep` to perform case-insensitive searches, which is helpful 
when the casing of the text isn't consistent or known.

**Example 1:**
```
grep -i "hello" technical/911report/chapter-1.txt

Output:
At 10:39, the Vice President updated the Secretary on the air threat conference:
Vice President: There's been at least three instances here where we've had reports
of aircraft approaching Washington-a couple were confirmed hijack. And, pursuant to
the President's instructions I gave authorization for them to be taken out. Hello?
```

This command searches for the word "hello" in `technical/911report/chapter-1.txt`, ignoring case differences
like "Hello", "HELLO", or "hello".

**Example 2:**
```
grep -i "objective" technical/government/Env_Prot_Agen/ctf7-10.txt

Output:
tests will depend largely on the objectives of the study.
If the objective of the test is to estimate the absolute
If the objective of the test is to estimate the chronic
If the objective of the test is to determine the additive
for the objectives of the test; supports adequate performance of
If the objectives of the test require the use of
samples is based on the objectives of the test and an understanding
The sampling point is determined by the objectives of the
independently for each test based on the objective of the study,
In cases where the objective of the test is to estimate
9.1.1 The objective of chronic aquatic toxicity tests with
9.2.1 If the objective of chronic aquatic toxicity tests with
replicates, and should be based on the objectives for obtaining the
6. Objective of test
depending on the degree of the departure and the objective of the
toxicant test, and the objective of the test. More frequent and/or
quality objectives and quality assurance plan.
```

Searches for "objective" in `technical/government/Env_Prot_Agen/ctf7-10.txt`, 
capturing all cases such as "Objective", "OBJECTIVE", etc.

---

### 2. Recursive Search (-r)
Using `-r`, `grep` searches through all directories and subdirectories starting 
from the specified path, making it powerful for comprehensive searches across many files.

**Example 1:**

```
grep -r "combination" technical/government

Output:
./technical/government/About_LSC/Strategic_report.txt:visits conducted in combination with state planning visits took
./technical/government/About_LSC/LegalServCorp_v_VelazquezOpinion.txt:many instances the grantees are funded by a combination of LSC
./technical/government/About_LSC/conference_highlights.txt:combination of audio-video conferencing with document assembly. 2)
./technical/government/About_LSC/conference_highlights.txt:combinations of services. I would encourage an agenda that
./technical/government/Env_Prot_Agen/multi102902.txt:combinations of control retrofits on a single unit. Chapter 6
./technical/government/Env_Prot_Agen/multi102902.txt:total of 900 MWe, for any combination into a single common
./technical/government/Env_Prot_Agen/multi102902.txt:combination with existing technologies. To the extent that other
./technical/government/Env_Prot_Agen/multi102902.txt:There are also several other combinations that may be used,
./technical/government/Env_Prot_Agen/multi102902.txt:including combinations of ACI with spray dryer and FF and
./technical/government/Env_Prot_Agen/multi102902.txt:combinations of ACI with FGD.32 The various combinations will be
./technical/government/Env_Prot_Agen/multi102902.txt:discussed further in Section 4.2. In each of these combinations,
./technical/government/Env_Prot_Agen/multi102902.txt:particular combination of equipment chosen for mercury reduction at
./technical/government/Env_Prot_Agen/multi102902.txt:Because combination of SCR and FGD are expected to have high
./technical/government/Env_Prot_Agen/multi102902.txt:This chapter will explore the combination of these technologies
./technical/government/Env_Prot_Agen/multi102902.txt:combination of FGD and SCR. Hence, the synergies of combining all
./technical/government/Env_Prot_Agen/multi102902.txt:2.5 and 3.5, or from a combination of technologies, as described in
./technical/government/Env_Prot_Agen/section-by-section_summary.txt:later than December 31, 2015 through a combination of reductions
./technical/government/Env_Prot_Agen/jeffordslieberm.txt:The combination of increased prices and the availability of more
./technical/government/Env_Prot_Agen/jeffordslieberm.txt:electricity demand by about 10%. With the combination of higher
./technical/government/Env_Prot_Agen/jeffordslieberm.txt:the combination of higher efficiencies and earlier availability of
./technical/government/Env_Prot_Agen/jeffordslieberm.txt:same year). At the same time, the combination of a lower demand for
./technical/government/Env_Prot_Agen/jeffordslieberm.txt:in total expenditures by 2015. The combination of a 12.5% reduction
./technical/government/Env_Prot_Agen/jeffordslieberm.txt:combination of increased prices and the availability of more
./technical/government/Env_Prot_Agen/jeffordslieberm.txt:The combination of increased prices and the availability of more
./technical/government/Env_Prot_Agen/jeffordslieberm.txt:With the combination of higher prices and improved efficiency,
./technical/government/Env_Prot_Agen/ctf1-6.txt:A control chart should be prepared for each combination
./technical/government/Env_Prot_Agen/ctm4-10.txt:A control chart should be prepared for each combination
./technical/government/Env_Prot_Agen/atx1-6.txt:A control chart should be prepared for each combination
./technical/government/Env_Prot_Agen/bill.txt:combination with any amount of any other fuel in any
./technical/government/Env_Prot_Agen/bill.txt:combusting fossil fuel, alone or incombination with any amount of
./technical/government/Env_Prot_Agen/bill.txt:means any combination ofequipment used to gasify fossil fuels (with
./technical/government/Env_Prot_Agen/bill.txt:alone or in combination with any amount of any other fuel in any
./technical/government/Env_Prot_Agen/bill.txt:coal-derived fuel alone or in combination with any other
./technical/government/Env_Prot_Agen/bill.txt:fuel alone or in combination with any amount of any other fuel in
./technical/government/Env_Prot_Agen/nov1.txt:unacceptable. In addition, the combination of emission reductions
./technical/government/Alcohol_Problems/Session2-PDF.txt:ED. We need to determine the sequence and combination of questions
./technical/government/Alcohol_Problems/Session2-PDF.txt:one or a combination of structured questionnaires.10 Screening
./technical/government/Alcohol_Problems/Session3-PDF.txt:combination of blood alcohol concentration (BAC), serum gamma
./technical/government/Alcohol_Problems/Session3-PDF.txt:A combination of basic research, program implementation and
./technical/government/Alcohol_Problems/Session3-PDF.txt:The combination of the potential opportunity to affect the
./technical/government/Gen_Account_Office/d0269g.txt:high-risk areas and determined that the combination of services
./technical/government/Gen_Account_Office/Testimony_cg00010t.txt:addition, after nearly 30 years of budget deficits, the combination
./technical/government/Gen_Account_Office/Testimony_cg00010t.txt:combination of employee communications and outreach efforts, most
./technical/government/Gen_Account_Office/GovernmentAuditingStandards_yb2002ed.txt:Assignments may have a combination of objectives that
./technical/government/Gen_Account_Office/GovernmentAuditingStandards_yb2002ed.txt:individually or in combination.
./technical/government/Gen_Account_Office/d01376g.txt:operations specialist, policy/oversight manager, or any combination
./technical/government/Gen_Account_Office/d01376g.txt:information resources through a combination of such structures. In
./technical/government/Gen_Account_Office/d01376g.txt:comparison with the hybrid combination used by leading
./technical/government/Gen_Account_Office/d01376g.txt:Implementing a combination of centralized and decentralized
./technical/government/Gen_Account_Office/d01376g.txt:implements a combination of centralized and decentralized IT and
./technical/government/Gen_Account_Office/d01376g.txt:Use a combination of centralized and decentralized
./technical/government/Gen_Account_Office/Statements_Feb28-1997_volume.txt:248. This is for a combination of reasons taken together: (a)
./technical/government/Gen_Account_Office/Statements_Feb28-1997_volume.txt:Weapons Systems. Weapons systems are a combination of one
./technical/government/Gen_Account_Office/Statements_Feb28-1997_volume.txt:land acquired in combination with general PP&E, including not
./technical/government/Gen_Account_Office/Statements_Feb28-1997_volume.txt:projects, objects, or combinations thereof. The apportioned amount
./technical/government/Gen_Account_Office/Statements_Feb28-1997_volume.txt:liabilities (or a combination of both) during a period from
./technical/government/Gen_Account_Office/Statements_Feb28-1997_volume.txt:combination of these wastes, which because of its quantity,
./technical/government/Gen_Account_Office/Statements_Feb28-1997_volume.txt:WEAPONS SYSTEMS - A combination of one or more weapons with all
./technical/government/Gen_Account_Office/pe1019.txt:An example of an efficient combination of careful specification
./technical/government/Gen_Account_Office/pe1019.txt:patterns that emerged from various combinations of the elements of
./technical/government/Gen_Account_Office/pe1019.txt:validity." The second was in the combination of case study methods
./technical/government/Gen_Account_Office/pe1019.txt:The combination of methodologies in the study of the same
./technical/government/Gen_Account_Office/d03419sp.txt:combination of principle-based and rule-based standards would be
./technical/government/Gen_Account_Office/d01591sp.txt:points to a combination of factors that influence the personal
./technical/government/Gen_Account_Office/d01591sp.txt:percent through some combination of personal, business, and
./technical/government/Gen_Account_Office/d01591sp.txt:noted in section 2, the combination of these policy actions and
./technical/government/Gen_Account_Office/d01591sp.txt:were lower.5 The combination of higher returns to saving and
./technical/government/Gen_Account_Office/d01591sp.txt:Medicare, reduce the debt, or do some combination of these. How the
./technical/government/Gen_Account_Office/d01591sp.txt:help workers understand that some combination of revenue increases
./technical/government/Gen_Account_Office/d01591sp.txt:require a combination of reform options equal to 1.86 percent of
./technical/government/Gen_Account_Office/d01591sp.txt:combination of increased revenues and reduced expenditures. Various
./technical/government/Gen_Account_Office/d01591sp.txt:next 75 years would require a combination of reform options equal
./technical/government/Gen_Account_Office/d01591sp.txt:percent, or some combination of the two. According to the Office of
./technical/government/Gen_Account_Office/d01186g.txt:retained electronically, or (3) a combination of automated and
./technical/government/Gen_Account_Office/d01186g.txt:a combination of the three.
./technical/government/Gen_Account_Office/d01186g.txt:combination of these methods.
./technical/government/Gen_Account_Office/ai00134.txt:legislation of the past 40 years. The combination of reforms
./technical/government/Gen_Account_Office/d02701.txt:combination of these drawings with the fact the aircraft was a
./technical/government/Gen_Account_Office/d02701.txt:and manufacturing knowledge. This was done by a combination of four
./technical/government/Gen_Account_Office/ai2132.txt:circumstances. Although such a combination increases the risks of
./technical/government/Gen_Account_Office/og98045.txt:achievable control technology portion of the rule in combination
./technical/government/Post_Rate_Comm/Cohenetal_DeliveryCost.txt:costs for each combination of quartiles of low, medium and high
./technical/government/Post_Rate_Comm/Cohenetal_Scale.txt:inefficiencies or a combination of both. The Postal Service argues
./technical/government/Post_Rate_Comm/ReportToCongress2002WEB.txt:considered in connection with a proposed change. In combination
./technical/government/Media/AP_LawSchoolDebts.txt:difficulties. Most blamed the combination of low starting salaries
./technical/government/Media/Coup_Reshapes_Legal_Aid.txt:combination.
```

This command recursively searches for "combination" in all files under the `/technical/government` directory.

**Example 2:**

```
grep -r "Dangerous" ./technical

Output:
./technical/plos/journal.pbio.0020150.txt:A Little Guilty Knowledge Is a Dangerous Thing
./technical/plos/journal.pbio.0020262.txt:The second part, ‘The Dangerous Womb’, is about birth defects, conjoined twins, and
./technical/911report/chapter-13.3.txt:School Ties Lead Down Dangerous Paths," CTC 2003- 40028CHX, Mar. 10, 2003.
```

Searches recursively for the term "Dangerous" in all documentation files within `./technical`.

---

### 3. Only Matching (-o)
The `-o` option prints only the matched parts of a line, which is useful when 
you only need to see what was matched rather than the entire line.

**Example 1:**

```
grep -o "January [0-1000]" technical/911report/chapter-7.txt

Output:
January 1
January 1
January 1
```

This command finds and displays all occurrences of "January" followed by a number in `technical/911report/chapter-7.txt`.

**Example 2:**

```
grep -o "\bIt\b" technical/government/Media/A_helping_hand.txt

Output:
It
It
It
It
It
It
```

Extracts occurrences of the word "It" as a whole word from `technical/government/Media/A_helping_hand.txt`.

---

### 4. Line Number (-n)
The `-n` option prefixes each matching line with its line number in the file. This is particularly useful for locating the context of data within a file.

**Example 1:**

```
grep -n "alcohol" technical/government/Alcohol_Problems/Session3-PDF.txt

Output:
10:Excessive alcohol consumption plays an important role in many of
13:documented the presence of alcohol among patients admitted to
15:studies have demonstrated that even blood alcohol concentration
16:(BAC) determinations under-estimate the extent of alcohol problems
19:admission, and the fact that alcohol is a risk factor both for the
22:alcohol problems in these settings.8-12 Although there are problems
31:intervening effectively with alcohol problems in emergency
45:patients with alcohol problems encountered in the emergency
52:asked, "To what extent do you believe your alcohol consumption was
70:We do know that alcohol consumption changes for many problem
74:However, changes in alcohol consumption are often not sustained
79:emergency department seem to dissipate without an alcohol-specific
91:of re-admission or prevent re-injury related to alcohol
117:alcohol workers intervening with problem drinkers. A brief
118:intervention in an emergency department by alcohol health workers
122:referral to alcoholism treatment for patients and families who
125:alcohol treatment in 62% of the 100 consecutive cases
131:drinking or in successful connection with appropriate alcohol
133:have used blood alcohol concentration as one of the critical
144:the mechanism of action of these interventions was reduced alcohol
152:alcohol consumption and consequences. Several current publications
157:combination of blood alcohol concentration (BAC), serum gamma
171:reduction occurred among the patients with mild to moderate alcohol
177:with more chronic and severe alcohol dependence. Another limitation
185:following an alcohol-related event randomly assigned 94 of the 184
188:driving and a list of alcohol treatment agencies. The intervention,
194:alcohol-related injuries, and alcohol-related problems were
209:specialists trained in alcohol or substance abuse counseling or in
217:avoid alcohol-related injuries in the future. Substance abuse
223:settings have delivered brief alcohol-focused interventions. These
226:brief, patient-centered alcohol counseling intervention delivered
228:produced significant reductions in alcohol consumption among both
232:alcohol intervention.9,26,35,36 However, few studies of
237:these alcohol-focused interventions for a variety of practical,
241:problematic alcohol consumption, the connection between injury and
250:alcohol is the goal of these treatment programs.37 On the other
261:abstinence from alcohol.
268:alcohol interventions.25 However, postponing intervention to the
274:alcohol interventions in medical settings have been effective,32
298:department and trauma center patients into alcoholism
320:This review of interventions, focused on addressing alcohol
333:have alcohol use problems, and there are published guidelines for
337:positioned to implement pro-grams of alcohol screening,
339:control and prevention, little has been done to incorporate alcohol
342:of trauma centers which revealed that blood alcohol testing, which
349:to identify patients with alcohol use problems.
351:regarding alcohol problems in emergency departments, a survey of
354:alcohol-impaired drivers.41 However, ambivalent attitudes were
355:revealed concerning alcoholics and alcoholism. On a scale of 0
356:(strongly disagree) to 7 (strongly agree) the statement "alcoholics
358:statement "alcoholism is a treat-able disease" received a mean
362:"defeatism about alcoholism management." In a recent survey of
363:emergency medicine physicians, 78% agreed that alcohol
371:asking about alcohol use but few used recommended screening
389:settings to reduce drinking and alcohol related risks. The first
393:problems can be identified along a range of alcohol use and
397:set for more or less severe alcohol problems. However, whatever the
414:the alcohol problem and the needs of the patient. Many treatment
416:by level of alcohol problem, although controlled trials do not
425:screening instrument that identifies individuals with alcohol
430:interventions, understand alcohol problems, and are armed with a
453:levels of severity? Individuals with less severe alcohol problems
463:the intervention for alcohol problems? Most emergency department
501:make interventions for alcohol problems more feasible? For example,
526:template with options incorporating the alcohol problem
530:been published that deal with alcohol dependence and abuse and
538:Zuska, a surgeon with an interest in alcohol problems among injured
539:patients noted: "The crisis that brings the alcoholic to the
545:alcohol problems have the potential to reduce alcohol-related
551:1. Cherpitel CJ. Screening for alcohol problems in the
553:2. Degutis LC. Screening for alcohol problems in emergency
557:3. Ewing JA. Detecting alcoholism: the CAGE questionnaire. JAMA
567:alcohol abuse in trauma patients. Arch Surg 1993;128:907-13.
573:PA, Craig SA, Zink BJ. Patients with alcohol problems in the
578:PA, Craig SA, Zink BJ. Patients with alcohol problems in the
589:role of alcohol and other drugs-an EAST position paper prepared by
593:alcohol-related injuries. Substance abuse interventions in general
600:Russlee AC. Attribution of injury to alcohol involvement in
602:seriously injured in alcohol-related motor vehicle crashes.
623:reduction with alcohol-positive older adolescents in a
633:opportunity to initiate treatment in the alcoholic. Am J Surg
653:alcohol-related trauma. Br J Oral Maxillofac Surg
658:alcohol health worker in an accident and emergency
675:alcohol problems. Acad Emerg Med 2000; 7:1383-92.
681:Brief physician advice for problem alcohol drinkers: a randomized
686:recovery after alcoholism treatment. JAMA 1992;267(5):663-7.
691:for performing alcohol interventions in trauma centers. J Trauma
698:alcohol problems: a review. Addiction 1993;88:315-36.
708:alcohol-impaired drivers: results from a national survey of
711:surveillance of alcohol intoxication after motor vehicular
714:attitudes concerning intervention for alcohol abuse/dependence in
717:interventions for alcohol problems: a national survey of primary
726:reduce alcohol intake in primary health care populations: a
729:alcoholism. In: Gurman AS, Jacobson N, editors. Clinical Handbook
740:trauma patients for alcohol problems: are insurance companies
774:emergency department (ED) with alcohol problems. We have just heard
792:to report heavy drinking, consequences of drinking, alcohol
793:dependence, or history of treatment for an alcohol problem.2
812:patients about their alcohol use. The intervention featured, the
864:often tracked. Why not include patients with alcohol problems in
876:alcohol consumption or decreases in negative consequences, such as
910:department: screening and brief intervention for alcohol problems
933:alcoholic client: The influence of experience, support, training,
949:psychotherapy for alcohol dependence. Arch Gen Psychiatry
962:Reducing death and disability related to alcohol remains a
965:identify alcohol problems and to begin interventions, particularly
967:compelling reasons make the ED an important setting for alcohol
972:alcohol problems are released from the ED rather than being
976:identification of and intervention for an alcohol problem.
1003:efficacy and ultimate effectiveness of brief alcohol interventions
1005:or alcohol-dependent drinkers. It is clear from their manuscript
1006:that a spectrum of alcohol problems presents in the ED and that a
1013:or deliver brief alcohol interventions in the ED. Previous research
1017:attrition rates, types of interventions, levels of alcohol use,
1020:drinkers, problem drinkers, alcohol-dependent drinkers) and the
1024:Brief alcohol interventions have generally included feedback by
1026:positive) to questions about alcohol consumption or consequences.
1035:effective, an ED-based brief alcohol intervention model that
1041:alcohol use. It is thought that this is particularly true if the
1046:providers cannot easily find time to conduct brief alcohol
1050:interest in doing alcohol interventions in the ED. On the other
1052:it difficult to address alcohol issues at all, particularly for
1054:conditions clearly linked to alcohol consumption.
1055:The implementation of brief alcohol intervention systems in
1058:first step, but implementation of proven alcohol screening and
1064:alcohol consumption of at-risk drinkers and the limited time for
1067:research on brief alcohol interventions specifically with the use
1076:positive for at-risk drinking or more serious alcohol-related
1082:system of intervention. Just as there is a spectrum of alcohol use
1090:New directions in brief alcohol interventions in emergency
1107:multiple health risks (e.g., smoking, alcohol use, seat belt use),
1118:to alcohol misuse and abuse.
1120:alcohol problems to those with severe dependence. In the next few
1125:alcohol use. Any methods that are developed with researchers and
1138:of alcohol-related emergency room admission. J Stud Alcohol
1150:alcohol-related injuries. Substance abuse interventions in general
1156:McCarthy M, Russlee AC. Attribution of injury to alcohol
1157:involvement in young adults seriously injured in alcohol-related
1169:physician advice for problem alcohol drinkers: a randomized
1176:alcohol health worker in an accident and emergency
1208:what motivates patients to change their use of alcohol. He noted
1215:alcohol or not, patients did equally well at follow-up.
1222:alcohol-related negative consequences and injuries at 1 year.
1250:of the study was to encourage post-discharge alcohol treatment, but
1289:alcohol-related harm, he was disappointed to find no effect on
1332:Many of the college students who visit the ED have mild alcohol
1333:problems and are confident they could overcome their alcohol
1360:control groups receive so much attention focused on alcohol that it
1365:about alcohol, and that could affect their answers. These
1368:severe alcohol problems is premature. In his study of adolescents,
1375:participate in research still had measurable blood alcohol levels.
1379:correlate mental status exam scores with alcohol levels at the time
1382:blood alcohol level patients could remember an intervention. If
1431:they know we need to be addressing alcohol problems. She asked the
1482:alcohol problems.
1486:like an appropriate venue for alcohol interventions because many ED
1487:patients have alcohol problems and the ED visit may represent a
1491:screen for alcohol-related problems, then primary care has failed.
1511:resources currently spent on alcohol problems in the ED. She noted
1512:that we have to help patients who have severe alcohol problems.
1545:severity of injury, degree of alcohol dependence, readiness to
1567:Patricia Perry reported that one alcohol intervention project in
1584:Jean Shope expressed her belief that addressing alcohol problems
1589:believed that the ED setting is just one of many where alcohol
1596:selling alcohol interventions because they are in competition with
1615:alcoholics anymore. Most use other substances as well, so it is
1630:it did not lead to changes in alcohol variables or weapon
1638:of alcohol problems was higher than other risk factors. Physicians
```

Lists occurrences of "alcohol" along with their line numbers in `technical/government/Alcohol_Problems/Session3-PDF.txt`.

**Example 2:**

```
grep -n "delivery" technical/government/Post_Rate_Comm/Cohenetal_Scale.txt

Output:
27:The delivery function is comparatively new to modern postal
32:century that city delivery began on a regular basis in the U.S. By
33:the end of the century rural delivery was started on a limited
38:inception. But delivery also changed the economics of the modern
41:delivery service, the fixed costs associated with delivery underlie
44:service at a uniform price. Second, it is argued that delivery is a
47:universal delivery system.2 The first argument is a political one
49:delivery. The second is an economic argument which presumes that
51:delivery. The analysis presented here is an attempt to address the
60:lower-than-average delivery costs, regardless of the characteristic
64:characteristics. For example, in the U.S., curb delivery is less
65:costly than park and loop delivery which is less costly than foot
66:delivery.
70:having a single firm (a monopoly) provide delivery. On the other
74:question: Do the economies of scale in the delivery function exceed
78:This paper measures the returns to scale of the U.S. delivery
81:Because delivery involves so much fixed cost, it would create a
87:the United States caused by high fixed costs in the delivery
89:This paper next estimates the value of scale in delivery
123:delivery function and the street delivery function. The former is
125:into the delivery sequence. "Delivery function" as used in this
126:paper refers to street delivery.
128:economies of scale exist in the delivery of mail.8 Other functional
132:John Panzar has characterized street delivery as a bottleneck
139:monopoly delivery service by the firms competing in processing and
167:behavior of city delivery carriers, it collects little data on the
169:assume throughout that rural delivery cost behavior is similar to
170:that of city delivery.13 In the U.S., street delivery costs for
193:The U.S. Postal Service has two types of delivery personnel;
194:city delivery carriers and rural carriers. In 1993, there were 164
195:thousand city delivery routes with 80 million delivery points and
196:49 thousand rural routes with 23 million delivery points. Rural
197:costs were 20 percent of total delivery costs.
202:This paper adopts the analysis of street delivery costs
204:over the past 20 years. That analysis disaggregates street delivery
207:drive the route, passing, but not accessing, any delivery point.
209:route in order to make a delivery. This may mean departing from the
210:basic line of travel and walking or driving to a delivery point and
212:from normal driving speed, stopping to make a delivery to a
230:receive mail each delivery day. 15 Consequently, the number of
248:street delivery costs, volumes, and delivery point characteristics
249:for city delivery carriers. The Postal Service's FY 1993 data set
264:compares the cost of providing delivery by a single firm with the
265:cost of providing delivery by two firms.18 We measure the returns
266:to scale in the U.S. postal delivery function by first determining
267:the total cost of delivery provided by the Postal Service. Next, we
268:determine the total cost of delivery performed by the incumbent and
281:Of course, the cost of providing delivery by a single firm could
285:the entire country each delivery day. Thus, each firm would have
292:receive delivery from both firms. We assume here that both firms
293:provide the same frequency of delivery (daily).19
304:bound on the benefits from scale economies of delivery.21
313:A niche incumbent might provide delivery less frequently or to a
322:scale economies in delivery are not firm specific. They are a
340:system-wide wage premium exceeds the $6.1 billion delivery scale
341:economy by $2.9 billion. Wachter's wage premium for the delivery
343:billion less than the value of the scale benefit from delivery.
386:Figure 2 presents the consumer benefit from delivery scale
405:for the delivery function alone. Thus, the net scale benefit is
408:It is far more likely that a monopoly for delivery alone would
410:included processing and transportation as well as delivery. This
413:monopoly in delivery.
427:in delivery only, will find its unit cost high relative to the
431:incumbent). Many First-Class mailers do not require daily delivery
432:and most advertising mailers do not require daily delivery.
434:administrations have the possibility of reducing delivery
436:U.S. Postal Service were to reduce delivery frequency. The
438:delivery costs. They are not so substantial when considered in the
444:delivery market.28
458:same unit delivery cost as the Postal Service. Even if this
461:unit delivery cost as the Postal Service on a national basis. This
466:Thus, the effects of economies of scale in delivery present
477:as a percentage of total costs. Therefore, street delivery costs,
480:largest component of street delivery costs, decreases with a rise
488:volume were one third of the 1993 level, then delivery costs as a
491:smaller volume postal systems, street delivery costs should also be
495:cost represented by street delivery cost, and the percentage of
496:total cost represented by fixed delivery cost for the 21 countries
500:corresponding coverage imply that its fixed portion of delivery
503:coverage for 1988. Thus, the fixed portion of delivery in the U.S.
506:proportions of fixed delivery cost tot total cost ranged from 12
509:from an analysis of delivery routes in the U.S., is valid for the
514:Note: Assumes fixed costs are incurred only in the delivery
517:described above, we calculate the value of scale in the delivery
523:slightly different approach because detailed street delivery cost
524:and point of delivery data are not available. We use volume per
526:street delivery cost to total cost relationship of the U.S. is the
543:than street delivery vary with volume, the value of scale is about
574:delivery function; Australia, Austria, France, Japan, Luxembourg,
577:justify a postal delivery monopoly based on economic grounds.
589:base contains a representative sample of street delivery costs,
590:volumes, and delivery point characteristics for city delivery
611:We measure the returns to scale in the U.S. postal delivery
612:function by first determining the total cost of delivery provided
616:SCm = street delivery cost
623:For the year 1993, street delivery cost totaled about $10.07
628:Next, we determine the total cost of delivery performed by the
634:where, SCfirmi = street delivery cost for firm i ACfirmi =
642:The total delivery cost for the duopoly market is simply
644:For the year 1993, total street delivery costs for the
653:delivery (i.e., in-office delivery, mail processing,
660:delivery cost and point of delivery data are not available. We use
662:assume that the street delivery cost to total cost relationship of
700:assume that all cost segments other than street delivery vary with
```

Identifies lines containing "delivery" in `technical/government/Post_Rate_Comm/Cohenetal_Scale.txt` and includes their line numbers.

# Works Cited
1. https://www.geeksforgeeks.org/grep-command-in-unixlinux/
2. https://www.freecodecamp.org/news/grep-command-tutorial-how-to-search-for-a-file-in-linux-and-unix/