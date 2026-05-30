# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12874.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_item | pk_wa_item | pk_wa_item | char(20) | √ |
| 2 | category_id | category_id | category_id | char(20) |
| 3 | clearflag | clearflag | clearflag | char(1) | √ |  | 'N' |
| 4 | code | code | code | varchar2(50) | √ |
| 5 | defaultflag | defaultflag | defaultflag | char(1) | √ |  | 'N' |
| 6 | idisplayseq | idisplayseq | idisplayseq | number(38, 0) |  |  | 0 |
| 7 | iflddecimal | iflddecimal | iflddecimal | number(38, 0) |  |  | 0 |
| 8 | ifldwidth | ifldwidth | ifldwidth | number(38, 0) |
| 9 | ifromflag | ifromflag | ifromflag | number(38, 0) | √ |  | 0 |
| 10 | iitemtype | iitemtype | iitemtype | number(38, 0) | √ |  | 0 |
| 11 | intotalitem | intotalitem | intotalitem | char(1) | √ |  | 'N' |
| 12 | iprivil | iprivil | iprivil | number(38, 0) |
| 13 | iproperty | iproperty | iproperty | number(38, 0) | √ |  | 0 |
| 14 | isinhi | isinhi | isinhi | char(1) | √ |  | 'N' |
| 15 | itemkey | itemkey | itemkey | varchar2(20) | √ |
| 16 | mid | mid | mid | char(1) |  |  | 'N' |
| 17 | name | name | name | varchar2(100) | √ |
| 18 | name2 | name2 | name2 | varchar2(100) |
| 19 | name3 | name3 | name3 | varchar2(100) |
| 20 | name4 | name4 | name4 | varchar2(100) |
| 21 | name5 | name5 | name5 | varchar2(100) |
| 22 | name6 | name6 | name6 | varchar2(100) |
| 23 | npsnceil | npsnceil | npsnceil | number(31, 8) |  |  | 0 |
| 24 | npsnfloor | npsnfloor | npsnfloor | number(31, 8) |  |  | 0 |
| 25 | nsumceil | nsumceil | nsumceil | number(31, 8) |
| 26 | nsumfloor | nsumfloor | nsumfloor | number(31, 8) |
| 27 | pk_budget_item | pk_budget_item | pk_budget_item | char(20) |
| 28 | pk_group | pk_group | pk_group | char(20) |
| 29 | pk_org | pk_org | pk_org | char(20) |
| 30 | psnceilflag | psnceilflag | psnceilflag | char(1) |  |  | 'N' |
| 31 | psnfloorflag | psnfloorflag | psnfloorflag | char(1) |  |  | 'N' |
| 32 | sumceilflag | sumceilflag | sumceilflag | char(1) |  |  | 'N' |
| 33 | sumfloorflag | sumfloorflag | sumfloorflag | char(1) |  |  | 'N' |
| 34 | synchro | synchro | synchro | varchar2(10) |
| 35 | taxflag | taxflag | taxflag | char(1) | √ |  | 'N' |
| 36 | totalitem | totalitem | totalitem | char(20) |
| 37 | vformula | vformula | vformula | varchar2(4000) |
| 38 | vformulastr | vformulastr | vformulastr | varchar2(4000) |
| 39 | creationtime | creationtime | creationtime | char(19) | √ |
| 40 | creator | creator | creator | char(20) | √ |
| 41 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 42 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 43 | modifier | modifier | modifier | char(20) |
| 44 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |