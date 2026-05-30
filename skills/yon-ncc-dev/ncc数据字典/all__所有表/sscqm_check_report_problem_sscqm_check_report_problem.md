# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11862.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | char(20) | √ |
| 2 | problemid | problemid | problemid | varchar2(50) |  |  | '~' |
| 3 | problem_name | problem_name | problem_name | varchar2(50) |
| 4 | problem_siz | problem_siz | problem_siz | number(38, 0) |
| 5 | reportid | reportid | reportid | varchar2(50) |
| 6 | serious_level | serious_level | serious_level | varchar2(50) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |