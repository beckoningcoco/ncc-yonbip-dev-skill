# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7681.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_account | pk_account | pk_account | char(20) | √ |
| 2 | bisdirect | bisdirect | bisdirect | char(1) |
| 3 | bisspread | bisspread | bisspread | char(1) |
| 4 | cyear | cyear | cyear | varchar2(50) |
| 5 | istype | istype | istype | number(38, 0) |
| 6 | month | month | month | varchar2(50) |
| 7 | naspvalue | naspvalue | naspvalue | number(28, 8) |
| 8 | ncost | ncost | ncost | number(28, 8) |
| 9 | ndef1 | ndef1 | ndef1 | varchar2(101) |
| 10 | ndef2 | ndef2 | ndef2 | varchar2(101) |
| 11 | ndef3 | ndef3 | ndef3 | varchar2(101) |
| 12 | ndef4 | ndef4 | ndef4 | varchar2(101) |
| 13 | ndef5 | ndef5 | ndef5 | varchar2(101) |
| 14 | nsacost | nsacost | nsacost | number(28, 8) |
| 15 | nspvalue | nspvalue | nspvalue | number(28, 8) |
| 16 | pk_class | pk_class | pk_class | varchar2(20) |  |  | '~' |
| 17 | pk_coitem | pk_coitem | pk_coitem | varchar2(20) |  |  | '~' |
| 18 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 19 | pk_destdeptatr | pk_destdeptatr | pk_destdeptatr | varchar2(20) |  |  | '~' |
| 20 | pk_fundsource | pk_fundsource | pk_fundsource | varchar2(20) |  |  | '~' |
| 21 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 22 | pk_med | pk_med | pk_med | varchar2(20) |  |  | '~' |
| 23 | pk_month | pk_month | pk_month | varchar2(20) |  |  | '~' |
| 24 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 25 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 26 | pk_soudept | pk_soudept | pk_soudept | varchar2(20) |  |  | '~' |
| 27 | pk_spreadpara | pk_spreadpara | pk_spreadpara | varchar2(20) |  |  | '~' |
| 28 | pk_srcdeptatr | pk_srcdeptatr | pk_srcdeptatr | varchar2(20) |  |  | '~' |
| 29 | upercent | upercent | upercent | number(28, 8) |
| 30 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 31 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 32 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 33 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 34 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 35 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 36 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |