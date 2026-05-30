# |<<

**物料利润中心信息 (bd_materialpfc / nc.vo.bd.material.pfc.MaterialPfcVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/898.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_materialpfc | 物料利润中心主键 | pk_materialpfc | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属利润中心 | pk_org | varchar(20) | √ | 利润中心 (profitcenter) |
| 4 | pk_material | 物料基本信息主键 | pk_material | varchar(20) | √ | 物料基本信息（多版本） (material) |
| 5 | transfermar | 传存货 | transfermar | char(1) | √ | 布尔类型 (UFBoolean) |
| 6 | asstservice | 辅助服务 | asstservice | char(1) | √ | 布尔类型 (UFBoolean) |
| 7 | pk_marcostcls | 成本分类 | pk_marcostcls | varchar(20) |  | 物料成本分类 (marcostclass) |
| 8 | clsfuturemar | 分类特征物料 | clsfuturemar | char(1) | √ | 布尔类型 (UFBoolean) |
| 9 | dataoriginflag | 分布式 | dataoriginflag | smallint |  | 数据来源 (dataorigin) |  | 0=本级产生; |