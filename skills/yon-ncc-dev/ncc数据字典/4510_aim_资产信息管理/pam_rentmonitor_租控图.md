# |<<

**租控图 (pam_rentmonitor / nc.vo.aim.rent.monitor.RentMonitorHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4315.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rentmonitor | 租控图主键 | pk_rentmonitor | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | bill_code | 编码 | bill_code | varchar(40) |  | 字符串 (String) |
| 6 | bill_date | 业务日期 | bill_date | char(19) |  | 日期 (UFDate) |
| 7 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 8 | name | 名称 | name | varchar(80) |  | 字符串 (String) |
| 9 | floors_total | 单元（区域）层数 | floors_total | int |  | 整数 (Integer) |
| 10 | units_total | 各单元（区域）每层可租赁数量 | units_total | int |  | 整数 (Integer) |
| 11 | unit_name | 单元名称 | unit_name | varchar(80) |  | 字符串 (String) |
| 12 | param_mark | 显示规则 | param_mark | varchar(80) |  | 字符串 (String) |
| 13 | area_name | 单元（区域）名称 | area_name | varchar(80) |  | 字符串 (String) |
| 14 | areas_total | 单元（区域）数量 | areas_total | int |  | 整数 (Integer) |
| 15 | is_equip | 关联对象 | is_equip | varchar(50) |  | 关联对象 (RelationEnum) |  | 0=资产卡片; |