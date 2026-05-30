# |<<

**供给来源 (mm_sasupply / nc.vo.mmpub.setanalysis.entity.SaSupplyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3777.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_supply | 供给来源主键 | pk_supply | varchar(60) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | vsupplytypecode | 供给单据类型 | vsupplytypecode | varchar(20) |  | 单据类型 (BilltypeVO) |
| 6 | fsupplytype | 供给单据 | fsupplytype | int |  | 供给类型 (SaSupplyType) |  | 0=存量; |