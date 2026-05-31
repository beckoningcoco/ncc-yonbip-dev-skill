# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7742.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ct_pu_change | pk_ct_pu_change | pk_ct_pu_change | char(20) | √ |
| 2 | pk_ct_pu | pk_ct_pu | pk_ct_pu | char(20) | √ |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 4 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 5 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 6 | vchangecode | vchangecode | vchangecode | number(28, 8) |
| 7 | vchgcontent | vchgcontent | vchgcontent | varchar2(256) |
| 8 | vchgdate | vchgdate | vchgdate | varchar2(19) |
| 9 | vchgpsn | vchgpsn | vchgpsn | varchar2(20) |  |  | '~' |
| 10 | vchgreason | vchgreason | vchgreason | varchar2(256) |
| 11 | vmemo | vmemo | vmemo | varchar2(181) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |