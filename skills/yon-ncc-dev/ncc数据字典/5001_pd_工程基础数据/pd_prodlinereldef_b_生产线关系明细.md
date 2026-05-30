# |<<

**生产线关系明细 (pd_prodlinereldef_b / nc.vo.pd.prodlinereldef.entity.ProdLineRelDefBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4373.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_prodlinerefdefb | 生产线关系明细 | pk_prodlinerefdefb | char(20) | √ | 主键 (UFID) |
| 2 | pk_uporg | 上游工厂最新版本 | pk_uporg | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 3 | pk_uporg_v | 上游工厂 | pk_uporg_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 4 | pk_upprodline | 上游生产线 | pk_upprodline | varchar(20) |  | 工作中心 (bd_wk) |
| 5 | pk_downorg | 下游工厂最新版本 | pk_downorg | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 6 | pk_downorg_v | 下游工厂 | pk_downorg_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 7 | pk_downprodline | 下游生产线 | pk_downprodline | varchar(20) |  | 工作中心 (bd_wk) |
| 8 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 9 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |