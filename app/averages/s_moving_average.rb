class SMovingAverage
	def initialize(term)
		@term = term
		@currentAverage = 0
		@first = 0
	end

	def compute(prices)
		if prices.count <= @term
			sum = 0
			prices.each{|i| sum += i}
			@currentAverage = (1.0/prices.count)*sum
		else
			@currentAverage -= @first
			@first = prices.first
			@currentAverage = @currentAverage - (@first/@term) + (prices.last/@term)
		end
		@currentAverage
	end
end