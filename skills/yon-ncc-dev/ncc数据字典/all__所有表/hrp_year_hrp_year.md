# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8785.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_year | pk_year | pk_year | char(20) | √ |
| 2 | hrp_year | hrp_year | hrp_year | char(4) |
| 3 | pk_group | pk_group | pk_group | char(20) |
| 4 | pk_org | pk_org | pk_org | char(20) |
| 5 | year_type | year_type | year_type | number(38, 0) |
| 6 | creationtime | creationtime | creationtime | char(19) | √ |
| 7 | creator | creator | creator | char(20) | √ |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 10 | modifier | modifier | modifier | char(20) |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |