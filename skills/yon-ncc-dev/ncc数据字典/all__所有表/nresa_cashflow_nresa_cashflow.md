# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10015.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cashflow | pk_cashflow | pk_cashflow | char(20) | √ |
| 2 | accountamt | accountamt | accountamt | number(28, 8) |
| 3 | billdate | billdate | billdate | char(19) |
| 4 | direction | direction | direction | varchar2(50) |
| 5 | entryno | entryno | entryno | number(38, 0) |
| 6 | glbamt | glbamt | glbamt | number(28, 8) |
| 7 | grpamt | grpamt | grpamt | number(28, 8) |
| 8 | originamt | originamt | originamt | number(28, 8) |
| 9 | pk_abstract | pk_abstract | pk_abstract | varchar2(300) |  |  | '~' |
| 10 | pk_account | pk_account | pk_account | varchar2(20) |  |  | '~' |
| 11 | pk_accountingbook | pk_accountingbook | pk_accountingbook | varchar2(20) |  |  | '~' |
| 12 | pk_cashitem | pk_cashitem | pk_cashitem | varchar2(20) |  |  | '~' |
| 13 | pk_control | pk_control | pk_control | varchar2(20) |  |  | '~' |
| 14 | pk_corp | pk_corp | pk_corp | varchar2(20) |  |  | '~' |
| 15 | pk_currency | pk_currency | pk_currency | varchar2(20) |  |  | '~' |
| 16 | pk_detail | pk_detail | pk_detail | char(20) |
| 17 | pk_dimsgroup | pk_dimsgroup | pk_dimsgroup | varchar2(20) |  |  | '~' |
| 18 | pk_finacial | pk_finacial | pk_finacial | varchar2(20) |  |  | '~' |
| 19 | pk_finacialbook | pk_finacialbook | pk_finacialbook | varchar2(20) |  |  | '~' |
| 20 | pk_finacial_v | pk_finacial_v | pk_finacial_v | varchar2(20) |  |  | '~' |
| 21 | pk_gldetail | pk_gldetail | pk_gldetail | char(20) |
| 22 | pk_glvoucher | pk_glvoucher | pk_glvoucher | char(20) |
| 23 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 24 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 25 | pk_profit | pk_profit | pk_profit | varchar2(20) |  |  | '~' |
| 26 | pk_profit_v | pk_profit_v | pk_profit_v | varchar2(20) |  |  | '~' |
| 27 | pk_seccashitem | pk_seccashitem | pk_seccashitem | varchar2(20) |  |  | '~' |
| 28 | pk_setofbook | pk_setofbook | pk_setofbook | varchar2(20) |  |  | '~' |
| 29 | pk_unit | pk_unit | pk_unit | varchar2(20) |  |  | '~' |
| 30 | remark | remark | remark | varchar2(200) |
| 31 | creationtime | creationtime | creationtime | char(19) |
| 32 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 33 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 34 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 35 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 36 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |