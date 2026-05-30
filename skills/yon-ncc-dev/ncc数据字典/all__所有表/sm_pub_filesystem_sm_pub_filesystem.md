# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11616.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk | pk | pk | char(20) | √ |
| 2 | contentdata | contentdata | contentdata | blob |
| 3 | filedesc | filedesc | filedesc | varchar2(600) |
| 4 | filelength | filelength | filelength | varchar2(50) |
| 5 | filepath | filepath | filepath | varchar2(2000) |
| 6 | filetype | filetype | filetype | varchar2(100) |
| 7 | hashidx | hashidx | hashidx | number(38, 0) |
| 8 | isdoc | isdoc | isdoc | char(1) |
| 9 | isfolder | isfolder | isfolder | char(1) |
| 10 | lasttime | lasttime | lasttime | varchar2(20) |
| 11 | modifytime | modifytime | modifytime | varchar2(20) |
| 12 | pk_doc | pk_doc | pk_doc | varchar2(2000) |
| 13 | rootpath | rootpath | rootpath | varchar2(500) |
| 14 | scantimes | scantimes | scantimes | number(38, 0) |
| 15 | smallimagedata | smallimagedata | smallimagedata | blob |
| 16 | creator | creator | creator | varchar2(20) |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | modifier | modifier | modifier | varchar2(20) |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |