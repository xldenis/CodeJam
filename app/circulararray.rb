class Fifo < Array
  def initialize(size,*params)
    @size = size
    super(*params)
  end
  def insert(val)
    if self.count >=@size
      self.delete_at(0)
      self<<val
    else
      self<<val
    end
  end
end
