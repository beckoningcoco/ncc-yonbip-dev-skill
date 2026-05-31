# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12763.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvris | pk_pvris | pk_pvris | char(20) | √ |
| 2 | addr_image | addr_image | addr_image | varchar2(256) |
| 3 | date_ris | date_ris | date_ris | char(19) |
| 4 | diag_obj | diag_obj | diag_obj | varchar2(4000) |
| 5 | diag_subj | diag_subj | diag_subj | varchar2(4000) |
| 6 | dt_risbody | dt_risbody | dt_risbody | char(20) |
| 7 | name_psn_diag | name_psn_diag | name_psn_diag | varchar2(50) |
| 8 | pk_group | pk_group | pk_group | char(20) |
| 9 | pk_org | pk_org | pk_org | char(20) |
| 10 | pk_psn_diag | pk_psn_diag | pk_psn_diag | char(20) |
| 11 | pk_pv | pk_pv | pk_pv | char(20) |
| 12 | pk_srv_ris | pk_srv_ris | pk_srv_ris | char(20) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |