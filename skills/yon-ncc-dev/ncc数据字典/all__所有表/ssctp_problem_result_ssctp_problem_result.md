# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11918.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_problem_result | pk_problem_result | pk_problem_result | char(20) | √ |
| 2 | actiontype | actiontype | actiontype | varchar2(50) |
| 3 | pk_comparison_result | pk_comparison_result | pk_comparison_result | char(20) | √ |
| 4 | pk_points | pk_points | pk_points | varchar2(20) |  |  | '~' |
| 5 | pk_problem | pk_problem | pk_problem | varchar2(20) |  |  | '~' |
| 6 | priority | priority | priority | varchar2(50) |
| 7 | problem | problem | problem | varchar2(200) |
| 8 | remarks | remarks | remarks | clob |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |