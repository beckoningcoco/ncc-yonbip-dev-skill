# |<<

**车辆定义 (dm_vehicle / nc.vo.scmf.dm.vehicle.entity.VehicleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1741.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cvehicleid | 车辆定义主键 | cvehicleid | char(20) | √ | 主键 (UFID) |
| 2 | cdeptid | 所属部门版本信息 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 3 | cdeptid_v | 所属部门 | cdeptid_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 4 | fattributeflag | 属性 | fattributeflag | int |  | 属性 (fattributeflag) |  | 0=自用; |