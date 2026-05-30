# |<<

**地图覆盖物坐标 (pam_map_coordinate / nc.vo.aim.equipmap.CoordinateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4280.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_map_coordinate | 坐标主键 | pk_map_coordinate | char(20) | √ | 主键 (UFID) |
| 2 | lng | 经度 | lng | decimal(28, 8) |  | 数值 (UFDouble) |
| 3 | lat | 纬度 | lat | decimal(28, 8) |  | 数值 (UFDouble) |
| 4 | sequence_num | 顺序 | sequence_num | int |  | 整数 (Integer) |