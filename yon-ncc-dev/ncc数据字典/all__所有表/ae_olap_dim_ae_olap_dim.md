# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6450.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dim | pk_dim | pk_dim | char(20) | √ |
| 2 | assetindustry | assetindustry | assetindustry | varchar2(20) |  |  | '~' |
| 3 | assetlayer | assetlayer | assetlayer | varchar2(10) |  |  | '4' |
| 4 | cachedim | cachedim | cachedim | number(38, 0) |
| 5 | dimdesc | dimdesc | dimdesc | varchar2(500) |
| 6 | dimid | dimid | dimid | varchar2(100) | √ |
| 7 | dimname | dimname | dimname | varchar2(200) |
| 8 | dimtype | dimtype | dimtype | number(38, 0) |
| 9 | extfield | extfield | extfield | varchar2(2000) |
| 10 | fk_fact | fk_fact | fk_fact | varchar2(50) |
| 11 | isvisible | isvisible | isvisible | number(38, 0) |
| 12 | pk_cube | pk_cube | pk_cube | char(20) |
| 13 | pk_schema | pk_schema | pk_schema | char(20) |
| 14 | pk_srcdim | pk_srcdim | pk_srcdim | varchar2(50) |
| 15 | scopetype | scopetype | scopetype | number(38, 0) |
| 16 | timedimext | timedimext | timedimext | varchar2(2000) |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |