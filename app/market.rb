class MarketWatcher 
def initialize(url,socket,delim="|")

@socket = TCPSocket.new(url,socket)
@delim = delim
end

def gets
  @socket.gets(@delim).chomp @delim
end
def puts(val)
  @socket.puts(val)
end

def close
  @socket.close
end
end