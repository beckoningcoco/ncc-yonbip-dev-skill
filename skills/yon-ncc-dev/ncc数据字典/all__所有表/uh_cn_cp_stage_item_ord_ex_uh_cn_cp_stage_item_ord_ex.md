# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12455.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ord_ex | pk_ord_ex | pk_ord_ex | varchar2(20) | √ |
| 2 | date_ex | date_ex | date_ex | char(19) |
| 3 | date_start | date_start | date_start | char(19) |
| 4 | pk_aber | pk_aber | pk_aber | char(20) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) | √ |  | '~' |
| 6 | pk_item_ex | pk_item_ex | pk_item_ex | varchar2(20) | √ |
| 7 | pk_ord | pk_ord | pk_ord | char(20) |
| 8 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 9 | pk_psn_ex | pk_psn_ex | pk_psn_ex | char(32) |
| 10 | psn_name_ex | psn_name_ex | psn_name_ex | varchar2(32) |
| 11 | state | state | state | varchar2(50) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |