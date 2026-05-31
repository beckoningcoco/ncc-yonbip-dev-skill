# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7964.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fileinfo | pk_fileinfo | pk_fileinfo | char(20) | √ |
| 2 | filelen | filelen | filelen | varchar2(50) |
| 3 | filename | filename | filename | varchar2(500) |
| 4 | filesrc | filesrc | filesrc | varchar2(50) |
| 5 | filetype | filetype | filetype | varchar2(50) |
| 6 | fileurl | fileurl | fileurl | varchar2(500) |
| 7 | imagesystemtype | imagesystemtype | imagesystemtype | varchar2(50) |
| 8 | pk_body | pk_body | pk_body | varchar2(20) |
| 9 | pk_head | pk_head | pk_head | varchar2(20) |
| 10 | pk_ncfile | pk_ncfile | pk_ncfile | varchar2(50) |
| 11 | creationtime | creationtime | creationtime | char(19) |
| 12 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 15 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |