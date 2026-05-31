# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11412.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_matprice_element | pk_matprice_element | pk_matprice_element | char(20) | √ |
| 2 | ccostcomponentid | ccostcomponentid | ccostcomponentid | varchar2(20) |  |  | '~' |
| 3 | ccostcompstrucid | ccostcompstrucid | ccostcompstrucid | varchar2(20) |  |  | '~' |
| 4 | celementid | celementid | celementid | varchar2(20) |  |  | '~' |
| 5 | costdomainid | costdomainid | costdomainid | varchar2(20) |  |  | '~' |
| 6 | ncost | ncost | ncost | number(28, 8) |
| 7 | pk_costtype | pk_costtype | pk_costtype | varchar2(20) |  |  | '~' |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_matprice | pk_matprice | pk_matprice | char(20) |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 12 | pk_setofbook | pk_setofbook | pk_setofbook | varchar2(20) |  |  | '~' |
| 13 | thiscost | thiscost | thiscost | number(28, 8) |
| 14 | upcost | upcost | upcost | number(28, 8) |
| 15 | updateversion | updateversion | updateversion | varchar2(50) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |