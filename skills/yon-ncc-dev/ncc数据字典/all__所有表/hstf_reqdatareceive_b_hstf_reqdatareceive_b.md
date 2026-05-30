# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8869.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | castunitid | castunitid | castunitid | varchar2(20) |  |  | '~' |
| 2 | cwarehouseid | cwarehouseid | cwarehouseid | varchar2(20) |  |  | '~' |
| 3 | destbid | destbid | destbid | varchar2(50) |
| 4 | nnum | nnum | nnum | number(28, 8) |
| 5 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 6 | pk_reqdatareceive | pk_reqdatareceive | pk_reqdatareceive | char(20) | √ |
| 7 | pk_reqdatareceiveb | pk_reqdatareceiveb | pk_reqdatareceiveb | char(20) | √ |
| 8 | reqdate | reqdate | reqdate | char(19) |
| 9 | rowno | rowno | rowno | varchar2(50) |
| 10 | rownote | rownote | rownote | varchar2(50) |
| 11 | srcbid | srcbid | srcbid | varchar2(50) |
| 12 | srcformat | srcformat | srcformat | varchar2(50) |
| 13 | srcmaterialcode | srcmaterialcode | srcmaterialcode | varchar2(50) |
| 14 | srcmaterialname | srcmaterialname | srcmaterialname | varchar2(50) |
| 15 | srcmodel | srcmodel | srcmodel | varchar2(50) |
| 16 | srcunit | srcunit | srcunit | varchar2(50) |
| 17 | vchangerate | vchangerate | vchangerate | varchar2(50) |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |