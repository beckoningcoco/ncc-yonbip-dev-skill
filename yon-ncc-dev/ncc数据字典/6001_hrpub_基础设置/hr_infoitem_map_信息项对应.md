# |<<

**信息项对应 (hr_infoitem_map / nc.vo.hr.infoset.InfoItemMapVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2679.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_infoitem_map | 信息项对应主键 | pk_infoitem_map | char(20) | √ | 主键 (UFID) |
| 2 | pk_infoset_map | 信息集对应主键 | pk_infoset_map | varchar(20) |  | 信息集对应 (InfoSetMap) |
| 3 | pk_sourceinfoitem | 源信息项 | pk_sourceinfoitem | varchar(20) | √ | 信息项 (info_item) |
| 4 | pk_targetinfoitem | 目标信息项 | pk_targetinfoitem | varchar(20) | √ | 信息项 (info_item) |
| 5 | system_flag | 系统预置 | system_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 11 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |