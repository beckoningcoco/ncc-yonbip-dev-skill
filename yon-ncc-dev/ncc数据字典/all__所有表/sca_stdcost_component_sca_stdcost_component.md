# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11423.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stdcost_component | pk_stdcost_component | pk_stdcost_component | char(20) | √ |
| 2 | ccostcomponentid | ccostcomponentid | ccostcomponentid | varchar2(20) |  |  | '~' |
| 3 | ccostcompstrucid | ccostcompstrucid | ccostcompstrucid | varchar2(20) |  |  | '~' |
| 4 | ccosttypeid | ccosttypeid | ccosttypeid | varchar2(20) |  |  | '~' |
| 5 | costdomainid | costdomainid | costdomainid | varchar2(20) |  |  | '~' |
| 6 | cstdcostid | cstdcostid | cstdcostid | char(20) |
| 7 | ncost | ncost | ncost | number(28, 8) |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 11 | pk_setofbook | pk_setofbook | pk_setofbook | varchar2(20) |  |  | '~' |
| 12 | thiscost | thiscost | thiscost | number(28, 8) |
| 13 | upcost | upcost | upcost | number(28, 8) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |