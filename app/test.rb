class TestSubscriber
  include Celluloid
  include Celluloid::Notifications

  attr_reader :count
  def initialize()
    subscribe("avg_data",:test)
    @count = 0
  end
  def test(channel,var)
    p var
    @count+=1
  end
  def go
    while true do
    publish("EMovingAverage_20","test")
  end
  end
end