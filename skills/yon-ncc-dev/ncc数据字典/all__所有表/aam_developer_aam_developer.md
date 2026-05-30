# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6413.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_developer | pk_developer | pk_developer | char(20) | √ |
| 2 | assetlayer | assetlayer | assetlayer | varchar2(50) | √ |
| 3 | developercode | developercode | developercode | varchar2(50) | √ |
| 4 | developername | developername | developername | varchar2(300) | √ |
| 5 | developername2 | developername2 | developername2 | varchar2(300) |
| 6 | developername3 | developername3 | developername3 | varchar2(300) |
| 7 | developername4 | developername4 | developername4 | varchar2(300) |
| 8 | developername5 | developername5 | developername5 | varchar2(300) |
| 9 | developername6 | developername6 | developername6 | varchar2(300) |
| 10 | developorg | developorg | developorg | char(20) | √ |
| 11 | email | email | email | varchar2(50) |
| 12 | isdefault | isdefault | isdefault | char(1) |
| 13 | issystem | issystem | issystem | char(1) |
| 14 | phone | phone | phone | varchar2(50) |
| 15 | pk_aamindustry | pk_aamindustry | pk_aamindustry | varchar2(50) |  |  | '~' |
| 16 | pk_countryzone | pk_countryzone | pk_countryzone | varchar2(20) |  |  | '~' |
| 17 | pk_industry | pk_industry | pk_industry | varchar2(20) |  |  | '~' |
| 18 | pk_module | pk_module | pk_module | varchar2(20) |  |  | '~' |
| 19 | creationtime | creationtime | creationtime | char(19) |
| 20 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 23 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |