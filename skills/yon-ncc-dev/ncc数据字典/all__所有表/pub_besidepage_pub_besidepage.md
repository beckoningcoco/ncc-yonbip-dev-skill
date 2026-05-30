# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10891.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_besidepage | pk_besidepage | pk_besidepage | char(20) | √ |
| 2 | extendtype | extendtype | extendtype | number(38, 0) |
| 3 | funcode | funcode | funcode | varchar2(50) | √ |
| 4 | mdid | mdid | mdid | varchar2(200) |  |  | '~' |
| 5 | orderindex | orderindex | orderindex | number(38, 0) |
| 6 | pagecode | pagecode | pagecode | varchar2(40) | √ |
| 7 | pagename | pagename | pagename | varchar2(300) | √ |
| 8 | pagename2 | pagename2 | pagename2 | varchar2(300) |
| 9 | pagename3 | pagename3 | pagename3 | varchar2(300) |
| 10 | pagename4 | pagename4 | pagename4 | varchar2(300) |
| 11 | pagename5 | pagename5 | pagename5 | varchar2(300) |
| 12 | pagename6 | pagename6 | pagename6 | varchar2(300) |
| 13 | pk_country | pk_country | pk_country | varchar2(20) |  |  | '~' |
| 14 | pk_industry | pk_industry | pk_industry | varchar2(20) |  |  | '~' |
| 15 | pk_level | pk_level | pk_level | varchar2(50) |
| 16 | targetpage | targetpage | targetpage | varchar2(20) |  |  | '~' |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |