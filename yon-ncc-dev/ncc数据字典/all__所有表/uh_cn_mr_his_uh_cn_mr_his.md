# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12499.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cn_mr_his | pk_cn_mr_his | pk_cn_mr_his | char(20) | √ |
| 2 | operation | operation | operation | varchar2(50) |
| 3 | operator_id | operator_id | operator_id | char(20) |
| 4 | operator_name | operator_name | operator_name | varchar2(100) |
| 5 | pk_group | pk_group | pk_group | char(20) |
| 6 | pk_org | pk_org | pk_org | char(20) |
| 7 | pk_pv | pk_pv | pk_pv | char(20) |
| 8 | update_time | update_time | update_time | char(19) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |