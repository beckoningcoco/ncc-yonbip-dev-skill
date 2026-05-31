# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11870.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bill | pk_bill | pk_bill | char(20) | √ |
| 2 | amount | amount | amount | number(28, 8) |
| 3 | billdate | billdate | billdate | char(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billno | billno | billno | varchar2(200) |
| 6 | billtypecode | billtypecode | billtypecode | varchar2(50) |  |  | '~' |
| 7 | busiid | busiid | busiid | varchar2(50) |
| 8 | operator | operator | operator | varchar2(20) |  |  | '~' |
| 9 | orgamount | orgamount | orgamount | number(28, 8) |
| 10 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 13 | pk_tradetype | pk_tradetype | pk_tradetype | varchar2(20) |  |  | '~' |
| 14 | remark | remark | remark | varchar2(1000) |
| 15 | rescan | rescan | rescan | char(1) |
| 16 | transtypecode | transtypecode | transtypecode | varchar2(101) |
| 17 | defitem1 | defitem1 | defitem1 | varchar2(101) |
| 18 | defitem2 | defitem2 | defitem2 | varchar2(101) |
| 19 | defitem3 | defitem3 | defitem3 | varchar2(101) |
| 20 | defitem4 | defitem4 | defitem4 | varchar2(101) |
| 21 | defitem5 | defitem5 | defitem5 | varchar2(101) |
| 22 | defitem6 | defitem6 | defitem6 | varchar2(101) |
| 23 | defitem7 | defitem7 | defitem7 | varchar2(101) |
| 24 | defitem8 | defitem8 | defitem8 | varchar2(101) |
| 25 | defitem9 | defitem9 | defitem9 | varchar2(101) |
| 26 | defitem10 | defitem10 | defitem10 | varchar2(101) |
| 27 | defitem11 | defitem11 | defitem11 | varchar2(101) |
| 28 | defitem12 | defitem12 | defitem12 | varchar2(101) |
| 29 | defitem13 | defitem13 | defitem13 | varchar2(101) |
| 30 | defitem14 | defitem14 | defitem14 | varchar2(101) |
| 31 | defitem15 | defitem15 | defitem15 | varchar2(101) |
| 32 | defitem16 | defitem16 | defitem16 | varchar2(101) |
| 33 | defitem17 | defitem17 | defitem17 | varchar2(101) |
| 34 | defitem18 | defitem18 | defitem18 | varchar2(101) |
| 35 | defitem19 | defitem19 | defitem19 | varchar2(101) |
| 36 | defitem20 | defitem20 | defitem20 | varchar2(101) |
| 37 | creationtime | creationtime | creationtime | char(19) |
| 38 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 39 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 40 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 41 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 42 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |