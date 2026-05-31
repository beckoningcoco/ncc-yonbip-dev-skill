# |<<

**租赁明细 (rlm_contract_s / nc.vo.rlm.contract.ContractRentDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4941.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contract_s | 租赁明细主键 | pk_contract_s | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 租出组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 3 | pk_org_v | 租出组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_material | 物料最新版本 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | pk_material_v | 物料 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | pk_rent_unit | 报价单位 | pk_rent_unit | varchar(20) |  | 计量单位 (measdoc) |
| 8 | rent_num_in | 已租入报价数量 | rent_num_in | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | rent_num_return | 已还回报价数量 | rent_num_return | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | rent_num_stop | 停租报价数量 | rent_num_stop | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | rent_num_comp | 赔偿报价数量 | rent_num_comp | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | rent_num_lost | 遗失报价数量 | rent_num_lost | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | rent_num_discard | 报废报价数量 | rent_num_discard | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | adjust_num | 调整报价数量 | adjust_num | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | pk_contract_b_src | 来源合同基本行主键 | pk_contract_b_src | varchar(20) |  | 字符串 (String) |
| 16 | pk_contract_b_base_src | 来源合同基本行源版主键 | pk_contract_b_base_src | varchar(20) |  | 字符串 (String) |
| 17 | pk_contract_base | 来源合同源版主键 | pk_contract_base | varchar(50) |  | 字符串 (String) |
| 18 | rowno_src | 来源合同行号 | rowno_src | varchar(30) |  | 字符串 (String) |
| 19 | pk_marbaseclass | 物料分类主键 | pk_marbaseclass | varchar(20) |  | 字符串 (String) |