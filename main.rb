require 'socket'
Dir["./app/**/*.rb"].each {|file| load file}
FAST = 5
SLOW = 20
m = MarketWatcher.new("localhost",8211,"|")
slowvalues = Fifo.new(10)
m.puts("H")


a = SMovingAverage.new(10)

until (t = m.gets).include? "C" do 

  slowvalues.insert(t.to_f)
  p a.compute(slowvalues)
end
