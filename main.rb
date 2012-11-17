require 'socket'
Dir["./app/**/*.rb"].each {|file| load file}
FAST = 5
SLOW = 20
m = MarketWatcher.new("localhost",8211,"|")
slowvalues = Fifo.new(10)
m.puts("H")
p slowvalues.insert(m.gets)

a = SMovingAverage.new(5)

a.compute([1,2,3,4,5])
