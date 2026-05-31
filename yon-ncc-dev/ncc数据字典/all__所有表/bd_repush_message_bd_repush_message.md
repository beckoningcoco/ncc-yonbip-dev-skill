# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7064.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repush_message | pk_repush_message | pk_repush_message | char(20) | √ |
| 2 | pub_task_pk | pub_task_pk | pub_task_pk | varchar2(255) | √ |
| 3 | push_data | push_data | push_data | varchar2(4000) | √ |
| 4 | repushnumber | repushnumber | repushnumber | number(38, 0) |  |  | 0 |
| 5 | def1 | def1 | def1 | varchar2(255) |
| 6 | def2 | def2 | def2 | varchar2(255) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |