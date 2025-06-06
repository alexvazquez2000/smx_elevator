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

If there is no parameter for the initial floor then the elevator is initialized to floor 1. If there is a problem parsing the parameter then the inital floor will default to floor=1.

If there is no parameters for the "floor" travel plan, then it is initialized to an empty array and the elevator doesn't move.  If there is a problem with the parameter then it is initialize to an empty array.

If a floor is duplicated then it will be shown only once on the output.  ie: floor=12,12,14 will output: 2 12,14  

There is no GUI, output is sent to the console.

There is no need for a logger.

# Test

The JUnit provide 100% test coverage.

# Excecute from command line

This assumes the code has already been compiled with: mvn compile

	cd /c/Users/alexv/workspace/smx_elevator  (or wherever the code is cloned)
	java -cp target/classes/ com.smx.elevator.Main floor=10,11,12 start=10
