# |<<

**物料利润中心成本域信息 (bd_materialpfcc / nc.vo.bd.material.pfcc.MaterialPFCCVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/899.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mateprofcost | 物料利润中心成本域主键 | pk_mateprofcost | char(20) | √ | 主键 (UFID) |
| 2 | pk_material | 物料基本信息主键 | pk_material | varchar(20) | √ | 物料基本信息（多版本） (material) |
| 3 | pk_org | 所属利润中心成本域 | pk_org | varchar(20) | √ | 组织_成本域 (costregion) |
| 4 | refcost | 参考成本 | refcost | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 6 | dataoriginflag | 分布式 | dataoriginflag | smallint |  | 数据来源 (dataorigin) |  | 0=本级产生; |