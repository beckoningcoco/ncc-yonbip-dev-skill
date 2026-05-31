# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6583.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_indiprovision | pk_indiprovision | pk_indiprovision | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 4 | approvestatus | approvestatus | approvestatus | number(38, 0) |
| 5 | billdate | billdate | billdate | char(19) |
| 6 | billno | billno | billno | varchar2(50) |
| 7 | billstatus | billstatus | billstatus | number(38, 0) |
| 8 | creatortime | creatortime | creatortime | char(19) |
| 9 | dimratio | dimratio | dimratio | number(28, 8) |  |  | 0 |
| 10 | globalmoney | globalmoney | globalmoney | number(28, 8) |  |  | 0 |
| 11 | globalrate | globalrate | globalrate | number(28, 8) |  |  | 1 |
| 12 | groupmoney | groupmoney | groupmoney | number(28, 8) |  |  | 0 |
| 13 | grouprate | grouprate | grouprate | number(28, 8) |  |  | 1 |
| 14 | localmoney | localmoney | localmoney | number(28, 8) |  |  | 0 |
| 15 | money | money | money | number(28, 8) |  |  | 0 |
| 16 | period | period | period | varchar2(50) |
| 17 | pk_bdprovisionrule | pk_bdprovisionrule | pk_bdprovisionrule | varchar2(20) |  |  | '~' |
| 18 | pk_billtype | pk_billtype | pk_billtype | varchar2(50) |
| 19 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 20 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 21 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 22 | prostatus | prostatus | prostatus | number(38, 0) |
| 23 | reason | reason | reason | varchar2(200) |
| 24 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 25 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) | √ |  | 0 |
| 26 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 27 | saga_status | saga_status | saga_status | number(38, 0) | √ |  | 0 |
| 28 | def1 | def1 | def1 | varchar2(101) |
| 29 | def2 | def2 | def2 | varchar2(101) |
| 30 | def3 | def3 | def3 | varchar2(101) |
| 31 | def4 | def4 | def4 | varchar2(101) |
| 32 | def5 | def5 | def5 | varchar2(101) |
| 33 | def6 | def6 | def6 | varchar2(101) |
| 34 | def7 | def7 | def7 | varchar2(101) |
| 35 | def8 | def8 | def8 | varchar2(101) |
| 36 | def9 | def9 | def9 | varchar2(101) |
| 37 | def10 | def10 | def10 | varchar2(101) |
| 38 | def11 | def11 | def11 | varchar2(101) |
| 39 | def12 | def12 | def12 | varchar2(101) |
| 40 | def13 | def13 | def13 | varchar2(101) |
| 41 | def14 | def14 | def14 | varchar2(101) |
| 42 | def15 | def15 | def15 | varchar2(101) |
| 43 | def16 | def16 | def16 | varchar2(101) |
| 44 | def17 | def17 | def17 | varchar2(101) |
| 45 | def18 | def18 | def18 | varchar2(101) |
| 46 | def19 | def19 | def19 | varchar2(101) |
| 47 | def20 | def20 | def20 | varchar2(101) |
| 48 | def21 | def21 | def21 | varchar2(101) |
| 49 | def22 | def22 | def22 | varchar2(101) |
| 50 | def23 | def23 | def23 | varchar2(101) |
| 51 | def24 | def24 | def24 | varchar2(101) |
| 52 | def25 | def25 | def25 | varchar2(101) |
| 53 | def26 | def26 | def26 | varchar2(101) |
| 54 | def27 | def27 | def27 | varchar2(101) |
| 55 | def28 | def28 | def28 | varchar2(101) |
| 56 | def29 | def29 | def29 | varchar2(101) |
| 57 | def30 | def30 | def30 | varchar2(101) |
| 58 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 59 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 60 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 61 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 62 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |