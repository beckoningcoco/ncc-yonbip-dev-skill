# |<<

**组织关系_组织类型业务范围 (orgtype_busiregion / nc.vo.org.orgmodel.OrgTypeBusiRegionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4208.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_region | 业务范围主键 | pk_region | char(20) | √ | 主键 (UFID) |
| 2 | pk_orgtype | 组织类型 | pk_orgtype | varchar(20) |  | 组织其它_组织类型 (orgtype) |
| 3 | name | 业务范围名称 | name | varchar(50) |  | 字符串 (String) |
| 4 | code | 业务范围编码 | code | varchar(200) |  | 字符串 (String) |