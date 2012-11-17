class App
  include Celluloid
  @@streams = {}
  @@fetcher = nil
  def self.start
    @@fetcher = MarketWatcher.new('localhost',8211,"|").future.begin unless @@fetcher
  end
  def self.fetch(stream,output)
    streams = @@streams[stream]||@@streams[stream] = DataStream.new(stream)
    streams.add_subscriber(output)
    p @@streams.count
  end
  def self.remove(stream,output)
    stream = @@streams[stream]
    stream.remove_subscriber(output)
  end
end