# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13043.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_idcontra | pk_idcontra | pk_idcontra | char(20) | √ |
| 2 | bill_type | bill_type | bill_type | varchar2(50) |
| 3 | file_id | file_id | file_id | varchar2(200) |
| 4 | isdelete | isdelete | isdelete | char(1) |
| 5 | pk_bill | pk_bill | pk_bill | varchar2(50) |
| 6 | sub_mark | sub_mark | sub_mark | varchar2(50) |
| 7 | sub_mark_b | sub_mark_b | sub_mark_b | varchar2(50) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |