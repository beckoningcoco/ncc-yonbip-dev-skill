# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12448.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_clin_ex | pk_clin_ex | pk_clin_ex | varchar2(20) | √ |
| 2 | date_ex | date_ex | date_ex | char(19) |
| 3 | desc_clin | desc_clin | desc_clin | varchar2(255) |
| 4 | pk_aber | pk_aber | pk_aber | char(20) |  |  | '~' |
| 5 | pk_clin | pk_clin | pk_clin | varchar2(50) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) | √ |  | '~' |
| 7 | pk_item_ex | pk_item_ex | pk_item_ex | varchar2(20) | √ |  | '~' |
| 8 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 9 | pk_psn_ex | pk_psn_ex | pk_psn_ex | char(32) |
| 10 | psn_name_ex | psn_name_ex | psn_name_ex | varchar2(32) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |