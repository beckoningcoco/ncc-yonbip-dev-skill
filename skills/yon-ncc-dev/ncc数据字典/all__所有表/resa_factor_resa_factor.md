# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11159.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_factor | pk_factor | pk_factor | char(20) | √ |
| 2 | balanflag | balanflag | balanflag | char(1) |
| 3 | balanorient | balanorient | balanorient | varchar2(1) | √ |
| 4 | bothorient | bothorient | bothorient | char(1) |
| 5 | costfeetype | costfeetype | costfeetype | number(38, 0) |
| 6 | currency | currency | currency | varchar2(20) |  |  | '~' |
| 7 | expenseclass | expenseclass | expenseclass | number(38, 0) |
| 8 | factorclass | factorclass | factorclass | number(38, 0) |
| 9 | factorcode | factorcode | factorcode | varchar2(50) | √ |
| 10 | factorlev | factorlev | factorlev | number(38, 0) |
| 11 | factorname | factorname | factorname | varchar2(200) | √ |
| 12 | factorname2 | factorname2 | factorname2 | varchar2(200) |
| 13 | factorname3 | factorname3 | factorname3 | varchar2(200) |
| 14 | factorname4 | factorname4 | factorname4 | varchar2(200) |
| 15 | factorname5 | factorname5 | factorname5 | varchar2(200) |
| 16 | factorname6 | factorname6 | factorname6 | varchar2(200) |
| 17 | feetype | feetype | feetype | number(38, 0) |
| 18 | feetypedoc | feetypedoc | feetypedoc | varchar2(20) |  |  | '~' |
| 19 | incomeexpenses | incomeexpenses | incomeexpenses | number(38, 0) |
| 20 | incurflag | incurflag | incurflag | char(1) |
| 21 | isexpland | isexpland | isexpland | char(1) |
| 22 | issemigood | issemigood | issemigood | char(1) |
| 23 | isworkfactor | isworkfactor | isworkfactor | char(1) |
| 24 | pk_factorchart | pk_factorchart | pk_factorchart | varchar2(20) |  |  | '~' |
| 25 | pk_factortype | pk_factortype | pk_factortype | varchar2(20) |
| 26 | pk_originalfactor | pk_originalfactor | pk_originalfactor | varchar2(20) |
| 27 | price | price | price | char(1) |
| 28 | quantity | quantity | quantity | char(1) |
| 29 | quantitycheck | quantitycheck | quantitycheck | char(1) |
| 30 | remcode | remcode | remcode | varchar2(50) |
| 31 | sealflag | sealflag | sealflag | char(1) |
| 32 | sumprint_level | sumprint_level | sumprint_level | number(38, 0) |
| 33 | unit | unit | unit | varchar2(20) |  |  | '~' |
| 34 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 35 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 36 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 37 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 38 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 39 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 40 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 41 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 42 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 43 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 44 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 45 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |