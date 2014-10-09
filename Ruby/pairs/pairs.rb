def input_data
	sm_text = gets
	sm_text ||= ''
	nkarray=sm_text.split(' ').map(&:to_i);
	nkarray
end

def input_integers_string(nvalues)
	sm_text = gets
	sm_text ||= ''
	integer_arrays=sm_text.split(' ').map(&:to_i);
	input_integers_string(nvalues) until ( integer_arrays.count == nvalues )
	integer_arrays
end
nkarray=[]
nkarray = input_data until ( nkarray.count == 2 )

all_numbers = input_integers_string(nkarray[0])

hashvalues={}

all_numbers.map do |value|
	hashvalues.merge!( value=> 1 )
end
total_numbers=0
all_numbers.select do |x| 
	if (hashvalues.has_key?(x+nkarray[1]) )
		total_numbers+=1
	end
end
puts total_numbers