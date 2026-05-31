# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9115.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cpackbillhid | cpackbillhid | cpackbillhid | char(20) | √ |
| 2 | corpoid | corpoid | corpoid | varchar2(20) |  |  | '~' |
| 3 | corpvid | corpvid | corpvid | varchar2(20) |  |  | '~' |
| 4 | cpacktypeid | cpacktypeid | cpacktypeid | varchar2(20) |  |  | '~' |
| 5 | dbilldate | dbilldate | dbilldate | char(19) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 9 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 10 | vinvbarcode | vinvbarcode | vinvbarcode | varchar2(50) |
| 11 | vpackboxno | vpackboxno | vpackboxno | varchar2(40) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |