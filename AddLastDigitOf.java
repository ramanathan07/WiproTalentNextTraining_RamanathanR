class AddLastDigitOf
{
	public int addLastDigitOf(int input1) {
		// Read only region end
		if(input1>=0 && input2>=0)
        return (input1%10)+(input2%10);
        
        else if(input1<0 && input2<0)
        return (-1*(input1%10))+(-1*(input2%10));

        else if(input1>=0 && input2<0)
        return (input1%10)+(-1*(input2%10));

        else if(input1<0 && input2>=0)
        return (-1*(input1%10))+(input2%10);

        else
		throw new UnsupportedOperationException("addLastDigits(int input1,int input2)");
	}
}
