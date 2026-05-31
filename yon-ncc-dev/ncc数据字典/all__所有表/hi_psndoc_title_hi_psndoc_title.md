# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8672.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | pk_psndoc_sub | pk_psndoc_sub | char(20) | √ |
| 2 | achievement | achievement | achievement | varchar2(50) |
| 3 | achive | achive | achive | varchar2(384) |
| 4 | assorg | assorg | assorg | varchar2(192) |
| 5 | begindate | begindate | begindate | char(10) |
| 6 | certifcode | certifcode | certifcode | varchar2(42) |
| 7 | certificationtime | certificationtime | certificationtime | varchar2(10) |
| 8 | enddate | enddate | enddate | char(10) |
| 9 | jobagelimit | jobagelimit | jobagelimit | number(38, 0) |
| 10 | lastflag | lastflag | lastflag | char(1) | √ |  | 'N' |
| 11 | pk_group | pk_group | pk_group | char(20) | √ |
| 12 | pk_org | pk_org | pk_org | char(20) |
| 13 | pk_psndoc | pk_psndoc | pk_psndoc | char(20) |
| 14 | pk_techposttitle | pk_techposttitle | pk_techposttitle | char(20) |
| 15 | recordnum | recordnum | recordnum | number(38, 0) | √ |  | 0 |
| 16 | specialtyname | specialtyname | specialtyname | varchar2(128) |
| 17 | strongsuit | strongsuit | strongsuit | varchar2(384) |
| 18 | summ | summ | summ | varchar2(384) |
| 19 | tiptop_flag | tiptop_flag | tiptop_flag | char(1) |
| 20 | titlengage | titlengage | titlengage | varchar2(20) |
| 21 | titlerank | titlerank | titlerank | varchar2(20) |  |  | '~' |
| 22 | creationtime | creationtime | creationtime | char(19) |
| 23 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 26 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |