class ParallelAverager
  include Celluloid
  include Celluloid::Notifications
  def initialize(strategy,speed)
    @array = Fifo.new(speed)
    @channel = "#{strategy.to_s}_#{speed.to_s}"
    p @channel
    @avg = Kernel.const_get(strategy).new(speed)
    subscribe("market_data",:compute)
  end

  def compute(channel,val)
    @array.insert(val)

    publish(@channel,@avg.compute(@array))
  end

end