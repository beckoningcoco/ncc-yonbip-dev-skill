# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9498.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | checkstate | checkstate | checkstate | number(38, 0) | √ |
| 2 | formula_id | formula_id | formula_id | varchar2(20) | √ |
| 3 | formula_name | formula_name | formula_name | varchar2(200) |
| 4 | note | note | note | blob |
| 5 | pk_checkresult | pk_checkresult | pk_checkresult | varchar2(20) | √ |
| 6 | position | position | position | number(38, 0) | √ |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |