# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7137.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deptpd | pk_deptpd | pk_deptpd | char(20) | √ |
| 2 | flag_stop | flag_stop | flag_stop | char(1) |
| 3 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 7 | pk_pd | pk_pd | pk_pd | varchar2(20) |  |  | '~' |
| 8 | pk_pdcate | pk_pdcate | pk_pdcate | varchar2(20) |  |  | '~' |
| 9 | sortno | sortno | sortno | varchar2(50) |
| 10 | unit | unit | unit | varchar2(50) |
| 11 | val_pu_bas | val_pu_bas | val_pu_bas | number(14, 2) |
| 12 | val_pu_max | val_pu_max | val_pu_max | number(14, 2) |
| 13 | val_pu_min | val_pu_min | val_pu_min | number(14, 2) |
| 14 | creationtime | creationtime | creationtime | char(19) |
| 15 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 18 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |