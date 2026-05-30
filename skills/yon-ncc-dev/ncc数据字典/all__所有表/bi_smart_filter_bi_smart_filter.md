# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7338.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_filter | pk_filter | pk_filter | char(20) | √ |
| 2 | enable | enable | enable | number(38, 0) |
| 3 | filtercode | filtercode | filtercode | varchar2(50) |
| 4 | filtermodel | filtermodel | filtermodel | blob |
| 5 | filtername | filtername | filtername | varchar2(100) |
| 6 | note | note | note | varchar2(500) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |
| 9 | pk_smart | pk_smart | pk_smart | char(20) |
| 10 | resdir | resdir | resdir | varchar2(50) |
| 11 | resid | resid | resid | varchar2(50) |
| 12 | creationtime | creationtime | creationtime | char(19) |
| 13 | creator | creator | creator | varchar2(20) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 16 | modifier | modifier | modifier | varchar2(20) |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |