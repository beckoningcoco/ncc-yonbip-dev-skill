# |<<

**车型定义 (dm_vehicletype / nc.vo.scmf.dm.vehicletype.entity.VehicleTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1742.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cvehicletypeid | 车型定义主键 | cvehicletypeid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org_v | 物流组织 | pk_org_v | varchar(20) |  | 组织_业务单元_物流组织版本信息 (trafficorg_v) |
| 3 | pk_org | 物流组织版本信息 | pk_org | varchar(20) |  | 组织_业务单元_物流组织 (trafficorg) |
| 4 | vvhcltypecode | 编码 | vvhcltypecode | varchar(40) |  | 字符串 (String) |
| 5 | vvhcltypename | 名称 | vvhcltypename | varchar(76) |  | 多语文本 (MultiLangText) |
| 6 | nload | 载重 | nload | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | ncubage | 容积 | ncubage | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 9 | nlength | 长 | nlength | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | nwidth | 宽 | nwidth | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nheight | 高 | nheight | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 13 | bsealflag | 封存 | bsealflag | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 15 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 16 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 17 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 18 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 19 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 20 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 21 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 22 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 23 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |