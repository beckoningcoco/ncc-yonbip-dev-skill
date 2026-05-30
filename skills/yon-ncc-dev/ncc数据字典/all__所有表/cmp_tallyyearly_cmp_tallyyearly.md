# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7579.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tallyyearly | pk_tallyyearly | pk_tallyyearly | varchar2(20) | √ |
| 2 | cyear | cyear | cyear | varchar2(50) |
| 3 | fundformcode | fundformcode | fundformcode | number(38, 0) |
| 4 | gathering | gathering | gathering | number(28, 8) |
| 5 | gatheringlocal | gatheringlocal | gatheringlocal | number(28, 8) |
| 6 | gathering_num | gathering_num | gathering_num | number(38, 0) |
| 7 | globalgatheringlocal | globalgatheringlocal | globalgatheringlocal | number(28, 8) |
| 8 | globalpaylocal | globalpaylocal | globalpaylocal | number(28, 8) |
| 9 | groupgatheringlocal | groupgatheringlocal | groupgatheringlocal | number(28, 8) |
| 10 | grouppaylocal | grouppaylocal | grouppaylocal | number(28, 8) |
| 11 | pay | pay | pay | number(28, 8) |
| 12 | paylocal | paylocal | paylocal | number(28, 8) |
| 13 | pay_num | pay_num | pay_num | number(38, 0) |
| 14 | pk_account | pk_account | pk_account | varchar2(20) |  |  | '~' |
| 15 | pk_corp | pk_corp | pk_corp | varchar2(20) |  |  | '~' |
| 16 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 17 | pk_fiorg | pk_fiorg | pk_fiorg | varchar2(20) |  |  | '~' |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 19 | pk_mngaccount | pk_mngaccount | pk_mngaccount | varchar2(20) |  |  | '~' |
| 20 | pk_notetype | pk_notetype | pk_notetype | varchar2(20) |  |  | '~' |
| 21 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 22 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 23 | pk_pcorg | pk_pcorg | pk_pcorg | varchar2(20) |  |  | '~' |
| 24 | unique_code | unique_code | unique_code | varchar2(50) |
| 25 | unique_value | unique_value | unique_value | varchar2(150) |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |