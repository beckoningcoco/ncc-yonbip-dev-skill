# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11407.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_converror | pk_converror | pk_converror | char(20) | √ |
| 2 | cactivityid | cactivityid | cactivityid | varchar2(20) |  |  | '~' |
| 3 | ccostcenterid | ccostcenterid | ccostcenterid | varchar2(20) |  |  | '~' |
| 4 | ccostcomponentid | ccostcomponentid | ccostcomponentid | varchar2(20) |  |  | '~' |
| 5 | ccostregionid_aim | ccostregionid_aim | ccostregionid_aim | varchar2(20) |  |  | '~' |
| 6 | ccostregionid_source | ccostregionid_source | ccostregionid_source | varchar2(20) |  |  | '~' |
| 7 | ccosttypeid_source | ccosttypeid_source | ccosttypeid_source | varchar2(20) |  |  | '~' |
| 8 | celementid | celementid | celementid | varchar2(20) |  |  | '~' |
| 9 | check_type | check_type | check_type | varchar2(50) |
| 10 | converror | converror | converror | char(20) | √ |
| 11 | costdomainid | costdomainid | costdomainid | varchar2(20) |  |  | '~' |
| 12 | cwkid | cwkid | cwkid | varchar2(20) |  |  | '~' |
| 13 | exception_error | exception_error | exception_error | char(1) |
| 14 | explain | explain | explain | varchar2(200) |
| 15 | materialid | materialid | materialid | varchar2(20) |  |  | '~' |
| 16 | pk_accbook | pk_accbook | pk_accbook | varchar2(20) |  |  | '~' |
| 17 | pk_accbook_source | pk_accbook_source | pk_accbook_source | varchar2(20) |  |  | '~' |
| 18 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 19 | pk_profitcenter | pk_profitcenter | pk_profitcenter | varchar2(20) |  |  | '~' |
| 20 | stockorg_aim | stockorg_aim | stockorg_aim | varchar2(20) |  |  | '~' |
| 21 | stockorg_source | stockorg_source | stockorg_source | varchar2(20) |  |  | '~' |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |