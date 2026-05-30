# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11872.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busiclass | pk_busiclass | pk_busiclass | char(20) | √ |
| 2 | appid | appid | appid | varchar2(50) |
| 3 | billtypecode | billtypecode | billtypecode | varchar2(50) |
| 4 | billtypename | billtypename | billtypename | varchar2(50) |
| 5 | busitype | busitype | busitype | number(38, 0) |  |  | 0 |
| 6 | classpath | classpath | classpath | varchar2(500) |
| 7 | includesub | includesub | includesub | char(1) |  |  | 'Y' |
| 8 | module | module | module | varchar2(50) |
| 9 | showflag | showflag | showflag | char(1) |  |  | 'Y' |
| 10 | showmark | showmark | showmark | char(1) |  |  | 'N' |
| 11 | subcodes | subcodes | subcodes | varchar2(500) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |