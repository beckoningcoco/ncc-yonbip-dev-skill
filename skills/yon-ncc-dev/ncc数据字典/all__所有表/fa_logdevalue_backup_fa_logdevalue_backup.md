# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8148.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_devalue | pk_devalue | pk_devalue | char(20) | √ |
| 2 | accdept | accdept | accdept | number(28, 8) |
| 3 | bill_code | bill_code | bill_code | varchar2(40) |
| 4 | devaluereason | devaluereason | devaluereason | varchar2(20) |  |  | '~' |
| 5 | devaluevalue | devaluevalue | devaluevalue | number(28, 8) |
| 6 | devalue_date | devalue_date | devalue_date | char(19) |
| 7 | locavalue | locavalue | locavalue | number(28, 8) |
| 8 | pk_accbook | pk_accbook | pk_accbook | varchar2(20) |  |  | '~' |
| 9 | pk_card | pk_card | pk_card | char(20) | √ |
| 10 | recorder | recorder | recorder | varchar2(20) |  |  | '~' |
| 11 | returnvalue | returnvalue | returnvalue | number(28, 8) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |