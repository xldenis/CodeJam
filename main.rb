require 'socket'
require 'celluloid'

Dir["./app/**/*.rb"].each {|file| load file}
FAST = 5
SLOW = 20
m = MarketWatcher.new("localhost",8211,"|")
m.puts("H")
test = ParallelAverager.new(:EMovingAverage,10)
t = TestSubscriber.new