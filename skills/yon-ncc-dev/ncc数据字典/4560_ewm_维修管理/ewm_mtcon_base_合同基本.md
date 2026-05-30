# |<<

**合同基本 (ewm_mtcon_base / nc.vo.ewm.maintaincon.MaintainConBaseVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1930.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mtcon_base | 合同基本主键 | pk_mtcon_base | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 维修组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_维修组织 (maintainorg) |
| 4 | pk_org_v | 维修组织 | pk_org_v | varchar(20) |  | 组织_业务单元_维修组织版本信息 (maintainorg_v) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | pk_equip | 设备 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 7 | pk_location | 位置 | pk_location | varchar(20) |  | 位置 (location) |
| 8 | pk_category | 设备类别 | pk_category | varchar(20) |  | 设备类别 (CategoryVO) |
| 9 | maintain_obj | 维修对象 | maintain_obj | varchar(80) |  | 字符串 (String) |
| 10 | pk_unit | 单位 | pk_unit | varchar(20) |  | 计量单位 (measdoc) |
| 11 | maintain_num | 维修数量 | maintain_num | int |  | 整数 (Integer) |
| 12 | price | 原币单价 | price | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | money | 原币金额 | money | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | price_org | 本币单价 | price_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | money_org | 本币金额 | money_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | pk_project | 项目 | pk_project | varchar(20) |  | 项目 (project) |
| 17 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 18 | pk_ownerorg | 设备管理组织 | pk_ownerorg | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 19 | pk_mandept | 设备管理部门 | pk_mandept | varchar(20) |  | 组织_部门 (dept) |
| 20 | pk_manager | 设备管理人 | pk_manager | varchar(20) |  | 人员基本信息 (psndoc) |
| 21 | pk_usedunit | 设备使用权 | pk_usedunit | varchar(20) |  | 组织 (org) |
| 22 | pk_usedorg | 设备使用管理组织 | pk_usedorg | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 23 | pk_usedept | 设备使用部门 | pk_usedept | varchar(20) |  | 组织_部门 (dept) |
| 24 | pk_user | 设备责任人 | pk_user | varchar(20) |  | 人员基本信息 (psndoc) |
| 25 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |