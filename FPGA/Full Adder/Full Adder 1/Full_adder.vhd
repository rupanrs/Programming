library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity Full_adder is
Port (A,	B,C: in STD_LOGIC;
		SUM,CARRY: out STD_LOGIC);
end Full_adder;

architecture Behavioral of Full_adder is

signal M,N: STD_LOGIC;

begin
	M <= A xor B;
	N <= A and B;
	
	SUM <= M xor C;
	CARRY <= (M and C) or N;

end architecture behavioral;