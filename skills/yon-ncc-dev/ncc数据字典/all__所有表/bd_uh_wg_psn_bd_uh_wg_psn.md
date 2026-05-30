# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7262.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wgpsn | pk_wgpsn | pk_wgpsn | char(20) | √ |
| 2 | date_begin | date_begin | date_begin | char(19) |
| 3 | date_end | date_end | date_end | char(19) |
| 4 | dt_role_pvpsn | dt_role_pvpsn | dt_role_pvpsn | varchar2(20) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | pk_psn | pk_psn | pk_psn | varchar2(20) |  |  | '~' |
| 8 | pk_role_pvpsn | pk_role_pvpsn | pk_role_pvpsn | varchar2(20) |
| 9 | pk_wg | pk_wg | pk_wg | char(20) | √ |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |