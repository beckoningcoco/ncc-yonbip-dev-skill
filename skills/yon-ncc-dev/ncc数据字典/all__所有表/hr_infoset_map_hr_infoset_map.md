# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8821.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_infoset_map | pk_infoset_map | pk_infoset_map | char(20) | √ |
| 2 | pk_group | pk_group | pk_group | char(20) |
| 3 | pk_org | pk_org | pk_org | char(20) |
| 4 | pk_sourceinfoset | pk_sourceinfoset | pk_sourceinfoset | char(20) |
| 5 | pk_targetinfoset | pk_targetinfoset | pk_targetinfoset | char(20) |
| 6 | system_flag | system_flag | system_flag | char(1) |
| 7 | creationtime | creationtime | creationtime | char(19) | √ |
| 8 | creator | creator | creator | char(20) | √ |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 11 | modifier | modifier | modifier | char(20) |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |