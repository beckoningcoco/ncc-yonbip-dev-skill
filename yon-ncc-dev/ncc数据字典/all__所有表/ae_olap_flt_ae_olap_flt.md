# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6451.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_filter | pk_filter | pk_filter | char(20) | √ |
| 2 | content | content | content | blob |
| 3 | contenttype | contenttype | contenttype | number(38, 0) |
| 4 | extfield | extfield | extfield | varchar2(2000) |
| 5 | filterid | filterid | filterid | varchar2(100) | √ |
| 6 | filtername | filtername | filtername | varchar2(200) |
| 7 | pk_cube | pk_cube | pk_cube | char(20) |
| 8 | pk_dim | pk_dim | pk_dim | char(20) |
| 9 | pk_schema | pk_schema | pk_schema | char(20) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |