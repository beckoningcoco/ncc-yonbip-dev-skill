# |<<

**维修合同 (ewm_mtcon / nc.vo.ewm.maintaincon.MaintainConHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1929.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mtcon | 维修合同主键 | pk_mtcon | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 维修组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_维修组织 (maintainorg) |
| 4 | pk_org_v | 维修组织 | pk_org_v | varchar(20) |  | 组织_业务单元_维修组织版本信息 (maintainorg_v) |
| 5 | bill_code | 合同编码 | bill_code | varchar(40) |  | 字符串 (String) |
| 6 | cont_name | 合同名称 | cont_name | varchar(200) |  | 字符串 (String) |
| 7 | bill_status | 合同状态 | bill_status | int |  | 维修合同单据状态 (MTBillStatusConstant) |  | 0=自由态; |