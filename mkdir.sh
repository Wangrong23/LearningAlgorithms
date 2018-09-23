#!/bin/sh
cd ~/文档/code/Algorithms
c=5
s1=5 s2=5 s3=5 s4=4 s5=5
s1p1=11 s1p2=5 s1p3=4 s1p4=10 s1p5=3
s2p1=6 s2p2=4 s2p3=3 s2p4=5 s2p5=4
s3p1=7 s3p2=3 s3p3=5 s3p4=5 s3p5=5
s4p1=8 s4p2=6 s4p3=7 s4p4=7
s5p1=5 s5p2=5 s5p3=6 s5p4=6
for ((i=1;i<=$c;i++))
do
	eval w=\$"s"$i
	echo $w
	for ((j=1;j<=$w;j++)) 
	do
		eval z="s"$i"p"$j
		echo $z
		for ((k=1;k<=$z;k++))
		do
			mkdir -p chapter_0$i/section$i.$j/part$i.$j.$k
		done
	done
done

