# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11157.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_facasshistory | pk_facasshistory | pk_facasshistory | char(40) | √ |
| 2 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 3 | isbalancecontrol | isbalancecontrol | isbalancecontrol | char(1) |
| 4 | isempty | isempty | isempty | char(1) |
| 5 | isnonleafused | isnonleafused | isnonleafused | char(1) |
| 6 | issumprint | issumprint | issumprint | char(1) |
| 7 | num | num | num | number(38, 0) |
| 8 | orginalfactorasoa | orginalfactorasoa | orginalfactorasoa | char(20) |
| 9 | pk_coverfactorasoa | pk_coverfactorasoa | pk_coverfactorasoa | char(20) |
| 10 | pk_entity | pk_entity | pk_entity | varchar2(20) |  |  | '~' |
| 11 | pk_facasoahistory | pk_facasoahistory | pk_facasoahistory | char(40) | √ |
| 12 | pk_factorasoa | pk_factorasoa | pk_factorasoa | varchar2(20) |  |  | '~' |
| 13 | pk_factorass | pk_factorass | pk_factorass | varchar2(20) |  |  | '~' |
| 14 | pk_factorchart | pk_factorchart | pk_factorchart | varchar2(20) |  |  | '~' |
| 15 | seqno | seqno | seqno | number(38, 0) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |