# Part 1: Bugs



# Part 2: Researching Commands
### 1. Case-Insensitive Search (-i)
The `-i` option allows `grep` to perform case-insensitive searches, which is helpful 
when the casing of the text isn't consistent or known.

**Example 1**
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

**Example 2**

```
grep -r "Dangerous" ./technical

Output:
./technical/plos/journal.pbio.0020150.txt:A Little Guilty Knowledge Is a Dangerous Thing
./technical/plos/journal.pbio.0020262.txt:The second part, ‘The Dangerous Womb’, is about birth defects, conjoined twins, and
./technical/911report/chapter-13.3.txt:School Ties Lead Down Dangerous Paths," CTC 2003- 40028CHX, Mar. 10, 2003.
```

Searches recursively for the term "Dangerous" in all documentation files within `./technical`.