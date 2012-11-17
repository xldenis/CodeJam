class SMovingAverage
	def initialize(term)
		@term = term
		@current_average = 0
		@first = 0
	end

	def compute(prices)
		if prices.count <= @term
			sum = 0
			prices.each{|i| sum += i}
			@current_average = (1.0/prices.count)*sum
		else
			@current_average -= @first
			@first = prices.first
			@current_average = @current_average - (@first/@term) + (prices.last/@term)
		end
		@current_average
	end
end