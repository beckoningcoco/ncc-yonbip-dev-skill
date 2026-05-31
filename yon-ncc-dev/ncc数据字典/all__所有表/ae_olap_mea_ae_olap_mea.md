# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6455.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_measure | pk_measure | pk_measure | char(20) | √ |
| 2 | aggtype | aggtype | aggtype | number(38, 0) |
| 3 | assetindustry | assetindustry | assetindustry | varchar2(20) |  |  | '~' |
| 4 | assetlayer | assetlayer | assetlayer | varchar2(10) |  |  | '4' |
| 5 | extfield | extfield | extfield | varchar2(2000) |
| 6 | formatclass | formatclass | formatclass | varchar2(100) |
| 7 | formatstr | formatstr | formatstr | varchar2(50) |
| 8 | formulaexp | formulaexp | formulaexp | varchar2(1000) |
| 9 | groupid | groupid | groupid | varchar2(100) |
| 10 | isvisible | isvisible | isvisible | number(38, 0) |
| 11 | measurecolumn | measurecolumn | measurecolumn | varchar2(50) |
| 12 | measuredesc | measuredesc | measuredesc | varchar2(500) |
| 13 | measureid | measureid | measureid | varchar2(100) | √ |
| 14 | measurename | measurename | measurename | varchar2(200) |
| 15 | measuretype | measuretype | measuretype | number(38, 0) |
| 16 | pk_cube | pk_cube | pk_cube | char(20) | √ |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |