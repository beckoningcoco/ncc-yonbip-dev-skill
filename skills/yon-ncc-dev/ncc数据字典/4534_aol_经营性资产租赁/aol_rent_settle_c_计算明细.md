# |<<

**计算明细 (aol_rent_settle_c / nc.vo.aol.rent.settle.RentOutCalculationVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/126.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rentsettle_c | 计算单主键 | pk_rentsettle_c | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 6 | pk_customer | 承租方 | pk_customer | varchar(20) |  | 客户基本信息 (customer) |
| 7 | pk_contract | 合同编码 | pk_contract | varchar(20) |  | 经营性租出合同 (ContractOutHeadVO) |
| 8 | pk_equip | 资产编码 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 9 | pk_lease_target | 租赁对象 | pk_lease_target | varchar(20) |  | 租赁对象 (LeaseTargetVO) |
| 10 | rent_type | 计租方式 | rent_type | varchar(500) |  | 字符串 (String) |
| 11 | rent_calmode | 租金计算方式 | rent_calmode | varchar(20) |  | 租金计算方式 (RentCalTypeEnum) |  | 1=合同约定标准; |