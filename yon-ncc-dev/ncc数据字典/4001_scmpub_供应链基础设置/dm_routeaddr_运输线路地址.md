# |<<

**运输线路地址 (dm_routeaddr / nc.vo.scmf.dm.route.entity.RouteBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1740.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | crouteaddrid | 运输路线地址主键 | crouteaddrid | char(20) | √ | 主键 (UFID) |
| 2 | nmileage | 里程(公里) | nmileage | decimal(28, 8) |  | 数值 (UFDouble) |
| 3 | caddrdocid | 运输地点 | caddrdocid | varchar(20) |  | 地点档案 (addressdoc) |
| 4 | nspecialmileage1 | 特殊路线1里程 | nspecialmileage1 | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | nspecialmileage2 | 特殊路线2里程 | nspecialmileage2 | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | nspecialmileage3 | 特殊路线3里程 | nspecialmileage3 | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | nspecialmileage4 | 特殊路线4里程 | nspecialmileage4 | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 9 | pk_org | 物流组织 | pk_org | varchar(20) |  | 组织_业务单元_物流组织 (trafficorg) |
| 10 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
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
| 26 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |