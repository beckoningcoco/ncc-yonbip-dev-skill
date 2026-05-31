# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7083.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_supplierbankpf | pk_supplierbankpf | pk_supplierbankpf | char(20) | √ |
| 2 | approvenote | approvenote | approvenote | varchar2(1024) |
| 3 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 4 | approvetime | approvetime | approvetime | char(19) |
| 5 | banktype | banktype | banktype | varchar2(20) |  |  | '~' |
| 6 | billno | billno | billno | varchar2(50) | √ |
| 7 | billstatus | billstatus | billstatus | number(38, 0) | √ |  | -1 |
| 8 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 9 | memo | memo | memo | varchar2(1024) |
| 10 | opertype | opertype | opertype | number(38, 0) | √ |
| 11 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |  |  | '10GZ' |
| 12 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 13 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 14 | pk_targetorg | pk_targetorg | pk_targetorg | varchar2(20) |  |  | '~' |
| 15 | pk_transtype | pk_transtype | pk_transtype | varchar2(20) |
| 16 | proposer | proposer | proposer | varchar2(20) |  |  | '~' |
| 17 | proposetime | proposetime | proposetime | char(19) |
| 18 | remark | remark | remark | varchar2(1536) |
| 19 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 20 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 21 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 22 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 23 | supplier | supplier | supplier | varchar2(20) |  |  | '~' |
| 24 | supplierbank | supplierbank | supplierbank | varchar2(20) |  |  | '~' |
| 25 | supplierbankbaseinfo | supplierbankbaseinfo | supplierbankbaseinfo | blob |
| 26 | supplierbankcode | supplierbankcode | supplierbankcode | varchar2(40) |
| 27 | supplierbankname | supplierbankname | supplierbankname | varchar2(300) |
| 28 | supplierbankname2 | supplierbankname2 | supplierbankname2 | varchar2(300) |
| 29 | supplierbankname3 | supplierbankname3 | supplierbankname3 | varchar2(300) |
| 30 | supplierbankname4 | supplierbankname4 | supplierbankname4 | varchar2(300) |
| 31 | supplierbankname5 | supplierbankname5 | supplierbankname5 | varchar2(300) |
| 32 | supplierbankname6 | supplierbankname6 | supplierbankname6 | varchar2(300) |
| 33 | targetorg | targetorg | targetorg | number(38, 0) | √ |
| 34 | def1 | def1 | def1 | varchar2(101) |
| 35 | def2 | def2 | def2 | varchar2(101) |
| 36 | def3 | def3 | def3 | varchar2(101) |
| 37 | def4 | def4 | def4 | varchar2(101) |
| 38 | def5 | def5 | def5 | varchar2(101) |
| 39 | def6 | def6 | def6 | varchar2(101) |
| 40 | def7 | def7 | def7 | varchar2(101) |
| 41 | def8 | def8 | def8 | varchar2(101) |
| 42 | def9 | def9 | def9 | varchar2(101) |
| 43 | def10 | def10 | def10 | varchar2(101) |
| 44 | creationtime | creationtime | creationtime | char(19) |
| 45 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 46 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 47 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 48 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 49 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |