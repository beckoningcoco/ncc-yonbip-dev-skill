# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12023.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | busisystem | busisystem | busisystem | varchar2(10) |
| 3 | filename | filename | filename | varchar2(100) |
| 4 | filesize | filesize | filesize | varchar2(20) |
| 5 | filesizevalue | filesizevalue | filesizevalue | number(38, 0) |
| 6 | filetype | filetype | filetype | char(1) |
| 7 | info | info | info | varchar2(200) |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |
| 9 | pk_uplevel | pk_uplevel | pk_uplevel | varchar2(20) |
| 10 | creationtime | creationtime | creationtime | char(19) |
| 11 | creator | creator | creator | varchar2(20) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 14 | modifier | modifier | modifier | varchar2(20) |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |