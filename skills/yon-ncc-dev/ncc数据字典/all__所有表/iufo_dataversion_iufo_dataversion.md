# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9509.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dataversion | pk_dataversion | pk_dataversion | char(20) | √ |
| 2 | pk_businessref | pk_businessref | pk_businessref | char(20) |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |
| 4 | pk_org | pk_org | pk_org | varchar2(20) |
| 5 | pk_versionno | pk_versionno | pk_versionno | number(38, 0) | √ |
| 6 | ver_content | ver_content | ver_content | varchar2(192) |
| 7 | ver_content2 | ver_content2 | ver_content2 | varchar2(192) |
| 8 | ver_content3 | ver_content3 | ver_content3 | varchar2(192) |
| 9 | ver_content4 | ver_content4 | ver_content4 | varchar2(192) |
| 10 | ver_content5 | ver_content5 | ver_content5 | varchar2(192) |
| 11 | ver_content6 | ver_content6 | ver_content6 | varchar2(192) |
| 12 | ver_name | ver_name | ver_name | varchar2(96) | √ |
| 13 | ver_name2 | ver_name2 | ver_name2 | varchar2(96) |
| 14 | ver_name3 | ver_name3 | ver_name3 | varchar2(96) |
| 15 | ver_name4 | ver_name4 | ver_name4 | varchar2(96) |
| 16 | ver_name5 | ver_name5 | ver_name5 | varchar2(96) |
| 17 | ver_name6 | ver_name6 | ver_name6 | varchar2(96) |
| 18 | ver_type | ver_type | ver_type | number(38, 0) | √ |
| 19 | creationtime | creationtime | creationtime | char(19) |
| 20 | creator | creator | creator | varchar2(20) |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 23 | modifier | modifier | modifier | varchar2(20) |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |