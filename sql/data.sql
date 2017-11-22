INSERT INTO Questions (question_ID, question_text, number_choices, chapter_ID) VALUES (1001, 'Which question no longer concerns the modern software engineer?',
 4,1);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (1001, 'Why does computer hardware cost so much?', -1, 1);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (1001, 'Why does software take a long time to finish?', -1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (1001, 'Why does it cost so much to develop a piece of software?', -1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (1001, 'Why can�t software errors be removed from products prior to delivery?', -1, 0);
INSERT INTO Questions (question_ID, question_text, number_choices, chapter_ID) VALUES (1002, 
'Software is a product and can be manufactured using the same technologies used for other engineering artifacts', 2,1);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (1002, 'True', 0, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (1002, 'False', 1, 1);
INSERT INTO Questions (question_ID, question_text, number_choices, chapter_ID) VALUES (1003, 'Software deteriorates rather than wears out because', 4,1);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (1003, 'Software suffers from exposure to hostile environments', -1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (1003, 'Defects are more likely to arise after software has been used often', -1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (1003, 'Multiple change requests introduce errors in component interactions', -1, 1);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (1003, 'Software spare parts become harder to order', -1, 0);
INSERT INTO Questions (question_ID, question_text, number_choices, chapter_ID) VALUES (1004, 
'WebApps are a mixture of print publishing and software development, making their development outside the realm of software engineering practice.', 2,1);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (1004, 'True', 0, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (1004, 'False', 1, 1);
INSERT INTO Questions (question_ID, question_text, number_choices, chapter_ID) VALUES (1005, 
'There are no real differences between creating WebApps and MobileApps.', 2,1);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (1005, 'True', 0, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (1005, 'False', 1, 1);
INSERT INTO Questions (question_ID, question_text, number_choices, chapter_ID) VALUES (1006, 
'In its simplest form an external computing device may access cloud data services using a web browser.', 2,1);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (1006, 'True', 0, 1);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (1006, 'False', 1, 0);
INSERT INTO Questions (question_ID, question_text, number_choices, chapter_ID) VALUES (1007, 
'Product line software development depends the reuse of existing software components to provide software engineering leverage.', 2,1);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (1007, 'True', 0, 1);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (1007, 'False', 1, 0);
INSERT INTO Chapters (chapter_ID, number_questions) VALUES (1, 7);
INSERT INTO Questions (question_ID, question_text, number_choices, chapter_ID) VALUES (2001, 
'Which of the items listed below is not one of the software engineering layers?', 4,2);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (2001, 'Process', -1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (2001, 'Manufacturing', -1, 1);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (2001, 'Methods', -1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (2001, 'Tools', -1, 0);
INSERT INTO Questions (question_ID, question_text, number_choices, chapter_ID) VALUES (2002, 
'Software engineering umbrella activities are only applied during the initial phases of software development projects.', 2,2);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (2002, 'True', 0, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (2002, 'False', 1, 1);
INSERT INTO Questions (question_ID, question_text, number_choices, chapter_ID) VALUES (2003, 
'Which of these are the 5 generic software engineering framework activities?', 4,2);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (2003, 'communication, planning, modeling, construction, deployment', -1, 1);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (2003, 'communication, risk management, measurement, production, reviewing', -1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (2003, 'analysis, designing, programming, debugging, maintenance', -1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (2003, 'analysis, planning, designing, programming, testing', -1, 0);
INSERT INTO Questions (question_ID, question_text, number_choices, chapter_ID) VALUES (2004,
 'Planning ahead for software reuse reduces the cost and increases the value of the systems into which they are incorporated.', 2,2);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (2004, 'True', -1, 1);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (2004, 'False', 1, 0);
INSERT INTO Questions (question_ID, question_text, number_choices, chapter_ID) VALUES (2005, 
'The essence of software engineering practice might be described as understand the problem, plan a solution, carry out the plan, and examine the result for accuracy.', 2,2);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (2005, 'True', 0, 1);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (2005, 'False', 1, 0);
INSERT INTO Questions (question_ID, question_text, number_choices, chapter_ID) VALUES (2006, 
'In agile process models the only deliverable work product is the working program.', 2,2);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (2006, 'True', 0, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (2006, 'False', 1, 1);
INSERT INTO Questions (question_ID, question_text, number_choices, chapter_ID) VALUES (2007, 
'A most software development projects are initiated to try to meet some business need.', 2,2);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (2007, 'True', 0, 1);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (2007, 'False', -1, 0);
INSERT INTO Questions (question_ID, question_text, number_choices, chapter_ID) VALUES (2008, 
'In general software only succeeds if its behavior is consistent with the objectives of its designers.', 2,2);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (2008, 'True', 0, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (2008, 'False', 1, 1);
INSERT INTO Chapters (chapter_ID, number_questions) VALUES (2, 8);
INSERT INTO Questions (question_ID, question_text, number_choices, chapter_ID) VALUES (3001, 'Which of the following are recognized process flow types?', 5,3);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (3001, 'Concurrent process flow', -1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (3001, 'Iterative process flow', 1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (3001, 'Linear process flow', 2, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (3001, 'Spiral process flow', -1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (3001, 'both b and c', 4, 1);
INSERT INTO Questions (question_ID, question_text, number_choices, chapter_ID) VALUES (3002, 
'The communication activity is best handled for small projects using six distinct actions (inception, elicitation, elaboration, negotiation, specification, validation).', 2,3);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (3002, 'True', 0, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (3002, 'False', 1, 1);
INSERT INTO Questions (question_ID, question_text, number_choices, chapter_ID) VALUES (3003, 
'A good software development team always uses the same task set for every project to insure high quality work products', 2,3);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (3003, 'True', 0, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (3003, 'False', 1, 1);
INSERT INTO Questions (question_ID, question_text, number_choices, chapter_ID) VALUES (3004, 
'Software processes can be constructed out of pre-existing software patterns to best meet the needs of a software project.', 2,3);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (3004, 'True', 0, 1);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (3004, 'False', 1, 0);
INSERT INTO Questions (question_ID, question_text, number_choices, chapter_ID) VALUES (3005, 'Which of these are standards for assessing software processes?', 5,3);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (3005, 'SEI', -1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (3005, 'SPICE', 1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (3005, 'ISO 9000', -1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (3005, 'ISO 9001', 3, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (3005, 'both b and d', 4, 1);
INSERT INTO Chapters (chapter_ID, number_questions) VALUES (3, 5);
INSERT INTO Questions (question_ID, question_text, number_choices, chapter_ID) VALUES (4001, 'The waterfall model of software development is', 4,4);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4001, 'A reasonable approach when requirements are well defined.', -1, 1);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4001, 'A good approach when a working program is required quickly.', -1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4001, 'The best approach to use for projects with large development teams.', -1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4001, 'An old fashioned model that is rarely used any more.', -1, 0);
INSERT INTO Questions (question_ID, question_text, number_choices, chapter_ID) VALUES (4002, 'The incremental model of software development is', 4,4);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4002, 'A reasonable approach when requirements are well defined.', -1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4002, 'A good approach when a working core product is required quickly.', -1, 1);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4002, 'The best approach to use for projects with large development teams.', -1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4002, 'A revolutionary model that is not used for commercial products.', -1, 0);
INSERT INTO Questions (question_ID, question_text, number_choices, chapter_ID) VALUES (4003, 'Evolutionary software process models', 4,4);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4003, 'Are iterative in nature.', -1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4003, 'Can easily accommodate product requirements changes.', -1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4003, 'Do not generally produce throwaway systems.', -1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4003, 'All of the above.', 3, 1);
INSERT INTO Questions (question_ID, question_text, number_choices, chapter_ID) VALUES (4004, 'The prototyping model of software development is', 4,4);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4004, 'A reasonable approach when requirements are well defined.', -1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4004, 'A useful approach when a customer cannot define requirements clearly.', -1, 1);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4004, 'The best approach to use for projects with large development teams.', -1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4004, 'A risky model that rarely produces a meaningful product.', -1, 0);
INSERT INTO Questions (question_ID, question_text, number_choices, chapter_ID) VALUES (4005, 
'The spiral model of software development', 4,4);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4005, 'Ends with the delivery of the software product.', -1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4005, 'Is more chaotic than the incremental model.', -1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4005, 'Includes project risks evaluation during each iteration.', -1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4005, 'All of the above.', 3, 1);
INSERT INTO Questions (question_ID, question_text, number_choices, chapter_ID) VALUES (4006, 
'The concurrent development model is', 5,4);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4006, 'Another name for concurrent engineering.', 0, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4006, 'Defines events that trigger engineering activity state transitions.', 1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4006, 'Only used for development of parallel or distributed systems.', -1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4006, 'Used whenever a large number of change requests are anticipated.', -1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4006, 'Both a and b', 4, 1);
INSERT INTO Questions (question_ID, question_text, number_choices, chapter_ID) VALUES (4007, 
'The component-based development model is', 4,4);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4007, 'Only appropriate for computer hardware design.', -1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4007, 'Not able to support the development of reusable components.', -1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4007, 'Dependent on object technologies for support.', -1, 1);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4007, 'Not cost effective by known quantifiable software metrics.', -1, 0);
INSERT INTO Questions (question_ID, question_text, number_choices, chapter_ID) VALUES (4008, 
'The formal methods model of software development makes use of mathematical methods to', 4,4);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4008, 'Define the specification for computer-based systems.', -1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4008, 'Develop defect free computer-based systems.', -1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4008, 'Verify the correctness of computer-based systems.', -1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4008, 'All of the above.', 3, 1);
INSERT INTO Questions (question_ID, question_text, number_choices, chapter_ID) VALUES (4009, 
'Which of these is not one of the phase names defined by the Unified Process model for software development?', 4,4);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4009, 'Inception phase', -1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4009, 'Elaboration phase', -1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4009, 'Construction phase', -1, 0);
INSERT INTO Answers(question_ID, answer_text, fixed_slot, is_correct) VALUES (4009, 'Validation phase', -1, 1);
INSERT INTO Chapters (chapter_ID, number_questions) VALUES (4, 9);