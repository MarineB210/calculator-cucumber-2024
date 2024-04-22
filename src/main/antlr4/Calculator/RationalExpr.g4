grammar RationalExpr;
// Parser rules

prog : exp ;

// Lexer rules

// expression

exp : infix
    | prefix
    | postfix
    ;

// infix expression
infix : infix op=(MUL | DIV) infix                          # MulDivInfix
      | infix op=(ADD | SUB) infix                          # AddSubInfix
      | rational                                            # rationalInfix
      | SUB? '(' infix ')'                                  # parensInfix
      ;

// prefix expression
prefix :  op=(MUL | DIV) '(' prefix  ((',')? prefix)+ ')'   # MulDivPrefix
        | op=(ADD | SUB) '(' prefix ((',')? prefix)+ ')'    # AddSubPrefix
        | rational                                          # rationalPrefix
        | SUB? '(' prefix ')'                               # parensPrefix
        ;

// postfix expression
postfix : '(' postfix ((',')? postfix)+ ')' op=(MUL | DIV)  # MulDivPostfix
        | '(' postfix ((',')? postfix)+ ')' op=(ADD | SUB)  # AddSubPostfix
        | rational                                          # rationalPostfix
        | '(' postfix ')' SUB?                              # parensPostfix
        ;

// numbers expression
rational: integer (FRAC integer)?                           # rationalNumber
        ;

integer: SUB? NUMBER                                        # integerNumber
       ;

MUL : '*';
DIV : '/';
ADD : '+';
SUB : '-';
FRAC : '÷';
NUMBER : [0-9]+ ;
WS : [ \t\n\r]+ -> skip ;