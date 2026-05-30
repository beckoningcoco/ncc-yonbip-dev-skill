# |<<

**周转材租入运输装卸费 (rlm_entrance_c / nc.vo.rlm.entrance.TransportPay)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4944.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_entrance_c | 费用子表主键 | pk_entrance_c | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 承租组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 3 | pk_org_v | 承租组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | pk_marbaseclass | 物料分类 | pk_marbaseclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 7 | pk_material | 物料最新版本 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | pk_material_v | 物料 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 9 | pk_unit | 单位 | pk_unit | varchar(20) |  | 计量单位 (measdoc) |
| 10 | num | 数量 | num | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | price | 单价（原币） | price | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | fee_type | 运输费/装卸费 | fee_type | int |  | 周转材运输装卸费 (feetype) |  | 1=运输费; |