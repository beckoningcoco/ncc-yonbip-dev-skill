# |<<

**到单信息 (lcm_arrival_b / nc.vo.lcm.open.arrival.ArrivalInfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3556.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_arrival_b | 主键 | pk_arrival_b | char(20) | √ | 主键 (UFID) |
| 2 | contractno | 合同号 | contractno | varchar(50) |  | 字符串 (String) |
| 3 | pk_concurrtype | 合同币种 | pk_concurrtype | varchar(20) |  | 币种 (currtype) |
| 4 | contractamount | 合同金额 | contractamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 5 | arrivalbatch | 到货批次 | arrivalbatch | varchar(50) |  | 字符串 (String) |
| 6 | pk_marbasclass | 货品分类 | pk_marbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 7 | pk_material | 货品/劳务 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | pk_measdoc | 计量单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 9 | arrivalcount | 到货数量 | arrivalcount | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | arrivalamnt | 到货金额 | arrivalamnt | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | remark | 备注 | remark | varchar(181) |  | 备注 (Memo) |
| 12 | pk_signer | 签收人 | pk_signer | varchar(20) |  | 人员基本信息 (psndoc) |
| 13 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 14 | pk_org_v | 财务组织多版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 15 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 16 | bitnumber | 计量单位小数位 | bitnumber | int |  | 换算小数位数枚举 (bitnumber) |  | 0=0; |