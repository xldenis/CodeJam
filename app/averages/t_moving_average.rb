class TMovingAverage
	def initialize(term)
		@term = term
	end

	def compute(prices)
		return (1.0/prices.count)*SMovingAverage.new(@term).compute(prices)
	end
end