# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13066.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_upload_err | pk_upload_err | pk_upload_err | char(20) | √ |
| 2 | cardcode | cardcode | cardcode | varchar2(50) |
| 3 | code_hppv | code_hppv | code_hppv | varchar2(50) |
| 4 | code_pv | code_pv | code_pv | varchar2(50) |
| 5 | date_err | date_err | date_err | char(19) |
| 6 | errmsg | errmsg | errmsg | varchar2(1024) |
| 7 | his_srvcode | his_srvcode | his_srvcode | varchar2(50) |
| 8 | hp_srvcode | hp_srvcode | hp_srvcode | varchar2(50) |
| 9 | patiname | patiname | patiname | varchar2(50) |
| 10 | pk_cgsrv | pk_cgsrv | pk_cgsrv | char(20) |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 13 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 14 | pk_psn_oper | pk_psn_oper | pk_psn_oper | varchar2(20) |  |  | '~' |
| 15 | pk_pv | pk_pv | pk_pv | varchar2(20) |  |  | '~' |
| 16 | psn_oper_name | psn_oper_name | psn_oper_name | varchar2(50) |
| 17 | srvname | srvname | srvname | varchar2(256) |
| 18 | uploadparam | uploadparam | uploadparam | varchar2(4000) |
| 19 | creationtime | creationtime | creationtime | char(19) |
| 20 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 23 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |