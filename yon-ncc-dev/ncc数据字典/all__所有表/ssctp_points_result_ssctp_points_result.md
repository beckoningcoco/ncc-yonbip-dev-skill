# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11914.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_points_result | pk_points_result | pk_points_result | char(20) | √ |
| 2 | auto_inspection | auto_inspection | auto_inspection | char(1) |
| 3 | ispass | ispass | ispass | char(1) |
| 4 | pk_comparison_result | pk_comparison_result | pk_comparison_result | char(20) | √ |
| 5 | pk_points | pk_points | pk_points | varchar2(20) |  |  | '~' |
| 6 | pk_problem | pk_problem | pk_problem | varchar2(20) |  |  | '~' |
| 7 | points | points | points | varchar2(200) |
| 8 | points_classification | points_classification | points_classification | varchar2(20) |  |  | '~' |
| 9 | ruleinfo | ruleinfo | ruleinfo | clob |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |