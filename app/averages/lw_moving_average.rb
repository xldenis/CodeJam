class LWMovingAverage
	def initialize(term)
		@term = term
	end	

	def compute(prices)
		sum = 0
		prices.each_with_index{|price,index| sum += price*index}
		return (2.0/(prices.count*(prices.count+1)))*sum
	end
end
LWMovingAverage.new(5).compute([1,2,3])