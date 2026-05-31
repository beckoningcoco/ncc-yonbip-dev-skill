# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6414.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_developorg | pk_developorg | pk_developorg | char(20) | √ |
| 2 | assetlayer | assetlayer | assetlayer | varchar2(50) |
| 3 | email | email | email | varchar2(50) |
| 4 | isdefault | isdefault | isdefault | char(1) |
| 5 | issystem | issystem | issystem | char(1) |
| 6 | mainpage | mainpage | mainpage | varchar2(50) |
| 7 | orgaddress | orgaddress | orgaddress | varchar2(200) |
| 8 | orgcode | orgcode | orgcode | varchar2(50) | √ |
| 9 | orgleader | orgleader | orgleader | varchar2(50) |
| 10 | orgname | orgname | orgname | varchar2(300) | √ |
| 11 | orgname2 | orgname2 | orgname2 | varchar2(300) |
| 12 | orgname3 | orgname3 | orgname3 | varchar2(300) |
| 13 | orgname4 | orgname4 | orgname4 | varchar2(300) |
| 14 | orgname5 | orgname5 | orgname5 | varchar2(300) |
| 15 | orgname6 | orgname6 | orgname6 | varchar2(300) |
| 16 | orgphone | orgphone | orgphone | varchar2(50) |
| 17 | orgtype | orgtype | orgtype | varchar2(50) | √ |
| 18 | partnercode | partnercode | partnercode | varchar2(2) |
| 19 | pk_countryzone | pk_countryzone | pk_countryzone | varchar2(20) |  |  | '~' |
| 20 | pk_industry | pk_industry | pk_industry | varchar2(20) |  |  | '~' |
| 21 | creationtime | creationtime | creationtime | char(19) |
| 22 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 25 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 26 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |