# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6449.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cube | pk_cube | pk_cube | char(20) | √ |
| 2 | assetindustry | assetindustry | assetindustry | varchar2(20) |  |  | '~' |
| 3 | assetlayer | assetlayer | assetlayer | varchar2(10) |  |  | '4' |
| 4 | cached | cached | cached | number(38, 0) |
| 5 | cubeid | cubeid | cubeid | varchar2(100) | √ |
| 6 | cubename | cubename | cubename | varchar2(200) |
| 7 | extfield | extfield | extfield | varchar2(2000) |
| 8 | factid | factid | factid | varchar2(200) | √ |
| 9 | factname | factname | factname | varchar2(200) |
| 10 | facttype | facttype | facttype | number(38, 0) |
| 11 | isvisible | isvisible | isvisible | number(38, 0) |
| 12 | pk_schema | pk_schema | pk_schema | char(20) | √ |
| 13 | scriptcached | scriptcached | scriptcached | number(38, 0) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |