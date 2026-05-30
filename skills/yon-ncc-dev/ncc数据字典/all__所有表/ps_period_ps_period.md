# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10845.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_period | pk_period | pk_period | char(20) | √ |
| 2 | begindate | begindate | begindate | char(19) |
| 3 | code | code | code | varchar2(50) |
| 4 | enddate | enddate | enddate | char(19) |
| 5 | iscatalog | iscatalog | iscatalog | char(1) |
| 6 | pid | pid | pid | varchar2(20) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 10 | prdname | prdname | prdname | varchar2(200) |
| 11 | prdname2 | prdname2 | prdname2 | varchar2(200) |
| 12 | prdname3 | prdname3 | prdname3 | varchar2(200) |
| 13 | prdname4 | prdname4 | prdname4 | varchar2(200) |
| 14 | prdname5 | prdname5 | prdname5 | varchar2(200) |
| 15 | prdname6 | prdname6 | prdname6 | varchar2(200) |
| 16 | prdunit | prdunit | prdunit | number(38, 0) |
| 17 | remark | remark | remark | varchar2(181) |
| 18 | seqno | seqno | seqno | number(38, 0) |
| 19 | creationtime | creationtime | creationtime | char(19) |
| 20 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 23 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |