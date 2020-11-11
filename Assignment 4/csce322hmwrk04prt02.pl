quickestWin(Puzzle,[a,b,l,l,l,c]).

nth2D(List, Row, Column, Val):- nth0(Row,List,ListRow), nth0(Column, ListRow, Val).
findall(I, nth0(I,List,7)),Res).