# |<<

**资产卡片（后台） (fa_card / nc.vo.fa.assetcard.CardVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1998.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_card | 主键 | pk_card | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_raorg | 利润中心 | pk_raorg | varchar(20) |  | 利润中心 (profitcenter) |
| 6 | pk_raorg_v | 利润中心版本 | pk_raorg_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 7 | card_code | 卡片编号 | card_code | varchar(40) |  | 字符串 (String) |
| 8 | asset_code | 资产编码 | asset_code | varchar(40) |  | 字符串 (String) |
| 9 | asset_name | 资产名称 | asset_name | varchar(400) |  | 多语文本 (MultiLangText) |
| 10 | bill_type | 单据类型 | bill_type | varchar(4) |  | 字符串 (String) |
| 11 | pk_transitype | 交易类型 | pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 12 | transi_type | 交易类型编码 | transi_type | varchar(30) |  | 字符串 (String) |
| 13 | pk_addreducestyle | 增加方式 | pk_addreducestyle | varchar(20) |  | 增减方式 (AddreduceStyleVO) |
| 14 | assetsuit_code | 资产套号 | assetsuit_code | varchar(320) |  | 字符串 (String) |
| 15 | bar_code | 条形码 | bar_code | varchar(80) |  | 字符串 (String) |
| 16 | begin_date | 开始使用日期 | begin_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 17 | business_date | 建卡日期 | business_date | char(19) |  | 日期 (UFDate) |
| 18 | close_date | 保险截止日期 | close_date | char(19) |  | 日期(结束) (UFDateEnd) |
| 19 | contrator | 建筑承包商 | contrator | varchar(80) |  | 字符串 (String) |
| 20 | dy_flag | 递延标识 | dy_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | deploy_flag | 调拨标识 | deploy_flag | char(20) |  | 字符串 (String) |
| 22 | fundorigin | 资金来源 | fundorigin | varchar(80) |  | 字符串 (String) |
| 23 | leave_date | 出厂日期 | leave_date | char(19) |  | 日期 (UFDate) |
| 24 | license | 车辆牌照号 | license | varchar(80) |  | 字符串 (String) |
| 25 | machinepower | 电机功率 | machinepower | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | machinequan | 电机数量 | machinequan | int |  | 整数 (Integer) |
| 27 | measureunit | 计量单位 | measureunit | varchar(20) |  | 计量单位 (measdoc) |
| 28 | spec | 规格 | spec | varchar(400) |  | 字符串 (String) |
| 29 | card_model | 型号 | card_model | varchar(400) |  | 字符串 (String) |
| 30 | nettonnage | 净吨位 | nettonnage | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | pk_assetgroup | 资产组 | pk_assetgroup | varchar(20) |  | 资产组 (assetgroup) |
| 32 | pk_assetuser | 使用人 | pk_assetuser | varchar(20) |  | 人员基本信息 (psndoc) |
| 33 | pk_user | 责任人 | pk_user | varchar(20) |  | 人员基本信息 (psndoc) |
| 34 | pk_currency | 币种 | pk_currency | varchar(20) |  | 币种 (currtype) |
| 35 | pk_equip | 设备主键 | pk_equip | varchar(20) |  | 字符串 (String) |
| 36 | pk_equip_usedept | 设备使用部门 | pk_equip_usedept | varchar(20) |  | 组织_部门 (dept) |
| 37 | pk_equip_usedept_v | 设备使用部门版本 | pk_equip_usedept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 38 | position | 存放地点 | position | varchar(200) |  | 多语文本 (MultiLangText) |
| 39 | producer | 生产厂商 | producer | varchar(80) |  | 字符串 (String) |
| 40 | provider | 供应商 | provider | varchar(20) |  | 供应商基本信息 (supplier) |
| 41 | quantity | 间[座]数 | quantity | int |  | 整数 (Integer) |
| 42 | soilarea | 土地面积 | soilarea | decimal(28, 8) |  | 数值 (UFDouble) |
| 43 | soillevel | 土地级别 | soillevel | varchar(80) |  | 字符串 (String) |
| 44 | bill_source | 卡片来源 | bill_source | varchar(40) |  | 卡片来源 (card_source) | handin | handin=手工录入; |