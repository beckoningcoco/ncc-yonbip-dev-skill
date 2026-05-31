# |<<

**租金明细 (alo_rent_calc_c / nc.vo.alo.rent.calculate.RentOutDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/97.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rent_calc_c | 租金明细主键 | pk_rent_calc_c | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 资产组织 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 3 | pk_org_v | 资产组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 6 | lease_bill_code | 租出单号 | lease_bill_code | varchar(40) |  | 字符串 (String) |
| 7 | pk_lease | 租出单主键 | pk_lease | varchar(20) |  | 字符串 (String) |
| 8 | transi_type | 租出单交易类型 | transi_type | varchar(30) |  | 字符串 (String) |
| 9 | pk_equip | 设备 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 10 | cal_start_date | 起始日期 | cal_start_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 11 | cal_end_date | 截至日期 | cal_end_date | char(19) |  | 日期(结束) (UFDateEnd) |
| 12 | rent_type | 计租方式 | rent_type | varchar(500) |  | 字符串 (String) |
| 13 | rent_calmode | 租金计算方式 | rent_calmode | int |  | 租金计算方式 (RentCalTypeEnum) |  | 1=合同约定标准; |