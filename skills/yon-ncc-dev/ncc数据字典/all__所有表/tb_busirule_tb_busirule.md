# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11989.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | createdby | createdby | createdby | varchar2(20) |
| 3 | createddate | createddate | createddate | char(19) |
| 4 | descript | descript | descript | varchar2(500) |
| 5 | isscriptedit | isscriptedit | isscriptedit | char(1) |
| 6 | issystem | issystem | issystem | char(1) | √ |
| 7 | modifiedby | modifiedby | modifiedby | varchar2(20) |
| 8 | modifieddate | modifieddate | modifieddate | char(19) |
| 9 | objcode | objcode | objcode | varchar2(50) |
| 10 | objname | objname | objname | varchar2(100) | √ |
| 11 | objname2 | objname2 | objname2 | varchar2(100) |
| 12 | objname3 | objname3 | objname3 | varchar2(100) |
| 13 | objname4 | objname4 | objname4 | varchar2(100) |
| 14 | objname5 | objname5 | objname5 | varchar2(100) |
| 15 | objname6 | objname6 | objname6 | varchar2(100) |
| 16 | pk_bigclass | pk_bigclass | pk_bigclass | varchar2(20) | √ |
| 17 | pk_busiattr | pk_busiattr | pk_busiattr | varchar2(20) |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |
| 19 | pk_mdsheet | pk_mdsheet | pk_mdsheet | varchar2(20) |
| 20 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 21 | pk_ruleclass | pk_ruleclass | pk_ruleclass | varchar2(20) | √ |
| 22 | ruletype | ruletype | ruletype | number(38, 0) | √ |
| 23 | syscode | syscode | syscode | varchar2(10) |
| 24 | def1 | def1 | def1 | varchar2(100) |
| 25 | def2 | def2 | def2 | varchar2(100) |
| 26 | def3 | def3 | def3 | varchar2(100) |
| 27 | def4 | def4 | def4 | varchar2(100) |
| 28 | def5 | def5 | def5 | varchar2(100) |
| 29 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 30 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |