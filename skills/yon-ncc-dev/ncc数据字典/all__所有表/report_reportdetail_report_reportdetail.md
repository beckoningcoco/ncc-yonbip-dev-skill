# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11133.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reportdetail | pk_reportdetail | pk_reportdetail | char(20) | √ |
| 2 | analysisfieldcode | analysisfieldcode | analysisfieldcode | varchar2(50) |
| 3 | analysistype | analysistype | analysistype | number(38, 0) |
| 4 | calculatetype | calculatetype | calculatetype | varchar2(50) |
| 5 | classid | classid | classid | varchar2(50) |
| 6 | datatype | datatype | datatype | varchar2(50) |
| 7 | directoryhierarchy | directoryhierarchy | directoryhierarchy | varchar2(500) |
| 8 | fieldcode | fieldcode | fieldcode | varchar2(500) |
| 9 | fieldname | fieldname | fieldname | varchar2(200) |
| 10 | fieldname2 | fieldname2 | fieldname2 | varchar2(200) |
| 11 | fieldname3 | fieldname3 | fieldname3 | varchar2(200) |
| 12 | fieldname4 | fieldname4 | fieldname4 | varchar2(200) |
| 13 | fieldname5 | fieldname5 | fieldname5 | varchar2(200) |
| 14 | fieldname6 | fieldname6 | fieldname6 | varchar2(200) |
| 15 | fieldtype | fieldtype | fieldtype | varchar2(20) | √ |
| 16 | filteroperator | filteroperator | filteroperator | varchar2(50) |
| 17 | filterproperty | filterproperty | filterproperty | varchar2(2000) |
| 18 | format | format | format | number(38, 0) |
| 19 | formula | formula | formula | varchar2(2000) |
| 20 | formulatype | formulatype | formulatype | varchar2(50) |
| 21 | fullname | fullname | fullname | varchar2(1000) |
| 22 | isaddbyperson | isaddbyperson | isaddbyperson | char(1) |  |  | 'N' |
| 23 | isdefdim | isdefdim | isdefdim | char(1) |
| 24 | issetdefdim | issetdefdim | issetdefdim | char(1) |
| 25 | issetfilter | issetfilter | issetfilter | char(1) |  |  | 'N' |
| 26 | issetquickcal | issetquickcal | issetquickcal | char(1) |  |  | 'N' |
| 27 | isshow | isshow | isshow | char(1) | √ |  | 'Y' |
| 28 | issubtotal | issubtotal | issubtotal | char(1) |
| 29 | modelname | modelname | modelname | varchar2(100) |
| 30 | pk_datamodel | pk_datamodel | pk_datamodel | varchar2(20) |
| 31 | pk_modelfield | pk_modelfield | pk_modelfield | varchar2(20) | √ |
| 32 | pk_parentcol | pk_parentcol | pk_parentcol | varchar2(20) |
| 33 | pk_report | pk_report | pk_report | char(20) | √ |
| 34 | quickcaltype | quickcaltype | quickcaltype | number(38, 0) |
| 35 | rankfieldcode | rankfieldcode | rankfieldcode | varchar2(50) |
| 36 | ranktype | ranktype | ranktype | number(38, 0) |
| 37 | refclassname | refclassname | refclassname | varchar2(200) |
| 38 | refname | refname | refname | varchar2(200) |
| 39 | refname2 | refname2 | refname2 | varchar2(200) |
| 40 | refname3 | refname3 | refname3 | varchar2(200) |
| 41 | refname4 | refname4 | refname4 | varchar2(200) |
| 42 | refname5 | refname5 | refname5 | varchar2(200) |
| 43 | refname6 | refname6 | refname6 | varchar2(200) |
| 44 | refpath | refpath | refpath | varchar2(500) |
| 45 | scale | scale | scale | number(38, 0) |
| 46 | sequence | sequence | sequence | varchar2(50) |
| 47 | showname | showname | showname | varchar2(200) |
| 48 | showname2 | showname2 | showname2 | varchar2(200) |
| 49 | showname3 | showname3 | showname3 | varchar2(200) |
| 50 | showname4 | showname4 | showname4 | varchar2(200) |
| 51 | showname5 | showname5 | showname5 | varchar2(200) |
| 52 | showname6 | showname6 | showname6 | varchar2(200) |
| 53 | sortmethod | sortmethod | sortmethod | varchar2(20) |
| 54 | sortnumber | sortnumber | sortnumber | varchar2(10) |
| 55 | specialdim | specialdim | specialdim | char(1) |
| 56 | subtotalmethod | subtotalmethod | subtotalmethod | varchar2(20) |
| 57 | sumformula | sumformula | sumformula | varchar2(2000) |
| 58 | unit | unit | unit | varchar2(20) |
| 59 | def1 | def1 | def1 | varchar2(101) |
| 60 | def2 | def2 | def2 | varchar2(101) |
| 61 | def3 | def3 | def3 | varchar2(101) |
| 62 | def4 | def4 | def4 | varchar2(101) |
| 63 | def5 | def5 | def5 | varchar2(101) |
| 64 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 65 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |