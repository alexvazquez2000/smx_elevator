# smx_elevator
SMX interview

# Elevator Project:

•    Provide code that simulates an elevator. You are free to use any language.

•    Upload the completed project to GitHub (public) for discussion during interview.

•    Document all assumptions and any features that weren’t implemented.

•    The result should be an executable, or script, that can be run with the following inputs and generate the following outputs.

                  Inputs: [list of floors to visit] (e.g. elevator start=12 floor=2,9,1,32)

                  Outputs: [total travel time, floors visited in order] (e.g. 560 12,2,9,1,32)

                  Program Constants: Single floor travel time: 10

#Submission Instructions:

Once your project is complete, please upload it to GitHub and send me the link by the day prior to your scheduled interview. This will allow the team enough time to review your project.

#Assumptions

If there is no parameter for the initial floor then it will be initialized to floor 12 per the sample input. If there is a problem parsing the parameter then the inital floor will default to floor=1.   A more generic approach would be to initialize to floor=1 but it made it simple to test.

If there is no parameters for the "floor" travel plan, then it is initialized to floors=2,9,1,32.    A more generic solution would have it initialized to an empty array, but this made it easier to test.   If there is a problem with the parameter then it is initialize to an empty array.

If a floor is duplicated then it will be shown only once on the output.  ie: floor=12,12,14 will output: 2 12,14
