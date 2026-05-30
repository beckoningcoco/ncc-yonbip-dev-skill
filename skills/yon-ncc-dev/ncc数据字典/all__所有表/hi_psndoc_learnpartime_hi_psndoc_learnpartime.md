# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8654.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | assorg | assorg | assorg | varchar2(128) |
| 2 | begindate | begindate | begindate | varchar2(10) |
| 3 | enddate | enddate | enddate | varchar2(10) |
| 4 | grade | grade | grade | varchar2(128) |
| 5 | lastflag | lastflag | lastflag | char(1) |
| 6 | name | name | name | varchar2(128) |
| 7 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |
| 8 | pk_psndoc_sub | pk_psndoc_sub | pk_psndoc_sub | varchar2(20) | √ |
| 9 | recordnum | recordnum | recordnum | number(38, 0) |
| 10 | remark | remark | remark | varchar2(200) |
| 11 | creationtime | creationtime | creationtime | varchar2(19) |
| 12 | creator | creator | creator | varchar2(20) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | modifiedtime | modifiedtime | modifiedtime | varchar2(19) |
| 15 | modifier | modifier | modifier | varchar2(20) |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |