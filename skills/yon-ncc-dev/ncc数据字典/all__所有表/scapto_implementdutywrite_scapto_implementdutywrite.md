# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11320.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_implementdutywrite | pk_implementdutywrite | pk_implementdutywrite | char(20) | √ |
| 2 | dept | dept | dept | varchar2(64) |
| 3 | dept_id | dept_id | dept_id | varchar2(50) | √ |
| 4 | execution_id | execution_id | execution_id | varchar2(50) | √ |
| 5 | name | name | name | varchar2(64) |
| 6 | pk_duty | pk_duty | pk_duty | varchar2(20) |
| 7 | pk_implementwrite | pk_implementwrite | pk_implementwrite | char(20) | √ |
| 8 | remark | remark | remark | varchar2(50) |
| 9 | upload_flag | upload_flag | upload_flag | varchar2(50) |
| 10 | upload_time | upload_time | upload_time | varchar2(50) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |