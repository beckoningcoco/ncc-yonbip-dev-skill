# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6412.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_countryzone | pk_countryzone | pk_countryzone | char(20) | √ |
| 2 | countryzonecode | countryzonecode | countryzonecode | varchar2(2) | √ |
| 3 | countryzonename | countryzonename | countryzonename | varchar2(300) | √ |
| 4 | countryzonename2 | countryzonename2 | countryzonename2 | varchar2(300) |
| 5 | countryzonename3 | countryzonename3 | countryzonename3 | varchar2(300) |
| 6 | countryzonename4 | countryzonename4 | countryzonename4 | varchar2(300) |
| 7 | countryzonename5 | countryzonename5 | countryzonename5 | varchar2(300) |
| 8 | countryzonename6 | countryzonename6 | countryzonename6 | varchar2(300) |
| 9 | isdefault | isdefault | isdefault | char(1) |
| 10 | issystem | issystem | issystem | char(1) |
| 11 | creationtime | creationtime | creationtime | char(19) |
| 12 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 15 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |