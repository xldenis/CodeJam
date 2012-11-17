require 'socket'
require 'celluloid'
require 'sinatra'
Dir["./app/**/*.rb"].each {|file| load file}
require './app'
SPEED = {:fast => 5, :slow => 20}
# Define routes
get '/' do

end

get '/start' do
  App.start
end

get '/:stream/:speed' do
  if !request.websocket?
    erb :index
  else
    speed = SPEED[params[:speed].to_sym]
    raise "Invalid Speed" if speed.nil?
    stream = params[:stream]+"_"+speed.to_s
    request.websocket do |ws|
      ws.onopen do
        ws.send("opened")
        App.fetch(stream,ws)
      end
      ws.onclose do
        warn("wetbsocket closed")
        App.remove(stream,ws)
      end
    end
  end
end

#create averagers
ParallelAverager.new(:SMA,SPEED[:slow])
ParallelAverager.new(:SMA,SPEED[:fast])
ParallelAverager.new(:LWMA,SPEED[:slow])
ParallelAverager.new(:LWMA,SPEED[:fast])
ParallelAverager.new(:EMA,SPEED[:slow])
ParallelAverager.new(:EMA,SPEED[:fast])
ParallelAverager.new(:TMA,SPEED[:slow])
ParallelAverager.new(:TMA,SPEED[:fast])