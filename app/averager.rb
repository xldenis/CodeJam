
#Simple Moving Average
#Gives equal weighting to all elements
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
#Linear Weight Moving Average
#Distributes weight linearly so that item n-1 and n have n-1, n weight respectively
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
#Exponential Moving Average
#Distributes weight exponentiall so that new items are exponentially heavier than old ones
class EMovingAverage
  def initialize(term)
    @term = term
    @current_average = 0
  end

  def compute(price_array)
    price = price_array.last
    if @current_average == 0
      @current_average = price
    else
      @current_average = @current_average + (2.0/(@term+1))*(price-@current_average)
    end
    @current_average
  end
end
#Triangle Moving Average
#Average of simple moving averages
class TMovingAverage
  def initialize(term)
    @term = term
  end

  def compute(prices)
    return (1.0/prices.count)*SMovingAverage.new(@term).compute(prices)
  end
end
SMA = SMovingAverage
LWMA = LWMovingAverage
EMA = EMovingAverage
TMA = TMovingAverage