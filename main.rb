require 'socket'
Dir["./app/*"].each {|file| require file}
m = MarketWatcher.new("localhost",8211,"|")
m.puts("H")
p m.gets
