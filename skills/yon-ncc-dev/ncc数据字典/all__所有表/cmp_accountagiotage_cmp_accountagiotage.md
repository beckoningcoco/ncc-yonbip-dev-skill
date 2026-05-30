# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7530.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accountagiotage | pk_accountagiotage | pk_accountagiotage | char(20) | √ |
| 2 | accountname | accountname | accountname | varchar2(300) |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | billtypecode | billtypecode | billtypecode | varchar2(50) |
| 5 | dbilldate | dbilldate | dbilldate | char(19) |
| 6 | doperatedate | doperatedate | doperatedate | char(19) |
| 7 | doperatetime | doperatetime | doperatetime | char(19) |
| 8 | localrate | localrate | localrate | number(28, 8) |
| 9 | memo | memo | memo | varchar2(181) |
| 10 | m_vouchid | m_vouchid | m_vouchid | varchar2(50) |
| 11 | pay_localmoney | pay_localmoney | pay_localmoney | number(28, 8) |
| 12 | pk_bankaccount | pk_bankaccount | pk_bankaccount | varchar2(20) |  |  | '~' |
| 13 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 14 | pk_cashaccount | pk_cashaccount | pk_cashaccount | varchar2(20) |  |  | '~' |
| 15 | pk_curr | pk_curr | pk_curr | varchar2(20) |  |  | '~' |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 17 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 18 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 19 | receipt_localmoney | receipt_localmoney | receipt_localmoney | number(28, 8) |
| 20 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 21 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 22 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 23 | saga_status | saga_status | saga_status | number(38, 0) |
| 24 | vbillno | vbillno | vbillno | varchar2(50) |
| 25 | creationtime | creationtime | creationtime | char(19) |
| 26 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 27 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 28 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 29 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 30 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |