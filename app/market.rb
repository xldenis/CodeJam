class MarketWatcher 
  include Celluloid
  include Celluloid::Notifications
def initialize(url,socket,delim="|")

@socket = TCPSocket.new(url,socket)
@delim = delim
end

def gets
  t = @socket.gets(@delim).chomp @delim
  publish("market_data",t.to_f  )
  t
end
def puts(val)
  @socket.puts(val)
end

def close
  @socket.close
end
def get_all
  until gets.include? "C" do end

end
def begin
  puts("H")
  get_all
end
end