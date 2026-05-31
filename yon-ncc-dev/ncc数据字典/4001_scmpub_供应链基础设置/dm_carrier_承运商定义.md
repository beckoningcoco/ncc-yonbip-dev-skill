# |<<

**承运商定义 (dm_carrier / nc.vo.scmf.dm.carrier.entity.CarrierVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1716.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ccarrierid | 运输承运商主键 | ccarrierid | char(20) | √ | 主键 (UFID) |
| 2 | csupplierid | 承运商 | csupplierid | varchar(20) |  | 供应商基本信息 (supplier) |
| 3 | pk_org | 物流组织版本信息 | pk_org | varchar(20) |  | 组织_业务单元_物流组织 (trafficorg) |
| 4 | pk_org_v | 物流组织 | pk_org_v | varchar(20) |  | 组织_业务单元_物流组织版本信息 (trafficorg_v) |
| 5 | csendtypeid | 运输方式 | csendtypeid | varchar(20) |  | 运输方式 (transporttype) |
| 6 | vbizlicencecode | 工商营业执照编号 | vbizlicencecode | varchar(200) |  | 字符串 (String) |
| 7 | vtranliencecode | 运输经营许可证编号 | vtranliencecode | varchar(200) |  | 字符串 (String) |
| 8 | vcontractcode | 合同编号 | vcontractcode | varchar(200) |  | 字符串 (String) |
| 9 | ntrandeposit | 承运押金 | ntrandeposit | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 11 | bsealflag | 封存 | bsealflag | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | nexchangerate | 轻货与重货折算点 | nexchangerate | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 14 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 15 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 16 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 17 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 18 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 19 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 20 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 21 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 22 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 23 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |