# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10411.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_map_coordinate | pk_map_coordinate | pk_map_coordinate | char(20) | √ |
| 2 | lat | lat | lat | number(28, 8) |
| 3 | lng | lng | lng | number(28, 8) |
| 4 | pk_map_location | pk_map_location | pk_map_location | char(20) | √ |
| 5 | sequence_num | sequence_num | sequence_num | number(38, 0) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |