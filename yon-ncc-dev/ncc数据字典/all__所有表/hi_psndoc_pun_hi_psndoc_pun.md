# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8664.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | pk_psndoc_sub | pk_psndoc_sub | char(20) | √ |
| 2 | lastflag | lastflag | lastflag | char(1) | √ |  | 'Y' |
| 3 | pk_group | pk_group | pk_group | char(20) |
| 4 | pk_org | pk_org | pk_org | char(20) |
| 5 | pk_psndoc | pk_psndoc | pk_psndoc | char(20) |
| 6 | punishdate | punishdate | punishdate | char(10) |
| 7 | punishmatter | punishmatter | punishmatter | varchar2(384) |
| 8 | punishmeas | punishmeas | punishmeas | varchar2(384) |
| 9 | punishorg | punishorg | punishorg | varchar2(150) |
| 10 | punishtype | punishtype | punishtype | varchar2(150) |
| 11 | recordnum | recordnum | recordnum | number(38, 0) | √ |  | 0 |
| 12 | creationtime | creationtime | creationtime | char(19) |
| 13 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 16 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |