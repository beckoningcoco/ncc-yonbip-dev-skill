# |<<

**物料利润中心子表信息 (bd_materialpfcsub / nc.vo.bd.material.pfc.MaterialPfcSubVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/901.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_materialpfcsub | 物料利润中心字表信息主键 | pk_materialpfcsub | char(20) | √ | 主键 (UFID) |
| 2 | pk_material | 物料基本信息主键 | pk_material | varchar(20) | √ | 物料基本信息（多版本） (material) |
| 3 | pk_materialpfc | 物料利润中心主键 | pk_materialpfc | varchar(20) | √ | 物料利润中心信息 (materialpfc) |
| 4 | pk_liabilitybook | 责任核算账簿 | pk_liabilitybook | varchar(20) | √ | 账簿_责任核算账簿 (liabilitybook) |
| 5 | pk_org | 所属利润中心 | pk_org | varchar(20) | √ | 利润中心 (profitcenter) |
| 6 | costmode | 成本对象类型 | costmode | varchar(50) |  | 成本对象类型 (sfcbdxtype) |  | Sys001=品种; |