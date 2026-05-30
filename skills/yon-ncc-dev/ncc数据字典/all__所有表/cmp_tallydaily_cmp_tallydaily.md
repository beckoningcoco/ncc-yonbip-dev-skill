# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7577.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tallydaily | pk_tallydaily | pk_tallydaily | char(20) | √ |
| 2 | billstatus | billstatus | billstatus | number(38, 0) |
| 3 | cday | cday | cday | varchar2(50) |
| 4 | cmonth | cmonth | cmonth | varchar2(50) |
| 5 | cyear | cyear | cyear | varchar2(50) |
| 6 | fundformcode | fundformcode | fundformcode | number(38, 0) |
| 7 | gathering | gathering | gathering | number(28, 8) |
| 8 | gatheringlocal | gatheringlocal | gatheringlocal | number(28, 8) |
| 9 | gathering_num | gathering_num | gathering_num | number(38, 0) |
| 10 | globalgatheringlocal | globalgatheringlocal | globalgatheringlocal | number(28, 8) |
| 11 | globalpaylocal | globalpaylocal | globalpaylocal | number(28, 8) |
| 12 | groupgatheringlocal | groupgatheringlocal | groupgatheringlocal | number(28, 8) |
| 13 | grouppaylocal | grouppaylocal | grouppaylocal | number(28, 8) |
| 14 | pay | pay | pay | number(28, 8) |
| 15 | paylocal | paylocal | paylocal | number(28, 8) |
| 16 | pay_num | pay_num | pay_num | number(38, 0) |
| 17 | pk_account | pk_account | pk_account | varchar2(20) |  |  | '~' |
| 18 | pk_corp | pk_corp | pk_corp | varchar2(20) |  |  | '~' |
| 19 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 20 | pk_fiorg | pk_fiorg | pk_fiorg | varchar2(20) |  |  | '~' |
| 21 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 22 | pk_mngaccount | pk_mngaccount | pk_mngaccount | varchar2(20) |  |  | '~' |
| 23 | pk_notetype | pk_notetype | pk_notetype | varchar2(20) |  |  | '~' |
| 24 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 25 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 26 | pk_pcorg | pk_pcorg | pk_pcorg | varchar2(20) |  |  | '~' |
| 27 | unique_code | unique_code | unique_code | varchar2(50) |
| 28 | unique_value | unique_value | unique_value | varchar2(150) |
| 29 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 30 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |