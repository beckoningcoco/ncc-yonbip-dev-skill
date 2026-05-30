# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8648.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | pk_psndoc_sub | pk_psndoc_sub | char(20) | √ |
| 2 | encourdate | encourdate | encourdate | char(10) |
| 3 | encourmatter | encourmatter | encourmatter | varchar2(384) |
| 4 | encourmeas | encourmeas | encourmeas | varchar2(384) |
| 5 | encourorg | encourorg | encourorg | varchar2(150) |
| 6 | encourrank | encourrank | encourrank | varchar2(20) |  |  | '~' |
| 7 | encourtype | encourtype | encourtype | varchar2(150) |
| 8 | lastflag | lastflag | lastflag | char(1) | √ |  | 'Y' |
| 9 | pk_group | pk_group | pk_group | char(20) |
| 10 | pk_org | pk_org | pk_org | char(20) |
| 11 | pk_psndoc | pk_psndoc | pk_psndoc | char(20) |
| 12 | recordnum | recordnum | recordnum | number(38, 0) | √ |  | 0 |
| 13 | creationtime | creationtime | creationtime | char(19) |
| 14 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 17 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |