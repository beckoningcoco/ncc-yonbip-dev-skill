# |<<

**开证申请合同信息 (lcm_apply_b / nc.vo.lcm.open.apply.ApplyBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3554.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_apply_b | 申请子表主键 | pk_apply_b | char(20) | √ | 主键 (UFID) |
| 2 | contractno | 合同号 | contractno | varchar(50) |  | 字符串 (String) |
| 3 | pk_contcurrtype | 合同币种 | pk_contcurrtype | varchar(20) |  | 币种 (currtype) |
| 4 | contractamount | 合同金额 | contractamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 5 | pk_marbasclass | 货品分类 | pk_marbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 6 | pk_material | 货品/劳务 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | quantity | 数量 | quantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | pk_measdoc | 计量单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 9 | unitprice | 单价 | unitprice | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | amount | 金额 | amount | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 12 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 13 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 14 | bitnumber | 数量精度 | bitnumber | int |  | 换算小数位数枚举 (bitnumber) |  | 0=0; |