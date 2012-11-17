class EMovingAverage
	def initialize(term)
		@term = term
		@current_average = 0
	end

	def compute(price)
		if @current_average == 0
			@current_average = price
		else
			@current_average = @current_average + (2.0/(@term+1))*(price-@current_average)
		end
		@current_average
	end
end