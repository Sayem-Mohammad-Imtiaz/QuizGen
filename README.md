# QuizGen - **lab group 1**


## System Requirement(s) 

Any browser with HTML5 compatibility and Javascript support is fine to run the application.  No additional software is required to install.


## User Guideline


**Take New Quiz**
  - Navigate to the page which is hosting the quiz generation software which should be provided by the instructor. (URI: /quizgen/)
  - You should now see a webpage with two tabs, a list of chapters, and a text box.
  - If you would like to create a new quiz, select which chapters you would like to be tested on and type how many questions per chapter       you want in the text box. If you would like to retake a quiz, see the next section.
  - Click the "SUBMIT" button
  - You should now be taken to a new page (URI: /quizgen/quiz/new/) for taking the quiz 
  - Take the quiz. You can either choose to answer a question by selecting options presented as 'Radio Box' or leave answered.
  - After you have completed the quiz, click the "SUBMIT" button.
  - You should now be looking at the quiz statistics page. (URI: /quizgen/quiz/result/)
  - If you would like to take another quiz, click the "Take Test Again!" link. This will bring you back to the chapter selection page.
  
**Retake Quiz**

- Navigate to the page which is hosting the quiz generation software which should be provided by the instructor. (URI: /quizgen/)
- You should now see a webpage with two tabs, a list of chapters, and a text box.
- At the top of the page, click the "Retake Quiz" tab.
- Select which chapters you would like to be tested on, type how many questions per chapter you want in the text box, and enter the quiz number you would like to take.
- Click the "SUBMIT" button
- You should now be taken to a new page (URI: /quizgen/quiz/retake/) for retaking the quiz 
- Take the quiz. You can either choose to answer a question by selecting options presented as 'Radio Box' or leave answered.
- After you have completed the quiz, click the "SUBMIT" button.
- You should now be looking at the quiz statistics page. (URI: /quizgen/quiz/result/)
- Please see section below to know how to interpret the statistics page
- If you would like to take another quiz, click the "Take Test Again!" link. This will bring you back to the chapter selection page.

**Interpreting Statistcis**
- Once you are done with taking quiz, a page that showing your performance will be generated. (URI: /quizgen/quiz/result/)
- The statistics at the top are your personal statistics on how well you performed on your quiz. It includes:
  - Number of questions you got correct.
  - Number of questions answered wrong
  - Number of questions you didn't answer
  - Total score in percentage
- The statistics shown next to each question are the overall stats for each question as answered by everyone. It includes
  - Number of times it has been attempted
  - Number of times it has been captured correctly
  - Overall success rate on this question till the date
