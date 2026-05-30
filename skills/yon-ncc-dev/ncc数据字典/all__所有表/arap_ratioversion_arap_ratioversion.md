# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6589.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ratioversion | pk_ratioversion | pk_ratioversion | char(20) | √ |
| 2 | begindate | begindate | begindate | char(19) |
| 3 | enddate | enddate | enddate | char(19) |
| 4 | pk_bdprovisionratio | pk_bdprovisionratio | pk_bdprovisionratio | varchar2(20) |  |  | '~' |
| 5 | creationtime | creationtime | creationtime | char(19) |
| 6 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 9 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |