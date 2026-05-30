# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6606.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | client | client | client | varchar2(50) |
| 2 | content | content | content | varchar2(100) |
| 3 | endtime | endtime | endtime | varchar2(19) |
| 4 | guid | guid | guid | char(20) | √ |
| 5 | opertype | opertype | opertype | varchar2(50) |
| 6 | requesturl | requesturl | requesturl | varchar2(100) |
| 7 | requestuser | requestuser | requestuser | varchar2(50) |
| 8 | starttime | starttime | starttime | varchar2(19) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |