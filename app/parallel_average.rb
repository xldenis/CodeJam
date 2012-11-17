class ParallelAverager
  include Celluloid
  include Celluloid::Notifications

  def initialize(strategy,n)
    @array = Fifo.new(n)

    @avg = Kernel.const_get(strategy).new(n)
    subscribe("market_data",:compute)
  end

  def compute(channel,val)
    @array.insert(val)

    publish("avg_data",@SMA.compute(@array))
  end

end