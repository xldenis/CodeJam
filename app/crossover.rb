class Crossover
	def initialize
		@current_difference = nil
	end 

	#updates the difference and detects any crossovers, returns the corresponding instruction
	def update(short_average,long_average)
		if @current_difference == nil
			@current_difference = short_average - long_average
		else
			new_difference = short_average - long_average
			instruction = instruction(new_difference)
			@current_difference = new_difference
		end
		instruction #return
	end

	private
	#computes the corresponding instruction to the new state of averages
	def instruction(new_diff)
		instruction = ''
		#if short term average crosses long term average from bottom
		if @current_difference < 0 & new_diff > 0
			instruction = 'B'
		# if short term average crosses long term average from top
		elsif @current_difference > 0 & new_diff < 0
			instruction = 'S'
		end
		instruction #return
	end
end