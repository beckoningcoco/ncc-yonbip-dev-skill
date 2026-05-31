# |<<

**运输路线 (dm_route / nc.vo.scmf.dm.route.entity.RouteHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1739.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | crouteid | 路线主键 | crouteid | char(20) | √ | 主键 (UFID) |
| 2 | vroutecode | 路线编码 | vroutecode | varchar(40) |  | 字符串 (String) |
| 3 | vroutename | 路线名称 | vroutename | varchar(76) |  | 多语文本 (MultiLangText) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 物流组织版本信息 | pk_org | varchar(20) |  | 组织_业务单元_物流组织 (trafficorg) |
| 6 | pk_org_v | 物流组织 | pk_org_v | varchar(20) |  | 组织_业务单元_物流组织版本信息 (trafficorg_v) |
| 7 | cvehicleid | 默认车辆 | cvehicleid | varchar(20) |  | 车辆定义 (dm_vehicle) |
| 8 | ccarrierid | 默认承运商 | ccarrierid | varchar(20) |  | 承运商定义 (dm_carrier) |
| 9 | bsealflag | 封存 | bsealflag | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | ctrantypeid | 默认运输方式 | ctrantypeid | varchar(20) |  | 运输方式 (transporttype) |
| 11 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 12 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 13 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 14 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 15 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 16 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 17 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 18 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 19 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 20 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 21 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 22 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 23 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |