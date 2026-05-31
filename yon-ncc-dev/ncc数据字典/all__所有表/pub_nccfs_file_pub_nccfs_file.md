# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10950.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk | pk | pk | char(20) | √ |
| 2 | createtime | createtime | createtime | varchar2(19) |
| 3 | filedesc | filedesc | filedesc | varchar2(600) |
| 4 | filename | filename | filename | varchar2(200) |
| 5 | filepath | filepath | filepath | varchar2(2000) |
| 6 | filetype | filetype | filetype | varchar2(100) |
| 7 | hashidx | hashidx | hashidx | number(38, 0) |
| 8 | isfolder | isfolder | isfolder | char(1) |
| 9 | ishandle | ishandle | ishandle | number(38, 0) |
| 10 | modifytime | modifytime | modifytime | varchar2(19) |
| 11 | modules | modules | modules | varchar2(20) |
| 12 | storeip | storeip | storeip | varchar2(20) |
| 13 | storerootdir | storerootdir | storerootdir | varchar2(100) |
| 14 | storetype | storetype | storetype | varchar2(20) |
| 15 | creator | creator | creator | varchar2(20) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifier | modifier | modifier | varchar2(100) |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |