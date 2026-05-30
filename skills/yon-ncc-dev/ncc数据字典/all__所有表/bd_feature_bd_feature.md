# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6925.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cfeatureid | cfeatureid | cfeatureid | char(20) | √ |
| 2 | castunitid | castunitid | castunitid | varchar2(20) |  |  | '~' |
| 3 | crefdataid | crefdataid | crefdataid | varchar2(36) |  |  | '~' |
| 4 | fdatatype | fdatatype | fdatatype | number(38, 0) |
| 5 | fenable | fenable | fenable | number(38, 0) |
| 6 | fselecttype | fselecttype | fselecttype | number(38, 0) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | vfeaturecode | vfeaturecode | vfeaturecode | varchar2(20) |
| 10 | vfeaturename | vfeaturename | vfeaturename | varchar2(75) |
| 11 | vfeaturename2 | vfeaturename2 | vfeaturename2 | varchar2(75) |
| 12 | vfeaturename3 | vfeaturename3 | vfeaturename3 | varchar2(75) |
| 13 | vfeaturename4 | vfeaturename4 | vfeaturename4 | varchar2(75) |
| 14 | vfeaturename5 | vfeaturename5 | vfeaturename5 | varchar2(75) |
| 15 | vfeaturename6 | vfeaturename6 | vfeaturename6 | varchar2(75) |
| 16 | vnote | vnote | vnote | varchar2(181) |
| 17 | creationtime | creationtime | creationtime | char(19) |
| 18 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 21 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |