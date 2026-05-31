# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8105.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_capitalsourcehis | pk_capitalsourcehis | pk_capitalsourcehis | char(40) | √ |
| 2 | accyear | accyear | accyear | varchar2(50) | √ |
| 3 | addstate | addstate | addstate | char(1) | √ |  | 'N' |
| 4 | ncumnum | ncumnum | ncumnum | number(28, 8) | √ |  | 0 |
| 5 | nmonthcumnum | nmonthcumnum | nmonthcumnum | number(28, 8) | √ |  | 0 |
| 6 | nnum | nnum | nnum | number(28, 8) | √ |  | 0 |
| 7 | period | period | period | varchar2(50) | √ |
| 8 | pk_accbook | pk_accbook | pk_accbook | char(20) | √ |
| 9 | pk_capitalsource | pk_capitalsource | pk_capitalsource | char(20) | √ |
| 10 | pk_card | pk_card | pk_card | char(20) | √ |
| 11 | pk_cardhistory | pk_cardhistory | pk_cardhistory | char(20) | √ |
| 12 | pk_fundsource | pk_fundsource | pk_fundsource | char(20) | √ |
| 13 | pk_jobmngfil | pk_jobmngfil | pk_jobmngfil | char(20) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |