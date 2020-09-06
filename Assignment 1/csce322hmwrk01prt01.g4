grammar csce322hmwrk01prt01;

// tokens
START: '<<alpha';
END: 'omega>>';
TYPE: 'Moves'|'Puzzle';
VALUE: '=';
NUM: [0-9];
MOVE: 'u'|'d'|'l'|'r';
ROW_SEP: '$';
BEGIN_BOARD: '{';
END_BOARD: '}';
BEGIN_LIST: '[';
END_LIST: ']';
AND: '&';
WS : [ \t\r\n]+{ skip(); };

// rules
boss : start moves end;
start: START;
end: END;
moves: TYPE VALUE BEGIN_LIST MOVE END_LIST END;