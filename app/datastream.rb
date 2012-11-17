class DataStream
  require 'set'
  include Celluloid
  include Celluloid::Notifications

  def initialize(topic)
    @subscribers = Set.new
    subscribe(topic,:notify)
  end
  def add_subscriber(subscriber)
    @subscribers<<subscriber
  end
  def remove_subscriber(subscriber)
    @subscribers.delete(subscriber)
  end
  def notify(channel,value)
    @subscribers.each {|ws| ws.send(value.to_s)}
  end
end