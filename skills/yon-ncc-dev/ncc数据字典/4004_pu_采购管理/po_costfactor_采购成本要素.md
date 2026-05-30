# |<<

**采购成本要素 (po_costfactor / nc.vo.pu.costfactor.entity.CostfactorHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4593.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_costfactor | 成本要素 | pk_costfactor | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织最新版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | vfactorname | 成本要素名称 | vfactorname | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | fapportionmode | 分摊方式 | fapportionmode | int |  | 分摊方式 (ApportionMode) | 0 | 0=按数量; |