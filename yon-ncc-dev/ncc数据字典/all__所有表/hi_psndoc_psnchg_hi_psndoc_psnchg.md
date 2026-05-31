# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8663.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | pk_psndoc_sub | pk_psndoc_sub | char(20) | √ |
| 2 | assgid | assgid | assgid | number(38, 0) | √ |
| 3 | begindate | begindate | begindate | char(10) |
| 4 | comecorpaddr | comecorpaddr | comecorpaddr | varchar2(20) |  |  | '~' |
| 5 | comecorpname | comecorpname | comecorpname | varchar2(300) |
| 6 | comecorpprp | comecorpprp | comecorpprp | varchar2(20) |  |  | '~' |
| 7 | cometype | cometype | cometype | varchar2(20) |
| 8 | enddate | enddate | enddate | char(10) |
| 9 | lastflag | lastflag | lastflag | char(1) |
| 10 | memo | memo | memo | varchar2(1536) |
| 11 | orgage | orgage | orgage | varchar2(1000) |
| 12 | org_workage | org_workage | org_workage | number(38, 0) |
| 13 | pk_corp | pk_corp | pk_corp | varchar2(20) |  |  | '~' |
| 14 | pk_group | pk_group | pk_group | char(20) |
| 15 | pk_org | pk_org | pk_org | char(20) |
| 16 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 17 | pk_psnorg | pk_psnorg | pk_psnorg | varchar2(20) | √ |  | '~' |
| 18 | recordnum | recordnum | recordnum | number(38, 0) |
| 19 | tocorpaddr | tocorpaddr | tocorpaddr | varchar2(20) |  |  | '~' |
| 20 | tocorpname | tocorpname | tocorpname | varchar2(300) |
| 21 | tocorpprp | tocorpprp | tocorpprp | varchar2(20) |  |  | '~' |
| 22 | totype | totype | totype | varchar2(20) |  |  | '~' |
| 23 | creationtime | creationtime | creationtime | char(19) |
| 24 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 25 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 26 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 27 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 28 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |