# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8133.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fundsdep | pk_fundsdep | pk_fundsdep | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | depamout | depamout | depamout | number(28, 8) |
| 4 | flag | flag | flag | number(38, 0) |
| 5 | name | name | name | varchar2(50) |
| 6 | orignalvalue | orignalvalue | orignalvalue | number(28, 8) |
| 7 | pk_accbook | pk_accbook | pk_accbook | varchar2(20) | √ |  | '~' |
| 8 | pk_capital_source | pk_capital_source | pk_capital_source | varchar2(50) |
| 9 | pk_card | pk_card | pk_card | varchar2(50) |
| 10 | pk_cardhistory | pk_cardhistory | pk_cardhistory | varchar2(50) |
| 11 | pk_depgather | pk_depgather | pk_depgather | varchar2(50) |
| 12 | pk_fundsource | pk_fundsource | pk_fundsource | varchar2(20) |  |  | '~' |
| 13 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 16 | pk_period | pk_period | pk_period | varchar2(20) |  |  | '~' |
| 17 | pk_usedept | pk_usedept | pk_usedept | varchar2(20) |  |  | '~' |
| 18 | totaldepamout | totaldepamout | totaldepamout | number(28, 8) |
| 19 | vmemo | vmemo | vmemo | varchar2(200) |
| 20 | creationtime | creationtime | creationtime | char(19) |
| 21 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 24 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |