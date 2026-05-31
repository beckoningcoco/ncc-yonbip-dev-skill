# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8645.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | pk_psndoc_sub | pk_psndoc_sub | char(20) | √ |
| 2 | approveflag | approveflag | approveflag | number(38, 0) |  |  | 1 |
| 3 | begindate | begindate | begindate | char(10) |
| 4 | certifcode | certifcode | certifcode | varchar2(42) |
| 5 | degreedate | degreedate | degreedate | char(10) |
| 6 | degreeunit | degreeunit | degreeunit | varchar2(384) |
| 7 | education | education | education | varchar2(20) |  |  | '~' |
| 8 | educationctifcode | educationctifcode | educationctifcode | varchar2(42) |
| 9 | edusystem | edusystem | edusystem | number(20, 8) |
| 10 | enddate | enddate | enddate | char(10) |
| 11 | lasteducation | lasteducation | lasteducation | char(1) |  |  | 'N' |
| 12 | lastflag | lastflag | lastflag | char(1) |
| 13 | major | major | major | varchar2(300) |
| 14 | majortype | majortype | majortype | varchar2(20) |  |  | '~' |
| 15 | memo | memo | memo | varchar2(1536) |
| 16 | period | period | period | varchar2(10) |
| 17 | pk_degree | pk_degree | pk_degree | varchar2(20) |  |  | '~' |
| 18 | pk_group | pk_group | pk_group | char(20) |
| 19 | pk_org | pk_org | pk_org | char(20) |
| 20 | pk_psndoc | pk_psndoc | pk_psndoc | char(20) |
| 21 | recordnum | recordnum | recordnum | number(38, 0) |
| 22 | school | school | school | varchar2(900) |
| 23 | schooltype | schooltype | schooltype | varchar2(192) |
| 24 | studymode | studymode | studymode | varchar2(20) |  |  | '~' |
| 25 | creationtime | creationtime | creationtime | char(19) |
| 26 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 27 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 28 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 29 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 30 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |