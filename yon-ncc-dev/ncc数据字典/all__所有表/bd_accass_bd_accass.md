# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6709.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accass | pk_accass | pk_accass | char(20) | √ |
| 2 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 3 | id | id | id | number(38, 0) |
| 4 | isbalancecontrol | isbalancecontrol | isbalancecontrol | char(1) |
| 5 | isempty | isempty | isempty | char(1) |
| 6 | isnonleafused | isnonleafused | isnonleafused | char(1) |
| 7 | issumprint | issumprint | issumprint | char(1) |
| 8 | num | num | num | number(38, 0) |  |  | 1 |
| 9 | pk_accasoa | pk_accasoa | pk_accasoa | char(20) | √ |
| 10 | pk_accchart | pk_accchart | pk_accchart | varchar2(20) |  |  | '~' |
| 11 | pk_coveraccasoa | pk_coveraccasoa | pk_coveraccasoa | varchar2(20) |  |  | '~' |
| 12 | pk_entity | pk_entity | pk_entity | char(20) | √ |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |