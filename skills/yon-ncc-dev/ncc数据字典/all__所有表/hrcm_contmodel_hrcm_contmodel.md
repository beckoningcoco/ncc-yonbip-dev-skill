# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8740.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_conmodel | pk_conmodel | pk_conmodel | char(20) | √ |
| 2 | isdefault | isdefault | isdefault | char(1) | √ |  | 'N' |
| 3 | modeltext | modeltext | modeltext | blob |
| 4 | model_xml | model_xml | model_xml | blob |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) | √ |  | '~' |
| 7 | vfilepath | vfilepath | vfilepath | varchar2(750) |
| 8 | vmodelcode | vmodelcode | vmodelcode | varchar2(42) | √ |
| 9 | vmodelname | vmodelname | vmodelname | varchar2(75) | √ |
| 10 | vmodelname2 | vmodelname2 | vmodelname2 | varchar2(75) |
| 11 | vmodelname3 | vmodelname3 | vmodelname3 | varchar2(75) |
| 12 | vmodelname4 | vmodelname4 | vmodelname4 | varchar2(75) |
| 13 | vmodelname5 | vmodelname5 | vmodelname5 | varchar2(75) |
| 14 | vmodelname6 | vmodelname6 | vmodelname6 | varchar2(75) |
| 15 | vmodeltype | vmodeltype | vmodeltype | varchar2(20) | √ |  | '~' |
| 16 | creationtime | creationtime | creationtime | char(19) | √ |
| 17 | creator | creator | creator | varchar2(20) | √ |  | '~' |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 20 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |