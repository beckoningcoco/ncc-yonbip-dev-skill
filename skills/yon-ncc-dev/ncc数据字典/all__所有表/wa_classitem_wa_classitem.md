# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12856.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_classitem | pk_wa_classitem | pk_wa_classitem | char(20) | √ |
| 2 | bankaccount | bankaccount | bankaccount | number(38, 0) |
| 3 | category_id | category_id | category_id | varchar2(20) |
| 4 | clearflag | clearflag | clearflag | char(1) | √ |  | 'N' |
| 5 | cperiod | cperiod | cperiod | char(2) |
| 6 | cyear | cyear | cyear | char(4) |
| 7 | destitemcol | destitemcol | destitemcol | varchar2(5) |
| 8 | destitempk | destitempk | destitempk | varchar2(20) |
| 9 | icomputeseq | icomputeseq | icomputeseq | number(38, 0) | √ |  | 0 |
| 10 | idisplayseq | idisplayseq | idisplayseq | number(38, 0) | √ |  | 0 |
| 11 | iflddecimal | iflddecimal | iflddecimal | number(38, 0) |
| 12 | ifromflag | ifromflag | ifromflag | number(38, 0) | √ |  | 0 |
| 13 | inapproveditem | inapproveditem | inapproveditem | char(1) | √ |
| 14 | issysformula | issysformula | issysformula | char(1) | √ |  | 'N' |
| 15 | istransfer | istransfer | istransfer | char(1) | √ |  | 'N' |
| 16 | itemkey | itemkey | itemkey | varchar2(20) | √ |
| 17 | name | name | name | varchar2(100) |
| 18 | name2 | name2 | name2 | varchar2(100) |
| 19 | name3 | name3 | name3 | varchar2(100) |
| 20 | name4 | name4 | name4 | varchar2(100) |
| 21 | name5 | name5 | name5 | varchar2(100) |
| 22 | name6 | name6 | name6 | varchar2(100) |
| 23 | npsnceil | npsnceil | npsnceil | number(31, 8) |
| 24 | npsnfloor | npsnfloor | npsnfloor | number(31, 8) |
| 25 | nsumceil | nsumceil | nsumceil | number(31, 8) |
| 26 | nsumfloor | nsumfloor | nsumfloor | number(31, 8) |
| 27 | pk_group | pk_group | pk_group | varchar2(20) |
| 28 | pk_org | pk_org | pk_org | varchar2(20) |
| 29 | pk_wa_class | pk_wa_class | pk_wa_class | varchar2(20) | √ |
| 30 | pk_wa_item | pk_wa_item | pk_wa_item | varchar2(20) | √ |
| 31 | psnceilflag | psnceilflag | psnceilflag | char(1) |  |  | 'N' |
| 32 | psnfloorflag | psnfloorflag | psnfloorflag | char(1) |  |  | 'N' |
| 33 | round_type | round_type | round_type | number(38, 0) |  |  | 0 |
| 34 | showflag | showflag | showflag | char(1) |  |  | 'N' |
| 35 | sumceilflag | sumceilflag | sumceilflag | char(1) |  |  | 'N' |
| 36 | sumfloorflag | sumfloorflag | sumfloorflag | char(1) |  |  | 'N' |
| 37 | taxflag | taxflag | taxflag | char(1) | √ |  | 'N' |
| 38 | vformula | vformula | vformula | varchar2(4000) |
| 39 | vformulastr | vformulastr | vformulastr | varchar2(4000) |
| 40 | creationtime | creationtime | creationtime | char(19) |
| 41 | creator | creator | creator | varchar2(20) |
| 42 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 43 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 44 | modifier | modifier | modifier | varchar2(20) |
| 45 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |