# |<<

**外部系统配置组织 (fip_pfxxsysconforg / nc.vo.fip.pfxxsysconf.PfxxSysConfOrgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2246.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_financeorg | 财务组织 | pk_financeorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 5 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 6 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 7 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |