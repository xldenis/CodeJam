class LWMovingAverage
	def initialize(term)
		@term = term
	end	

	def compute(prices)
		sum = 0
		prices.each_with_index{|price,index| sum += price*(index+1)}
		return (2.0/(prices.count*(prices.count+1)))*sum
	end
end