# |<<

**信息集对应 (hr_infoset_map / nc.vo.hr.infoset.InfoSetMapVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2682.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_infoset_map | 信息集对应主键 | pk_infoset_map | char(20) | √ | 主键 (UFID) |
| 2 | pk_sourceinfoset | 源信息集 | pk_sourceinfoset | varchar(20) | √ | 信息集 (InfoSet) |
| 3 | pk_targetinfoset | 目标信息集 | pk_targetinfoset | varchar(20) | √ | 信息集 (InfoSet) |
| 4 | system_flag | 系统预置 | system_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 8 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 10 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |