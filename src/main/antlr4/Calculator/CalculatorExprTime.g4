grammar CalculatorExprTime;
// Parser rules

prog : exp ;

// Lexer rules

// expression

exp : infix
    | prefix
    | postfix
    ;

// infix expression

infix : infix op=('+' | '-') infix   # AddSubInfix
      | NUMBER ':' NUMBER ':' NUMBER (op=('AM' | 'PM'))? (op=('CET+' | 'CET-') NUMBER+)?   # timeInfix
      | NUMBER ':' NUMBER ':' NUMBER ':' NUMBER ':' NUMBER ':' NUMBER
        (op=('AM' | 'PM'))? (op=('CET+' | 'CET-') NUMBER+)?   # dateInfix
      | '(' infix ')'                 # parensInfix
      ;

// prefix expression

prefix :  op=('+' | '-') '(' prefix? ((',')? prefix)+ ')'   # AddSubPrefix
        | NUMBER ':' NUMBER ':' NUMBER (op=('AM' | 'PM'))? (op=('CET+' | 'CET-') NUMBER+)?   # timePrefix
        | NUMBER ':' NUMBER ':' NUMBER ':' NUMBER ':' NUMBER ':' NUMBER
          (op=('AM' | 'PM'))? (op=('CET+' | 'CET-') NUMBER+)?   # datePrefix
        | '(' prefix ')'                                # parensPrefix
        ;

// postfix expression
postfix : '(' postfix? ((',')? postfix)+ ')' op=('+' | '-')   # AddSubPostfix
        | NUMBER ':' NUMBER ':' NUMBER (op=('AM' | 'PM'))? (op=('CET+' | 'CET-') NUMBER+)?   # timePostfix
        | NUMBER ':' NUMBER ':' NUMBER ':' NUMBER ':' NUMBER ':' NUMBER
          (op=('AM' | 'PM'))? (op=('CET+' | 'CET-') NUMBER+)?   # datePostfix
        | '(' postfix ')'                                   # parensPostfix
        ;

AM : 'AM';
PM : 'PM';
CETADD: 'CET+';
CETSUB : 'CET-';
ADD : '+';
SUB : '-';
NUMBER : [0-9]+ ;
WS : [ \t\n\r]+ -> skip ;