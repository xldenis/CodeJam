class Crossover
	def initialize
		@current_difference = nil
	end 

	def update_difference(short_average,long_average)
		if @current_difference == nil
			@current_difference = short_average - long_average
		else
			new_difference = short_average - long_average
			issue_instruction(new_difference)
			@current_difference = new_difference
		end
	end

	def issue_instruction(new_diff)
		instruction = ''
		#if short term average crosses long term average from bottom
		if @current_difference < 0 & new_diff > 0
			instruction = 'B'
		elsif @current_difference > 0 & new_diff < 0
			instruction = 'S'
		end
		instruction
	end
end