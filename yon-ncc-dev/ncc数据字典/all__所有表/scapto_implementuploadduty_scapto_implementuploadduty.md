# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11325.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | dept_id | dept_id | dept_id | varchar2(50) | √ |
| 2 | dept | dept | dept | varchar2(64) |
| 3 | execution_id | execution_id | execution_id | char(20) | √ |
| 4 | name | name | name | varchar2(64) |
| 5 | pk_duty | pk_duty | pk_duty | varchar2(50) |
| 6 | remark | remark | remark | varchar2(50) |
| 7 | upload_flag | upload_flag | upload_flag | varchar2(50) |
| 8 | upload_time | upload_time | upload_time | varchar2(50) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |