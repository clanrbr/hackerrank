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

all_numbers.sort!.reverse!

total_sum=0
all_numbers.each_with_index do |number,index|
	if ( index+1 > nkarray[1])
		total_sum += ((index/nkarray[1]) + 1)*number
	else
		total_sum += number
	end
end
puts total_sum