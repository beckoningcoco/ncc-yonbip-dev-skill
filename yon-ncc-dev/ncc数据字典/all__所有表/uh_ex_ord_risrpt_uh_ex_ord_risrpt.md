# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12607.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_risrpt | pk_risrpt | pk_risrpt | char(20) | √ |
| 2 | addr_img | addr_img | addr_img | varchar2(400) |
| 3 | code_srv | code_srv | code_srv | varchar2(256) |
| 4 | date_result | date_result | date_result | char(19) |
| 5 | dt_srvtype | dt_srvtype | dt_srvtype | varchar2(50) |
| 6 | note | note | note | varchar2(4000) |
| 7 | pk_emr | pk_emr | pk_emr | varchar2(20) |  |  | '~' |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_ordmt | pk_ordmt | pk_ordmt | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(50) |  |  | '~' |
| 11 | pk_srv | pk_srv | pk_srv | varchar2(50) |  |  | '~' |
| 12 | pk_srvtype | pk_srvtype | pk_srvtype | varchar2(20) |  |  | '~' |
| 13 | result | result | result | number(38, 0) |
| 14 | result_obj | result_obj | result_obj | varchar2(4000) |
| 15 | result_subj | result_subj | result_subj | varchar2(4000) |
| 16 | unit_med | unit_med | unit_med | varchar2(20) |  |  | '~' |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |