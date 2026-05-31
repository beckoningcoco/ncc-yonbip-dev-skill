# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8100.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_assetgrouprate | pk_assetgrouprate | pk_assetgrouprate | char(20) | √ |
| 2 | group_name | group_name | group_name | varchar2(80) |
| 3 | pk_assetgroup | pk_assetgroup | pk_assetgroup | varchar2(50) |
| 4 | pk_assetgroup_b | pk_assetgroup_b | pk_assetgroup_b | char(20) | √ |
| 5 | rate | rate | rate | number(16, 6) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |