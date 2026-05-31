# |<<

**开证登记合同信息 (lcm_openregister_b / nc.vo.lcm.open.register.ContractVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3572.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contract | 主键 | pk_contract | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org_v | 财务组织多版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | contractno | 合同号 | contractno | varchar(50) |  | 字符串 (String) |
| 6 | pk_currtype | 合同币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 7 | pk_marbasclass | 货品分类 | pk_marbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 8 | pk_material | 货品/劳务 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 9 | quantity | 数量 | quantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | measure | 计量单位 | measure | varchar(20) |  | 计量单位 (measdoc) |
| 11 | bitnumber | 计量单位小数位数 | bitnumber | int |  | 换算小数位数枚举 (bitnumber) |  | 0=0; |