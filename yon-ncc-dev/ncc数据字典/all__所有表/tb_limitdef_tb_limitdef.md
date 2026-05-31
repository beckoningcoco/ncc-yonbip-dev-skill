# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12049.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | createdby | createdby | createdby | varchar2(20) |  |  | '~' |
| 3 | createddate | createddate | createddate | char(19) |
| 4 | description | description | description | varchar2(500) |
| 5 | dimsectionsettuple | dimsectionsettuple | dimsectionsettuple | blob |
| 6 | modifiedby | modifiedby | modifiedby | varchar2(20) |  |  | '~' |
| 7 | modifieddate | modifieddate | modifieddate | char(19) |
| 8 | objcode | objcode | objcode | varchar2(50) | √ |
| 9 | objname | objname | objname | varchar2(300) | √ |
| 10 | objname2 | objname2 | objname2 | varchar2(300) |
| 11 | objname3 | objname3 | objname3 | varchar2(300) |
| 12 | objname4 | objname4 | objname4 | varchar2(300) |
| 13 | objname5 | objname5 | objname5 | varchar2(300) |
| 14 | objname6 | objname6 | objname6 | varchar2(300) |
| 15 | pk_cube | pk_cube | pk_cube | varchar2(20) |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 17 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |