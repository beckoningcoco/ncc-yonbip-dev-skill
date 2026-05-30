# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8656.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | author | author | author | varchar2(128) |
| 2 | authormember | authormember | authormember | varchar2(200) |
| 3 | begindate | begindate | begindate | varchar2(10) |
| 4 | booknumber | booknumber | booknumber | varchar2(128) |
| 5 | enddate | enddate | enddate | varchar2(10) |
| 6 | lastflag | lastflag | lastflag | char(1) |
| 7 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |
| 8 | pk_psndoc_sub | pk_psndoc_sub | pk_psndoc_sub | varchar2(20) | √ |
| 9 | press | press | press | varchar2(128) |
| 10 | recordnum | recordnum | recordnum | number(38, 0) |
| 11 | remark | remark | remark | varchar2(200) |
| 12 | treatiseclass | treatiseclass | treatiseclass | varchar2(128) |
| 13 | treatisename | treatisename | treatisename | varchar2(128) |
| 14 | creationtime | creationtime | creationtime | varchar2(19) |
| 15 | creator | creator | creator | varchar2(20) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | varchar2(19) |
| 18 | modifier | modifier | modifier | varchar2(20) |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |