# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8104.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_capitalsource | pk_capitalsource | pk_capitalsource | char(20) | √ |
| 2 | capitalsource | capitalsource | capitalsource | varchar2(20) | √ |  | '~' |
| 3 | monthncumnum | monthncumnum | monthncumnum | number(28, 8) |
| 4 | ncumnum | ncumnum | ncumnum | number(28, 8) |
| 5 | nnum | nnum | nnum | number(28, 8) |
| 6 | norignalnum | norignalnum | norignalnum | number(28, 8) |
| 7 | percent | percent | percent | number(28, 8) |
| 8 | pk_accbook | pk_accbook | pk_accbook | varchar2(20) |  |  | '~' |
| 9 | pk_card | pk_card | pk_card | char(20) | √ |
| 10 | pk_cardhistory | pk_cardhistory | pk_cardhistory | varchar2(20) |
| 11 | pk_jobmngfil | pk_jobmngfil | pk_jobmngfil | varchar2(20) |  |  | '~' |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |