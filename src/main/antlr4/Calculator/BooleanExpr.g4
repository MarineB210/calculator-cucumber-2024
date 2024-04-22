grammar BooleanExpr;
// Parser rules

prog : exp ;

// Lexer rules

// expression

exp : infix
    | prefix
    | postfix
    ;

// infix expression

infix : NOT infix               # NOTinfix
      | infix AND infix         # ANDinfix
      | infix OR infix          # ORinfix
      | infix IMPL infix        # IMPLinfix
      | infix XOR infix         # XORinfix
      | infix EQ infix          # EQinfix
      | BOOL                    # boolInfix
      | '(' infix ')'           # parensBoolInfix
      ;

// prefix expression

prefix :  NOT prefix                                    # NOTprefix
        | AND '(' prefix  ((',')? prefix)+ ')'          # ANDprefix
        | OR '(' prefix ((',')? prefix)+ ')'            # ORprefix
        | IMPL '(' prefix ((',')? prefix)+ ')'          # IMPLprefix
        | XOR '(' prefix ((',')? prefix)+ ')'           # XORprefix
        | EQ '(' prefix ((',')? prefix)+ ')'            # EQprefix
        | BOOL                                          # boolPrefix
        | '(' prefix ')'                                # parensBoolPrefix
        ;

// postfix expression
postfix : postfix NOT                                    # NOTpostfix
        | '(' postfix  ((',')? postfix)+ ')' AND         # ANDpostfix
        | '(' postfix ((',')? postfix)+ ')' OR           # ORpostfix
        | '(' postfix ((',')? postfix)+ ')' IMPL         # IMPLpostfix
        | '(' postfix ((',')? postfix)+ ')' XOR          # XORpostfix
        | '(' postfix ((',')? postfix)+ ')' EQ           # EQpostfix
        | BOOL                                           # boolPostfix
        | '(' postfix ')'                                # parensBoolPostfix
        ;

NOT : 'NOT';
AND : 'AND';
OR : 'OR';
IMPL : 'IMPL';
XOR : 'XOR';
EQ : 'EQ';
BOOL : [0|1] ;
WS : [ \t\n\r]+ -> skip ;