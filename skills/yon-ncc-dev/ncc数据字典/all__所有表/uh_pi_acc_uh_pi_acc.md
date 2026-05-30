# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12684.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patiacc | pk_patiacc | pk_patiacc | char(20) | √ |
| 2 | acc_password | acc_password | acc_password | char(50) |
| 3 | amt_cred | amt_cred | amt_cred | number(14, 2) |
| 4 | amt_cred_lock | amt_cred_lock | amt_cred_lock | number(14, 2) |
| 5 | amt_exps | amt_exps | amt_exps | number(14, 2) |
| 6 | amt_pre | amt_pre | amt_pre | number(14, 2) |
| 7 | amt_pre_lock | amt_pre_lock | amt_pre_lock | number(14, 2) |
| 8 | eu_cred_status | eu_cred_status | eu_cred_status | number(38, 0) |
| 9 | eu_pre_status | eu_pre_status | eu_pre_status | number(38, 0) |
| 10 | eu_status | eu_status | eu_status | number(38, 0) |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 13 | pk_pati | pk_pati | pk_pati | varchar2(20) | √ |
| 14 | creationtime | creationtime | creationtime | char(19) |
| 15 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 18 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |