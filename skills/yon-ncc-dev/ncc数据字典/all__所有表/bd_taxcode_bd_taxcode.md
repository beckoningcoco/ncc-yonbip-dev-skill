# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7103.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taxcode | pk_taxcode | pk_taxcode | char(20) | √ |
| 2 | code | code | code | varchar2(40) | √ |
| 3 | cuscountry | cuscountry | cuscountry | varchar2(20) |  |  | '~' |
| 4 | custaxes | custaxes | custaxes | varchar2(20) |  |  | '~' |
| 5 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 6 | description | description | description | varchar2(300) | √ |
| 7 | description2 | description2 | description2 | varchar2(300) |
| 8 | description3 | description3 | description3 | varchar2(300) |
| 9 | description4 | description4 | description4 | varchar2(300) |
| 10 | description5 | description5 | description5 | varchar2(300) |
| 11 | description6 | description6 | description6 | varchar2(300) |
| 12 | enablestate | enablestate | enablestate | number(38, 0) | √ |  | 2 |
| 13 | iscusvat | iscusvat | iscusvat | number(38, 0) | √ |  | 3 |
| 14 | istriangletrade | istriangletrade | istriangletrade | number(38, 0) | √ |  | 3 |
| 15 | mattaxes | mattaxes | mattaxes | varchar2(20) |  |  | '~' |
| 16 | pk_group | pk_group | pk_group | varchar2(20) | √ |  | '~' |
| 17 | pk_org | pk_org | pk_org | varchar2(20) | √ |  | '~' |
| 18 | pursaletype | pursaletype | pursaletype | number(38, 0) | √ |  | 5 |
| 19 | reptaxcountry | reptaxcountry | reptaxcountry | varchar2(20) | √ |  | '~' |
| 20 | supcountry | supcountry | supcountry | varchar2(20) |  |  | '~' |
| 21 | suptaxes | suptaxes | suptaxes | varchar2(20) |  |  | '~' |
| 22 | creationtime | creationtime | creationtime | char(19) |
| 23 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 26 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |